/**
 * This program expects two command-line arguments -- a person's first name and
 * last name. For example: C:\mywork> java Greetings Annabel Lee
 * 
 * @author Jessica Jiang
 * @version August 20, 2014
 * @author Period: 4
 * @author Assignment: JMCh02_Hello - Greetings2.java
 */
import java.util.Scanner;

public class Greetings2
{
    public static void main( String[] args )
    {
        Scanner kboard = new Scanner( System.in );
        System.out.print( "Enter your first name: " );
        String firstName = kboard.nextLine();
        System.out.print( "Enter your last name: " );
        String lastName = kboard.nextLine();
        System.out.println( "Hello, " + firstName + " " + lastName );
        System.out.println( "Welcome to Java!" );
    }
}


