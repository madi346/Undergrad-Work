#ifndef _SEARCHER_HPP
#define _SEARCHER_HPP

#include "Timer.hpp"
#include <stdlib.h> 

class Searcher
{
    public:
    Searcher( int arraySize );

    int Search1( const vector<int>& arr, int findMe );
    int Search2( const vector<int>& arr, int findMe );
    int Search3( const vector<int>& arr, int findMe );

    vector<int> Sorter1( const vector<int>& arr );

    int Fibonacci_Rec( int n );
    int Fibonacci_Iter( int n );

    void Run( int type );

    private:
    void DoSearch( int type );
    void DoSort();
    void DoFibonacci( int type );

    vector<int> m_array;
    bool m_listSorted;
};

Searcher::Searcher( int arraySize )
{
    cout << "Vector size: " << arraySize << endl;
    for ( int i = 0; i < arraySize; i++ )
    {
        m_array.push_back( rand() % arraySize );
    }
    m_listSorted = false;
}

void Searcher::Run( int type )
{
    if ( type == 1 || type == 2 || type == 3 )
    {
        DoSearch( type );
    }
    else if ( type == 4 )
    {
        DoSort();
    }
    else
    {
        DoFibonacci( type );
    }
}

void Searcher::DoSearch( int type )
{
    int n;
    cout << "Enter the INTEGER value to find: " << endl;
    cin >> n;

    cout << "Searching with ";
    Timer timer;
    timer.Start();

    int index = -1;

    if ( type == 1 )
    {
        cout << "Search 1..." << endl;
        index = Search1( m_array, n );
    }
    else if ( type == 2 )
    {
        cout << "Search 2..." << endl;
        index = Search2( m_array, n );
    }
    else if ( type == 3 )
    {
        cout << "Search 3..." << endl;
        index = Search3( m_array, n );
    }

    cout << endl << "Done, time elapsed: " << timer.GetElapsedMilliseconds() << " milliseconds" << endl;
    cout << "Result: " << n << " found at index " << index << endl;
}

void Searcher::DoSort()
{
    Timer timer;
    timer.Start();

    cout << "Sorting..." << endl;
    m_array = Sorter1( m_array );
    cout << endl << "Done, time elapsed: " << timer.GetElapsedMilliseconds() << " milliseconds" << endl;

    m_listSorted = true;

    cout << "First 5 values: " << endl;
    for ( int i = 0; i < 5; i++ )
    {
        cout << i << " = " << m_array[i] << endl;
    }
    cout << "Last 5 values: " << endl;
    for ( int i = m_array.size() - 5; i < m_array.size(); i++ )
    {
        cout << i << " = " << m_array[i] << endl;
    }

    cout << "List has been sorted. Outcomes for searches may be different." << endl;
}

void Searcher::DoFibonacci( int type )
{
    int n;
    cout << "Find which Fibonacci number? ";
    cin >> n;

    Timer timer;
    timer.Start();

    int fib = -1;

    if ( type == 5 )
    {
        cout << "Recursive Fibonacci..." << endl;
        fib = Fibonacci_Rec( n );
    }
    else if ( type == 6 )
    {
        cout << "Iterative Fibonacci..." << endl;
        fib = Fibonacci_Iter( n );
    }

    cout << endl << "Done, time elapsed: " << timer.GetElapsedMilliseconds() << " milliseconds" << endl;
    cout << "Result: " << n << "th Fibonacci number is " << fib << endl;

}

int Searcher::Search1( const vector<int>& arr, int findMe )
{
    // Implement a search
	for (int i = 0; i < arr.size(); i++) {
		if (arr[i] == findMe) {
			return i;
		}
	}
	//return -1;
}

int Searcher::Search2( const vector<int>& arr, int findMe )
{
    // Implement a search, random search
	
	int size = arr.size();
	for (int i = rand() % size; i < size; i++) {
		if (arr[i] == findMe) {
			return i;
		}
	}
	
}

int Searcher::Search3( const vector<int>& arr, int findMe )
{
    // Binary search
    if ( !m_listSorted )
    {
        cout << "Binary search only works with a sorted list." << endl;
        return -1;
    }

    int l = 0;
    int r = arr.size() - 1;

    while ( l <= r )
    {
        int m = l + ( r - l ) / 2;

        if ( arr[m] == findMe )
        {
            return m;
        }

        if ( arr[m] < findMe )
        {
            l = m + 1;
        }

        else
        {
            r = m - 1;
        }
    }

    return -1;
}

vector<int> Searcher::Sorter1( const vector<int>& arr )
{
    // Bubble Sort
    vector<int> sorted = arr;
    unsigned int n = sorted.size();

    for ( unsigned int i = 0; i < n-1; i++ )
    {
        for ( unsigned int j = 0; j < n-i-1; j++ )
        {
            if ( sorted[j] > sorted[j+1] )
            {
                int temp = sorted[j];
                sorted[j] = sorted[j+1];
                sorted[j+1] = temp;
            }
        }
    }

    return sorted;
}

int Searcher::Fibonacci_Rec( int n )
{
    if ( n <= 0 )       { return 0; }
    else if ( n == 1 )  { return 1; }
    else
    {
        return Fibonacci_Rec( n-1 ) + Fibonacci_Rec( n-2 );
    }
}

int Searcher::Fibonacci_Iter( int n )
{
    // From http://www.sanfoundry.com/cpp-program-find-fibonacci-numbers-iteration/
    int previous = 1;
    int current = 1;
    int next = 1;

    for ( int i = 3; i <= n; i++ )
    {
        next = current + previous;
        previous = current;
        current = next;
    }
    return next;
}

#endif
