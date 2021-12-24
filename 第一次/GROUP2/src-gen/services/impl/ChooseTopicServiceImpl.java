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

public class ChooseTopicServiceImpl implements ChooseTopicService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public ChooseTopicServiceImpl() {
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
	public Topic getAllTopics(int teacherId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get topics
		Topic topics = null;
		//no nested iterator --  iterator: any previous:any
		for (Topic t : (List<Topic>)EntityManager.getAllInstancesOf("Topic"))
		{
			if (t.getUserId() == teacherId)
			{
				topics = t;
				break;
			}
				
			
		}
		/* previous state in post-condition*/

		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			if ((StandardOPs.size(topics) == 0))
			{
				topics = null;
				
				refresh();
				// post-condition checking
				if (!(((StandardOPs.size(topics) == 0) ? topics == null
				 && 
				true : this.getTopics() == topic
				 && 
				true))) {
					throw new PostconditionException();
				}
				
				//return code
				refresh();
				return topics;
			}
			else
			{
			 	this.setTopics(topic);
			 	
			 	refresh();
			 	// post-condition checking
			 	if (!(((StandardOPs.size(topics) == 0) ? topics == null
			 	 && 
			 	true : this.getTopics() == topic
			 	 && 
			 	true))) {
			 		throw new PostconditionException();
			 	}
			 	
			 	//return code
			 	refresh();
			 	return topics;
			}
			
			
			
		}
		else
		{
			throw new PreconditionException();
		}
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("getAllTopics", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean chooseOneTopic(int topicId, int studentId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get student
		User student = null;
		//no nested iterator --  iterator: any previous:any
		for (User user : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (user.getUserId() == studentId)
			{
				student = user;
				break;
			}
				
			
		}
		//Get topic
		Topic topic = null;
		//no nested iterator --  iterator: any previous:any
		for (Topic t : (List<Topic>)EntityManager.getAllInstancesOf("Topic"))
		{
			if (t.getTopicId() == topicId)
			{
				topic = t;
				break;
			}
				
			
		}
		/* previous state in post-condition*/

		/* check precondition */
		if (StandardOPs.oclIsundefined(topic) == false && StandardOPs.oclIsundefined(student) == false) 
		{ 
			/* Logic here */
			UserChooseTopic uct = null;
			uct = (UserChooseTopic) EntityManager.createObject("UserChooseTopic");
			uct.setUserId(studentId);
			uct.setTopicId(topicId);
			EntityManager.addObject("UserChooseTopic", uct);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			uct.getUserId() == studentId
			 && 
			uct.getTopicId() == topicId
			 && 
			StandardOPs.includes(((List<UserChooseTopic>)EntityManager.getAllInstancesOf("UserChooseTopic")), uct)
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
		//all relevant vars : uct
		//all relevant entities : UserChooseTopic
	}  
	
	static {opINVRelatedEntity.put("chooseOneTopic", Arrays.asList("UserChooseTopic"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
