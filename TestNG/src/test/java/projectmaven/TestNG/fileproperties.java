package projectmaven.TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class fileproperties {

	public static void main(String[] args) {
		Properties obj=new Properties();
		try {
		FileInputStream obj1 =new FileInputStream("D:\\eclipse-workspace\\TestNG\\config.properties");
		obj.load(obj1);
      String URL=obj.getProperty("URL");
      String User_Name =obj.getProperty("User_Name");
      String email =obj.getProperty("email");
      String password =obj.getProperty("password");
      String address =obj.getProperty("address");
      String mobile_no =obj.getProperty("mobile_no");
      System.out.println(URL);
      System.out.println(User_Name);
      System.out.println(email);
      System.out.println(password);
      System.out.println(address);
      System.out.println(mobile_no);
            } catch(Exception e) {
    	  System.out.println(e);
      }
	}
	}


