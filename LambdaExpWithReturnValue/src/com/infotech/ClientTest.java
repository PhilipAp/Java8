package com.infotech;

public class ClientTest {

	public static void main(String[] args) {
		
   /* MyInterface myInterface = (n1,n2)->{
    	return n1 > n2;
      };*/
		
		//Simplified version
		MyInterface myInterface = (n1,n2)-> n1 > n2;
		
      System.out.println(myInterface.test(90, 56));
      System.out.println(myInterface.test(98, 109));
	}

}
