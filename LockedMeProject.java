package com.lockedme;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class LockedMeProject 
 {
	static final String folderpath="D:\\MYPhase1OppsProject\\LockedMeFiles";
    
	public static void main(String[] args) 
	  {
		//registration welcome screen
		registrationLoginMainMenu();
		
		int proceed=1;
	       
		do
		
		{
			//Variable declaration
		
		Scanner obj = new Scanner(System.in);
		int ch ;
	    //Menu 
		displayMainMenu();
		
		ch=Integer.parseInt(obj.nextLine());
		
	    switch(ch)
		{
		case 1 : getAllFiles();
		          break;
		case 2 : createFiles();
		         break;
		case 3 : deleteFile();
		         break;
		case 4 : searchFile();
		         break;
		case 5 : System.exit(0);
		         break;
		default :System.out.println("invalid operation");	    
		         break;
		}

		} while(proceed>0);
		  
	  }

	

public static void registrationLoginMainMenu() 
{
                String Username;
			    String Password;

			    Password = "123";
			    Username = "BHAGYASHREE";
			    System.out.println(" ==================================================\n");
			    System.out.println("************  WELCOME TO LockedMe.com ************\n");
			    System.out.println("---------- Your personal Digital LOCKER ----------\n");
			    System.out.println(" ==================================================\n");
			    System.out.println( "1 .Registration \n" );
			    System.out.println( "2 .Login \n" );
			    System.out.println(" ==================================================\n");
			    System.out.println("*********** WELCOME TO REGISTRATION PAGE **********\n");		
			    System.out.println(" ====================================================\n");
			   
			    Scanner input1 = new Scanner(System.in);
			    System.out.println("Enter Username : ");
			    String username = input1.next();

			    Scanner input2 = new Scanner(System.in);
			    System.out.println("Enter Password : ");
			    String password = input2.next();

			    if (username.equals(Username) && password.equals(Password))
			    {

			        System.out.println("Access Granted! Welcome!");
			    }

			    else if (username.equals(Username))
			    {
			        System.out.println("Invalid Password!");
			    } 
			    else if (password.equals(Password)) 
			    {
			        System.out.println("Invalid Username!");
	  
			    }
			     }
	
public static void displayMainMenu()
	 {
		 System.out.println("******************************************************");
		 System.out.println("------------ WELCOME Main Menu LockedMe.com-----------\n");
		 System.out.println("******************************************************");
		 System.out.println("1.Retrive all files");
		 System.out.println("2.create a new file");
		 System.out.println("3.Delete a file");
		 System.out.println("4.Search a file");
	     System.out.println("5.Exit");
	     System.out.println("******************************************************");
	     System.out.println(" ----------------ENTER YOUR CHOICE------------------\n");
	     System.out.println("******************************************************");
     
	 }

	
// RETRIVE ALL FILE NAME 
public static void getAllFiles()
{
//GET THE FILE NAME 
List<String> fileNames = FileManager.getAllFiles(folderpath);
				
for(String f:fileNames)
System.out.println(f);
}



/**
 * THIS METHOD IS USED FOR CREATE THE FILES 
 */
//CREATE ALL FILE NAMES 
public static void createFiles()  
{
//Variable Declartion 
Scanner obj = new Scanner(System.in);
String fileName;
int linesCount;
List<String> content = new ArrayList<String>();

//Read file name from user 
System.out.println("Enter The FileName:");
fileName = obj.nextLine();

//Read number of lines from user 
System.out.println("Enter how many lines in the file:");
linesCount =Integer.parseInt(obj.nextLine());

//Read Lines from user 
for(int i=1; i<=linesCount; i++)
{
System.out.println("Enter line" +i+ ":");
content.add(obj.nextLine());
}

//Save and store  the content into the file 
boolean isSaved = FileManager.createFiles(folderpath, fileName, content);

if(isSaved)
{
System.out.println("File and data.saved successfully");
}
else
{
System.out.println("some error occured please contact admin@meg.com ");
}
//close Scanner object 
//obj.close();
}
/**
 * THIS METHOD IS USED FOR DELETE THE FILE 
 */
//DELETE THE FILE
public static void deleteFile() 
{
	//code for deleting a file 
	String fileName;
	
Scanner obj = new Scanner(System.in);
System.out.println("ENTER FILE NAME TO BE DELETED: ");
 fileName = obj.nextLine();
  boolean isDeleted =FileManager.deleteFile(folderpath ,fileName);  
{ 
if(isDeleted)
{
System.out.println("FILE DELETED SUCCESSFULLY:");
}
else
{
System.out.println("EITHER FILE NOT THERE OR SOME ACCESS ISSUE: ");
}
}
//close Scanner object 
//obj.close();
}



/**
 * THIS IS METHOD IS USED FOR SERACH THE FILE 
 */
//SEARCH THE FILE  
public static void searchFile()
{
	//code for searching a file 
	
	String fileName;
	
	Scanner obj = new Scanner(System.in);
	System.out.println("ENTER THE FILE NAME TO BE SEARCHED:");
	
	fileName= obj.nextLine();

   	
   boolean isFound =FileManager.searchFile(folderpath,fileName);
			
if(isFound)
{
		System.out.println("FILE IS PRESENT IN THE FOLDER:");
}
		else
		{		
    
		System.out.println("FILE IS NOT PRESENT IN THE FOLDER ");
}		
}


}
 
 
	
	
	

 
 

