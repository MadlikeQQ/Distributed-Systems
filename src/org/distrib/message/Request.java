package org.distrib.message;

import java.io.Serializable;
import java.util.SortedMap;

public class Request extends Message implements Serializable {
	private  long serialVersionUID =  -1L;
	private String operation = "";
	private String operands = "";
	private String command = "";
    private int masterport=0;
    private String value =null;
    
	public Request() {
		super();
	}
	
	public Request(String command) {
		super();
		setCommand(command);
	}
	
	public void setCommand(String command){
		this.command= command;
		int i = command.indexOf(',');
		if(i>0){
		operation = command.substring(0, i);
		operands = command.substring(i + 1 , command.length());
		}
	}
	
	public String getCommand(){
		return command;
	}
	
	public String getOperation(){
		return operation;
	}
	
	public String getOperands(){
		return operands;
	}
	
	public  long getSerialVersionID(){
		return serialVersionUID;
	}
	
	public void setSerialVersionID(long id){
		this.serialVersionUID = id;
	}
	public void setMaster(int port){
        this.masterport= port;
    }

    public int getMaster(){
        return masterport;
    }

    public void setPrevVal(String value){
        this.value=value;
    }

    public String getPrevVal(){
        return value;
    }

}
