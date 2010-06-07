package lezione15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {
    private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private static final String SQL = "SELECT * FROM title";

    public static void main( String[] args ) {
        try {
            Class.forName( DRIVER_NAME );

            Connection connection = DriverManager.getConnection( args[ 0 ], args[ 1 ], args[ 2 ] );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery( SQL );
            
            while ( resultSet.next() ) {
                System.out.println( "ID: " + resultSet.getInt( "title_id" ) );
                System.out.println( "Name: " + resultSet.getString( "name" ) );
                System.out.println( "Title Kind ID: " + resultSet.getInt( "title_kind_ID" ) );
                System.out.println( "Description: " + resultSet.getString( "description" ) );
                System.out.println( "Author: " + resultSet.getString( "author" ) );
                System.out.println( "Isbn: " + resultSet.getString( "isbn" ) );
                System.out.println( "-----------------------------------" );
              }
            }
            catch ( ClassNotFoundException e ) {
                 e.printStackTrace();
            }
            catch ( SQLException e ) {
                 e.printStackTrace();
            }
          }
        }


