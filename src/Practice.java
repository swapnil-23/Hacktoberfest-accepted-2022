import java.util.Scanner;

import java.math.*;

public class Practice {
    public static void main(String[] args)
    {
        Circumference();
    }

    static void Circumference()
    {
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();

        float circum = (float) (2*Math.PI*rad);
        System.out.println(circum);
    }
}