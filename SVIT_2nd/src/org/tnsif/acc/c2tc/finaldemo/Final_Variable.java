package org.tnsif.acc.c2tc.finaldemo;


//UPI app Transaction Limit

class UPIApp
{
	final int Max_Daily_Limit= 100000;
	
	void showLimit()
	{
		System.out.println("Daily transfer Limit "+Max_Daily_Limit);
	}
}
public class Final_Variable {

	public static void main(String[] args) {
		UPIApp upi=new UPIApp();
		upi.showLimit();
		
	}

}
