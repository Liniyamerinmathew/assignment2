package medicine;

public class Medicine {
    public void displayLabel(){
        System.out.println("Company: Mankind pharma");
        System.out.println("Address: Kerala");
    }
}
class Tablet extends Medicine
{
    public void displayLabel()
    {
        System.out.println("store in cool dry place");
    }
}
class Syrup extends Medicine
{
    public void displayLabel()
    {
        System.out.println("consume as directed by the physician");
    }
}
class Ointment extends Medicine
{
    public void displayLabel() {
        System.out.println("for external use only");
    }
}