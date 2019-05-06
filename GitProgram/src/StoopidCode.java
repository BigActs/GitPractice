import java.util.Scanner;

public class StoopidCode
{

    private static Scanner scan = new Scanner( System.in );

    public static void main( String[] args )
    {
        // TODO Auto-generated method stub
        String name = null;
        System.out.println( "What is your name?" );
        name = scan.next();
        System.out.println(
                "Here is your name backwards: " + backwardName( name ) );
    }

    public static String backwardName( String name )
    {
        StringBuilder b = new StringBuilder( "" );
        for ( int i = name.length() - 1; i > 0; i-- )
        {
            b.append( name.charAt( i ) );
        }
        return b.toString();
    }
}
