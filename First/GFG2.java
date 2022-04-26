package First;
// Importing class of second package
import Second.GFG3;
 
public class GFG2 {
 
    public static void main(String[] args)
    {
        // Creating reference of the GFG1 class that is
        // present in the same project
        GFG1 ob = new GFG1(1, 2);
        System.out.println("Addition " + ob.add());
       
        // Creating the reference fo the GFG3 class that is
        // present in the other project
        GFG3 ob1 = new GFG3(2, 1);
        System.out.println("Subtract " + ob1.subtract());
    }
}