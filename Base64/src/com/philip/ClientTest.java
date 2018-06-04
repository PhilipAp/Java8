package com.philip;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ClientTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		final String textData = "Jesus is my Saviour and Kari Jobe inspires me !";
		String encodedData = Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println(encodedData);
		
		System.out.println("-------------------------------------");
		
		byte[] decodedArr = Base64.getDecoder().decode(encodedData);
		String decodedData = new String(decodedArr, "UTF-8");
		System.out.println(decodedData);
		
	}

}
