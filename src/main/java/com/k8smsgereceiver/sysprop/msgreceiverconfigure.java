/**
 * 
 */
package com.k8smsgereceiver.sysprop;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */
@Configuration
public class msgreceiverconfigure {

	
	   @Bean
	    public ModelMapper modelMapperBean() {
	        return new ModelMapper();
	    }
}
