package com.zyro.actions;

import org.openqa.selenium.By;

public class AutoMethodModel {
	private String actionMessage;
	private By by;
	private String actionCase;
	
	public AutoMethodModel(String actionMessage, By by, String actionCase) {
		super();
		this.actionMessage = actionMessage;
		this.by = by;
		this.actionCase = actionCase;
	}

	public String getActionMessage() {
		return actionMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.actionMessage = errorMessage;
	}
	
	public By getBy() {
		return by;
	}
	
	public void setBy(By by) {
		this.by = by;
	}
	
	public String getActionCase() {
		return actionCase;
	}
	
	public void setActionCase(String actionCase) {
		this.actionCase = actionCase;
	}
	
	@Override
	public String toString() {
		return "AutoMethodModel [actionMessage = " + actionMessage + ", by = " + by + ", actionCase = " + actionCase + "]";
	}
}
