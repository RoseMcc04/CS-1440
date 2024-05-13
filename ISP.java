/**
 * @author (Rose McCormack) 
 * @version (26 March 2024)
 */
public class ISP 
{
    private char pkg;
    private double hoursUsed;
    /**
     * 
     */
    public ISP() 
    {
        pkg = 'A';
    }
    /**
     * @param pack This will allow us to initialize the type of package
     * by inputting the char value.
     * @param hours This will allow us to initialize the number of hours
     * in the month by inputting the double value.
     */
    public ISP(char pack, double hours) 
    {
        pkg = pack;
        hoursUsed = hours;
    }
    /**
     * @param p This mutator will set the char to determine
     * the type of package.
     */
    public void setPkg(char p) 
    {
        pkg = p;
    }
    /**
     * @return This accessor will return the char for
     * the type of package for the first package.
     */
    public char getPkg() 
    {
        return pkg;
    }
    /**
     * @param h This mutator will set the hours used
     * to determine which plan if feasible for the 
     * customer.
     */
    public void setHoursUsed(double h) 
    {
        hoursUsed = h;
    }
    /**
     * @return This accessor will return the number of hours
     * of internet that the consumer uses.
     */
    public double getHoursUsed() 
    {
        return hoursUsed;
    }
    /**
     * @return This method will calculate the charges for the
     * customer depending on the plan and they will have a
     * cost returned to them after calling the method.
     */
    public double calculateCharges() 
    {
        if (pkg == 'A') 
        {
            if (hoursUsed <= 10.00) 
            {
                return 9.95;
            }
            else 
            {
                return 9.95 + ((hoursUsed - 10.00) * 2.00);
            }
        }
        else if (pkg == 'B') 
        {
            if (hoursUsed <= 20.00) 
            {
                return 14.95;
            }
            else
            {
                return 14.95 + ((hoursUsed - 20.00) * 1.00);
            }
        }
        else 
        {
            return 19.95;
        }
    }
    /**
     * This method will allow us to return how much money
     * the user could save with another plan.
     */
    public void printSavings() 
    {
        double costA = helperForA();
        double costB = helperForB();
        double savingsAB = costA - costB;
        double savingsAC = costA - 19.95;
        double savingsBC = costB - 19.95;
        if (pkg == 'A')
        {
            if (costA > costB) 
            {
                System.out.printf("You would have saved $%.2f by choosing " 
                    + "package B", savingsAB);
            }
            if (costA > 19.95) 
            {
                System.out.printf("You would have saved $%.2f by choosing " 
                    + "package C", savingsAC);
            }
        }
        if (pkg == 'B') 
        {
            if (costB > 19.95) 
            {
                System.out.printf("You would have saved $%.2f by choosing " 
                    + "package C", savingsBC);
            }
        }
    }
    /**
     * @return This method will help us determine the cost for Package A
     * based on hours of internet used.
     */
    public double helperForA() 
    {
        if (hoursUsed <= 10.00) 
        {
            return 9.95;
        }
        else 
        {
            return 9.95 + ((hoursUsed - 10.00) * 2.00);
        }
    }
    /**
     * @return This method will help us determine the cost for Package B
     * based on hours of internet used.
     */
    public double helperForB() 
    {
        if (hoursUsed <= 20.00) 
        {
            return 14.95;
        }
        else
        {
            return 14.95 + ((hoursUsed - 20.00) * 1.00);
        }
    }
}
