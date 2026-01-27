/**
 * 
 */
package com.k8smsgereceiver.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 */
//@FeignClient(name = "mnpdbapiservice", url = "http://localhost:8084", path = "/mnpdbapiservice/master")
@FeignClient(name = "mnpdbapiservice", url = "${mnpdbapi.service.url}", path = "/mnpdbapiservice/master")
public interface mnpdbfeignclient {

	@GetMapping("/getrn")
	public String getRN(@RequestParam("msisdn") String msisdn);
	
}
