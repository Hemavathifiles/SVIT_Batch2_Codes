package org.tnsif.acc.c2tc.interfacedemo;

@FunctionalInterface
interface NotificationService
{
	void notifyUser(String message);
	
}
class EmailNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("New Email : "+ message);
		
	}	
}

class SMSNotification implements NotificationService {

	@Override
	public void notifyUser(String message) {
		System.out.println("New SMS : " + message);

	}
}



public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		EmailNotification emailnotification=new EmailNotification();
		SMSNotification smsnotification=new SMSNotification();
		
		emailnotification.notifyUser("Assignment Uploaded");
		smsnotification.notifyUser("class at 10AM");
	}

}
