import java.lang.*;
import java.lang.Math.*;
import java.util.*;
import java.io.*;

public class diffie{

public static double power(double a, double b, double P)
{
	if (b == 1)
		return a;

	else
		return ((Math.pow(a, b)) % P);
}

//Driver program
public static void main(String[] args)
{
	double G, x, a, y, b, ka, kb, P;

	// Both the persons will be agreed upon the
		// public keys G and P
	P = 23; // A prime number P is taken
	System.out.println("The value of P : "+ P);

	G = 9; // A primitve root for P, G is taken
	System.out.println("The value of G : "+ G);

	// Alice will choose the private key a
	a = 4; // a is the chosen private key
	System.out.println("The private key a for Alice : "+ a);
	x = power(G, a, P); // gets the generated key

	// Bob will choose the private key b
	b = 3; // b is the chosen private key
	System.out.println("The private key b for Bob : "+ b);
	y = power(G, b, P); // gets the generated key

	// Generating the secret key after the exchange
		// of keys
	ka = power(y, a, P); // Secret key for Alice
	kb = power(x, b, P); // Secret key for Bob

	System.out.println("Secret key for the Alice is : "+ ka);
	System.out.println("Secret Key for the Bob is : "+ kb);

}

}
