package com.redshift;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.function.BiConsumer;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Default (Template) Project
 * Package - com.redshift
 * Created_on - May 15 - 2024
 * Created_at - 12:32
 */

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        RedshiftDriver.loadRedshiftDriver();
        Connection connection = RedshiftConnection.getConnection("admin", "Redshift1234");
        System.out.println("Connection Established");
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM public.dummy");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1)); // New line after printing each row
            System.out.println(resultSet.getString(2)); // New line after printing each row
        }
    }
}