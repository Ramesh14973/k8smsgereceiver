/**
 * 
 */
package com.k8smsgereceiver.sysprop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * 
 */
public class Consts {
	private static final Logger logger = LogManager.getLogger(Consts.class);

	//Operators
	public static String  oprmaxis = "maxis";
	public static String  oprcelcom = "celcom";
	public static String  oprdigi = "digi";
	public static String  oprumobile = "umobile";
	
	
	
	
	private static UUID uuid = null;	
	private static List randHelper = null;
	
	public static String get12digitUUID() {
		 
		String randdigit = null; //getUUID();
		String randdigittemp=null;
		 
		try {
			
			randdigit = getUUID();				
			if(randHelper==null){
				 randHelper = new ArrayList();
			 }
			 
			 if(randHelper.contains(randdigit)){			 
				 randdigittemp = randdigit;
				 randdigit = getUUID();
				 info(randdigittemp+ " already generated So regenerating... New number "+randdigit);
			 }else{
				 randHelper.add(randdigit); 
			 }		 
			 if(randHelper.size() > 5000){
			// if(randHelper.size() > Consts.serverSeq){
				 randHelper.clear();
				 info("randHelper cleared");			 
			 }
		}catch(Exception e) {
			e.printStackTrace();
			}finally {
				
			}
		 return randdigit;
		 
	 }  // End of get12digitUUID
	 
	 
	 
	 private static String getUUID() {
		 String uuidString = null;
		 String uniqueId = null;
		 try {
		    // Generate a random UUID
	         uuid = UUID.randomUUID();
	        // Get the string representation of the UUID
	        uuidString = uuid.toString().replaceAll("-", "");
	        // Get the first 12 digits of the UUID string
	       // uniqueId = uuidString.substring(0, 12); //celcom not support more than 19 digit transaction id
	        uniqueId = uuidString.substring(0, 10);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 uuidString = null;
		 }
	        return uniqueId;
	 } // End of getUUID
	 
	 private static void info(String strPrint) {
		 logger.info(strPrint);
	 }
} // End of Consts
