import java.util.*;
import java.lang.*;
public class RSA1{
public static void main(String[] args)
{
    //2 random prime numbers
    double p = 3;
    double q = 7;
    double n=p*q;
    double count;
    double totient = (p-1)*(q-1);

    //public key
    //e stands for encrypt
    double e = 2;

    //for checking co-prime which satisfies e>1
    while(e<totient){
    count = gcd(e,totient);
    if(count==1)
        break;
    else
        e++;
    }

    //private key
    //d stands for decrypt
    double d;

    //k can be any arbitrary value
    double k = 2;

    //choosing d such that it satisfies d*e = 1 + k * totient
    d = (1 + (k*totient))/e;
    double msg = 12;
    double c = Math.pow(msg,e);
    double m = Math.pow(c,d);
    c= c%n;
    m= m%n;

    System.out.println("Message data = "+msg);
    System.out.println("p = "+p);
    System.out.println("q = "+q);
    System.out.println("n = pq = "+n);
    System.out.println("totient = "+totient);
    System.out.println("e = "+e);
    System.out.println("d = "+d);
    System.out.println("Encrypted data = "+c);
    System.out.println("Original Message Sent = "+m);

}
//to find gcd
public static double gcd(double a, double h)
{
  double temp;
  while(true)
  {
      temp = a%h;
      if(temp==0)
      return h;
      a = h;
      h = temp;
  }
}

}
