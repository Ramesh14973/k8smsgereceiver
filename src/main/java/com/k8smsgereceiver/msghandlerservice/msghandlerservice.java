/**
 * 
 */
package com.k8smsgereceiver.msghandlerservice;

import com.k8smsgereceiver.sysprop.msgbean;
import com.k8smsgereceiver.sysprop.respondbean;

/**
 * 
 */
public interface msghandlerservice {

	public respondbean receivemessage(msgbean mbean); 
	
} // End of 
