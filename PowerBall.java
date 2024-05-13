import java.util.Random;

/**
 * This class will allow us to establish our methods and 
 * techniques needed to generate a lottery/PowerBall
 * ticket. We will be able to read off numbers and determine
 * whether we won the lottery or not. 
 *
 * @author (Rose McCormack)
 * @version (16 April 2024)
 */
public class PowerBall 
{
    public static final int MAX_LOTTERY_NUMBER = 59;
    public static final int MAX_POWER_BALL_NUMBER = 35;
    private Random randomGenerator = new Random();
    private int number0;
    private int number1;
    private int number2; 
    private int number3;
    private int number4;
    private int powerBall;
    /**
     * This no-arg constructor allows us to initialize our private
     * fields.
     */
    public PowerBall() 
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    /**
     * @return This method will allow us to generate a random lottery number.
     */
    public int generateLotteryNumber() 
    {
        int localVar = randomGenerator.nextInt(MAX_LOTTERY_NUMBER) 
            + 1;
        return localVar;
    }
    /**
     * @return This method will allow us to generate a random PowerBall
     * number.
     */
    public int generatePowerBallNumber() 
    {
        int powerBallNumber = randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) 
            + 1;
        return powerBallNumber;
    }
    /**
     * @param newNumber This is the lottery number.
     * @return The return value will be whether the number is a
     * duplicate or not (true or false).
     */
    public boolean isDuplicateLotteryNumber(int newNumber) 
    {
        if (newNumber == number0) 
        {
            return true;
        }
        else if (newNumber == number1) 
        {
            return true;
        }
        else if (newNumber == number2) 
        {
            return true;
        }
        else if (newNumber == number3) 
        {
            return true;
        }
        else if (newNumber == number4) 
        {
            return true;
        }
        return false;
