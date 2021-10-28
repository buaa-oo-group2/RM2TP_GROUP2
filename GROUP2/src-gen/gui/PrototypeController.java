package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TabPane;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.Tooltip;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import gui.supportclass.*;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;
import services.*;
import services.impl.*;
import java.time.format.DateTimeFormatter;
import java.lang.reflect.Method;

import entities.*;

public class PrototypeController implements Initializable {


	DateTimeFormatter dateformatter;
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		group2system_service = ServiceManager.createGROUP2System();
		thirdpartyservices_service = ServiceManager.createThirdPartyServices();
		choosetopicservice_service = ServiceManager.createChooseTopicService();
		addtopicservice_service = ServiceManager.createAddTopicService();
		uploadfileservice_service = ServiceManager.createUploadFileService();
		viewfileservice_service = ServiceManager.createViewFileService();
		givecommentservice_service = ServiceManager.createGiveCommentService();
		modifyfileservice_service = ServiceManager.createModifyFileService();
				
		this.dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
	   	 //prepare data for contract
	   	 prepareData();
	   	 
	   	 //generate invariant panel
	   	 genereateInvairantPanel();
	   	 
		 //Actor Threeview Binding
		 actorTreeViewBinding();
		 
		 //Generate
		 generatOperationPane();
		 genereateOpInvariantPanel();
		 
		 //prilimariry data
		 try {
			DataFitService.fit();
		 } catch (PreconditionException e) {
			// TODO Auto-generated catch block
		 	e.printStackTrace();
		 }
		 
		 //generate class statistic
		 classStatisicBingding();
		 
		 //generate object statistic
		 generateObjectTable();
		 
		 //genereate association statistic
		 associationStatisicBingding();

