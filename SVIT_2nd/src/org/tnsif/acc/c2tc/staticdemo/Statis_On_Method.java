package org.tnsif.acc.c2tc.staticdemo;

class PaymentGateway
{
	static void showSupportedBank() {
		System.out.println("Supported  Banks : SBI , HDFC, ICICI, Axis");
	}
}
class Hema extends PaymentGateway
{
	static void showSupportedBank()
	{
		System.out.println("helo");
	}
}
public class Statis_On_Method {

	public static void main(String[] args) {
		PaymentGateway.showSupportedBank();
		Hema.showSupportedBank();
		
	}

}
