/**
 * 
 */
package com.k8smsgereceiver.msghandlerservice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.k8smsgereceiver.feignclient.mnpdbfeignclient;
import com.k8smsgereceiver.feignclient.msginsertClient;
import com.k8smsgereceiver.feignclient.propertiesclient;
import com.k8smsgereceiver.sysprop.Consts;
import com.k8smsgereceiver.sysprop.msgbean;
import com.k8smsgereceiver.sysprop.respondbean;

/**
 * 
 */
@Service
public class msghandlerserviceimpl implements msghandlerservice {
	private static final Logger logger = LogManager.getLogger(msghandlerserviceimpl.class);
	
	
   // @Autowired
    //private ModelMapper mapper;

    // Spring will create the implementation
    // for this class
    // and will inject the bean here (proxy)
    @Autowired
    private msginsertClient msginsertClient;
    
    @Autowired
    private mnpdbfeignclient mnpfclient;
    
    @Autowired
    private propertiesclient propclient;
	
	@Override
	public respondbean receivemessage(msgbean mbean) {
		respondbean resbean=null;
		String msginid =  null;
		try {
		debug("message revceived in debug :"+mbean.getCustid());
		info("message revceived in info :"+mbean.getCustid());
		info("message revceived in info :"+Consts.get12digitUUID());
		
		//propclient.getLip4maxis();
		
		info("Maxis Properties in info :"+propclient.getLip4maxis());
		info("Maxis IP changed in source  ---->"+propclient.getLip4telco());
		
		msginid = mbean.getCustid().substring(0, 4).toString()+Consts.get12digitUUID();
		
		
        //Communicate microservices Using FeignClient
        ResponseEntity<msgbean> msginResponse = msginsertClient.insertdata(mbean);
        //employeeResponse.setAddressResponse(addressResponse.getBody());

        // checking mnp
        String strResponse = mnpfclient.getRN(mbean.getMsisdn());
        
        info("Routing number for  :"+mbean.getMsisdn()+" = "+strResponse);
		
		resbean = new respondbean();
		resbean.setMsginid(msginid);
		resbean.setErrorDescribe("Successfully received");
		resbean.setHttpRespcode("200");
		resbean.setStatus("Received");
		resbean.setStatusErrorcode("1000");
		
		// must write code to check validation
		}catch(Exception e) 
		{e.printStackTrace();}
		return resbean;
	} // end of 

	
	private void debug(String strPrint) {
		
		logger.debug(strPrint);
	}
	
	
	private void info(String strPrint) {
		
		logger.info(strPrint);
	}
	
	
} // End of receivemessage
