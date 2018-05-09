#ifndef _function2
#define _function2

int SumArray( int arr[], int size )
{
	int sum = 0;
    for ( int i = 0; i < size; i++ )
    {
        
        sum += arr[i];
    }
    return sum;
}

/* Add a test to this function */
void Test_SumArr()
{
    cout << "************ Test_SumArr ************" << endl;

    int expectedOutput;
    int actualOutput;

    /* TEST 1 ********************************************/
    int inputArray1[] = { 1, 2, 3, 4 };
    expectedOutput = 10;

    actualOutput = SumArray( inputArray1, 4 );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_SumArr: Test 1 passed!" << endl;
    }
    else
    {
        cout << "Test_SumArr: Test 1 FAILED! \n\t"
        << "Inputs: 1, 2, 3, 4 \n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 2 ********************************************/
    // CREATE YOUR OWN TEST
    int inputArray2[] = { -50, 25, 50, 175, 2 };
    expectedOutput = 202;    // change me


    // Run test (keep this as-is):
    actualOutput = SumArray( inputArray2, 5 ); // 2nd argument is size of the array
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_SumArr: Test 2 passed!" << endl;
    }
    else
    {
        cout << "Test_SumArr: Test 2 FAILED! \n\t"
        << "Inputs: -50, 25, 50, 175, 2 \n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 3 ********************************************/
    // CREATE YOUR OWN TEST
    int inputArray3[] = { 0, 5, -11, -53, 9 };
    expectedOutput = -50;    // change me


    // Run test (keep this as-is):
    actualOutput = SumArray( inputArray3, 5 ); // 2nd argument is size of the array
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_SumArr: Test 3 passed!" << endl;
    }
    else
    {
        cout << "Test_SumArr: Test 3 FAILED! \n\t"
        << "Inputs: 0, 5, -11, -53, 9 \n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

}

#endif

