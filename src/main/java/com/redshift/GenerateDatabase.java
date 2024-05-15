package com.redshift;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - aws-redshift-jdbc
 * Package - com.redshift
 * Created_on - May 15 - 2024
 * Created_at - 13:13
 */

@UtilityClass
public class GenerateDatabase {

    public static void generateDatabase(Connection connection, String database) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "CREATE DATABASE " + database;
        statement.executeUpdate(query);
        System.err.println("Database created");
    }
}
