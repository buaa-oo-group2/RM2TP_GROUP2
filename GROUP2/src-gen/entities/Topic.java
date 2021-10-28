package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Topic implements Serializable {
	
	/* all primary attributes */
	private int TopicId;
	private String TopicName;
	private String TopicMeaning;
	private String TopicTarget;
	private String TopicMethod;
	private String TopicContent;
	private int UserId;
	
	/* all references */
	private User TopictoUser; 
	private List<UserChooseTopic> TopictoUserChooseTopic = new LinkedList<UserChooseTopic>(); 
	
	/* all get and set functions */
	public int getTopicId() {
		return TopicId;
	}	
	
	public void setTopicId(int topicid) {
		this.TopicId = topicid;
	}
	public String getTopicName() {
		return TopicName;
	}	
	
	public void setTopicName(String topicname) {
		this.TopicName = topicname;
	}
	public String getTopicMeaning() {
		return TopicMeaning;
	}	
	
	public void setTopicMeaning(String topicmeaning) {
		this.TopicMeaning = topicmeaning;
	}
	public String getTopicTarget() {
		return TopicTarget;
	}	
	
	public void setTopicTarget(String topictarget) {
		this.TopicTarget = topictarget;
	}
	public String getTopicMethod() {
		return TopicMethod;
	}	
	
	public void setTopicMethod(String topicmethod) {
		this.TopicMethod = topicmethod;
	}
	public String getTopicContent() {
		return TopicContent;
	}	
	
	public void setTopicContent(String topiccontent) {
		this.TopicContent = topiccontent;
	}
	public int getUserId() {
		return UserId;
	}	
	
	public void setUserId(int userid) {
		this.UserId = userid;
	}
	
	/* all functions for reference*/
	public User getTopictoUser() {
		return TopictoUser;
	}	
	
	public void setTopictoUser(User user) {
		this.TopictoUser = user;
	}			
	public List<UserChooseTopic> getTopictoUserChooseTopic() {
		return TopictoUserChooseTopic;
	}	
	
	public void addTopictoUserChooseTopic(UserChooseTopic userchoosetopic) {
		this.TopictoUserChooseTopic.add(userchoosetopic);
	}
	
	public void deleteTopictoUserChooseTopic(UserChooseTopic userchoosetopic) {
		this.TopictoUserChooseTopic.remove(userchoosetopic);
	}
	


}
