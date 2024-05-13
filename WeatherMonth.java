import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a description of class WeatherMonth here.
 *
 * @author (Rose McCormack)
 * @version (30 April 2024)
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;
    private int[] minTemperature;
    /**
     * This no-arg constructor will allow us to initialize values for our 
     * fields. 
     */
    public WeatherMonth() 
    {
        monthName = "January";
        daysInMonth = 31;
        maxTemperature = new int[daysInMonth];
        for (int i = 0; i < daysInMonth; i++) 
        {
            maxTemperature[i] = -999;
        }
        minTemperature = new int[daysInMonth];
        for (int i = 0; i < daysInMonth; i++) 
        {
            minTemperature[i] = -999;
        }
    }

    /**
     * @param monthName This parameter will set the month for our situation.
     * @param daysInMonth This parameter will allow us to set the number of 
     * days for the desired month.
     */
    public WeatherMonth(String monthName, int daysInMonth) 
    {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        maxTemperature = new int[this.daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++) 
        {
            maxTemperature[i] = -999;
        }
        minTemperature = new int[this.daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++) 
        {
            minTemperature[i] = -999;
        }
    }

    /**
     * @param args The main method will allow us to run the program.
     */
    public static void main(String[] args) 
    {
        WeatherMonth weatherMonth = new WeatherMonth("June", 5);
        weatherMonth.setDayMaxTemp(3, 85);
        weatherMonth.displayWeatherMonth();
        WeatherMonth weatherMarch = new WeatherMonth("March", 31);
        System.out.println(weatherMarch.toString());
        int[] testArray = {20, -999, 10, 50, -999, 40, 30};
        double average = WeatherComputation.averageTemperature(testArray);
        int highest = WeatherComputation.highestTemperature(testArray);
        int lowest = WeatherComputation.lowestTemperature(testArray);
        int first = WeatherComputation.numberMissing(testArray);
    }

    /**
     * @param maxTemperature This method will set the max temperature array. 
     */
    public void setMaxTemperature(int[] maxTemperature) 
    {
        this.maxTemperature = maxTemperature;
    }

    /**
     * @return This accessor will allow us to return the max temperatures 
     * from the array.
     */
    public int[] getMaxTemperature() 
    {
        return this.maxTemperature;
    }

    /**
     * @param dayOfMonth This parameter will allow us to specify a 
     * day of month.
     * @param temperature This parameter will allow us to 
     * specify the maximum temp.
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature) 
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth) 
        {
            for (int i = 0; i < maxTemperature.length; i++) 
            {
                maxTemperature[dayOfMonth - 1] = temperature;
            }
        }
        else 
        {
            return;
        }
    }

    /**
     * This method will display the day of the month and temperature in a
     * table-like format.
     */
    public void displayWeatherMonth() 
    {
        System.out.println(monthName);
        System.out.println("Day\tMax\tMin");
        for (int i = 0; i < maxTemperature.length 
            && i < minTemperature.length; i++) 
        {
            String s = String.format("%d\t%s\t%s\n", i + 1, maxTemperature[i], 
                minTemperature[i]);
            System.out.print(s);
        }
    }

    /**
     * @param fileName This method will allow us to read maximum temps
     * from a text file.
     * @throws IOException This clause will help us with debugging.
     */
    public void readMaxTempFile(String fileName) throws IOException
    {
        File myFile = new File(fileName);
        Scanner weatherDataScanner = new Scanner(myFile);
        while (weatherDataScanner.hasNext()) 
        {
            int n = weatherDataScanner.nextInt();
            int t = weatherDataScanner.nextInt();
            setDayMaxTemp(n, t);
        }
    }

    /**
     * @return This method will return a string relating to maximum and
     * minimum temps.
     */
    public String toString() 
    {
        String s = String.format("%2s%9s%10s\n", "Day", "Max", "Min");
        for (int i = 0; (i < maxTemperature.length) 
            || (i < minTemperature.length); i++) 
        {
            if (maxTemperature[i] == -999 && minTemperature[i] == -999) 
            {
                s = s + String.format("%2d%10s%10s\n", i + 1, "N/A", 
                    "N/A");
            }
            else
            {
                s = s + String.format("%2d%10d%10s\n", i + 1, 
                    maxTemperature[i], minTemperature[i]);
            }
        }
        return this.monthName + "\n" + s;
    }

    /**
     * @param monthName This mutator will allow us to set the month.
     */
    public void setMonthName(String monthName) 
    {
        this.monthName = monthName;
    }

    /**
     * @return This accessor will allow us to retrieve the month name.
     */
    public String getMonthName() 
    {
        return this.monthName;
    }

    /**
     * @param daysInMonth This mutator will allow us to set the days for 
     * the month we specified.
     */
    public void setDaysInMonth(int daysInMonth) 
    {
        this.daysInMonth = daysInMonth;
    }

    /**
     * @return This accessor will allow us to access the days for the month
     * we specified.
     */
    public int getDaysInMonth() 
    {
        return this.daysInMonth;
    }

    /**
     * @param minTemperature This mutator will allow us to set an array of 
     * minimum temperatures throughout a month. 
     */
    public void setMinTemperature(int[] minTemperature) 
    {
        this.minTemperature = minTemperature;
    }

    /**
     * @return This accessor will allow us to retrieve an array of minimum
     * temperatures throughout the month.
     */
    public int[] getMinTemperature() 
    {
        return this.minTemperature;
    }

    /**
     * @param dayOfMonth This method will allow us to set the minimim
     * temperature of a specific day of a month.
     * @param temperature Temperature parameter
     */
    public void setDayMinTemp(int dayOfMonth, int temperature) 
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth) 
        {
            for (int i = 0; i < minTemperature.length; i++) 
            {
                minTemperature[dayOfMonth - 1] = temperature;
            }
        }
        else 
        {
            return;
        }
    }

    /**
     * @param fileName This method will read the minimum temperatures file.
     * @throws IOException This clause will help us with debugging.
     */
    public void readMinTempFile(String fileName) throws IOException
    {
        File myFile = new File(fileName);
        Scanner weatherDataScanner = new Scanner(myFile);
        while (weatherDataScanner.hasNext()) 
        {
            int n = weatherDataScanner.nextInt();
            int t = weatherDataScanner.nextInt();
            setDayMinTemp(n, t);
        }
    }
}
