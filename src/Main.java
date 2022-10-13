import java.util.Scanner;


public class Main {
    public static void main (String [] args) {

        String myString = "AP CSA is awesome!";
        String s = myString.substring (myString.indexOf ("S"), 5);
        System.out.println (s);

        String awe = myString.substring (myString.indexOf ("awesome!"), myString.length());
        System.out.println (awe);

        String today = "FRIDAY!";
        String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
        System.out.println(x);

        String today2 = "FRIDAY!";
        String x2 = today.substring(3, 7).substring(0, 3);
        System.out.println(x2);

        String blah2 = "What's for dinner?";
        String agh2 = blah2.substring (11);

        String agh3 = blah2.substring (11,18);

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter first string: ");
        String first = input.nextLine ();

        System.out.println ("String length: " + first.length ());
        System.out.println ("First half: " + first.substring (0, (first.length() / 2)));
        System.out.println ("Second half: " + first.substring ((first.length() / 2), first.length()));

        System.out.println ("Enter second string: ");
        String second = input.nextLine ();

        if (first.length () == second.length ()) {
            System.out.println ("Both strings have the same length");
        }
        else if (first.length () > second.length ()) {
            System.out.println (first + " is longer");
        }
        else {
            System.out.println (second + " is longer");
        }


       if (first.compareTo (second) == 0) {
           System.out.println ("Both strings have the exact same characters");
       }
        else if (first.compareTo (second) > 0) {
            System.out.println (second + " is first alphabetically");
        }
        else {
            System.out.println (first + " is first alphabetically");
        }


        if (first.indexOf (second) != -1) {
            System.out.println (second + "is found in " + first + " at index " + first.indexOf (second));
        }
        else {
            System.out.println (second + " is NOT found in " + first);
        }
    }
}
