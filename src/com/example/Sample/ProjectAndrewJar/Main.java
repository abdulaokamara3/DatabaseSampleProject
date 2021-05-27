package com.example.Sample.ProjectAndrewJar;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String host = "jdbc:mysql://localhost:3306/shoppingdb";
            String uName="root";
            String uPass = "kamara1734";
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement stmt=con.createStatement();
            String  sql = "select * from custom ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id_col = rs.getInt("idcustom");
                String first_name = rs.getString("firstName");
                String last_name = rs.getString("lastName");
                String product_name = rs.getString("productName");
                int cost = rs.getInt("cost");
                int quantities = rs.getInt("quantities");

                String p = id_col+   " " + first_name +  " "   + last_name + " " + product_name + " " + cost+ " " +quantities;
                System.out.println(p);
            }

        }catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }
}
