package com.nhance.automation.webGenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import com.google.common.collect.Lists;


/**
 * 
 */
/**
 * @author Manmohan
 *
 */
public class DataBaseConnection {

	static String output;
	static List<String> someList = new ArrayList<String>();
	static List<String> listOFString=new ArrayList<String>();
	
	public static String connect_To_Neo4j_DB(String query) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

		// Create the connection and establish a connection to DB
		String dbUrl = "jdbc:neo4j:http://172.19.11.133:7474";
		// DEV = "jdbc:neo4j:bolt://139.59.12.52:7687/browser/"
		// QA = "jdbc:neo4j:http://172.19.11.22:7474";;
		// Staging = "jdbc:neo4j:bolt://162.243.210.123:7687/browser/";
				
		String userName = "neo4j";
		String password = "nhance@123";

		//Connection con = DriverManager.getConnection(dbUrl, userName, password);
		
		Connection con = DriverManager.getConnection(dbUrl, userName, password);

		// Create a statement through connection reference
		Statement stmt = con.createStatement();
		// Execute any sample query using execute Query

		ResultSet rs = stmt.executeQuery(query);
		{
			while (rs.next()) {
				//System.out.println(rs.getString("output"));
			    output=rs.getString("output");
			}

			stmt.close();
			rs.close();
		}
		return output;
	}
	
	
	public static List<String> connect_To_Neo4j_DB_For_ListOFString(String query) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// Register the oracle DB using driver class
		//Class.forName("org.neo4j.jdbc.Driver");
		// Create the connection and establish a connection to DB
		String dbUrl = "jdbc:neo4j:http://172.19.11.133:7474";  
		// DEV = "jdbc:neo4j:bolt://139.59.12.52:7687/browser/"
		// QA = "jdbc:neo4j:http://172.19.11.22:7474";;
	
		String userName = "neo4j";
		String password = "nhance@123";

		//Connection con = DriverManager.getConnection(dbUrl, userName, password);
		
		Connection con = DriverManager.getConnection(dbUrl, userName, password);

		// Create a statement through connection referance
		Statement stmt = con.createStatement();
		// Execute any sample query using execute Query

		ResultSet rs = stmt.executeQuery(query);
		{
			while (rs.next()) {
				//System.out.println(rs.getString("output"));
			    output=rs.getString("output"); 
			   someList.add(output);
			   listOFString = Lists.reverse(someList); 
			  // Collections.reverse(someList);
			}
		
			stmt.close();
			rs.close();
		}
		return listOFString;
	}
	
	@Test
	public void fetchDataFrom_DB() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		List<String> output= connect_To_Neo4j_DB_For_ListOFString("match(n:DigitalKit)-[r:USER_HAS_DK]-(u:User) where u.mobile = '8861528280' and n.status <> 3  return n.digitalKitCode as output order BY n.digitalKitCode DESC limit 5");
		for(int i=0;i<output.size();i++)
		{
			System.out.println("The Kit Code is : ");
		    System.out.println(output.get(i));
		}
		
	}
}
