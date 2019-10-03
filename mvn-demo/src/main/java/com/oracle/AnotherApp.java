package com.oracle;

public class AnotherApp {
	public String ReturnString() {
		return "Hi";
	}
	
	public int ReturnInt(boolean flag) {
		if(flag == false) {
			return 0;
		}		
		return 1 ;
	}
}
