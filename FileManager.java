package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
public class FileManager {
	
	/**
	 * This method will be return file names from the folder 
	 * @param folderpath
	 * @return List<String>
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		//Creating file object 
		File f1= new File(folderpath);
		
		//Getting all the files into a filearray 
		File[] listOfFiles = f1.listFiles();
		
		//Declare a list to store the file names 
		List<String> fileNames = new ArrayList<String>();
		
		for(File f:listOfFiles)
		fileNames.add(f.getName());
		
		//return the list 
		return fileNames;
		
	}
	
	/**
	 * This method will create or append content into the file specified 
	 * @param folderpath
	 * @param fileNames
	 * @param content
	 * @return boolean 
	 */
	
	 public static boolean createFiles(String folderpath,String fileNames,List<String> content)
	 {
		 try
		 {
			 File f1 = new File( folderpath, fileNames);
			 
			 FileWriter fw= new FileWriter(f1);
			
			 for(String s:content)
			 {
				 fw.write(s+"\n");
				 
			 }
			 fw.close();
			 return true ;
			 }
		 
		 catch(Exception Ex)
		 {
			 return false;
		 }
	 }

	public static boolean deleteFile(String folderpath, String fileName) {
		// TODO Auto-generated method stub
		 File file= new File(folderpath,fileName);
		 try
		 {
			 if(file.delete())
				 return true;
			 else 
				 return false;
		 }
		 catch(Exception Ex)
		 {
			 return false;
		 }
		 
		 
		}
	 
	

	public static boolean searchFile(String folderpath, String fileName) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	}
	     

 