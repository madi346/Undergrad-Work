#ifndef _function3
#define _function3

/*
Factorial functions
@param int n        The n! value

Calculate n! by multiplying n * (n-1) * (n-2) * ... * 3 * 2 * 1.
*/

int Factorial_Iter( int n )
{
	for (int i = n - 1; i > 0; i--) {
		n *= i; 
	}
	return n; 
   
}

int Factorial_Rec( int n )
{
	//terminating case
	if (n == 0) {
		return 1;
	}
	// recursive case
	return n*Factorial_Rec(n - 1);
   
	
}

#endif
