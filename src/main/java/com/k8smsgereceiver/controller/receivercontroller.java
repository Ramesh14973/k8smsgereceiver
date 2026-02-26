/**
 * 
 */
package com.k8smsgereceiver.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.k8smsgereceiver.msghandlerservice.msghandlerservice;
import com.k8smsgereceiver.sysprop.msgbean;
import com.k8smsgereceiver.sysprop.respondbean;

/**
 * 
 */
@RestController
public class receivercontroller {
	private static final Logger logger = LogManager.getLogger(receivercontroller.class);

	@Autowired
	private msghandlerservice msghandservice;
	
	
	
	@PostMapping("/receiver")
	public  ResponseEntity<respondbean> receivemessage(@RequestBody msgbean mbean) {
			
		info("receivercontroller Invoked ===================================="+mbean.getCustid());
		//msghandservice.receivemessage(mbean);
		//info("receivercontroller Invoked ===================================="+msghandservice.getLip4maxis());
		
		return new ResponseEntity<respondbean>(msghandservice.receivemessage(mbean),HttpStatus.CREATED);
				
	} // end of receivemenssage
	
	
	private void info(String strPrint) {logger.info(strPrint);}
} // End of receivercontroller
