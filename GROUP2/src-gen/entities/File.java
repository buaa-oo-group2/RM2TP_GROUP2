package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class File implements Serializable {
	
	/* all primary attributes */
	private int FileId;
	private String FileName;
	private String FilePath;
	private String Comment;
	private int FileType;
	private int UserId;
	
	/* all references */
	
	/* all get and set functions */
	public int getFileId() {
		return FileId;
	}	
	
	public void setFileId(int fileid) {
		this.FileId = fileid;
	}
	public String getFileName() {
		return FileName;
	}	
	
	public void setFileName(String filename) {
		this.FileName = filename;
	}
	public String getFilePath() {
		return FilePath;
	}	
	
	public void setFilePath(String filepath) {
		this.FilePath = filepath;
	}
	public String getComment() {
		return Comment;
	}	
	
	public void setComment(String comment) {
		this.Comment = comment;
	}
	public int getFileType() {
		return FileType;
	}	
	
	public void setFileType(int filetype) {
		this.FileType = filetype;
	}
	public int getUserId() {
		return UserId;
	}	
	
	public void setUserId(int userid) {
		this.UserId = userid;
	}
	
	/* all functions for reference*/
	


}
