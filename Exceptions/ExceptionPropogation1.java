package com.exception;

import java.security.PublicKey;

public class ExceptionPropogation1 {
		void m() throws Exception 
		{
			int a=55/0;
		}
		void n()throws Exception{
			m();
		}
		void p() {
			try {
				n();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		public static void main(String args[])
		{
		  ExceptionPropogation1 ee=new ExceptionPropogation1();
		  ee.p();
		  System.out.println("done");
		}
	}


