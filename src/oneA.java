import java.util.Scanner;

/**
 * Created by alex on 2015-10-31.
 */
public class oneA {
    public static void main(String[] args) {
        //Input
        Scanner input = new Scanner(System.in);

        //Get m, n, a
        double m = input.nextDouble();
        double n = input.nextDouble();
        double a = input.nextDouble();

        //Result
        System.out.println((long)(Math.ceil(m/a) * Math.ceil(n/a)));
    }
}
