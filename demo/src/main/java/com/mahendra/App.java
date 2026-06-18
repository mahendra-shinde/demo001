package com.mahendra;

/**
 * Hello world!
 *
 */
public class App 
{
    String dbConnString = "jdbc:mysql://localhost:3306/demo";
    String dbUser = "root";
    String dbPassword = "root";
    String azStorageConnString = "DefaultEndpointsProtocol=https;AccountName=mahendra;AccountKey=...;EndpointSuffix=core.windows.net";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
