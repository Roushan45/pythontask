package cheggapril;
import java.util.Random;
class TestRational
{
   public static void main (String[] args)
   {
       int a, b, c, d, e, f;
       
       Random rationalRand = new Random();
       
       a = rationalRand.nextInt(9) + 1;
       b = rationalRand.nextInt(9) + 1;
       d = rationalRand.nextInt(9) + 1;
       c = rationalRand.nextInt(9) + 1;
       e = rationalRand.nextInt(9) + 1;
       f = rationalRand.nextInt(9) + 1;
       
       Rational r1 = new Rational(a,b);
       Rational r2 = new Rational(c,d);
       Rational r3 = new Rational(e,f);
       int numerator,denominator;
      
       Rational r4 = new Rational();
  
      
       System.out.println("rational Numbers : "+r1+","+r2+","+r3);
      
       if(r1.greaterThan(r2))
       {
            if(r1.greaterThan(r3))
            {
                numerator = r1.getNumerator();
                denominator = r1.getDenominator();
            }
            else
            {
                numerator = r3.getNumerator();
                denominator = r3.getDenominator();
            }
          
       }
       else
       {
           if(r2.greaterThan(r3))
            {
                numerator = r2.getNumerator();
                denominator = r2.getDenominator();
            }
            else
            {
                numerator = r3.getNumerator();
                denominator = r3.getDenominator();
            }
       }
       double r = (double)numerator/denominator;
       System.out.println("\nMaximum :"+ numerator+"/"+denominator+ "("+r+")");
      
      
       if(r1.smallerThan(r2))
       {
            if(r1.smallerThan(r3))
            {
                numerator = r1.getNumerator();
                denominator = r1.getDenominator();
            }
            else
            {
                numerator = r3.getNumerator();
                denominator = r3.getDenominator();
            }
          
       }
       else
       {
           if(r2.smallerThan(r3))
            {
                numerator = r2.getNumerator();
                denominator = r2.getDenominator();
            }
            else
            {
                numerator = r3.getNumerator();
                denominator = r3.getDenominator();
            }
       }
       r = (double)numerator/denominator;
       System.out.println("\nMinimum :"+ numerator+"/"+denominator+ "("+r+")");
      
      
       r4 = r4.sum(r1);
       r4 = r4.sum(r2);
       r4 = r4.sum(r3);
       r4.reduce(); //reduce the sum of three Rational numbers
      
       Rational avg = new Rational(r4.getNumerator(),r4.getDenominator()*3);
       avg.reduce();
      
       System.out.println("\nSum = "+r4+"("+r4.toDecimal()+")");
      
       System.out.println("\nAverage = "+avg+"("+r4.toDecimal()/3+")"); // avg rational number divided by 3
      
   }
}