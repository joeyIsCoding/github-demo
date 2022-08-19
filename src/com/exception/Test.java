package com.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age<18)throw new TooYoung("You are too young to participate");
			else if(age>60)throw new TooOld("You are too old to participate");
	}

}
