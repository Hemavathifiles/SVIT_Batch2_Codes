package org.tnsif.acc.c2tc.staticdemo;

class User2
{
	String username;
	static String appName="InstaClone";
	
	
	User2(String username)
	{
		this.username=username;
	}
	
	void showDetalis()
	{
		System.out.println("User : "+username + " , Appname : "+appName);
	}
}
public class Static_on_Variable_Demo {

	public static void main(String[] args) {
		User2 u1=new User2("Bhavana");
		User2 u2=new User2("Arjun");

		u1.showDetalis();
		u2.showDetalis();
	}

}
