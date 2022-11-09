import java.util.Scanner;

public class Employee {
    private String name, result;
    private int employee_id, a1, a2, a3;

    public Employee(String n, int i, int a, int b, int c) {
        name = n;
        employee_id = i;
        a1 = a;
        a2 = b;
        a3 = c;
        if (a > 75 && b > 75 && c > 75) {
            result = "promoted";
        } else {
            result = "demoted";
        }
    }

    public int total() {
        return (a1 + a2 + a3);
    }

    public double percentage() {
        return (total() / 3);
    }
    public void dispaly(){
            System.out.println("Name:"+name);
            System.out.println(" Employee id: " + employee_id);
            System.out.println("Total:" + total());
            System.out.println("Percentage= " + percentage());
            System.out.println("Result: " + result);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee obj1=new Employee("Ramesh",34565,85,65,89);
        Employee obj2=new Employee("Thomas",34520,76,85,79);
        Employee obj3=new Employee("Sara",34515,90,85,80);
        obj1.dispaly();
        obj2.dispaly();
        obj3.dispaly();
    }
}

