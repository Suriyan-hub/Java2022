package Collections;

public class CheckObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students("Diya", 1);
		Students s1=new Students("Diya", 1);
		
		if(s.equals(s1)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println("HashCode of obj1 :" +s.hashCode());
		System.out.println("Hashcode of obj2 :" +s1.hashCode());
	}

}
