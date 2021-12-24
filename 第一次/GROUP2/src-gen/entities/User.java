package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class User implements Serializable {
	
	/* all primary attributes */
	private int UserId;
	private String Username;
	private String Password;
	private roleType Role;
	
	/* all references */
	private File FileToUser; 
	private List<UserChooseTopic> UsertoUserChooseTopic = new LinkedList<UserChooseTopic>(); 
	
	/* all get and set functions */
	public int getUserId() {
		return UserId;
	}	
	
	public void setUserId(int userid) {
		this.UserId = userid;
	}
	public String getUsername() {
		return Username;
	}	
	
	public void setUsername(String username) {
		this.Username = username;
	}
	public String getPassword() {
		return Password;
	}	
	
	public void setPassword(String password) {
		this.Password = password;
	}
	public roleType getRole() {
		return Role;
	}	
	
	public void setRole(roleType role) {
		this.Role = role;
	}
	
	/* all functions for reference*/
	public File getFileToUser() {
		return FileToUser;
	}	
	
	public void setFileToUser(File file) {
		this.FileToUser = file;
	}			
	public List<UserChooseTopic> getUsertoUserChooseTopic() {
		return UsertoUserChooseTopic;
	}	
	
	public void addUsertoUserChooseTopic(UserChooseTopic userchoosetopic) {
		this.UsertoUserChooseTopic.add(userchoosetopic);
	}
	
	public void deleteUsertoUserChooseTopic(UserChooseTopic userchoosetopic) {
		this.UsertoUserChooseTopic.remove(userchoosetopic);
	}
	


}
