import java.util.Scanner;

/**
 * Created by Alex on 2015-10-29.
 */
public class onefoursixA {

    public static void main(String args[]) {

        //Input
        Scanner input = new Scanner(System.in);

        //Get length
        int n = input.nextInt();

        //Get number
        String num = input.next();

        //Flag
        boolean flag = true;

        //Determine if lucky
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < num.length() && flag; i++) {
            if (num.charAt(i) != '4' && num.charAt(i) != '7') {
                flag = false;
            } else if (i < num.length() / 2) {
                leftSum += Character.getNumericValue(num.charAt(i));
            } else {
                rightSum += Character.getNumericValue(num.charAt(i));
            }
        }

        if (leftSum != rightSum) {
            flag = false;
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
