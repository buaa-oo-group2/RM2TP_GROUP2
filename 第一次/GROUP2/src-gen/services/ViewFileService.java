package services;

import entities.*;
import java.util.List;
import java.time.LocalDate;


public interface ViewFileService {

	/* all system operations of the use case*/
	String enterPage(int pageType, int userId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	File getFile(int fileId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	String viewFile(File file) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
