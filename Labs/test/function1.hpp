#ifndef _function1
#define _function1

/*
CountUp functions
@param int start    The starting value (inclusive) to begin at
@param int end      The end value (inclusive) to run until

Display the numbers between [start] and [end], incrementing by 1 each time.
*/

void CountUp_Iter( int start, int end )
{
	for (int i = start; i <= end; i++) {
		cout << i << " "; 
	}
}

void CountUp_Rec( int start, int end )
{
	cout << start << " ";
	// terminating case
	if (start == end) {
		return; // to stop 
	}

	// recursive case
	CountUp_Rec(start + 1, end); 
	
}

#endif
