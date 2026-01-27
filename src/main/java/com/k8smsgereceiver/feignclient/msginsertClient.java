package com.k8smsgereceiver.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.k8smsgereceiver.sysprop.msgbean;


//@FeignClient(name = "messageinservice", url = "http://localhost:8083", path = "/messageinservice")
@FeignClient(name = "messageinservice", url = "${messagein.service.url}", path = "/messageinservice")
public interface msginsertClient {

	@PostMapping("/savedata")
	public ResponseEntity<msgbean> insertdata(@RequestBody msgbean mbean);
	
} // End of msginsertClient
