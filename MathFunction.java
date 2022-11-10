import java.util.Scanner;

public class MathFunction
{
    public int p1;
    public double p2;
    public double p3;

    public int multiply(int a, int b)
    {
        p1=a*b;
        System.out.println("the product of 2 integer values entered is: "+p1);
        return p1;
    }
    public double multiply(double c, double d)
    {
        p2=c*d;
        System.out.println("the product of 2 float values entered is: "+p2);
        return p2;
    }
    public double multiply(int e, double f)
    {
        p3=e*f;
        System.out.println("the product of an integer and float is: "+p3);
        return p3;
    }
}
class Math
{
    public static int a,b,e;
    public static double c,d,f;

    public static void main(String[] args)
    {
    MathFunction M=new MathFunction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int m=M.multiply(a,b);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2 float values: ");
        c= sc1.nextDouble();
        d= sc1.nextDouble();
        double ma=M.multiply(c, d);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter an integer and a float value ");
        e= sc2.nextInt();
        f= sc2.nextDouble();
        double mat=M.multiply(e,f);

    }
}
