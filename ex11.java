/*
* To change this license header, choose License Headers in Project 
Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
Package javaproject;
Import java.sql.Connection;
Import java.sql.DriverManager;
Import java.sql.PreparedStatement;
Import java.sql.ResultSet;
Import java.sql.SQLException;
Import java.util.Scanner;
/**
*
* @author 20uad023
*/
Public class JavaProject {
 /**
 * @param args the command line arguments
 */
 Public static void main(String[] args) throws SQLException {
 Try{
 Class.forName(“com.mysql.jdbc.Driver”);
 Connection con = DriverManager.getConnection 
(“jdbc:mysql://localhost:3306/hotel”, “root”, “”);
 Scanner obj=new Scanner(System.in);
 System.out.println(“Enter the id and hotel name”);
 Int x = obj.nextInt();
 String n = obj.next();
 PreparedStatement ps = (PreparedStatement) 
con.prepareStatement(“insert into infos values(?,?)”);
 Ps.setInt(1, x);
 Ps.setString(2, n);
 If( ps.executeUpdate()==1){
 System.out.println(“insert successfully”);
 }
 PreparedStatement pm=(PreparedStatement) 
con.prepareStatement(“select * from info”);
 ResultSet rs=pm1.executeQuery();
 While(rs.next())
 {
 Int s = rs.getInt(“id”);
 String m = rs.getString(“name”);
 System.out.println(s + “ “ + m);
 }
 }
 Catch(Exception e){
 System.out.println€;
 }
 }
}