package shopperGeneric;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadProperty implements ApplicationConstants{
	Properties pf;
	public ReadProperty() throws Exception {
	pf=new Properties();
	FileInputStream fil=new FileInputStream(Property_path);
	pf.load(fil);
	}
	
	public String url()
	{
	String url=pf.getProperty("TestUrl");
	return url;
	}
	
	public String usn()
	{
	String usn=pf.getProperty("email_id");
	return usn;
	}
	
	public String psw()
	{
	String psw=pf.getProperty("psw");
	return psw;
	}
}
