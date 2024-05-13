/**
 * Short, one-line description of LemonadeStand class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Rose McCormack) 
 * @version (27 February 2024)
 */
public class LemonadeStand
{
    private int lemons;
    private int gallonsOfWater;
    private int cupsOfSugar;
    private int emptyGlasses;
    private int glassesOfLemonade;
    private double price;
    private double income;
    /**
     * This is our no-arg constructor for the LemonadeStand.java file.
     */
    public LemonadeStand() 
    {
        lemons = 0;
        gallonsOfWater = 0;
        cupsOfSugar = 0;
        emptyGlasses = 0;
        glassesOfLemonade = 0;
        price = 0.00;
        income = 0.00;
    }
    /**
     * @param newLemons will allow us to initialize the
     * number of lemons
     * 
     * @param water will allow us to initialize the 
     * amount of water in gallons
     * 
     * @param sugar will allow us to initialize the 
     * amount of sugar in cups
     * 
     * @param glasses will allow us to initialize the number
     * of empty glasses
     * 
     * @param newPrice will allow us to initialize our price for a 
     * cup of lemonade
     * 
     */
    public LemonadeStand(int newLemons, int water, int sugar, int glasses, 
        double newPrice) 
    {
        setLemons(newLemons);
        setGallonsOfWater(water);
        setCupsOfSugar(sugar);
        setEmptyGlasses(glasses);
        setPrice(newPrice);
        glassesOfLemonade = 0;
        income = 0.00;
    }
    /**
     * @param args This is our main method.
     */
    public static void main(String[] args) 
    {
        LemonadeStand lemonadeStand = new LemonadeStand(15, 3, 4, 20, 1.5);
        lemonadeStand.makeLemonade();
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
    }
    /**
     * @param newLemons This will help us initialize lemons.
     */
    public void setLemons(int newLemons) 
    {
        if (newLemons < 0) 
        {
            newLemons = 0;
            lemons = newLemons;
        }
        else 
        {
            lemons = newLemons; 
        }
    }
    /**
     * @return This will help us get the value of lemons.
     */
    public int getLemons() 
    {
        return lemons;    
    }
    /**
     * @param newGallonsOfWater This will help us initialize our variable
     * gallonsOfWater.
     */
    public void setGallonsOfWater(int newGallonsOfWater) 
    {
        if (newGallonsOfWater < 0) 
        {
            newGallonsOfWater = 0;
            gallonsOfWater = newGallonsOfWater;
        }
        else 
        {
            gallonsOfWater = newGallonsOfWater;
        }
    }
    /**
     * @return This getter will allow us to retrive the gallons of water.
     */
    public int getGallonsOfWater() 
    {
        return gallonsOfWater;
    }
    /**
     * @param newCupsOfSugar This will allow us to initialize the 
     * cupsOfSugar variable.
     */
    public void setCupsOfSugar(int newCupsOfSugar) 
    {
        if (newCupsOfSugar < 0) 
        {
            newCupsOfSugar = 0;
            cupsOfSugar = newCupsOfSugar;
        }
        else 
        {
            cupsOfSugar = newCupsOfSugar;
        }
    }
    /**
     * @return This getter will allow us to retrive the cupsOfSugar value.
     */
    public int getCupsOfSugar() 
    {
        return cupsOfSugar;
    }
    /**
     * @param newEmptyGlasses This setter will allow us to initialize the
     * emptyGlasses variable. 
     */
    public void setEmptyGlasses(int newEmptyGlasses) 
    {
        if (newEmptyGlasses < 0) 
        {
            newEmptyGlasses = 0;
            emptyGlasses = newEmptyGlasses;
        }
        else 
        {
            emptyGlasses = newEmptyGlasses;
        }
    }
    /**
     * @return This getter will allow us to retrive our emptyGlasses value.
     */
    public int getEmptyGlasses() 
    {
        return emptyGlasses;
    }
    /**
     * @param newGlassesOfLemonade This setter will allow us to initialize
     * the number of glasses of lemonade.
     */
    public void setGlassesOfLemonade(int newGlassesOfLemonade) 
    {
        if (newGlassesOfLemonade < 0) 
        {
            newGlassesOfLemonade = 0;
            glassesOfLemonade = newGlassesOfLemonade;
        }
        else 
        {
            glassesOfLemonade = newGlassesOfLemonade;
        }
    }
    /**
     * @return This getter will allow us to retrive the number of glasses 
     * of lemonade.
     */
    public int getGlassesOfLemonade() 
    {
        return glassesOfLemonade;
    }
    /**
     * @param newPrice will allow us to initialize the price field.
     */
    public void setPrice(double newPrice) 
    {
        if (newPrice < 0.00) 
        {
            newPrice = 0.00;
            price = newPrice;
        }
        else 
        {
            price = newPrice;
        }
    }
    /**
     * @return This getter will allow us to retrive the new price. 
     */
    public double getPrice() 
    {
        return price;
    }
    /**
     * @param newIncome This setter will allow us to initialize the income.
     */
    public void setIncome(double newIncome) 
    {
        if (newIncome < 0.00) 
        {
            newIncome = 0.00;
            income = newIncome;
        }
        else 
        {
            income = newIncome;
        }
    }
    /**
     * @return This getter will allow us to retrive the income value. 
     */
    public double getIncome() 
    {
        return income;
    }
    /**
     * @return This method will allow us to make lemonade based on 
     * actual supplies.
     */
    public int makeLemonade() 
    {
        if (lemons > 5 && gallonsOfWater > 0 && cupsOfSugar > 0 
            && emptyGlasses > 7 && glassesOfLemonade > -9) 
        {
            lemons = lemons - 6;
            gallonsOfWater = gallonsOfWater - 1;
            cupsOfSugar = cupsOfSugar - 1;
            emptyGlasses = emptyGlasses - 8;
            glassesOfLemonade = glassesOfLemonade + 8;
            return glassesOfLemonade;
        }
        else 
        {
            return 0;
        }
    }
    /**
     * @return This method will allow us to sell lemonade depending on
     * the amount of glasses of lemonade.
     */
    public int sellLemonade() 
    {
        if (glassesOfLemonade == 0) 
        {
            makeLemonade();
            if (glassesOfLemonade == 0) 
            {
                return 0;
            }
            else 
            {
                income = income + price;
                glassesOfLemonade = glassesOfLemonade - 1;
                return 1;
            }
        }
        else 
        {
            income = income + price;
            glassesOfLemonade = glassesOfLemonade - 1;
            return 1;
        }
    }
    /**
     * @param requestedGlasses is the parameter for how many glasses all
     * customers have requested.
     * 
     * @return glassesOfLemonade This method will allow us to add requested
     * glasses to the current glasses of lemonade.
     */
    public int sellMoreLemonade(int requestedGlasses) 
    {
        if (requestedGlasses <= glassesOfLemonade) 
        {
            income = income + (price * requestedGlasses);
            glassesOfLemonade = glassesOfLemonade - requestedGlasses;
            return requestedGlasses;
        }
        else 
        {
            makeLemonade();
            if (glassesOfLemonade >= requestedGlasses) 
            {
                income = income + (price * requestedGlasses);
                glassesOfLemonade = glassesOfLemonade - requestedGlasses;
                return requestedGlasses;
            }
            else 
            {
                int sellGlasses = glassesOfLemonade;
                glassesOfLemonade = 0;
                income = income + (price * sellGlasses);
                return sellGlasses;
            }
        }
    }
}
