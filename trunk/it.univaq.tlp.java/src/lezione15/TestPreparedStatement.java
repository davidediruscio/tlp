package lezione15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreparedStatement {
    private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private static final String SQL = "SELECT * FROM title WHERE name=?";

    public static void main( String[] args ) {
        try {
            Class.forName( DRIVER_NAME );

            Connection connection = DriverManager.getConnection(args[ 0 ], args[ 1 ], args[ 2 ] );
            PreparedStatement preparedStatement =  connection.prepareStatement( SQL );
            preparedStatement.setString( 1, "name");
            ResultSet resultSet = preparedStatement.executeQuery();

            while ( resultSet.next() ) {
                System.out.println( "ID: " + resultSet.getInt( "title_id" ) );
                System.out.println( "Name: " + resultSet.getString( "name" ) );
                System.out.println( "Title Kind ID: " +  resultSet.getInt( "title_kind_ID" ) );
                System.out.println( "Description: " +  resultSet.getString( "description" ) );
                System.out.println( "Author: " +  resultSet.getString( "author" ) );
                System.out.println( "Isbn: " + resultSet.getString( "isbn" ) );
                System.out.println( "-----------------------------------" );
            }
            
            resultSet.close(); 
            preparedStatement.close(); 
        	connection.close(); 
        	
          }
          catch ( ClassNotFoundException e ) {
              e.printStackTrace();
          }
          catch ( SQLException e ) {
              e.printStackTrace();
          }
      }

    }
