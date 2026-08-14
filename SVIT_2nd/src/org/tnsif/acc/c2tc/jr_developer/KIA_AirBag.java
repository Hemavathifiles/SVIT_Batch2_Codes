package org.tnsif.acc.c2tc.jr_developer;

public class KIA_AirBag {

	 void disp_AirBags()
	{
		System.out.println("ALL KIA have airbags");
	}
	 
	 public static void main(String[] args) {
			KIA_AirBag obj=new KIA_AirBag ();
			obj.disp_AirBags();
			KIA_SpeedLimit obj1=new KIA_SpeedLimit();
			obj1.disp_SpeedLimit();
		}

}
