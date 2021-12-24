package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class UserChooseTopic implements Serializable {
	
	/* all primary attributes */
	private int UserId;
	private int TopicId;
	
	/* all references */
	
	/* all get and set functions */
	public int getUserId() {
		return UserId;
	}	
	
	public void setUserId(int userid) {
		this.UserId = userid;
	}
	public int getTopicId() {
		return TopicId;
	}	
	
	public void setTopicId(int topicid) {
		this.TopicId = topicid;
	}
	
	/* all functions for reference*/
	


}
