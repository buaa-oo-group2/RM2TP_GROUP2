package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.SerializationUtils;
import java.util.Iterator;

public class GROUP2SystemImpl implements GROUP2System, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public GROUP2SystemImpl() {
		services = new ThirdPartyServicesImpl();
	}

	public void refresh() {
		ChooseTopicService choosetopicservice_service = (ChooseTopicService) ServiceManager
				.getAllInstancesOf("ChooseTopicService").get(0);
		AddTopicService addtopicservice_service = (AddTopicService) ServiceManager
				.getAllInstancesOf("AddTopicService").get(0);
		UploadFileService uploadfileservice_service = (UploadFileService) ServiceManager
				.getAllInstancesOf("UploadFileService").get(0);
		ViewFileService viewfileservice_service = (ViewFileService) ServiceManager
				.getAllInstancesOf("ViewFileService").get(0);
		GiveCommentService givecommentservice_service = (GiveCommentService) ServiceManager
				.getAllInstancesOf("GiveCommentService").get(0);
		ModifyFileService modifyfileservice_service = (ModifyFileService) ServiceManager
				.getAllInstancesOf("ModifyFileService").get(0);
	}			
	
	/* Generate buiness logic according to functional requirement */
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
