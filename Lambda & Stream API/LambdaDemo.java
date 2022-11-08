package com.java8;

interface A
{
	void show(int i,int j);
}
//class B implements A
//{
//	public void show() {
//		System.out.println("Hello");
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj;
//		obj=new A()//Anonymous inner class
//				{
//					public void show()
//					{
//						System.out.println("Hello");
//					}
//				};
		obj=(i,j) ->System.out.println("hello "+i+ " " +j);
		obj.show(7, 5);
	}

}
