package com.oracle;

public class App {
	public String Sample() {
		return "sample string";
	}
	
	public int SampleInt(boolean flag) {
		if(flag == false) {
			return 0;
		}		
		return 1 ;
	}
}
