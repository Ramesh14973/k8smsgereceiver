/**
 * 
 */
package com.k8smsgereceiver.sysprop;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 */



@Data
@Getter
@Setter
//@Document(collection="master")
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class msgbean {

	    private String RcvTime = null;
	    private String SendTime = null;
	    private String msisdn =null;
	    private String message = null;
	    private int no_of_sms = 1;
	    
	   // @Indexed(unique = true)
	    private String msginid = null;	    
	    private String msgoutid = null;
	    private String strGWURL = null;
	    private String customerroute = null;
	    private String HttpResp = null;
	    private String sender =null;
	    private String custid=null;
	    private String password=null;
	    private int dn=0;
	    private String dnurl=null;
	    private String strRecTitle=null;
	    private String strRN=null;
	    private String strTelco=null;
	    private String strCarrier=null;
	    private String strCountry=null;
	    private int msgcount = 0;
	    private String msgtype=null;
	    private String Lip4telco = null;
	    private String httpRespcode= null;
	    private String status = null;
	    private String statusErrorcode = null;
	    private String rcvstatus = null;
	    private String rcvstatusErrorcode = null;
	    private String negativeretry = null;
	    // for Singapore customer
	    private String strcontent=null;
	    
	    // carrier accountdetails
	    private String carrieraccid=null;
	    private String carrieraccpwd=null;
	    
	    private String mcc=null;
	    private String mnc=null;
	    
	    // Added 2 parameters for CIMB on 20240917
	    private String product=null;
	    private String campaignId=null;
	    
		public String getRcvTime() {
			return RcvTime;
		}
		public void setRcvTime(String rcvTime) {
			RcvTime = rcvTime;
		}
		public String getSendTime() {
			return SendTime;
		}
		public void setSendTime(String sendTime) {
			SendTime = sendTime;
		}
		public String getMsisdn() {
			return msisdn;
		}
		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public int getNo_of_sms() {
			return no_of_sms;
		}
		public void setNo_of_sms(int no_of_sms) {
			this.no_of_sms = no_of_sms;
		}
		public String getMsginid() {
			return msginid;
		}
		public void setMsginid(String msginid) {
			this.msginid = msginid;
		}
		public String getMsgoutid() {
			return msgoutid;
		}
		public void setMsgoutid(String msgoutid) {
			this.msgoutid = msgoutid;
		}
		public String getStrGWURL() {
			return strGWURL;
		}
		public void setStrGWURL(String strGWURL) {
			this.strGWURL = strGWURL;
		}
		public String getCustomerroute() {
			return customerroute;
		}
		public void setCustomerroute(String customerroute) {
			this.customerroute = customerroute;
		}
		public String getHttpResp() {
			return HttpResp;
		}
		public void setHttpResp(String httpResp) {
			HttpResp = httpResp;
		}
		public String getSender() {
			return sender;
		}
		public void setSender(String sender) {
			this.sender = sender;
		}
		public String getCustid() {
			return custid;
		}
		public void setCustid(String custid) {
			this.custid = custid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getDn() {
			return dn;
		}
		public void setDn(int dn) {
			this.dn = dn;
		}
		public String getDnurl() {
			return dnurl;
		}
		public void setDnurl(String dnurl) {
			this.dnurl = dnurl;
		}
		public String getStrRecTitle() {
			return strRecTitle;
		}
		public void setStrRecTitle(String strRecTitle) {
			this.strRecTitle = strRecTitle;
		}
		public String getStrRN() {
			return strRN;
		}
		public void setStrRN(String strRN) {
			this.strRN = strRN;
		}
		public String getStrTelco() {
			return strTelco;
		}
		public void setStrTelco(String strTelco) {
			this.strTelco = strTelco;
		}
		public String getStrCarrier() {
			return strCarrier;
		}
		public void setStrCarrier(String strCarrier) {
			this.strCarrier = strCarrier;
		}
		public String getStrCountry() {
			return strCountry;
		}
		public void setStrCountry(String strCountry) {
			this.strCountry = strCountry;
		}
		public int getMsgcount() {
			return msgcount;
		}
		public void setMsgcount(int msgcount) {
			this.msgcount = msgcount;
		}
		public String getMsgtype() {
			return msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
		public String getLip4telco() {
			return Lip4telco;
		}
		public void setLip4telco(String lip4telco) {
			Lip4telco = lip4telco;
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
		public String getRcvstatus() {
			return rcvstatus;
		}
		public void setRcvstatus(String rcvstatus) {
			this.rcvstatus = rcvstatus;
		}
		public String getRcvstatusErrorcode() {
			return rcvstatusErrorcode;
		}
		public void setRcvstatusErrorcode(String rcvstatusErrorcode) {
			this.rcvstatusErrorcode = rcvstatusErrorcode;
		}
		public String getNegativeretry() {
			return negativeretry;
		}
		public void setNegativeretry(String negativeretry) {
			this.negativeretry = negativeretry;
		}
		public String getStrcontent() {
			return strcontent;
		}
		public void setStrcontent(String strcontent) {
			this.strcontent = strcontent;
		}
		public String getCarrieraccid() {
			return carrieraccid;
		}
		public void setCarrieraccid(String carrieraccid) {
			this.carrieraccid = carrieraccid;
		}
		public String getCarrieraccpwd() {
			return carrieraccpwd;
		}
		public void setCarrieraccpwd(String carrieraccpwd) {
			this.carrieraccpwd = carrieraccpwd;
		}
		public String getMcc() {
			return mcc;
		}
		public void setMcc(String mcc) {
			this.mcc = mcc;
		}
		public String getMnc() {
			return mnc;
		}
		public void setMnc(String mnc) {
			this.mnc = mnc;
		}
		public String getProduct() {
			return product;
		}
		public void setProduct(String product) {
			this.product = product;
		}
		public String getCampaignId() {
			return campaignId;
		}
		public void setCampaignId(String campaignId) {
			this.campaignId = campaignId;
		}
	
	    
	
} // End of msgbean
