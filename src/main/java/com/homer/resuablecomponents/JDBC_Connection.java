package com.homer.resuablecomponents;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC_Connection {
	
		public  ResultSetMetaData metadata;
	//	public  String JDBC_DRIVER = "com.ibm.as400.access.AS400JDBCDriver";
		public String JDBC_DRIVER="com.ibm.db2.jcc.DB2Driver";
		public String DB_URL = "jdbc:db2://ibdynpx0.sysplex.homedepot.com:5122/NP1";
		public String USER="qa1mm05";
		public String PASS="ert5yui3";
	
	
		public JDBC_Connection(){		
			
			ResultSetMetaData metadata;
			JDBC_DRIVER ="com.ibm.db2.jcc.DB2Driver";
			DB_URL = "jdbc:db2://ibdynpx0.sysplex.homedepot.com:5122/NP1";
			USER= "qa1mm05";
			PASS="ert5yui3";
		
		}
		
		
public ArrayList<String> array_Database_Connection(String query) throws InterruptedException,  IOException, ClassNotFoundException {
			
			ArrayList<String> Db_datas = new ArrayList<String>();
		
			try
			{
				
			Class.forName(JDBC_DRIVER);
			Connection conn = null;
			Statement stmt = null;
			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			System.out.println("Fetching records with condition...");
			String sql = query;		
			ResultSet rs = stmt.executeQuery(sql);
			metadata = rs.getMetaData();
			  while(rs.next())
			{
				for(int i=1;i<=metadata.getColumnCount();i++)
				{
					Db_datas.add(rs.getString(i).trim());
					}
			System.out.println(Db_datas);	
				}
			rs.close();
			stmt.close();
			conn.close();
			
			return Db_datas;
			}
			catch(Exception e)
			{
				Db_datas.add(null);
				System.out.println("Exception on executing the query");
				e.printStackTrace();
				return null;
			}
		 
	}
		
		
public String str_Database_Connection(String query) throws InterruptedException,  IOException, ClassNotFoundException {
			
		   String Db_datas=null;
			try
			{
				
			Class.forName(JDBC_DRIVER);
			Connection conn = null;
			Statement stmt = null;
			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			System.out.println("Fetching records with condition...");
			String sql = query;	
			//stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			metadata = rs.getMetaData();
			while(rs.next()){
			Db_datas=rs.getString(1);			
			}
			System.out.println(Db_datas);					
			rs.close();
			stmt.close();
			conn.close();			
			return Db_datas;
			}
			catch(Exception e)
			{
			//	Db_datas.add(null);
				System.out.println("Exception on executing the query");
				e.printStackTrace();
				return null;
			}
		 
	}


public String str_Update_Database_Connection(String query) throws InterruptedException,  IOException, ClassNotFoundException {
	
	   String Db_datas=null;
		try
		{
			
		Class.forName(JDBC_DRIVER);
		Connection conn = null;
		Statement stmt = null;
		// STEP 3: Open a connection
		System.out.println("Connecting to a selected database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connected database successfully...");
		// STEP 4: Execute a query
		System.out.println("Creating statement...");
		stmt = conn.createStatement();
		System.out.println("Fetching records with condition...");
		String sql = query;		
		stmt.executeUpdate(sql);		
		return Db_datas;
		}
		catch(Exception e)
		{
		//	Db_datas.add(null);
			System.out.println("Exception on executing the query");
			e.printStackTrace();
			return null;
		}
	 
}

}

