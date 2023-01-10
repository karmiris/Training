package com;

public class ArrayExample {

	public static void main(String[] args) {
		int xyz[] = {10,20,30};
		System.out.println(xyz); // corrupt data
		System.out.println(xyz[0]);
		System.out.println("Size: "+xyz.length); 
		for (int i=0; i< xyz.length; i++ )
			System.out.println(xyz[i]);
		
		int num[] = new int[10];
		int temp = 100;
		for (int i=0; i< num.length; i++ )
			num[i] = ++temp;
		for (int i=0; i< num.length; i++ )
			System.out.println(num[i]);
	}

}
