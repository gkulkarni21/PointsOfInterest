package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        System.out.println("Calling getPlaceRequest");
        PlaceSearch search = new PlaceSearch();
        //search.getPlaceTest();
        search.getPlaceSearch("Rocky+Mountain+national+park");
    }
}
