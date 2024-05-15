package com.redshift;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - aws-redshift-jdbc
 * Package - com.redshift
 * Created_on - May 15 - 2024
 * Created_at - 13:04
 */

public class RedshiftDriver {

    public static void loadRedshiftDriver() throws ClassNotFoundException {
        Class.forName("com.amazon.redshift.jdbc42.Driver");
    }
}
