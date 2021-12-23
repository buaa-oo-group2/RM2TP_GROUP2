package services;

import entities.*;
import java.util.List;
import java.time.LocalDate;


public interface ModifyFileService {

	/* all system operations of the use case*/
	String enterPage(int pageType, int userId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	String getComment(int fileId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean uploadFile(String fileName, int fileType, int studentId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
