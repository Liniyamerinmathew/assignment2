import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args)
    {
        int a, b, p1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        p1=a*b;
        System.out.println("the product of 2 integer values entered is: "+p1);

        double c,d,p2;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2 float values: ");
        c= sc1.nextDouble();
        d= sc1.nextDouble();
        p2=c*d;
        System.out.println("the product of 2 float values entered is: "+p2);

        int e;
        double f,p3;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter an integer and a float value ");
        e= sc2.nextInt();
        f= sc2.nextDouble();
        p3=e*f;
        System.out.println("the product of an integer and float is: "+p3);
    }
}
