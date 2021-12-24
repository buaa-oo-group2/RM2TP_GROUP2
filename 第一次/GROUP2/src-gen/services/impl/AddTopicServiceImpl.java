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

public class AddTopicServiceImpl implements AddTopicService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public AddTopicServiceImpl() {
		services = new ThirdPartyServicesImpl();
	}

	
	//Shared variable from system services
	
	/* Shared variable from system services and get()/set() methods */
			
	/* all get and set functions for temp property*/
				
	
	
	/* Generate inject for sharing temp variables between use cases in system service */
	public void refresh() {
		GROUP2System group2system_service = (GROUP2System) ServiceManager.getAllInstancesOf("GROUP2System").get(0);
	}
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public boolean addTopic(Topic topic, int teacherId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get teacher
		User teacher = null;
		//no nested iterator --  iterator: any previous:any
		for (User u : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (u.getUserId() == teacherId)
			{
				teacher = u;
				break;
			}
				
			
		}
		//Get get_topic
		Topic get_topic = null;
		//no nested iterator --  iterator: any previous:any
		for (Topic t : (List<Topic>)EntityManager.getAllInstancesOf("Topic"))
		{
			if (t.getTopicId() == topic.getTopicId())
			{
				get_topic = t;
				break;
			}
				
			
		}
		/* previous state in post-condition*/

		/* check precondition */
		if (StandardOPs.oclIsundefined(teacher) == false && StandardOPs.oclIsundefined(topic) == false && get_topic == null) 
		{ 
			/* Logic here */
			Topic t = null;
			t = (Topic) EntityManager.createObject("Topic");
			t = topic;
			EntityManager.addObject("Topic", t);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			t == topic
			 && 
			StandardOPs.includes(((List<Topic>)EntityManager.getAllInstancesOf("Topic")), t)
			 && 
			true)) {
				throw new PostconditionException();
			}
			
		
			//return primitive type
			refresh();				
			return true;
		}
		else
		{
			throw new PreconditionException();
		}
		//all relevant vars : t
		//all relevant entities : Topic
	}  
	
	static {opINVRelatedEntity.put("addTopic", Arrays.asList("Topic"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
