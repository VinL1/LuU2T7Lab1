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

    }
}
