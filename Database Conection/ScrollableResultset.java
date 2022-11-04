package Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableResultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnector dobj=new DbConnector();
		Connection con;
		ResultSet rs;
		Statement st;
	try
		{
			String query="select * from student1";
			con=dobj.Dbconnect();
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery(query);
			while(rs.next())
			{
				System.out.print(rs.getInt("id"));
				System.out.print(" "+rs.getString("name"));
				System.out.print(" "+rs.getString("phno"));
				System.out.println();
			}
			rs.first();
			System.out.println("First record:");
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" " +rs.getString("phno"));
			rs.absolute(3);
			System.out.println("Third record:");
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" " +rs.getString("phno"));
			rs.last();
			System.out.println("Last record:");
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" " +rs.getString("phno"));
			//rs.previous();
			rs.relative(-3);
			System.out.println("Last to first record:");
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" " +rs.getString("phno"));
		} 
	catch (Exception e) 
	{
		System.out.println(e);
		}
		
	}

}
