package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DbConnector dobj=new DbConnector();
		  Scanner sc=new Scanner(System.in);
		  Connection con;
		  PreparedStatement ps;
		  
		  try {
			  String query="delete from student1 where id =?";
			  con=dobj.Dbconnect();
			ps=con.prepareStatement(query);
			
			/*System.out.println("Enter the number of data to be deleted");
			int n1=sc.nextInt();
			for(int j=0;j<n1;j++)
			{
				System.out.println("enter stud id:");  
				int id=sc.nextInt(); */
				ps.setInt(1, 4);
				int res1=ps.executeUpdate();
				
				if(res1!=0)
				{
					System.out.println(res1 + "record Deleted");
				}
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
