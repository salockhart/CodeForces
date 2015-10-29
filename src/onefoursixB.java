import java.util.Scanner;

/**
 * Created by Alex on 2015-10-29.
 */
public class onefoursixB {

    public static void main(String args[]) {

        //Input
        Scanner input = new Scanner(System.in);

        //Get a
        String a = input.next();

        //Get b
        String b = input.next();

        boolean repeat = true;

        //Statistics on B
        int numB4 = 0;
        int numB7 = 0;
        for (int j = 0; j < b.length(); j++) {
            if (b.charAt(j) == '4') {
                numB4++;
            } else if (b.charAt(j) == '7') {
                numB7++;
            }
        }

        //BRUTE FORCE
        for (int i = Integer.parseInt(a); repeat; i++) {
            int lastIndex = -1;
            boolean correct = true;
            a = (new Integer(i)).toString();
            for (int j = 0; j < b.length() && correct; j++) {
                if (a.indexOf(b.charAt(j), lastIndex) != -1) {
                    lastIndex = a.indexOf(b.charAt(j), lastIndex) + 1;
                } else {
                    correct = false;
                }
            }
            if (correct) {
                //Ensure correct number of each lucky number
                int numA4 = 0;
                int numA7 = 0;
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == '4') {
                        numA4++;
                    } else if (a.charAt(j) == '7') {
                        numA7++;
                    }
                }
                if (numA4 == numB4 && numA7 == numB7) {
                    repeat = false;
                }
            }
        }
        System.out.println(a);
    }
}
