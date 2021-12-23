package services;

import entities.*;
import java.util.List;
import java.time.LocalDate;


public interface ChooseTopicService {

	/* all system operations of the use case*/
	Topic getAllTopics(int teacherId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean chooseOneTopic(int topicId, int studentId) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
