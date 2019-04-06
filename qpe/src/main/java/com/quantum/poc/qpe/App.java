package com.quantum.poc.qpe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "QPE Sample App Started" );
        NumAddition numObj = new NumAddition();
        numObj.addNum(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println( "QPE Sample0 App Finished" );
    }
}
