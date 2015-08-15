package com.levelup.jsf.radiobuttons;

import javax.annotation.ManagedBean;

@ManagedBean
public class RadioButtons {

	private String radioButtonJSF;
	private String radioButtonJSF22;
	
	public void checkExample() {
		System.out.println(radioButtonJSF);
		System.out.println(radioButtonJSF22);
	}
	
	public String getRadioButtonJSF() {
		return radioButtonJSF;
	}
	public void setRadioButtonJSF(String radioButtonJSF) {
		this.radioButtonJSF = radioButtonJSF;
	}

	public String getRadioButtonJSF22() {
		return radioButtonJSF22;
	}

	public void setRadioButtonJSF22(String radioButtonJSF22) {
		this.radioButtonJSF22 = radioButtonJSF22;
	}

}
