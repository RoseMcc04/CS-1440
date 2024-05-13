//Put any imports below this line.
import java.util.Scanner;
 
/**
 * @author (Rose McCormack) 
 * @version (19 March 2024)
 */
public class ISPMain
{
    /**
     * @param args This is our main method. We are declaring an object
     * from the regular ISP class and we are printing out our calculations.
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the package you are currently using: " 
            + "A, B, or C ");
        String pkg = kb.nextLine();
        char p = pkg.charAt(0);
        double h = 0.00;
        if (p == 'A' || p == 'B')
        {
            System.out.println("Enter number of hours in decimal form: ");
            h = kb.nextDouble();
        }
        ISP plan = new ISP(p, h);
        System.out.println(plan.calculateCharges());
        plan.printSavings();
    }
}
