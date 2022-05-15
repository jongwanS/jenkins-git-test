package com.jwlim.api.model;

public class ResponseMsg {
	private String status;
	private String message;
	
	public ResponseMsg() {
	}
	
	public ResponseMsg(String status) {
		this.status = status;
	}
	public ResponseMsg(String status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public ResponseMsg setStatus(String status){
        this.status = status;
        return this;
    }
	
	public ResponseMsg setMessage(String message){
        this.message = message;
        return this;
    }
	
	public ResponseMsg build(){
        return new ResponseMsg(this.status,this.message);
    }

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
}
