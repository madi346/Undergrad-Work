#ifndef _function2
#define _function2

/*
MultiplyUp functions
@param int start    The starting value (inclusive) to begin at
@param int end      The end value (inclusive) to run until

Display the numbers between [start] and [end], multiplying
the value by itself each time.
*/

void MultiplyUp_Iter( int start, int end )
{
	for (int i = start; i <= end; i*=i) {
		cout << i << "   "; 
 
	}
	
}

void MultiplyUp_Rec( int start, int end )
{
	
	// terminating case
	if (start > end) {
		return; // end
	}
	cout << start << "   ";

	//recursive case
	MultiplyUp_Rec(start*start, end); 
}

#endif
