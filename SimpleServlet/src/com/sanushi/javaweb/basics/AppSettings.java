package com.sanushi.javaweb.basics;

import java.util.List;

public class AppSettings {
	
	private CssClass formCssClass;
	private String[] tabNames;
	private List<Tab> tabs;


	public CssClass getFormCssClass() {
		return formCssClass;
	}

	public void setFormCssClass(CssClass formCssClass) {
		this.formCssClass = formCssClass;
	}
		
	public String[] getTabNames() {
		return tabNames;
	}

	public void setTabNames(String[] tabNames) {
		this.tabNames = tabNames;
	}
	
	public List<Tab> getTabs() {
		return tabs;
	}

	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;
	}

}
