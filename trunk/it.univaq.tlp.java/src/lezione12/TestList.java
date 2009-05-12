package lezione12;

import java.util.*;


public class TestList {
    public static void main( String[] args ) {
        List list = new ArrayList();
        boolean b;
        Object o;
        int i1,i2;
        int s;

        list.add( "x" );                        // Add at end
        list.add( "y" );                        // Add at end
        list.add( 2, "x");                      // Add at location 2
        list.add( 0, "k"); 						// Add at location 1
        b = list.contains( "1" );               // Is it in there?
        
        // Lists allow random access, which is cheap
        // for ArrayList, expensive for LinkedList:
        o = list.get( 1 );                      // Get object at location 1
        i1 = list.indexOf( "x" );                // Tell index of object
        b = list.isEmpty();                     // Any elements inside?
        i2 = list.lastIndexOf( "x" );            // Last match
        //list.remove( 1 );                       // Remove location 1
        list.remove( "3" );                     // Remove this object
        //list.set( 1, "z" );                     // Set location 1 to "y"

        s = list.size();                        // How big is it?
        
        System.out.println(list);
        System.out.println(o+" "+i1+" "+b+" "+i2+" "+s);
        list.clear();                           // Remove all elements
    }
}
