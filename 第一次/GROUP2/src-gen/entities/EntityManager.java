package entities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.Method;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.File;

public class EntityManager {

	private static Map<String, List> AllInstance = new HashMap<String, List>();
	
	private static List<User> UserInstances = new LinkedList<User>();
	private static List<Topic> TopicInstances = new LinkedList<Topic>();
	private static List<File> FileInstances = new LinkedList<File>();
	private static List<UserChooseTopic> UserChooseTopicInstances = new LinkedList<UserChooseTopic>();

	
	/* Put instances list into Map */
	static {
		AllInstance.put("User", UserInstances);
		AllInstance.put("Topic", TopicInstances);
		AllInstance.put("File", FileInstances);
		AllInstance.put("UserChooseTopic", UserChooseTopicInstances);
	} 
		
	/* Save State */
	public static void save(File file) {
		
		try {
			
			ObjectOutputStream stateSave = new ObjectOutputStream(new FileOutputStream(file));
			
			stateSave.writeObject(UserInstances);
			stateSave.writeObject(TopicInstances);
			stateSave.writeObject(FileInstances);
			stateSave.writeObject(UserChooseTopicInstances);
			
			stateSave.close();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* Load State */
	public static void load(File file) {
		
		try {
			
			ObjectInputStream stateLoad = new ObjectInputStream(new FileInputStream(file));
			
			try {
				
				UserInstances =  (List<User>) stateLoad.readObject();
				AllInstance.put("User", UserInstances);
				TopicInstances =  (List<Topic>) stateLoad.readObject();
				AllInstance.put("Topic", TopicInstances);
				FileInstances =  (List<File>) stateLoad.readObject();
				AllInstance.put("File", FileInstances);
				UserChooseTopicInstances =  (List<UserChooseTopic>) stateLoad.readObject();
				AllInstance.put("UserChooseTopic", UserChooseTopicInstances);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	/* create object */  
	public static Object createObject(String Classifer) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method createObjectMethod = c.getDeclaredMethod("create" + Classifer + "Object");
			return createObjectMethod.invoke(c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* add object */  
	public static Object addObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectMethod = c.getDeclaredMethod("add" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) addObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}	
	
	/* add objects */  
	public static Object addObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectsMethod = c.getDeclaredMethod("add" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) addObjectsMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* Release object */
	public static boolean deleteObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) deleteObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/* Release objects */
	public static boolean deleteObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) deleteObjectMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}		 	
	
	 /* Get all objects belongs to same class */
	public static List getAllInstancesOf(String ClassName) {
			 return AllInstance.get(ClassName);
	}	

   /* Sub-create object */
	public static User createUserObject() {
		User o = new User();
		return o;
	}
	
	public static boolean addUserObject(User o) {
		return UserInstances.add(o);
	}
	
	public static boolean addUserObjects(List<User> os) {
		return UserInstances.addAll(os);
	}
	
	public static boolean deleteUserObject(User o) {
		return UserInstances.remove(o);
	}
	
	public static boolean deleteUserObjects(List<User> os) {
		return UserInstances.removeAll(os);
	}
	public static Topic createTopicObject() {
		Topic o = new Topic();
		return o;
	}
	
	public static boolean addTopicObject(Topic o) {
		return TopicInstances.add(o);
	}
	
	public static boolean addTopicObjects(List<Topic> os) {
		return TopicInstances.addAll(os);
	}
	
	public static boolean deleteTopicObject(Topic o) {
		return TopicInstances.remove(o);
	}
	
	public static boolean deleteTopicObjects(List<Topic> os) {
		return TopicInstances.removeAll(os);
	}
	public static File createFileObject() {
		File o = new File();
		return o;
	}
	
	public static boolean addFileObject(File o) {
		return FileInstances.add(o);
	}
	
	public static boolean addFileObjects(List<File> os) {
		return FileInstances.addAll(os);
	}
	
	public static boolean deleteFileObject(File o) {
		return FileInstances.remove(o);
	}
	
	public static boolean deleteFileObjects(List<File> os) {
		return FileInstances.removeAll(os);
	}
	public static UserChooseTopic createUserChooseTopicObject() {
		UserChooseTopic o = new UserChooseTopic();
		return o;
	}
	
	public static boolean addUserChooseTopicObject(UserChooseTopic o) {
		return UserChooseTopicInstances.add(o);
	}
	
	public static boolean addUserChooseTopicObjects(List<UserChooseTopic> os) {
		return UserChooseTopicInstances.addAll(os);
	}
	
	public static boolean deleteUserChooseTopicObject(UserChooseTopic o) {
		return UserChooseTopicInstances.remove(o);
	}
	
	public static boolean deleteUserChooseTopicObjects(List<UserChooseTopic> os) {
		return UserChooseTopicInstances.removeAll(os);
	}
  
}

