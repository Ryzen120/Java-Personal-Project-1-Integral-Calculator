import java.util.Scanner;

/**
 * Tests the methods of the IntegralCalculator Class. Taking the input of the user to determine which integral the
 * user wants solved and displaying the approximated answer in the console.
 *
 * @author Robert Lenko
 * @professor Ryan O'grady.
 * @version 10/7/2018
 */
public class IntegralTester
{
    public static void main(String[] args) 
    {
       /*
        * This program was meant to be used for hardcoded calculus problems with integration. However, the logic in the IntegralCalculator class
        * is there for integration, and with the proper use of method calls from the Math Class, technically any integral could be designed / modded
        * in one of the methods calls in the IntegralCalculator class, from my old methods. The bounds of which you integrate from can be 
        * pre determined in this class via one of the below pass ins.
        * 
        * Note: the CPU power required to accomplish complex integrals at high N values is high. This program in the future should be adjusted to be
        * multithreaded to help the overhead of the computation be solved much quicker. However for now, we can get a pretty close approximation.
        * 
        * For questions / suggestions email bobbylenko120@hotmail.com
        * Note: This program was made in my beginning java days, and I am more of a python programmer. There will be redundency / dependency.
        * 
        */ 
        
        
       Scanner in = new Scanner(System.in);
       
       System.out.println("* * * Integral Calculator Initiated * * *");
       System.out.println();
       
       while(true) 
       {
            System.out.println("Enter the integer for chosen the Integral, Enter 0 to quit.");
            System.out.println();
            
            //
            System.out.println("1. x^3 from 1 to 3");
            System.out.println("2. sqrt(1+4x^2) from 0 to 1");
            System.out.println("3. e^(-x^2) from 0 to 10");
            System.out.println("4. sin(x)/x from -1000 to 1000");
            System.out.println("5. sqrt(1+(x^2/25)-x+(25/4)) from 0 to 20");
            System.out.println();
            
            System.out.print("You entered: ");
            
            int x = in.nextInt();
            
            System.out.println("Computing...");
            System.out.println();
            
            IntegralCalculator integral = new IntegralCalculator();
            
            if(x == 1) 
            {
               System.out.print("Your approximated result is: "); 
               System.out.println(integral.Integrate1(1, 3, 100000000));
               System.out.println();
            }
            else if(x == 2)
            {
               System.out.print("Your approximated result is: "); 
               System.out.println(integral.Integrate2(0, 1, 100000000));
               System.out.println();
            }
            else if(x == 3)
            {
               System.out.print("Your approximated result is: ");  
               System.out.println(integral.Integrate3(0, 10, 100000000));
               System.out.println();
               System.out.println("Standard computation time exceeded, answer may be inaccurate... ");
               System.out.println();
               System.out.println("This integral can be represented with the error function: 1/2sqrt(pi)*erf(10) = 0.88622... ");
               System.out.println();
            }
            else if(x == 4)
            {
               System.out.print("Your approximated result is: ");  
               System.out.println(integral.Integrate4(-1000, 1000, 100000000));
               System.out.println();
            }
            else if(x == 5)
            {
               System.out.print("Your approximated result is: ");  
               System.out.println(integral.Integrate5(0, 20, 19));
               System.out.println();
            }
            else if(x == 0)
            {
               System.out.println("Program Terminated");
               break;
            }
            else
            {
               System.out.println("Invalid Input. Please restart program.");
               break;
            }
            
        
        }
         
    }

}