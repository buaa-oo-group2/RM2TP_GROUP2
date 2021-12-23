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

public class GiveCommentServiceImpl implements GiveCommentService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public GiveCommentServiceImpl() {
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
	public String enterPage(int pageType, int userId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get user
		User user = null;
		//no nested iterator --  iterator: any previous:any
		for (User u : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (u.getUserId() == userId)
			{
				user = u;
				break;
			}
				
			
		}
		/* previous state in post-condition*/

		/* check precondition */
		if (pageType > 0 && pageType < 4 && StandardOPs.oclIsundefined(user) == false && user.getRole() == STUDENT) 
		{ 
			/* Logic here */
			
			
			refresh();
			// post-condition checking
			if (!(true)) {
				throw new PostconditionException();
			}
			
		
			//return primitive type
			refresh();				
			return UploadPageHTML;
		}
		else
		{
			throw new PreconditionException();
		}
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean giveComment(String comment, int fileId) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get file
		File file = null;
		//no nested iterator --  iterator: any previous:any
		for (File f : (List<File>)EntityManager.getAllInstancesOf("File"))
		{
			if (f.getFileId() == fileId)
			{
				file = f;
				break;
			}
				
			
		}
		/* previous state in post-condition*/

		/* check precondition */
		if (StandardOPs.oclIsundefined(file) == false && StandardOPs.oclIsundefined(comment) == false) 
		{ 
			/* Logic here */
			file.setComment(comment);
			
			
			refresh();
			// post-condition checking
			if (!(file.getComment() == comment
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
		//string parameters: [comment] 
		//all relevant vars : file
		//all relevant entities : File
	}  
	
	static {opINVRelatedEntity.put("giveComment", Arrays.asList("File"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
