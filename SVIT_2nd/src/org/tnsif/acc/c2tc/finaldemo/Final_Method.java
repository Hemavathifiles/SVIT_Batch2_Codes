package org.tnsif.acc.c2tc.finaldemo;



//e-commerce discount cal
class ECommercePlatform
{
	final void calculateDiscount()
	{
		System.out.println("Base discount =10%");
	}
}

class Amazon extends ECommercePlatform
{

	void calculateDiscount()
	{
		System.out.println("Extra Discount =20% ");
	}
}

public class Final_Method {

	public static void main(String[] args) {
		
	}

}
