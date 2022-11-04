package Connection;

import java.sql.*;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnector dobj=new DbConnector();
	      Scanner sc=new Scanner(System.in);
	      Connection con;
	      PreparedStatement ps=null;
	      ResultSet rs;
	      Statement st;
	      int id1 = 0;
	      int res2 = 0;
	      try
	      {
	    	  String query="update student1 set name=?,phno=? where id=? ";
	    	  con=dobj.Dbconnect();
	    	  ps=con.prepareStatement(query);
	    	 /* System.out.println("Enter the number of data to be updated");
			  int n2=sc.nextInt();
			  for(int j=0;j<n2;j++)
				{
					System.out.println("enter stud id to be updated:");  
					id1=sc.nextInt();  
					System.out.println("enter student name:");  
					String name=sc.next();
					System.out.println("enter stud phno:");  
					String phno=sc.next();  */
				    ps.setInt(3, 6);
					ps.setString(1, "Vimal");
					ps.setString(2, "8045123980");
					res2=ps.executeUpdate();
					if(res2!=0)
					{
						System.out.println(res2 + "record updated");
					}
				//}
	      }
	      catch(SQLException e)
	      {
	    	  System.out.println(e);
	      }
	}

}
