package com.icss.mvc.entity;

import java.sql.Timestamp;

public class Client {
	private Integer clientId;
	private String clientName;
	private String tel;
	private String address;
	private Float foregift;
	private Integer bucketCnt;
	private Timestamp startDate;
	private Integer sendedCnt;
	private String pwd;
	
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getForegift() {
		return foregift;
	}
	public void setForegift(Float foregift) {
		this.foregift = foregift;
	}
	public Integer getBucketCnt() {
		return bucketCnt;
	}
	public void setBucketCnt(Integer bucketCnt) {
		this.bucketCnt = bucketCnt;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Integer getSendedCnt() {
		return sendedCnt;
	}
	public void setSendedCnt(Integer sendedCnt) {
		this.sendedCnt = sendedCnt;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
