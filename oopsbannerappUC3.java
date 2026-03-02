package OOPSBannerApp;
/**
 * OOPSBanner App UC3 - OOPS Banner Application (USE Case of Use Case)
 * 
 * This Class extends the funcutionality of use Case 2 by improving thw way the "OOPS" banner 
 * is constructed and displayed.It focuses on enhancing cide readability and efficiency
 * by utilizing the string.join() Method to create each line of the banner .This approach 
 * overcomes the drawbracks of using the + operator for the string concatenation, Which can lead
 * to code inefficiency due to the creation of multiple intermediate string objects in memory.
 * 
 * @author Developer
 * @version 3.0
 */

// Extend use case UC2 to use String.jojn() method to create each line of the "OOPS" banner
//instead of concatenating string with the + operator .This is essentially to overcome the 
//drawbacks of using the + operator for string concatenation Which essentially creates
//Multiple intermediate string objects in memory leading to infficiency.

public class oopsbannerappUC3 {

    //Main method to run the banner display
    //Use System.out.println() to print each line of the OOPS banner to create
    //the visual effect for the message "OOPS".construct each line using 
    //String.join() method for better readbility and efficiency
    //Each line corresponds to a row in the banner for the letters O, O, p, S.
    public static void main(String[] args) {
        System.out.println("   ***   " + " " + "     ***   " + " " + "   ****     "  + " " + "    ******    " );
        System.out.println(" **    ** " + " " + " **    ** " + " " + " **     **  "  + " " + " **         " );
        System.out.println("**      **" + " " + "**      **" + " " + "**       ** "  + " " + "**          " );
        System.out.println("**      **" + " " + "**      **" + " " + "**       ** "  + " " + "**          " );
        System.out.println("**      **" + " " + "**      **" + " " + "**      **  "  + " " + "   ****     " );
        System.out.println("**      **" + " " + "**      **" + " " + "** ****     "  + " " + "       **   " );
        System.out.println("**      **" + " " + "**      **" + " " + "**          "  + " " + "        **  " );
        System.out.println(" **    ** " + " " + " **    ** " + " " + "**          "  + " " + "        **  " );
        System.out.println("   ***   " + " " + "   ***   " + " " + " **           "  + " " + "  ******     " );

    }
    
}
