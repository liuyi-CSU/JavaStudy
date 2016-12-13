package com.bean;

import java.util.HashMap;

//模拟一个机器人与人对话的情景(12’) 
//	创建一个机器人类(Robot), 该类有状态(String型,默认是关闭)和
//	话术(HashMap<String,String>)两个属性.
public class Robot {
	private String state="close";
	private HashMap<String,String> hm;
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Robot(String state, HashMap<String, String> hm) {
		super();
		this.state = state;
		this.hm = hm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hm == null) ? 0 : hm.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		if (hm == null) {
			if (other.hm != null)
				return false;
		} else if (!hm.equals(other.hm))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public HashMap<String, String> getHm() {
		return hm;
	}
	public void setHm(HashMap<String, String> hm) {
		this.hm = hm;
	}
	@Override
	public String toString() {
		return "Robot [state=" + state + ", hm=" + hm + "]";
	}
	
}
