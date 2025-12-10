package com.nareshit.ecommerce.Exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;



public class MyErrorClass {

	private String message;
	private LocalDateTime localDateTimes;
	private String desc;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getLocalDateTimes() {
		return localDateTimes;
	}
	public void setLocalDateTimes(LocalDateTime localDateTimes) {
		this.localDateTimes = localDateTimes;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public MyErrorClass(String message, LocalDateTime localDateTimes, String desc) {
		super();
		this.message = message;
		this.localDateTimes = localDateTimes;
		this.desc = desc;
	}
	
	public MyErrorClass() {}
	@Override
	public String toString() {
		return "MyErrorClass [message=" + message + ", localDateTimes=" + localDateTimes + ", desc=" + desc + "]";
	}
	
	
}
