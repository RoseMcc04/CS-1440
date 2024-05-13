import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This is the PowerBallTicket class. We will use this to allow us to 
 * get a ticket file and then see if we win the lottery.
 *
 * @author (Rose McCormack)
 * @version (16 April 2024)
 */
public class PowerBallTicket
{
    /**
     * @param args This is our class' main method. It will allow us to declare 
     * a PowerBall object and generate multiple tickets that could be the 
     * winning numbers.
     * @throws IOException We will throw an error is anything unexpected 
     * comes up. 
     */
    public static void main(String[] args) throws IOException
    {
        // This block will read the name of the input file from the user.
        // We also create a PowerBall object and use the input file to 
        // eventually print. 
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName = kb.nextLine();
        System.out.print("Please enter the amount of tickets: ");
        int tickets = kb.nextInt();
        PowerBall powerBall = new PowerBall();
        PrintWriter pbWriter = new PrintWriter(fileName);
        for (int i = 0; i < tickets; i++) 
        {
            powerBall.generateLotteryPicks();
            pbWriter.println(powerBall.toString());
        }
        pbWriter.close();
    }
}
