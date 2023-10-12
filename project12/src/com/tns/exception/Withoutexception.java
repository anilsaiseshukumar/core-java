package com.tns.exception;

public class Withoutexception {
  public static void divide() {
	  int a=6,b=0,c;
	  try {//Exception is raised
		  c=a/b;
	  }
	  catch(ArithmeticException e) {//Exception is handling and e is a object of a exception
		  System.out.println("Exception caught"+ e.getMessage());
	  }
	  catch(ArrayIndexOutOfBoundsException e)  {
		  System.out.println("Exception caught"+ e.getMessage());
	  }
	  finally{
		  System.out.println("this will be exceuted");
	  }
	}
}
