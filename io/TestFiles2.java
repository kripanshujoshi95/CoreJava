package com.raystec.io;

import java.io.FileReader;

public class TestFiles2 {
	
	public static void main(String[] args) throws Exception {
	
		FileReader fr = new FileReader("C:\\Users\\dell\\Desktop\\Concept.txt");
		
		int c = fr.read();          //Create an object integer and hold read method
		
//		while (c != -1 ) {
//			System.out.println(c);  
//			c = fr.read();
//		}
			char ch;                    //Create an object of char
		
		while (c != -1) {
			
			ch = (char) c;          //Type cast in char
			System.out.print(ch);
			c = fr.read();
			
		}fr.close();
		
	}

}
