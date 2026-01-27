/**
 * 
 */
package com.k8smsgereceiver.sysprop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class respondbean {
	
	private String msginid = null;	
    private String httpRespcode= null;
    private String status = null;
    private String statusErrorcode = null;
    private String ErrorDescribe = null;
	public String getMsginid() {
		return msginid;
	}
	public void setMsginid(String msginid) {
		this.msginid = msginid;
	}
	public String getHttpRespcode() {
		return httpRespcode;
	}
	public void setHttpRespcode(String httpRespcode) {
		this.httpRespcode = httpRespcode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusErrorcode() {
		return statusErrorcode;
	}
	public void setStatusErrorcode(String statusErrorcode) {
		this.statusErrorcode = statusErrorcode;
	}
	public String getErrorDescribe() {
		return ErrorDescribe;
	}
	public void setErrorDescribe(String errorDescribe) {
		ErrorDescribe = errorDescribe;
	}
	

} // End of respondbean
