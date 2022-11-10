package medicine;

public class TestMedicine {
    public static void main(String[] args)
    {
        Medicine M[]=new Medicine[10];
        double i =Math.random()*4;
        int j= (int) i;
        System.out.println(j);
        switch (j)
        {
            case 1:M[0]=new Medicine();
            M[1]=new Tablet();
            M[0].displayLabel();
            M[1].displayLabel();
            break;
            case 2:M[2]=new Medicine();
                M[3]=new Syrup();
                M[2].displayLabel();
                M[3].displayLabel();
                break;
            case 3:M[4]=new Medicine();
                M[5]=new Ointment();
                M[4].displayLabel();
                M[5].displayLabel();
                break;
            default:System.out.println("invalid choice");
        }
    }
}
