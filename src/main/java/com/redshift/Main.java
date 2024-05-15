package com.redshift;

import lombok.SneakyThrows;

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
        RedshiftConnection.getConnection("admin", "@@@@@@");
        System.out.println("Connection Established");

    }
}