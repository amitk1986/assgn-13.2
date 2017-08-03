package com.diablo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;



public class StudentDaoImpl {
	
	DataSource ds;
	public DataSource getDs() {
		return ds;
	}
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
 public void getStudent(){
	 Connection con=null;
	 try{
		con=ds.getConnection();
		 Statement stm = con.createStatement();
		 ResultSet rs = stm.executeQuery("select * from students");
		 while (rs.next()){
			 System.out.println(rs.getString(1)+rs.getString(2));
		 }
	 }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
 }
}