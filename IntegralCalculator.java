import java.lang.Math;

/**
 * Holds all the methods used by the IntegralTester Class. Performs analysis of integration techniques, applying
 * the rules and arithmetic needed to produce an approximated answer in decimal format.
 * (Accurate to at least four decimal places)
 *
 * @author Robert Lenko
 * @version 10/7/2018
 */
public class IntegralCalculator
{
    
    public static double f(double x)
    {
        return (Math.pow(x,3));
    }
    
    public static double g(double y)
    {
        return (Math.sqrt(1+4*Math.pow(y,2)));
    }
    
    public static double j(double z)
    {
       return (Math.pow(Math.E, Math.pow(-z,2)));      //1.350E42
       
       //Ignore the below previous attempts at calculations.
       
       //Attempts and answers below.
       //return (Math.pow(Math.E, Math.exp(-z*-z)));   //Infinity
       //return Math.exp(z*z);                        //1.350E42
       //return Math.pow(Math.E,(z*z));                //1.350E42
       //return (Math.pow(Math.exp(-z),2));           //.500000000
    }
    
    public static double k(double q)
    {   
       return (Math.sin(q)/q);   
    }
    
    public static double m(double r)
    {
        return (Math.sqrt(1+(Math.pow(r, 2)/25)-r+(25/4)));
    }
    
    public static double Integrate1(double a, double b, long n)
    {
      double sum = 0, h = 0, i =0;
      if(a>b)
      {
        Integrate1(b,a,n);
      }   
      else
      {
          h = (b-a)/n;
          for(i=a; i<=b; i=i+h)
          {
            sum = sum + h*f(i);    
          }
      }
      return sum;
    }

    public static double Integrate2(double a, double b, long n)
    {
      double sum = 0, h = 0, i =0;
      if(a>b)
      {
        Integrate2(b,a,n);
      }   
      else
      {
          h = (b-a)/n;
          for(i=a; i<=b; i=i+h)
          {
            sum = sum + h*g(i);    
          }
      }
      return sum; 
    }
    
    public static double Integrate3(double a, double b, long n)
    {
      double sum = 0, h = 0, i =0;
      if(a>b)
      {
        Integrate3(b,a,n);
      }   
      else
      {
          h = (b-a)/n;
          for(i=a; i<=b; i=i+h)
          {
            sum = sum + h*j(i);    
          }
      }
      return sum; 
    }
    
    public static double Integrate4(double a, double b, long n)
    {
      double sum = 0, h = 0, i =0;
      if(a>b)
      {
        Integrate4(b,a,n);
      }   
      else
      {
          h = (b-a)/n;
          for(i=a; i<=b; i=i+h)
          {
            sum = sum + h*k(i);    
          }
      }
      return sum; 
    }
    
    public static double Integrate5(double a, double b, long n)
    {
      double sum = 0, h = 0, i =0;
      if(a>b)
      {
        Integrate5(b,a,n);
      }   
      else
      {
          h = (b-a)/n;
          for(i=a; i<=b; i=i+h)
          {
            sum = sum + h*m(i);    
          }
      }
      return sum;
    }
    
}

