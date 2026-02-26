/**
 * 
 */
package com.k8smsgereceiver.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

/**
 * 
 */
@FeignClient(name = "properties", url = "${properties.service.url}", path = "/properties")
public interface propertiesclient {

	@GetMapping("/getLip4maxis")
	@CircuitBreaker(name = "maxisprop", fallbackMethod = "fallbackUserData")
	public String getLip4maxis();
	
	@GetMapping("/getLip4maxistelco")
	@CircuitBreaker(name = "maxisproptelco", fallbackMethod = "fallbackLip4maxistelco")
	public String getLip4maxistelco();
	
    default String fallbackUserData(Throwable throwable) {
        return "Can not retrive maxis Operator properties due to service unavailability";
    }
    
	
    default String fallbackLip4maxistelco(Throwable throwable) {
        return "Can not retrive fallbackLip4maxistelco Operator properties due to service unavailability";
    }
    
} // End of propertiesclient
