package com.enverx.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiq {
	Properties pro;
	public ReadConfiq()
	{
		File src = new File("./Confiquarations/confiq.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	public String getAdminApplicationURL()
	{
		String url = pro.getProperty("baseurl");
		return url;
	}
	public String getAdminEmail()
	{
		String adminemail = pro.getProperty("adminemail");
		return adminemail;
	}
	public String getAdminPassword()
	{
		String adminpassword = pro.getProperty("adminpassword");
		return adminpassword;
	}
	public String getUserApplicationURL()
	{
		String userurl = pro.getProperty("userbaseurl");
		return userurl;
	}
	public String getUserEmail()
	{
		String useremail = pro.getProperty("useremail");
		return useremail;
	}
	public String getUserPassword()
	{
		String userpassword = pro.getProperty("userpassword");
		return userpassword;
	}
	public String getUserInvestorEmail()
	{
		String userinvestoremail = pro.getProperty("useremailasinvestor");
		return userinvestoremail;
	}
	public String getUserInvestorPassword()
	{
		String userinvestorpassword = pro.getProperty("userpasswordasinvestor");
		return userinvestorpassword;
	}
	
	
	

}
