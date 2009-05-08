package lezione11;

import java.io.*;

public class TestCheckedException {
	

    public static void main(String[] args) {
    	
    	if (args.length!=1)
             return;
    	
         FileReader reader = null;
         try {
               reader = new FileReader( args[ 0 ] );
         }
         catch(FileNotFoundException e) {
            System.out.println("File non trovato");
         }
         finally {
             System.out.println("Blocco sempre eseguito");  
        	 if (reader!=null) {
                  try {
                       reader.close();
                  }
                  	catch (IOException e) { //Do nothing }
                  }
               }
         }
    }
}
