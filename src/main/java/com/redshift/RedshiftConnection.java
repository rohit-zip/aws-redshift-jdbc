package com.redshift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - aws-redshift-jdbc
 * Package - com.redshift
 * Created_on - May 15 - 2024
 * Created_at - 12:50
 */

public class RedshiftConnection {

    public static Connection getConnection(String username, String password) throws SQLException, ClassNotFoundException {
        String url = "jdbc:redshift://default-workgroup.058264535737.ap-southeast-2.redshift-serverless.amazonaws.com:5439/dev";
        return DriverManager.getConnection(url, username, password);
    }
}
