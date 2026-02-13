/**
 * 
 */
package com.k8smsgereceiver.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 */
@FeignClient(name = "properties", url = "${properties.service.url}", path = "/properties")
public interface propertiesclient {

	@GetMapping("/getLip4maxis")
	public String getLip4maxis();
	
	@GetMapping("/getLip4telco")
	public String getLip4telco();
	
} // End of propertiesclient
