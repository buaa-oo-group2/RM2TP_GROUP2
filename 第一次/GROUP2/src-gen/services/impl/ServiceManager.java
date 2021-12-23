package services.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import services.*;
	
public class ServiceManager {
	
	private static Map<String, List> AllServiceInstance = new HashMap<String, List>();
	
	private static List<GROUP2System> GROUP2SystemInstances = new LinkedList<GROUP2System>();
	private static List<ThirdPartyServices> ThirdPartyServicesInstances = new LinkedList<ThirdPartyServices>();
	private static List<ChooseTopicService> ChooseTopicServiceInstances = new LinkedList<ChooseTopicService>();
	private static List<AddTopicService> AddTopicServiceInstances = new LinkedList<AddTopicService>();
	private static List<UploadFileService> UploadFileServiceInstances = new LinkedList<UploadFileService>();
	private static List<ViewFileService> ViewFileServiceInstances = new LinkedList<ViewFileService>();
	private static List<GiveCommentService> GiveCommentServiceInstances = new LinkedList<GiveCommentService>();
	private static List<ModifyFileService> ModifyFileServiceInstances = new LinkedList<ModifyFileService>();
	
	static {
		AllServiceInstance.put("GROUP2System", GROUP2SystemInstances);
		AllServiceInstance.put("ThirdPartyServices", ThirdPartyServicesInstances);
		AllServiceInstance.put("ChooseTopicService", ChooseTopicServiceInstances);
		AllServiceInstance.put("AddTopicService", AddTopicServiceInstances);
		AllServiceInstance.put("UploadFileService", UploadFileServiceInstances);
		AllServiceInstance.put("ViewFileService", ViewFileServiceInstances);
		AllServiceInstance.put("GiveCommentService", GiveCommentServiceInstances);
		AllServiceInstance.put("ModifyFileService", ModifyFileServiceInstances);
	} 
	
	public static List getAllInstancesOf(String ClassName) {
			 return AllServiceInstance.get(ClassName);
	}	
	
	public static GROUP2System createGROUP2System() {
		GROUP2System s = new GROUP2SystemImpl();
		GROUP2SystemInstances.add(s);
		return s;
	}
	public static ThirdPartyServices createThirdPartyServices() {
		ThirdPartyServices s = new ThirdPartyServicesImpl();
		ThirdPartyServicesInstances.add(s);
		return s;
	}
	public static ChooseTopicService createChooseTopicService() {
		ChooseTopicService s = new ChooseTopicServiceImpl();
		ChooseTopicServiceInstances.add(s);
		return s;
	}
	public static AddTopicService createAddTopicService() {
		AddTopicService s = new AddTopicServiceImpl();
		AddTopicServiceInstances.add(s);
		return s;
	}
	public static UploadFileService createUploadFileService() {
		UploadFileService s = new UploadFileServiceImpl();
		UploadFileServiceInstances.add(s);
		return s;
	}
	public static ViewFileService createViewFileService() {
		ViewFileService s = new ViewFileServiceImpl();
		ViewFileServiceInstances.add(s);
		return s;
	}
	public static GiveCommentService createGiveCommentService() {
		GiveCommentService s = new GiveCommentServiceImpl();
		GiveCommentServiceInstances.add(s);
		return s;
	}
	public static ModifyFileService createModifyFileService() {
		ModifyFileService s = new ModifyFileServiceImpl();
		ModifyFileServiceInstances.add(s);
		return s;
	}
}	
