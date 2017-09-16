package com.backroads.softrip.webdriver.common.url;

public class UrlBuilder {
	private static final String UAT = "UAT";
	private static final String PROD = "PROD";
	private static final String UATBASE = "http://softrip.backroads.com/uat/softripnext/#/";
	private static final String PRODBASE = "http://www.softrip.com/backroads/softripnext/#/";
	private static final String LOGIN = "common/login";
	private static final String CALENDAR = "main/calendar";
	private static final String COMPDIRECTORY = "main/companydirectory";
	private static final String MESSAGEBOARD = "main/messageboard";
	private static final String SUPPLIERDOCS = "product/supplierdocs";
	private static final String SUPPLIERS = "product/suppliers";
	private static final String PROJECTS = "product/project/projects";
	private static final String TASKS = "product/project/tasks";
	private static final String HOTELREQUESTS = "product/project/hotelrequests";
	private static final String CONFRESERVATIONS = "operations/confirmreservations";
	private static final String MESSAGES = "operations/messages";
	private static final String VENDORDIRECT = "operations/vendordirect";
	private static final String TOURSERIES = "operations/tourseries";
	private static final String GUIDEASSIGNMENTS = "operations/guideassignments";
	private static final String INVENTORY = "operations/inventory";
	private static final String HISTORY = "operations/history";
	private static final String OPTEXPIRED = "operations/optexpired";
	private static final String BLOCKRELEASE = "operations/blockrelease";
	private static final String RESQMANAGEMENT = "operations/resqueuemanagement";
	private static final String USERS = "security/users";
	private static final String EXTERNALUSERS = "security/external-users";
	private static final String LOCKEDACCOUNTS = "security/locked-accounts";
	
	private String baseUrl;
	private String testEnv;
	
	
	public UrlBuilder(){

	}
	
	public String getTestEnv(){
		return testEnv;
	}
	
	public void setTestEnv(String env){
		testEnv = env;

		switch(testEnv){
		case "UAT":
			baseUrl = UATBASE;
			break;
		case "PROD":
			baseUrl = PRODBASE;
			break;
		default:
			if(testEnv.contains(UATBASE)){
				baseUrl = UATBASE;
				testEnv = UAT;
			} else if (testEnv.contains(PRODBASE)) {
				baseUrl = PRODBASE;
				testEnv = PROD;
			} else {
				System.out.println("***Please pass \"UAT\" or \"PROD\" .***");	
			}
			break;			
		}		
	}
	
	public String getBaseUrl(){
		return baseUrl;
	}
	
	public String buildUrl(String pageName){
		switch(pageName){
		case "LOGIN":
			return baseUrl + LOGIN;
		case "CALENDAR":
			return baseUrl + CALENDAR;
		case "SUPPLIERDOCS":
			return baseUrl + SUPPLIERDOCS;
		case "COMPDIRECTORY":
			return baseUrl + COMPDIRECTORY;
		case "MESSAGEBOARD":
			return baseUrl + MESSAGEBOARD;
		case "SUPPLIERS":
			return baseUrl + SUPPLIERS;
		case "PROJECTS":
			return baseUrl + PROJECTS;
		case "TASKS":
			return baseUrl + TASKS;
		case "HOTELREQUESTS":
			return baseUrl + HOTELREQUESTS;
		case "CONFRESERVATIONS":
			return baseUrl + CONFRESERVATIONS;
		case "MESSAGES":
			return baseUrl + MESSAGES;
		case "VENDORDIRECT":
			return baseUrl + VENDORDIRECT;
		case "TOURSERIES":
			return baseUrl + TOURSERIES;
		case "GUIDEASSIGNMENTS":
			return baseUrl + GUIDEASSIGNMENTS;
		case "INVENTORY":
			return baseUrl + INVENTORY;
		case "HISTORY":
			return baseUrl + HISTORY;
		case "OPTEXPIRED":
			return baseUrl + OPTEXPIRED;
		case "BLOCKRELEASE":
			return baseUrl + BLOCKRELEASE;
		case "RESQMANAGEMENT":
			return baseUrl + RESQMANAGEMENT;
		case "USERS": 
			return baseUrl + USERS;
		case "EXTERNALUSERS":
			return baseUrl + EXTERNALUSERS;
		case "LOCKEDACCOUNTS":
			return baseUrl + LOCKEDACCOUNTS;
	    default:
	    	return "Please pass a correct argument: LOGIN, CALENDAR, SUPPLYRDOCS etc.  See UrlBuilder.java";
		}
	}
	
	public String getLoginPageUrl(){
		return baseUrl + LOGIN;
	}
/*	
	public String getCalendarPageUrl(){
		return baseUrl + CALENDAR;
	}

	public String getSupplierDocsPageUrl(){
		return baseUrl + SUPPLIERDOCS;
	}
*/
}
