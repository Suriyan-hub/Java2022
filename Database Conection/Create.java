package Connection;

import java.sql.*;
import java.util.*;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DbConnector dobj=new DbConnector();
      Scanner sc=new Scanner(System.in);
      Connection con;
      PreparedStatement ps;
      ResultSet rs;
      int res;
      try
      {
    	 String query1="insert into student1(name,phno) values(?,?)";
    	 con= dobj.Dbconnect();
    	 ps=con.prepareStatement(query1);
    	/* System.out.println("Enter the number of data to be insert");
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++)
			{
				//System.out.println("enter stud id:");  
				//int id=sc.nextInt();  
				System.out.println("enter student name:");  
				String name=sc.next(); 
				System.out.println("enter student phno :");  
				String phno=sc.next(); 
				//ps.setInt(1, id);*/
				ps.setString(1, "Sruthi");
				ps.setString(2, "9081234765");
				res=ps.executeUpdate();
				System.out.println(res+ " records inserted");
			//}	
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}

}
