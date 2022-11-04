package Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdatableResultset {

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
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery(query);
			//rs.next();
			rs.absolute(8);
	        rs.updateInt(1, 12);
	        rs.updateRow();
	        System.out.println("1 ROW UPDATED...");
			rs.moveToInsertRow();;
			rs.updateInt(1, 13);
			rs.updateString(2, "Akash" );
			rs.updateString(3, "9456723290");
			rs.insertRow();
			System.out.println("1 ROW INSERTED...");
			rs.absolute(4);
			rs.deleteRow();
			System.out.println("1 ROW DELETED...");
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	
	}	
}