		 //set listener 
		 setListeners();
	}
	
	/**
	 * deepCopyforTreeItem (Actor Generation)
	 */
	TreeItem<String> deepCopyTree(TreeItem<String> item) {
		    TreeItem<String> copy = new TreeItem<String>(item.getValue());
		    for (TreeItem<String> child : item.getChildren()) {
		        copy.getChildren().add(deepCopyTree(child));
		    }
		    return copy;
	}
	
	/**
	 * check all invariant and update invariant panel
	 */
	public void invairantPanelUpdate() {
		
		try {
			
			for (Entry<String, Label> inv : entity_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String entityName = invt[0];
				for (Object o : EntityManager.getAllInstancesOf(entityName)) {				
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}				
			}
			
			for (Entry<String, Label> inv : service_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String serviceName = invt[0];
				for (Object o : ServiceManager.getAllInstancesOf(serviceName)) {				
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	/**
	 * check op invariant and update op invariant panel
	 */		
	public void opInvairantPanelUpdate() {
		
		try {
			
			for (Entry<String, Label> inv : op_entity_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String entityName = invt[0];
				for (Object o : EntityManager.getAllInstancesOf(entityName)) {
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
			for (Entry<String, Label> inv : op_service_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String serviceName = invt[0];
				for (Object o : ServiceManager.getAllInstancesOf(serviceName)) {
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 
	*	generate op invariant panel 
	*/
	public void genereateOpInvariantPanel() {
		
		opInvariantPanel = new HashMap<String, VBox>();
		op_entity_invariants_label_map = new LinkedHashMap<String, Label>();
		op_service_invariants_label_map = new LinkedHashMap<String, Label>();
		
		VBox v;
		List<String> entities;
		v = new VBox();
		
		//entities invariants
		entities = ChooseTopicServiceImpl.opINVRelatedEntity.get("getAllTopics");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("getAllTopics" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ChooseTopicService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("getAllTopics", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ChooseTopicServiceImpl.opINVRelatedEntity.get("chooseOneTopic");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("chooseOneTopic" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ChooseTopicService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("chooseOneTopic", v);
		
		v = new VBox();
		
		//entities invariants
		entities = AddTopicServiceImpl.opINVRelatedEntity.get("addTopic");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("addTopic" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("AddTopicService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("addTopic", v);
		
		v = new VBox();
		
		//entities invariants
		entities = UploadFileServiceImpl.opINVRelatedEntity.get("enterPage");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("enterPage" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("UploadFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("enterPage", v);
		
		v = new VBox();
		
		//entities invariants
		entities = UploadFileServiceImpl.opINVRelatedEntity.get("uploadFile");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("uploadFile" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("UploadFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("uploadFile", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ViewFileServiceImpl.opINVRelatedEntity.get("enterPage");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("enterPage" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ViewFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("enterPage", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ViewFileServiceImpl.opINVRelatedEntity.get("getFile");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("getFile" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ViewFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("getFile", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ViewFileServiceImpl.opINVRelatedEntity.get("viewFile");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("viewFile" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ViewFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("viewFile", v);
		
		v = new VBox();
		
		//entities invariants
		entities = GiveCommentServiceImpl.opINVRelatedEntity.get("enterPage");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("enterPage" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("GiveCommentService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("enterPage", v);
		
		v = new VBox();
		
		//entities invariants
		entities = GiveCommentServiceImpl.opINVRelatedEntity.get("giveComment");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("giveComment" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("GiveCommentService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("giveComment", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ModifyFileServiceImpl.opINVRelatedEntity.get("enterPage");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("enterPage" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ModifyFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("enterPage", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ModifyFileServiceImpl.opINVRelatedEntity.get("getComment");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("getComment" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ModifyFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("getComment", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ModifyFileServiceImpl.opINVRelatedEntity.get("uploadFile");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("uploadFile" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ModifyFileService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("uploadFile", v);
		
		
	}
	
	
	/*
	*  generate invariant panel
	*/
	public void genereateInvairantPanel() {
		
		service_invariants_label_map = new LinkedHashMap<String, Label>();
		entity_invariants_label_map = new LinkedHashMap<String, Label>();
		
		//entity_invariants_map
		VBox v = new VBox();
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			Label l = new Label(inv.getKey());
			l.setStyle("-fx-max-width: Infinity;" + 
					"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
				    "-fx-padding: 6px;" +
				    "-fx-border-color: black;");
			
			Tooltip tp = new Tooltip();
			tp.setText(inv.getValue());
			l.setTooltip(tp);
			
			service_invariants_label_map.put(inv.getKey(), l);
			v.getChildren().add(l);
			
		}
		//entity invariants
		for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
			
			String INVname = inv.getKey();
			Label l = new Label(INVname);
			if (INVname.contains("AssociationInvariants")) {
				l.setStyle("-fx-max-width: Infinity;" + 
					"-fx-background-color: linear-gradient(to right, #099b17 0%, #F0FFFF 100%);" +
				    "-fx-padding: 6px;" +
				    "-fx-border-color: black;");
			} else {
				l.setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
			}	
			Tooltip tp = new Tooltip();
			tp.setText(inv.getValue());
			l.setTooltip(tp);
			
			entity_invariants_label_map.put(inv.getKey(), l);
			v.getChildren().add(l);
			
		}
		ScrollPane scrollPane = new ScrollPane(v);
		scrollPane.setFitToWidth(true);
		all_invariant_pane.setMaxHeight(850);
		
		all_invariant_pane.setContent(scrollPane);
	}	
	
	
	
	/* 
	*	mainPane add listener
	*/
	public void setListeners() {
		 mainPane.getSelectionModel().selectedItemProperty().addListener((ov, oldTab, newTab) -> {
			 
			 	if (newTab.getText().equals("System State")) {
			 		System.out.println("refresh all");
			 		refreshAll();
			 	}
		    
		    });
	}
	
	
	//checking all invariants
	public void checkAllInvariants() {
		
		invairantPanelUpdate();
	
	}	
	
	//refresh all
	public void refreshAll() {
		
		invairantPanelUpdate();
		classStatisticUpdate();
		generateObjectTable();
	}
	
	
	//update association
	public void updateAssociation(String className) {
		
		for (AssociationInfo assoc : allassociationData.get(className)) {
			assoc.computeAssociationNumber();
		}
		
	}
	
	public void updateAssociation(String className, int index) {
		
		for (AssociationInfo assoc : allassociationData.get(className)) {
			assoc.computeAssociationNumber(index);
		}
		
	}	
	
	public void generateObjectTable() {
		
		allObjectTables = new LinkedHashMap<String, TableView>();
		
		TableView<Map<String, String>> tableUser = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableUser_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableUser_UserId.setMinWidth("UserId".length()*10);
		tableUser_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableUser.getColumns().add(tableUser_UserId);
		TableColumn<Map<String, String>, String> tableUser_Username = new TableColumn<Map<String, String>, String>("Username");
		tableUser_Username.setMinWidth("Username".length()*10);
		tableUser_Username.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Username"));
		    }
		});	
		tableUser.getColumns().add(tableUser_Username);
		TableColumn<Map<String, String>, String> tableUser_Password = new TableColumn<Map<String, String>, String>("Password");
		tableUser_Password.setMinWidth("Password".length()*10);
		tableUser_Password.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Password"));
		    }
		});	
		tableUser.getColumns().add(tableUser_Password);
		TableColumn<Map<String, String>, String> tableUser_Role = new TableColumn<Map<String, String>, String>("Role");
		tableUser_Role.setMinWidth("Role".length()*10);
		tableUser_Role.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Role"));
		    }
		});	
		tableUser.getColumns().add(tableUser_Role);
		
		//table data
		ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
		List<User> rsUser = EntityManager.getAllInstancesOf("User");
		for (User r : rsUser) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getUsername() != null)
				unit.put("Username", String.valueOf(r.getUsername()));
			else
				unit.put("Username", "");
			if (r.getPassword() != null)
				unit.put("Password", String.valueOf(r.getPassword()));
			else
				unit.put("Password", "");
			unit.put("Role", String.valueOf(r.getRole()));

			dataUser.add(unit);
		}
		
		tableUser.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableUser.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("User", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableUser.setItems(dataUser);
		allObjectTables.put("User", tableUser);
		
		TableView<Map<String, String>> tableTopic = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableTopic_TopicId = new TableColumn<Map<String, String>, String>("TopicId");
		tableTopic_TopicId.setMinWidth("TopicId".length()*10);
		tableTopic_TopicId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicId"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicId);
		TableColumn<Map<String, String>, String> tableTopic_TopicName = new TableColumn<Map<String, String>, String>("TopicName");
		tableTopic_TopicName.setMinWidth("TopicName".length()*10);
		tableTopic_TopicName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicName"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicName);
		TableColumn<Map<String, String>, String> tableTopic_TopicMeaning = new TableColumn<Map<String, String>, String>("TopicMeaning");
		tableTopic_TopicMeaning.setMinWidth("TopicMeaning".length()*10);
		tableTopic_TopicMeaning.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicMeaning"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicMeaning);
		TableColumn<Map<String, String>, String> tableTopic_TopicTarget = new TableColumn<Map<String, String>, String>("TopicTarget");
		tableTopic_TopicTarget.setMinWidth("TopicTarget".length()*10);
		tableTopic_TopicTarget.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicTarget"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicTarget);
		TableColumn<Map<String, String>, String> tableTopic_TopicMethod = new TableColumn<Map<String, String>, String>("TopicMethod");
		tableTopic_TopicMethod.setMinWidth("TopicMethod".length()*10);
		tableTopic_TopicMethod.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicMethod"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicMethod);
		TableColumn<Map<String, String>, String> tableTopic_TopicContent = new TableColumn<Map<String, String>, String>("TopicContent");
		tableTopic_TopicContent.setMinWidth("TopicContent".length()*10);
		tableTopic_TopicContent.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicContent"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_TopicContent);
		TableColumn<Map<String, String>, String> tableTopic_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableTopic_UserId.setMinWidth("UserId".length()*10);
		tableTopic_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableTopic.getColumns().add(tableTopic_UserId);
		
		//table data
		ObservableList<Map<String, String>> dataTopic = FXCollections.observableArrayList();
		List<Topic> rsTopic = EntityManager.getAllInstancesOf("Topic");
		for (Topic r : rsTopic) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("TopicId", String.valueOf(r.getTopicId()));
			if (r.getTopicName() != null)
				unit.put("TopicName", String.valueOf(r.getTopicName()));
			else
				unit.put("TopicName", "");
			if (r.getTopicMeaning() != null)
				unit.put("TopicMeaning", String.valueOf(r.getTopicMeaning()));
			else
				unit.put("TopicMeaning", "");
			if (r.getTopicTarget() != null)
				unit.put("TopicTarget", String.valueOf(r.getTopicTarget()));
			else
				unit.put("TopicTarget", "");
			if (r.getTopicMethod() != null)
				unit.put("TopicMethod", String.valueOf(r.getTopicMethod()));
			else
				unit.put("TopicMethod", "");
			if (r.getTopicContent() != null)
				unit.put("TopicContent", String.valueOf(r.getTopicContent()));
			else
				unit.put("TopicContent", "");
			unit.put("UserId", String.valueOf(r.getUserId()));

			dataTopic.add(unit);
		}
		
		tableTopic.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableTopic.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Topic", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableTopic.setItems(dataTopic);
		allObjectTables.put("Topic", tableTopic);
		
		TableView<Map<String, String>> tableFile = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableFile_FileId = new TableColumn<Map<String, String>, String>("FileId");
		tableFile_FileId.setMinWidth("FileId".length()*10);
		tableFile_FileId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("FileId"));
		    }
		});	
		tableFile.getColumns().add(tableFile_FileId);
		TableColumn<Map<String, String>, String> tableFile_FileName = new TableColumn<Map<String, String>, String>("FileName");
		tableFile_FileName.setMinWidth("FileName".length()*10);
		tableFile_FileName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("FileName"));
		    }
		});	
		tableFile.getColumns().add(tableFile_FileName);
		TableColumn<Map<String, String>, String> tableFile_FilePath = new TableColumn<Map<String, String>, String>("FilePath");
		tableFile_FilePath.setMinWidth("FilePath".length()*10);
		tableFile_FilePath.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("FilePath"));
		    }
		});	
		tableFile.getColumns().add(tableFile_FilePath);
		TableColumn<Map<String, String>, String> tableFile_Comment = new TableColumn<Map<String, String>, String>("Comment");
		tableFile_Comment.setMinWidth("Comment".length()*10);
		tableFile_Comment.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Comment"));
		    }
		});	
		tableFile.getColumns().add(tableFile_Comment);
		TableColumn<Map<String, String>, String> tableFile_FileType = new TableColumn<Map<String, String>, String>("FileType");
		tableFile_FileType.setMinWidth("FileType".length()*10);
		tableFile_FileType.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("FileType"));
		    }
		});	
		tableFile.getColumns().add(tableFile_FileType);
		TableColumn<Map<String, String>, String> tableFile_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableFile_UserId.setMinWidth("UserId".length()*10);
		tableFile_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableFile.getColumns().add(tableFile_UserId);
		
		//table data
		ObservableList<Map<String, String>> dataFile = FXCollections.observableArrayList();
		List<File> rsFile = EntityManager.getAllInstancesOf("File");
		for (File r : rsFile) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("FileId", String.valueOf(r.getFileId()));
			if (r.getFileName() != null)
				unit.put("FileName", String.valueOf(r.getFileName()));
			else
				unit.put("FileName", "");
			if (r.getFilePath() != null)
				unit.put("FilePath", String.valueOf(r.getFilePath()));
			else
				unit.put("FilePath", "");
			if (r.getComment() != null)
				unit.put("Comment", String.valueOf(r.getComment()));
			else
				unit.put("Comment", "");
			unit.put("FileType", String.valueOf(r.getFileType()));
			unit.put("UserId", String.valueOf(r.getUserId()));

			dataFile.add(unit);
		}
		
		tableFile.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableFile.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("File", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableFile.setItems(dataFile);
		allObjectTables.put("File", tableFile);
		
		TableView<Map<String, String>> tableUserChooseTopic = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableUserChooseTopic_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableUserChooseTopic_UserId.setMinWidth("UserId".length()*10);
		tableUserChooseTopic_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableUserChooseTopic.getColumns().add(tableUserChooseTopic_UserId);
		TableColumn<Map<String, String>, String> tableUserChooseTopic_TopicId = new TableColumn<Map<String, String>, String>("TopicId");
		tableUserChooseTopic_TopicId.setMinWidth("TopicId".length()*10);
		tableUserChooseTopic_TopicId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TopicId"));
		    }
		});	
		tableUserChooseTopic.getColumns().add(tableUserChooseTopic_TopicId);
		
		//table data
		ObservableList<Map<String, String>> dataUserChooseTopic = FXCollections.observableArrayList();
		List<UserChooseTopic> rsUserChooseTopic = EntityManager.getAllInstancesOf("UserChooseTopic");
		for (UserChooseTopic r : rsUserChooseTopic) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("UserId", String.valueOf(r.getUserId()));
			unit.put("TopicId", String.valueOf(r.getTopicId()));

			dataUserChooseTopic.add(unit);
		}
		
		tableUserChooseTopic.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableUserChooseTopic.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("UserChooseTopic", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableUserChooseTopic.setItems(dataUserChooseTopic);
		allObjectTables.put("UserChooseTopic", tableUserChooseTopic);
		

		
	}
	
	/* 
	* update all object tables with sub dataset
	*/ 
	public void updateUserTable(List<User> rsUser) {
			ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
			for (User r : rsUser) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUsername() != null)
					unit.put("Username", String.valueOf(r.getUsername()));
				else
					unit.put("Username", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("Role", String.valueOf(r.getRole()));
				dataUser.add(unit);
			}
			
			allObjectTables.get("User").setItems(dataUser);
	}
	public void updateTopicTable(List<Topic> rsTopic) {
			ObservableList<Map<String, String>> dataTopic = FXCollections.observableArrayList();
			for (Topic r : rsTopic) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("TopicId", String.valueOf(r.getTopicId()));
				if (r.getTopicName() != null)
					unit.put("TopicName", String.valueOf(r.getTopicName()));
				else
					unit.put("TopicName", "");
				if (r.getTopicMeaning() != null)
					unit.put("TopicMeaning", String.valueOf(r.getTopicMeaning()));
				else
					unit.put("TopicMeaning", "");
				if (r.getTopicTarget() != null)
					unit.put("TopicTarget", String.valueOf(r.getTopicTarget()));
				else
					unit.put("TopicTarget", "");
				if (r.getTopicMethod() != null)
					unit.put("TopicMethod", String.valueOf(r.getTopicMethod()));
				else
					unit.put("TopicMethod", "");
				if (r.getTopicContent() != null)
					unit.put("TopicContent", String.valueOf(r.getTopicContent()));
				else
					unit.put("TopicContent", "");
				unit.put("UserId", String.valueOf(r.getUserId()));
				dataTopic.add(unit);
			}
			
			allObjectTables.get("Topic").setItems(dataTopic);
	}
	public void updateFileTable(List<File> rsFile) {
			ObservableList<Map<String, String>> dataFile = FXCollections.observableArrayList();
			for (File r : rsFile) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("FileId", String.valueOf(r.getFileId()));
				if (r.getFileName() != null)
					unit.put("FileName", String.valueOf(r.getFileName()));
				else
					unit.put("FileName", "");
				if (r.getFilePath() != null)
					unit.put("FilePath", String.valueOf(r.getFilePath()));
				else
					unit.put("FilePath", "");
				if (r.getComment() != null)
					unit.put("Comment", String.valueOf(r.getComment()));
				else
					unit.put("Comment", "");
				unit.put("FileType", String.valueOf(r.getFileType()));
				unit.put("UserId", String.valueOf(r.getUserId()));
				dataFile.add(unit);
			}
			
			allObjectTables.get("File").setItems(dataFile);
	}
	public void updateUserChooseTopicTable(List<UserChooseTopic> rsUserChooseTopic) {
			ObservableList<Map<String, String>> dataUserChooseTopic = FXCollections.observableArrayList();
			for (UserChooseTopic r : rsUserChooseTopic) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				unit.put("TopicId", String.valueOf(r.getTopicId()));
				dataUserChooseTopic.add(unit);
			}
			
			allObjectTables.get("UserChooseTopic").setItems(dataUserChooseTopic);
	}
	
	/* 
	* update all object tables
	*/ 
	public void updateUserTable() {
			ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
			List<User> rsUser = EntityManager.getAllInstancesOf("User");
			for (User r : rsUser) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUsername() != null)
					unit.put("Username", String.valueOf(r.getUsername()));
				else
					unit.put("Username", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("Role", String.valueOf(r.getRole()));
				dataUser.add(unit);
			}
			
			allObjectTables.get("User").setItems(dataUser);
	}
	public void updateTopicTable() {
			ObservableList<Map<String, String>> dataTopic = FXCollections.observableArrayList();
			List<Topic> rsTopic = EntityManager.getAllInstancesOf("Topic");
			for (Topic r : rsTopic) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("TopicId", String.valueOf(r.getTopicId()));
				if (r.getTopicName() != null)
					unit.put("TopicName", String.valueOf(r.getTopicName()));
				else
					unit.put("TopicName", "");
				if (r.getTopicMeaning() != null)
					unit.put("TopicMeaning", String.valueOf(r.getTopicMeaning()));
				else
					unit.put("TopicMeaning", "");
				if (r.getTopicTarget() != null)
					unit.put("TopicTarget", String.valueOf(r.getTopicTarget()));
				else
					unit.put("TopicTarget", "");
				if (r.getTopicMethod() != null)
					unit.put("TopicMethod", String.valueOf(r.getTopicMethod()));
				else
					unit.put("TopicMethod", "");
				if (r.getTopicContent() != null)
					unit.put("TopicContent", String.valueOf(r.getTopicContent()));
				else
					unit.put("TopicContent", "");
				unit.put("UserId", String.valueOf(r.getUserId()));
				dataTopic.add(unit);
			}
			
			allObjectTables.get("Topic").setItems(dataTopic);
	}
	public void updateFileTable() {
			ObservableList<Map<String, String>> dataFile = FXCollections.observableArrayList();
			List<File> rsFile = EntityManager.getAllInstancesOf("File");
			for (File r : rsFile) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("FileId", String.valueOf(r.getFileId()));
				if (r.getFileName() != null)
					unit.put("FileName", String.valueOf(r.getFileName()));
				else
					unit.put("FileName", "");
				if (r.getFilePath() != null)
					unit.put("FilePath", String.valueOf(r.getFilePath()));
				else
					unit.put("FilePath", "");
				if (r.getComment() != null)
					unit.put("Comment", String.valueOf(r.getComment()));
				else
					unit.put("Comment", "");
				unit.put("FileType", String.valueOf(r.getFileType()));
				unit.put("UserId", String.valueOf(r.getUserId()));
				dataFile.add(unit);
			}
			
			allObjectTables.get("File").setItems(dataFile);
	}
	public void updateUserChooseTopicTable() {
			ObservableList<Map<String, String>> dataUserChooseTopic = FXCollections.observableArrayList();
			List<UserChooseTopic> rsUserChooseTopic = EntityManager.getAllInstancesOf("UserChooseTopic");
			for (UserChooseTopic r : rsUserChooseTopic) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("UserId", String.valueOf(r.getUserId()));
				unit.put("TopicId", String.valueOf(r.getTopicId()));
				dataUserChooseTopic.add(unit);
			}
			
			allObjectTables.get("UserChooseTopic").setItems(dataUserChooseTopic);
	}
	
	public void classStatisicBingding() {
	
		 classInfodata = FXCollections.observableArrayList();
	 	 user = new ClassInfo("User", EntityManager.getAllInstancesOf("User").size());
	 	 classInfodata.add(user);
	 	 topic = new ClassInfo("Topic", EntityManager.getAllInstancesOf("Topic").size());
	 	 classInfodata.add(topic);
	 	 file = new ClassInfo("File", EntityManager.getAllInstancesOf("File").size());
	 	 classInfodata.add(file);
	 	 userchoosetopic = new ClassInfo("UserChooseTopic", EntityManager.getAllInstancesOf("UserChooseTopic").size());
	 	 classInfodata.add(userchoosetopic);
	 	 
		 class_statisic.setItems(classInfodata);
		 
		 //Class Statisic Binding
		 class_statisic.getSelectionModel().selectedItemProperty().addListener(
				 (observable, oldValue, newValue) ->  { 
				 										 //no selected object in table
				 										 objectindex = -1;
				 										 
				 										 //get lastest data, reflect updateTableData method
				 										 try {
												 			 Method updateob = this.getClass().getMethod("update" + newValue.getName() + "Table", null);
												 			 updateob.invoke(this);			 
												 		 } catch (Exception e) {
												 		 	 e.printStackTrace();
												 		 }		 										 
				 	
				 										 //show object table
				 			 				 			 TableView obs = allObjectTables.get(newValue.getName());
				 			 				 			 if (obs != null) {
				 			 				 				object_statics.setContent(obs);
				 			 				 				object_statics.setText("All Objects " + newValue.getName() + ":");
				 			 				 			 }
				 			 				 			 
				 			 				 			 //update association information
							 			 				 updateAssociation(newValue.getName());
				 			 				 			 
				 			 				 			 //show association information
				 			 				 			 ObservableList<AssociationInfo> asso = allassociationData.get(newValue.getName());
				 			 				 			 if (asso != null) {
				 			 				 			 	association_statisic.setItems(asso);
				 			 				 			 }
				 			 				 		  });
	}
	
	public void classStatisticUpdate() {
	 	 user.setNumber(EntityManager.getAllInstancesOf("User").size());
	 	 topic.setNumber(EntityManager.getAllInstancesOf("Topic").size());
	 	 file.setNumber(EntityManager.getAllInstancesOf("File").size());
	 	 userchoosetopic.setNumber(EntityManager.getAllInstancesOf("UserChooseTopic").size());
		
	}
	
	/**
	 * association binding
	 */
	public void associationStatisicBingding() {
		
		allassociationData = new HashMap<String, ObservableList<AssociationInfo>>();
		
		ObservableList<AssociationInfo> User_association_data = FXCollections.observableArrayList();
		AssociationInfo User_associatition_FileToUser = new AssociationInfo("User", "File", "FileToUser", false);
		User_association_data.add(User_associatition_FileToUser);
		AssociationInfo User_associatition_UsertoUserChooseTopic = new AssociationInfo("User", "UserChooseTopic", "UsertoUserChooseTopic", true);
		User_association_data.add(User_associatition_UsertoUserChooseTopic);
		
		allassociationData.put("User", User_association_data);
		
		ObservableList<AssociationInfo> Topic_association_data = FXCollections.observableArrayList();
		AssociationInfo Topic_associatition_TopictoUser = new AssociationInfo("Topic", "User", "TopictoUser", false);
		Topic_association_data.add(Topic_associatition_TopictoUser);
		AssociationInfo Topic_associatition_TopictoUserChooseTopic = new AssociationInfo("Topic", "UserChooseTopic", "TopictoUserChooseTopic", true);
		Topic_association_data.add(Topic_associatition_TopictoUserChooseTopic);
		
		allassociationData.put("Topic", Topic_association_data);
		
		ObservableList<AssociationInfo> File_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("File", File_association_data);
		
		ObservableList<AssociationInfo> UserChooseTopic_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("UserChooseTopic", UserChooseTopic_association_data);
		
		
		association_statisic.getSelectionModel().selectedItemProperty().addListener(
			    (observable, oldValue, newValue) ->  { 
	
							 		if (newValue != null) {
							 			 try {
							 			 	 if (newValue.getNumber() != 0) {
								 				 //choose object or not
								 				 if (objectindex != -1) {
									 				 Class[] cArg = new Class[1];
									 				 cArg[0] = List.class;
									 				 //reflect updateTableData method
										 			 Method updateob = this.getClass().getMethod("update" + newValue.getTargetClass() + "Table", cArg);
										 			 //find choosen object
										 			 Object selectedob = EntityManager.getAllInstancesOf(newValue.getSourceClass()).get(objectindex);
										 			 //reflect find association method
										 			 Method getAssociatedObject = selectedob.getClass().getMethod("get" + newValue.getAssociationName());
										 			 List r = new LinkedList();
										 			 //one or mulity?
										 			 if (newValue.getIsMultiple() == true) {
											 			 
											 			r = (List) getAssociatedObject.invoke(selectedob);
										 			 }
										 			 else {
										 				r.add(getAssociatedObject.invoke(selectedob));
										 			 }
										 			 //invoke update method
										 			 updateob.invoke(this, r);
										 			  
										 			 
								 				 }
												 //bind updated data to GUI
					 				 			 TableView obs = allObjectTables.get(newValue.getTargetClass());
					 				 			 if (obs != null) {
					 				 				object_statics.setContent(obs);
					 				 				object_statics.setText("Targets Objects " + newValue.getTargetClass() + ":");
					 				 			 }
					 				 		 }
							 			 }
							 			 catch (Exception e) {
							 				 e.printStackTrace();
							 			 }
							 		}
					 		  });
		
	}	
	
	

    //prepare data for contract
	public void prepareData() {
		
		//definition map
		definitions_map = new HashMap<String, String>();
		definitions_map.put("getAllTopics", "topics:Topic = Topic.allInstance()->any(t:Topic | t.UserId = teacherId)\n");
		definitions_map.put("chooseOneTopic", "student:User = User.allInstance()->any(user:User | user.UserId = studentId)\ntopic:Topic = Topic.allInstance()->any(t:Topic | t.TopicId = topicId)\n");
		definitions_map.put("addTopic", "teacher:User = User.allInstance()->any(u:User | u.UserId = teacherId)\nget_topic:Topic = Topic.allInstance()->any(t:Topic | t.TopicId = topic.TopicId)\n");
		definitions_map.put("enterPage", "user:User = User.allInstance()->any(u:User | u.UserId = userId)\n");
		definitions_map.put("uploadFile", "student:User = User.allInstance()->any(u:User | u.UserId = studentId)\n");
		definitions_map.put("enterPage", "user:User = User.allInstance()->any(u:User | u.UserId = userId)\n");
		definitions_map.put("getFile", "file:File = File.allInstance()->any(f:File | f.FileId = fileId)\n");
		definitions_map.put("enterPage", "user:User = User.allInstance()->any(u:User | u.UserId = userId)\n");
		definitions_map.put("giveComment", "file:File = File.allInstance()->any(f:File | f.FileId = fileId)\n");
		definitions_map.put("enterPage", "user:User = User.allInstance()->any(u:User | u.UserId = userId)\n");
		definitions_map.put("getComment", "file:File = File.allInstance()->any(f:File | f.FileId = fileId)\n");
		definitions_map.put("uploadFile", "student:User = User.allInstance()->any(u:User | u.UserId = studentId)\n");
		
		//precondition map
		preconditions_map = new HashMap<String, String>();
		preconditions_map.put("getAllTopics", "true");
		preconditions_map.put("chooseOneTopic", "topic.oclIsUndefined() = false and\nstudent.oclIsUndefined() = false\n");
		preconditions_map.put("addTopic", "teacher.oclIsUndefined() = false and\ntopic.oclIsUndefined() = false and\nget_topic = null\n");
		preconditions_map.put("enterPage", "pageType > 0 and\npageType < 4 and\nuser.oclIsUndefined() = false and\nuser.Role = STUDENT\n");
		preconditions_map.put("uploadFile", "student.oclIsUndefined() = false and\nfileType > 0 and\nfileType < 4 and\nfileName.size() > 0\n");
		preconditions_map.put("enterPage", "pageType > 0 and\npageType < 4 and\nuser.oclIsUndefined() = false and\nuser.Role = TEACHER\n");
		preconditions_map.put("getFile", "file.oclIsUndefined() = false");
		preconditions_map.put("viewFile", "file.oclIsUndefined() = false and\nfile.FilePath.oclIsUndefined() = false\n");
		preconditions_map.put("enterPage", "pageType > 0 and\npageType < 4 and\nuser.oclIsUndefined() = false and\nuser.Role = TEACHER\n");
		preconditions_map.put("giveComment", "file.oclIsUndefined() = false and\ncomment.oclIsUndefined() = false\n");
		preconditions_map.put("enterPage", "pageType > 0 and\npageType < 4 and\nuser.oclIsUndefined() = false and\nuser.Role = STUDENT\n");
		preconditions_map.put("getComment", "file.oclIsUndefined() = false");
		preconditions_map.put("uploadFile", "student.oclIsUndefined() = false and\nfileType > 0 and\nfileType < 4 and\nfileName.size() > 0\n");
		
		//postcondition map
		postconditions_map = new HashMap<String, String>();
		postconditions_map.put("getAllTopics", "if(topics.size() = 0)\nthen\ntopics = null and\nresult = topics\nelse\nself.topics = topic and\nresult = topics\nendif");
		postconditions_map.put("chooseOneTopic", "let uct:UserChooseTopic inuct.oclIsNew() and\nuct.UserId = studentId and\nuct.TopicId = topicId and\nUserChooseTopic.allInstance()->includes(uct) and\nresult = true\n");
		postconditions_map.put("addTopic", "let t:Topic int.oclIsNew() and\nt = topic and\nTopic.allInstance()->includes(t) and\nresult = true\n");
		postconditions_map.put("enterPage", "result = UploadPageHTML");
		postconditions_map.put("uploadFile", "let file:File infile.oclIsNew() and\nfile.FileName = fileName and\nfile.UserId = studentId and\nfile.FileType = fileType and\nFile.allInstance()->includes(file) and\nresult = true\n");
		postconditions_map.put("enterPage", "result = DownloadPageHTML");
		postconditions_map.put("getFile", "result = file");
		postconditions_map.put("viewFile", "fileContent = DownloadFile(file.FilePath) and\nfileHtml = ParseFileToHtml(fileContent) and\nresult = fileHtml\n");
		postconditions_map.put("enterPage", "result = CommentPageHTML");
		postconditions_map.put("giveComment", "file.Comment = comment and\nresult = true\n");
		postconditions_map.put("enterPage", "result = FilePageHTML");
		postconditions_map.put("getComment", "result = file.comment");
		postconditions_map.put("uploadFile", "let file:File infile.oclIsNew() and\nfile.FileName = fileName and\nfile.UserId = studentId and\nfile.FileType = fileType and\nFile.allInstance()->includes(file) and\nresult = true\n");
		
		//service invariants map
		service_invariants_map = new LinkedHashMap<String, String>();
		
		//entity invariants map
		entity_invariants_map = new LinkedHashMap<String, String>();
		
	}
	
	public void generatOperationPane() {
		
		 operationPanels = new LinkedHashMap<String, GridPane>();
		
		 // ==================== GridPane_getAllTopics ====================
		 GridPane getAllTopics = new GridPane();
		 getAllTopics.setHgap(4);
		 getAllTopics.setVgap(6);
		 getAllTopics.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> getAllTopics_content = getAllTopics.getChildren();
		 Label getAllTopics_teacherId_label = new Label("teacherId:");
		 getAllTopics_teacherId_label.setMinWidth(Region.USE_PREF_SIZE);
		 getAllTopics_content.add(getAllTopics_teacherId_label);
		 GridPane.setConstraints(getAllTopics_teacherId_label, 0, 0);
		 
		 getAllTopics_teacherId_t = new TextField();
		 getAllTopics_content.add(getAllTopics_teacherId_t);
		 getAllTopics_teacherId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(getAllTopics_teacherId_t, 1, 0);
		 operationPanels.put("getAllTopics", getAllTopics);
		 
		 // ==================== GridPane_chooseOneTopic ====================
		 GridPane chooseOneTopic = new GridPane();
		 chooseOneTopic.setHgap(4);
		 chooseOneTopic.setVgap(6);
		 chooseOneTopic.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> chooseOneTopic_content = chooseOneTopic.getChildren();
		 Label chooseOneTopic_topicId_label = new Label("topicId:");
		 chooseOneTopic_topicId_label.setMinWidth(Region.USE_PREF_SIZE);
		 chooseOneTopic_content.add(chooseOneTopic_topicId_label);
		 GridPane.setConstraints(chooseOneTopic_topicId_label, 0, 0);
		 
		 chooseOneTopic_topicId_t = new TextField();
		 chooseOneTopic_content.add(chooseOneTopic_topicId_t);
		 chooseOneTopic_topicId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(chooseOneTopic_topicId_t, 1, 0);
		 Label chooseOneTopic_studentId_label = new Label("studentId:");
		 chooseOneTopic_studentId_label.setMinWidth(Region.USE_PREF_SIZE);
		 chooseOneTopic_content.add(chooseOneTopic_studentId_label);
		 GridPane.setConstraints(chooseOneTopic_studentId_label, 0, 1);
		 
		 chooseOneTopic_studentId_t = new TextField();
		 chooseOneTopic_content.add(chooseOneTopic_studentId_t);
		 chooseOneTopic_studentId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(chooseOneTopic_studentId_t, 1, 1);
		 operationPanels.put("chooseOneTopic", chooseOneTopic);
		 
		 // ==================== GridPane_addTopic ====================
		 GridPane addTopic = new GridPane();
		 addTopic.setHgap(4);
		 addTopic.setVgap(6);
		 addTopic.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> addTopic_content = addTopic.getChildren();
		 Label addTopic_topic_label = new Label("topic:");
		 addTopic_topic_label.setMinWidth(Region.USE_PREF_SIZE);
		 addTopic_content.add(addTopic_topic_label);
		 GridPane.setConstraints(addTopic_topic_label, 0, 0);
		 
		 addTopic_topic_t = new TextField();
		 addTopic_content.add(addTopic_topic_t);
		 addTopic_topic_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addTopic_topic_t, 1, 0);
		 Label addTopic_teacherId_label = new Label("teacherId:");
		 addTopic_teacherId_label.setMinWidth(Region.USE_PREF_SIZE);
		 addTopic_content.add(addTopic_teacherId_label);
		 GridPane.setConstraints(addTopic_teacherId_label, 0, 1);
		 
		 addTopic_teacherId_t = new TextField();
		 addTopic_content.add(addTopic_teacherId_t);
		 addTopic_teacherId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addTopic_teacherId_t, 1, 1);
		 operationPanels.put("addTopic", addTopic);
		 
		 // ==================== GridPane_enterPage ====================
		 GridPane enterPage = new GridPane();
		 enterPage.setHgap(4);
		 enterPage.setVgap(6);
		 enterPage.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> enterPage_content = enterPage.getChildren();
		 Label enterPage_pageType_label = new Label("pageType:");
		 enterPage_pageType_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_pageType_label);
		 GridPane.setConstraints(enterPage_pageType_label, 0, 0);
		 
		 enterPage_pageType_t = new TextField();
		 enterPage_content.add(enterPage_pageType_t);
		 enterPage_pageType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_pageType_t, 1, 0);
		 Label enterPage_userId_label = new Label("userId:");
		 enterPage_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_userId_label);
		 GridPane.setConstraints(enterPage_userId_label, 0, 1);
		 
		 enterPage_userId_t = new TextField();
		 enterPage_content.add(enterPage_userId_t);
		 enterPage_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_userId_t, 1, 1);
		 operationPanels.put("enterPage", enterPage);
		 
		 // ==================== GridPane_uploadFile ====================
		 GridPane uploadFile = new GridPane();
		 uploadFile.setHgap(4);
		 uploadFile.setVgap(6);
		 uploadFile.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> uploadFile_content = uploadFile.getChildren();
		 Label uploadFile_fileName_label = new Label("fileName:");
		 uploadFile_fileName_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_fileName_label);
		 GridPane.setConstraints(uploadFile_fileName_label, 0, 0);
		 
		 uploadFile_fileName_t = new TextField();
		 uploadFile_content.add(uploadFile_fileName_t);
		 uploadFile_fileName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_fileName_t, 1, 0);
		 Label uploadFile_fileType_label = new Label("fileType:");
		 uploadFile_fileType_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_fileType_label);
		 GridPane.setConstraints(uploadFile_fileType_label, 0, 1);
		 
		 uploadFile_fileType_t = new TextField();
		 uploadFile_content.add(uploadFile_fileType_t);
		 uploadFile_fileType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_fileType_t, 1, 1);
		 Label uploadFile_studentId_label = new Label("studentId:");
		 uploadFile_studentId_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_studentId_label);
		 GridPane.setConstraints(uploadFile_studentId_label, 0, 2);
		 
		 uploadFile_studentId_t = new TextField();
		 uploadFile_content.add(uploadFile_studentId_t);
		 uploadFile_studentId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_studentId_t, 1, 2);
		 operationPanels.put("uploadFile", uploadFile);
		 
		 // ==================== GridPane_enterPage ====================
		 GridPane enterPage = new GridPane();
		 enterPage.setHgap(4);
		 enterPage.setVgap(6);
		 enterPage.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> enterPage_content = enterPage.getChildren();
		 Label enterPage_pageType_label = new Label("pageType:");
		 enterPage_pageType_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_pageType_label);
		 GridPane.setConstraints(enterPage_pageType_label, 0, 0);
		 
		 enterPage_pageType_t = new TextField();
		 enterPage_content.add(enterPage_pageType_t);
		 enterPage_pageType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_pageType_t, 1, 0);
		 Label enterPage_userId_label = new Label("userId:");
		 enterPage_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_userId_label);
		 GridPane.setConstraints(enterPage_userId_label, 0, 1);
		 
		 enterPage_userId_t = new TextField();
		 enterPage_content.add(enterPage_userId_t);
		 enterPage_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_userId_t, 1, 1);
		 operationPanels.put("enterPage", enterPage);
		 
		 // ==================== GridPane_getFile ====================
		 GridPane getFile = new GridPane();
		 getFile.setHgap(4);
		 getFile.setVgap(6);
		 getFile.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> getFile_content = getFile.getChildren();
		 Label getFile_fileId_label = new Label("fileId:");
		 getFile_fileId_label.setMinWidth(Region.USE_PREF_SIZE);
		 getFile_content.add(getFile_fileId_label);
		 GridPane.setConstraints(getFile_fileId_label, 0, 0);
		 
		 getFile_fileId_t = new TextField();
		 getFile_content.add(getFile_fileId_t);
		 getFile_fileId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(getFile_fileId_t, 1, 0);
		 operationPanels.put("getFile", getFile);
		 
		 // ==================== GridPane_viewFile ====================
		 GridPane viewFile = new GridPane();
		 viewFile.setHgap(4);
		 viewFile.setVgap(6);
		 viewFile.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> viewFile_content = viewFile.getChildren();
		 Label viewFile_file_label = new Label("file:");
		 viewFile_file_label.setMinWidth(Region.USE_PREF_SIZE);
		 viewFile_content.add(viewFile_file_label);
		 GridPane.setConstraints(viewFile_file_label, 0, 0);
		 
		 viewFile_file_t = new TextField();
		 viewFile_content.add(viewFile_file_t);
		 viewFile_file_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(viewFile_file_t, 1, 0);
		 operationPanels.put("viewFile", viewFile);
		 
		 // ==================== GridPane_enterPage ====================
		 GridPane enterPage = new GridPane();
		 enterPage.setHgap(4);
		 enterPage.setVgap(6);
		 enterPage.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> enterPage_content = enterPage.getChildren();
		 Label enterPage_pageType_label = new Label("pageType:");
		 enterPage_pageType_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_pageType_label);
		 GridPane.setConstraints(enterPage_pageType_label, 0, 0);
		 
		 enterPage_pageType_t = new TextField();
		 enterPage_content.add(enterPage_pageType_t);
		 enterPage_pageType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_pageType_t, 1, 0);
		 Label enterPage_userId_label = new Label("userId:");
		 enterPage_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_userId_label);
		 GridPane.setConstraints(enterPage_userId_label, 0, 1);
		 
		 enterPage_userId_t = new TextField();
		 enterPage_content.add(enterPage_userId_t);
		 enterPage_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_userId_t, 1, 1);
		 operationPanels.put("enterPage", enterPage);
		 
		 // ==================== GridPane_giveComment ====================
		 GridPane giveComment = new GridPane();
		 giveComment.setHgap(4);
		 giveComment.setVgap(6);
		 giveComment.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> giveComment_content = giveComment.getChildren();
		 Label giveComment_comment_label = new Label("comment:");
		 giveComment_comment_label.setMinWidth(Region.USE_PREF_SIZE);
		 giveComment_content.add(giveComment_comment_label);
		 GridPane.setConstraints(giveComment_comment_label, 0, 0);
		 
		 giveComment_comment_t = new TextField();
		 giveComment_content.add(giveComment_comment_t);
		 giveComment_comment_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(giveComment_comment_t, 1, 0);
		 Label giveComment_fileId_label = new Label("fileId:");
		 giveComment_fileId_label.setMinWidth(Region.USE_PREF_SIZE);
		 giveComment_content.add(giveComment_fileId_label);
		 GridPane.setConstraints(giveComment_fileId_label, 0, 1);
		 
		 giveComment_fileId_t = new TextField();
		 giveComment_content.add(giveComment_fileId_t);
		 giveComment_fileId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(giveComment_fileId_t, 1, 1);
		 operationPanels.put("giveComment", giveComment);
		 
		 // ==================== GridPane_enterPage ====================
		 GridPane enterPage = new GridPane();
		 enterPage.setHgap(4);
		 enterPage.setVgap(6);
		 enterPage.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> enterPage_content = enterPage.getChildren();
		 Label enterPage_pageType_label = new Label("pageType:");
		 enterPage_pageType_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_pageType_label);
		 GridPane.setConstraints(enterPage_pageType_label, 0, 0);
		 
		 enterPage_pageType_t = new TextField();
		 enterPage_content.add(enterPage_pageType_t);
		 enterPage_pageType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_pageType_t, 1, 0);
		 Label enterPage_userId_label = new Label("userId:");
		 enterPage_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 enterPage_content.add(enterPage_userId_label);
		 GridPane.setConstraints(enterPage_userId_label, 0, 1);
		 
		 enterPage_userId_t = new TextField();
		 enterPage_content.add(enterPage_userId_t);
		 enterPage_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(enterPage_userId_t, 1, 1);
		 operationPanels.put("enterPage", enterPage);
		 
		 // ==================== GridPane_getComment ====================
		 GridPane getComment = new GridPane();
		 getComment.setHgap(4);
		 getComment.setVgap(6);
		 getComment.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> getComment_content = getComment.getChildren();
		 Label getComment_fileId_label = new Label("fileId:");
		 getComment_fileId_label.setMinWidth(Region.USE_PREF_SIZE);
		 getComment_content.add(getComment_fileId_label);
		 GridPane.setConstraints(getComment_fileId_label, 0, 0);
		 
		 getComment_fileId_t = new TextField();
		 getComment_content.add(getComment_fileId_t);
		 getComment_fileId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(getComment_fileId_t, 1, 0);
		 operationPanels.put("getComment", getComment);
		 
		 // ==================== GridPane_uploadFile ====================
		 GridPane uploadFile = new GridPane();
		 uploadFile.setHgap(4);
		 uploadFile.setVgap(6);
		 uploadFile.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> uploadFile_content = uploadFile.getChildren();
		 Label uploadFile_fileName_label = new Label("fileName:");
		 uploadFile_fileName_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_fileName_label);
		 GridPane.setConstraints(uploadFile_fileName_label, 0, 0);
		 
		 uploadFile_fileName_t = new TextField();
		 uploadFile_content.add(uploadFile_fileName_t);
		 uploadFile_fileName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_fileName_t, 1, 0);
		 Label uploadFile_fileType_label = new Label("fileType:");
		 uploadFile_fileType_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_fileType_label);
		 GridPane.setConstraints(uploadFile_fileType_label, 0, 1);
		 
		 uploadFile_fileType_t = new TextField();
		 uploadFile_content.add(uploadFile_fileType_t);
		 uploadFile_fileType_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_fileType_t, 1, 1);
		 Label uploadFile_studentId_label = new Label("studentId:");
		 uploadFile_studentId_label.setMinWidth(Region.USE_PREF_SIZE);
		 uploadFile_content.add(uploadFile_studentId_label);
		 GridPane.setConstraints(uploadFile_studentId_label, 0, 2);
		 
		 uploadFile_studentId_t = new TextField();
		 uploadFile_content.add(uploadFile_studentId_t);
		 uploadFile_studentId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(uploadFile_studentId_t, 1, 2);
		 operationPanels.put("uploadFile", uploadFile);
		 
	}	

	public void actorTreeViewBinding() {
		
		TreeItem<String> treeRootstudent = new TreeItem<String>("Root node");
			TreeItem<String> subTreeRoot_chooseTopic = new TreeItem<String>("chooseTopic");
			subTreeRoot_chooseTopic.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("getAllTopics"),
					 	new TreeItem<String>("chooseOneTopic")
				 		));	
			TreeItem<String> subTreeRoot_uploadFile = new TreeItem<String>("uploadFile");
			subTreeRoot_uploadFile.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("enterPage"),
					 	new TreeItem<String>("uploadFile")
				 		));	
			TreeItem<String> subTreeRoot_modifyFile = new TreeItem<String>("modifyFile");
			subTreeRoot_modifyFile.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("enterPage"),
					 	new TreeItem<String>("getComment"),
					 	new TreeItem<String>("uploadFile")
				 		));	
		
		treeRootstudent.getChildren().addAll(Arrays.asList(
			subTreeRoot_chooseTopic,
			subTreeRoot_uploadFile,
			subTreeRoot_modifyFile
			));
		
		treeRootstudent.setExpanded(true);

		actor_treeview_student.setShowRoot(false);
		actor_treeview_student.setRoot(treeRootstudent);
		
		//TreeView click, then open the GridPane for inputing parameters
		actor_treeview_student.getSelectionModel().selectedItemProperty().addListener(
						 (observable, oldValue, newValue) -> { 
						 								
						 							 //clear the previous return
													 operation_return_pane.setContent(new Label());
													 
						 							 clickedOp = newValue.getValue();
						 							 GridPane op = operationPanels.get(clickedOp);
						 							 VBox vb = opInvariantPanel.get(clickedOp);
						 							 
						 							 //op pannel
						 							 if (op != null) {
						 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
						 								 
						 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
						 								 choosenOperation = new LinkedList<TextField>();
						 								 for (Node n : l) {
						 								 	 if (n instanceof TextField) {
						 								 	 	choosenOperation.add((TextField)n);
						 								 	  }
						 								 }
						 								 
						 								 definition.setText(definitions_map.get(newValue.getValue()));
						 								 precondition.setText(preconditions_map.get(newValue.getValue()));
						 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
						 								 
						 						     }
						 							 else {
						 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
						 								 l.setPadding(new Insets(8, 8, 8, 8));
						 								 operation_paras.setContent(l);
						 							 }	
						 							 
						 							 //op invariants
						 							 if (vb != null) {
						 							 	ScrollPane scrollPane = new ScrollPane(vb);
						 							 	scrollPane.setFitToWidth(true);
						 							 	invariants_panes.setMaxHeight(200); 
						 							 	//all_invariant_pane.setContent(scrollPane);	
						 							 	
						 							 	invariants_panes.setContent(scrollPane);
						 							 } else {
						 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
						 							     l.setPadding(new Insets(8, 8, 8, 8));
						 							     invariants_panes.setContent(l);
						 							 }
						 							 
						 							 //reset pre- and post-conditions area color
						 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
						 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
						 							 //reset condition panel title
						 							 precondition_pane.setText("Precondition");
						 							 postcondition_pane.setText("Postcondition");
						 						} 
						 				);
		TreeItem<String> treeRootteacher = new TreeItem<String>("Root node");
			TreeItem<String> subTreeRoot_addTopic = new TreeItem<String>("addTopic");
			subTreeRoot_addTopic.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("addTopic")
				 		));	
			TreeItem<String> subTreeRoot_viewFile = new TreeItem<String>("viewFile");
			subTreeRoot_viewFile.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("enterPage"),
					 	new TreeItem<String>("getFile"),
					 	new TreeItem<String>("viewFile")
				 		));	
			TreeItem<String> subTreeRoot_giveComment = new TreeItem<String>("giveComment");
			subTreeRoot_giveComment.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("enterPage"),
					 	new TreeItem<String>("giveComment")
				 		));	
		
		treeRootteacher.getChildren().addAll(Arrays.asList(
			subTreeRoot_addTopic,
			subTreeRoot_viewFile,
			subTreeRoot_giveComment
			));
		
		treeRootteacher.setExpanded(true);

		actor_treeview_teacher.setShowRoot(false);
		actor_treeview_teacher.setRoot(treeRootteacher);
		
		//TreeView click, then open the GridPane for inputing parameters
		actor_treeview_teacher.getSelectionModel().selectedItemProperty().addListener(
						 (observable, oldValue, newValue) -> { 
						 								
						 							 //clear the previous return
													 operation_return_pane.setContent(new Label());
													 
						 							 clickedOp = newValue.getValue();
						 							 GridPane op = operationPanels.get(clickedOp);
						 							 VBox vb = opInvariantPanel.get(clickedOp);
						 							 
						 							 //op pannel
						 							 if (op != null) {
						 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
						 								 
						 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
						 								 choosenOperation = new LinkedList<TextField>();
						 								 for (Node n : l) {
						 								 	 if (n instanceof TextField) {
						 								 	 	choosenOperation.add((TextField)n);
						 								 	  }
						 								 }
						 								 
						 								 definition.setText(definitions_map.get(newValue.getValue()));
						 								 precondition.setText(preconditions_map.get(newValue.getValue()));
						 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
						 								 
						 						     }
						 							 else {
						 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
						 								 l.setPadding(new Insets(8, 8, 8, 8));
						 								 operation_paras.setContent(l);
						 							 }	
						 							 
						 							 //op invariants
						 							 if (vb != null) {
						 							 	ScrollPane scrollPane = new ScrollPane(vb);
						 							 	scrollPane.setFitToWidth(true);
						 							 	invariants_panes.setMaxHeight(200); 
						 							 	//all_invariant_pane.setContent(scrollPane);	
						 							 	
						 							 	invariants_panes.setContent(scrollPane);
						 							 } else {
						 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
						 							     l.setPadding(new Insets(8, 8, 8, 8));
						 							     invariants_panes.setContent(l);
						 							 }
						 							 
						 							 //reset pre- and post-conditions area color
						 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
						 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
						 							 //reset condition panel title
						 							 precondition_pane.setText("Precondition");
						 							 postcondition_pane.setText("Postcondition");
						 						} 
						 				);
	}

	/**
	*    Execute Operation
	*/
	@FXML
	public void execute(ActionEvent event) {
		
		switch (clickedOp) {
		case "getAllTopics" : getAllTopics(); break;
		case "chooseOneTopic" : chooseOneTopic(); break;
		case "addTopic" : addTopic(); break;
		case "enterPage" : enterPage(); break;
		case "uploadFile" : uploadFile(); break;
		case "enterPage" : enterPage(); break;
		case "getFile" : getFile(); break;
		case "viewFile" : viewFile(); break;
		case "enterPage" : enterPage(); break;
		case "giveComment" : giveComment(); break;
		case "enterPage" : enterPage(); break;
		case "getComment" : getComment(); break;
		case "uploadFile" : uploadFile(); break;
		
		}
		
		System.out.println("execute buttion clicked");
		
		//checking relevant invariants
		opInvairantPanelUpdate();
	}

	/**
	*    Refresh All
	*/		
	@FXML
	public void refresh(ActionEvent event) {
		
		refreshAll();
		System.out.println("refresh all");
	}		
	
	/**
	*    Save All
	*/			
	@FXML
	public void save(ActionEvent event) {
		
		Stage stage = (Stage) mainPane.getScene().getWindow();
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save State to File");
		fileChooser.setInitialFileName("*.state");
		fileChooser.getExtensionFilters().addAll(
		         new ExtensionFilter("RMCode State File", "*.state"));
		
		File file = fileChooser.showSaveDialog(stage);
		
		if (file != null) {
			System.out.println("save state to file " + file.getAbsolutePath());				
			EntityManager.save(file);
		}
	}
	
	/**
	*    Load All
	*/			
	@FXML
	public void load(ActionEvent event) {
		
		Stage stage = (Stage) mainPane.getScene().getWindow();
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open State File");
		fileChooser.getExtensionFilters().addAll(
		         new ExtensionFilter("RMCode State File", "*.state"));
		
		File file = fileChooser.showOpenDialog(stage);
		
		if (file != null) {
			System.out.println("choose file" + file.getAbsolutePath());
			EntityManager.load(file); 
		}
		
		//refresh GUI after load data
		refreshAll();
	}
	
	
	//precondition unsat dialog
	public void preconditionUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("Precondtion is not satisfied");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}
	
	//postcondition unsat dialog
	public void postconditionUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("Postcondtion is not satisfied");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}

	public void thirdpartyServiceUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("third party service is exception");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}		
	
	
	public void getAllTopics() {
		
		System.out.println("execute getAllTopics");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: getAllTopics in service: ChooseTopicService ");
		
		try {
			//invoke op with parameters
				Topic r = choosetopicservice_service.getAllTopics(
				Integer.valueOf(getAllTopics_teacherId_t.getText())
				);
			
				//binding result to GUI
				TableView<Map<String, String>> tableTopic = new TableView<Map<String, String>>();
				TableColumn<Map<String, String>, String> tableTopic_TopicId = new TableColumn<Map<String, String>, String>("TopicId");
				tableTopic_TopicId.setMinWidth("TopicId".length()*10);
				tableTopic_TopicId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicId"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicId);
				TableColumn<Map<String, String>, String> tableTopic_TopicName = new TableColumn<Map<String, String>, String>("TopicName");
				tableTopic_TopicName.setMinWidth("TopicName".length()*10);
				tableTopic_TopicName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicName"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicName);
				TableColumn<Map<String, String>, String> tableTopic_TopicMeaning = new TableColumn<Map<String, String>, String>("TopicMeaning");
				tableTopic_TopicMeaning.setMinWidth("TopicMeaning".length()*10);
				tableTopic_TopicMeaning.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicMeaning"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicMeaning);
				TableColumn<Map<String, String>, String> tableTopic_TopicTarget = new TableColumn<Map<String, String>, String>("TopicTarget");
				tableTopic_TopicTarget.setMinWidth("TopicTarget".length()*10);
				tableTopic_TopicTarget.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicTarget"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicTarget);
				TableColumn<Map<String, String>, String> tableTopic_TopicMethod = new TableColumn<Map<String, String>, String>("TopicMethod");
				tableTopic_TopicMethod.setMinWidth("TopicMethod".length()*10);
				tableTopic_TopicMethod.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicMethod"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicMethod);
				TableColumn<Map<String, String>, String> tableTopic_TopicContent = new TableColumn<Map<String, String>, String>("TopicContent");
				tableTopic_TopicContent.setMinWidth("TopicContent".length()*10);
				tableTopic_TopicContent.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("TopicContent"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_TopicContent);
				TableColumn<Map<String, String>, String> tableTopic_UserId = new TableColumn<Map<String, String>, String>("UserId");
				tableTopic_UserId.setMinWidth("UserId".length()*10);
				tableTopic_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
				    }
				});	
				tableTopic.getColumns().add(tableTopic_UserId);
				
				ObservableList<Map<String, String>> dataTopic = FXCollections.observableArrayList();
				
					Map<String, String> unit = new HashMap<String, String>();
					unit.put("TopicId", String.valueOf(r.getTopicId()));
					if (r.getTopicName() != null)
						unit.put("TopicName", String.valueOf(r.getTopicName()));
					else
						unit.put("TopicName", "");
					if (r.getTopicMeaning() != null)
						unit.put("TopicMeaning", String.valueOf(r.getTopicMeaning()));
					else
						unit.put("TopicMeaning", "");
					if (r.getTopicTarget() != null)
						unit.put("TopicTarget", String.valueOf(r.getTopicTarget()));
					else
						unit.put("TopicTarget", "");
					if (r.getTopicMethod() != null)
						unit.put("TopicMethod", String.valueOf(r.getTopicMethod()));
					else
						unit.put("TopicMethod", "");
					if (r.getTopicContent() != null)
						unit.put("TopicContent", String.valueOf(r.getTopicContent()));
					else
						unit.put("TopicContent", "");
					unit.put("UserId", String.valueOf(r.getUserId()));
					dataTopic.add(unit);
				
				
				tableTopic.setItems(dataTopic);
				operation_return_pane.setContent(tableTopic);					
					
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void chooseOneTopic() {
		
		System.out.println("execute chooseOneTopic");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: chooseOneTopic in service: ChooseTopicService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(choosetopicservice_service.chooseOneTopic(
			Integer.valueOf(chooseOneTopic_topicId_t.getText()),
			Integer.valueOf(chooseOneTopic_studentId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void addTopic() {
		
		System.out.println("execute addTopic");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: addTopic in service: AddTopicService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(addtopicservice_service.addTopic(,
			Integer.valueOf(addTopic_teacherId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void enterPage() {
		
		System.out.println("execute enterPage");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: enterPage in service: UploadFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(uploadfileservice_service.enterPage(
			Integer.valueOf(enterPage_pageType_t.getText()),
			Integer.valueOf(enterPage_userId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void uploadFile() {
		
		System.out.println("execute uploadFile");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: uploadFile in service: UploadFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(uploadfileservice_service.uploadFile(
			uploadFile_fileName_t.getText(),
			Integer.valueOf(uploadFile_fileType_t.getText()),
			Integer.valueOf(uploadFile_studentId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void enterPage() {
		
		System.out.println("execute enterPage");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: enterPage in service: ViewFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(viewfileservice_service.enterPage(
			Integer.valueOf(enterPage_pageType_t.getText()),
			Integer.valueOf(enterPage_userId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void getFile() {
		
		System.out.println("execute getFile");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: getFile in service: ViewFileService ");
		
		try {
			//invoke op with parameters
				File r = viewfileservice_service.getFile(
				Integer.valueOf(getFile_fileId_t.getText())
				);
			
				//binding result to GUI
				TableView<Map<String, String>> tableFile = new TableView<Map<String, String>>();
				TableColumn<Map<String, String>, String> tableFile_FileId = new TableColumn<Map<String, String>, String>("FileId");
				tableFile_FileId.setMinWidth("FileId".length()*10);
				tableFile_FileId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("FileId"));
				    }
				});	
				tableFile.getColumns().add(tableFile_FileId);
				TableColumn<Map<String, String>, String> tableFile_FileName = new TableColumn<Map<String, String>, String>("FileName");
				tableFile_FileName.setMinWidth("FileName".length()*10);
				tableFile_FileName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("FileName"));
				    }
				});	
				tableFile.getColumns().add(tableFile_FileName);
				TableColumn<Map<String, String>, String> tableFile_FilePath = new TableColumn<Map<String, String>, String>("FilePath");
				tableFile_FilePath.setMinWidth("FilePath".length()*10);
				tableFile_FilePath.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("FilePath"));
				    }
				});	
				tableFile.getColumns().add(tableFile_FilePath);
				TableColumn<Map<String, String>, String> tableFile_Comment = new TableColumn<Map<String, String>, String>("Comment");
				tableFile_Comment.setMinWidth("Comment".length()*10);
				tableFile_Comment.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("Comment"));
				    }
				});	
				tableFile.getColumns().add(tableFile_Comment);
				TableColumn<Map<String, String>, String> tableFile_FileType = new TableColumn<Map<String, String>, String>("FileType");
				tableFile_FileType.setMinWidth("FileType".length()*10);
				tableFile_FileType.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("FileType"));
				    }
				});	
				tableFile.getColumns().add(tableFile_FileType);
				TableColumn<Map<String, String>, String> tableFile_UserId = new TableColumn<Map<String, String>, String>("UserId");
				tableFile_UserId.setMinWidth("UserId".length()*10);
				tableFile_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
					@Override
				    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
				        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
				    }
				});	
				tableFile.getColumns().add(tableFile_UserId);
				
				ObservableList<Map<String, String>> dataFile = FXCollections.observableArrayList();
				
					Map<String, String> unit = new HashMap<String, String>();
					unit.put("FileId", String.valueOf(r.getFileId()));
					if (r.getFileName() != null)
						unit.put("FileName", String.valueOf(r.getFileName()));
					else
						unit.put("FileName", "");
					if (r.getFilePath() != null)
						unit.put("FilePath", String.valueOf(r.getFilePath()));
					else
						unit.put("FilePath", "");
					if (r.getComment() != null)
						unit.put("Comment", String.valueOf(r.getComment()));
					else
						unit.put("Comment", "");
					unit.put("FileType", String.valueOf(r.getFileType()));
					unit.put("UserId", String.valueOf(r.getUserId()));
					dataFile.add(unit);
				
				
				tableFile.setItems(dataFile);
				operation_return_pane.setContent(tableFile);					
					
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void viewFile() {
		
		System.out.println("execute viewFile");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: viewFile in service: ViewFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(viewfileservice_service.viewFile(
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void enterPage() {
		
		System.out.println("execute enterPage");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: enterPage in service: GiveCommentService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(givecommentservice_service.enterPage(
			Integer.valueOf(enterPage_pageType_t.getText()),
			Integer.valueOf(enterPage_userId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void giveComment() {
		
		System.out.println("execute giveComment");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: giveComment in service: GiveCommentService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(givecommentservice_service.giveComment(
			giveComment_comment_t.getText(),
			Integer.valueOf(giveComment_fileId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void enterPage() {
		
		System.out.println("execute enterPage");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: enterPage in service: ModifyFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(modifyfileservice_service.enterPage(
			Integer.valueOf(enterPage_pageType_t.getText()),
			Integer.valueOf(enterPage_userId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void getComment() {
		
		System.out.println("execute getComment");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: getComment in service: ModifyFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(modifyfileservice_service.getComment(
			Integer.valueOf(getComment_fileId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void uploadFile() {
		
		System.out.println("execute uploadFile");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: uploadFile in service: ModifyFileService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(modifyfileservice_service.uploadFile(
			uploadFile_fileName_t.getText(),
			Integer.valueOf(uploadFile_fileType_t.getText()),
			Integer.valueOf(uploadFile_studentId_t.getText())
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}




	//select object index
	int objectindex;
	
	@FXML
	TabPane mainPane;

	@FXML
	TextArea log;
	
	@FXML
	TreeView<String> actor_treeview_student;
	@FXML
	TreeView<String> actor_treeview_teacher;

	@FXML
	TextArea definition;
	@FXML
	TextArea precondition;
	@FXML
	TextArea postcondition;
	@FXML
	TextArea invariants;
	
	@FXML
	TitledPane precondition_pane;
	@FXML
	TitledPane postcondition_pane;
	
	//chosen operation textfields
	List<TextField> choosenOperation;
	String clickedOp;
		
	@FXML
	TableView<ClassInfo> class_statisic;
	@FXML
	TableView<AssociationInfo> association_statisic;
	
	Map<String, ObservableList<AssociationInfo>> allassociationData;
	ObservableList<ClassInfo> classInfodata;
	
	GROUP2System group2system_service;
	ThirdPartyServices thirdpartyservices_service;
	ChooseTopicService choosetopicservice_service;
	AddTopicService addtopicservice_service;
	UploadFileService uploadfileservice_service;
	ViewFileService viewfileservice_service;
	GiveCommentService givecommentservice_service;
	ModifyFileService modifyfileservice_service;
	
	ClassInfo user;
	ClassInfo topic;
	ClassInfo file;
	ClassInfo userchoosetopic;
		
	@FXML
	TitledPane object_statics;
	Map<String, TableView> allObjectTables;
	
	@FXML
	TitledPane operation_paras;
	
	@FXML
	TitledPane operation_return_pane;
	
	@FXML
	TitledPane all_invariant_pane;
	
	@FXML
	TitledPane invariants_panes;
	
	Map<String, GridPane> operationPanels;
	Map<String, VBox> opInvariantPanel;
	
	//all textfiled or eumntity
	TextField getAllTopics_teacherId_t;
	TextField chooseOneTopic_topicId_t;
	TextField chooseOneTopic_studentId_t;
	TextField addTopic_topic_t;
	TextField addTopic_teacherId_t;
	TextField enterPage_pageType_t;
	TextField enterPage_userId_t;
	TextField uploadFile_fileName_t;
	TextField uploadFile_fileType_t;
	TextField uploadFile_studentId_t;
	TextField enterPage_pageType_t;
	TextField enterPage_userId_t;
	TextField getFile_fileId_t;
	TextField viewFile_file_t;
	TextField enterPage_pageType_t;
	TextField enterPage_userId_t;
	TextField giveComment_comment_t;
	TextField giveComment_fileId_t;
	TextField enterPage_pageType_t;
	TextField enterPage_userId_t;
	TextField getComment_fileId_t;
	TextField uploadFile_fileName_t;
	TextField uploadFile_fileType_t;
	TextField uploadFile_studentId_t;
	
	HashMap<String, String> definitions_map;
	HashMap<String, String> preconditions_map;
	HashMap<String, String> postconditions_map;
	HashMap<String, String> invariants_map;
	LinkedHashMap<String, String> service_invariants_map;
	LinkedHashMap<String, String> entity_invariants_map;
	LinkedHashMap<String, Label> service_invariants_label_map;
	LinkedHashMap<String, Label> entity_invariants_label_map;
	LinkedHashMap<String, Label> op_entity_invariants_label_map;
	LinkedHashMap<String, Label> op_service_invariants_label_map;
	

	
}
