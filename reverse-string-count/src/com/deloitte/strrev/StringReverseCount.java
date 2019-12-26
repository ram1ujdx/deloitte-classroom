package com.deloitte.strrev;
import java.util.Scanner;
public class StringReverseCount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("Enter a String : ");
		str=in.nextLine();
		StringBuilder revStr=new StringBuilder(str);
		int count=0;
		char c;
		int n=str.length();
		for(int i=0;i<n;i++) {
			c=str.toUpperCase().charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='I' || c=='U') {
				count++;
			}
			revStr.setCharAt(n-(i+1), c);
			
		}
		
		System.out.println("Total count = "+count);
		System.out.println("Reverse = "+revStr);

	}
	

}
