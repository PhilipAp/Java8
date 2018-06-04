package com.infotech;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface1 myInterface1 = () ->System.out.println("This method executes using lambda ");
		             myInterface1.method1();
		             
		System.out.println("--------------------------------------------------------------------");
		
		MyInterface2 myInterface2 = (String name)->{System.out.println("Your name is "+name);};
		myInterface2.method2("KK Kabobo");
		
		
		System.out.println("--------------------------------------------------------------------");
		MyInterface3 myInterface3 = (String name, int age)->{
			System.out.println("Your name is "+name);
			System.out.println("Your are "+age+" years old");		
		};
		myInterface3.method3("Henry", 23);
	}

}
