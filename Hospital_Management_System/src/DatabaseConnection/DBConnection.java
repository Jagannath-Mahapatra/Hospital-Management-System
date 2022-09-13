/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.*;
/**
 *
 * @author Mahapatra
 */
public class DBConnection {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
//    public static void main(String[] args){
//        String className = "com.mysql.cj.jdbc.Driver";
//        try{
//            Class.forName(className);
//            System.out.println("Success");
//        }
//        catch(Exception e){
//            System.out.println("Failure");
//        }
//    }
}
