#ifndef _function1
#define _function1

int SumThree( int a, int b, int c )
{
    return a + b + c;
}

/* Add a test to this function */
void Test_SumThree()
{
    cout << "************ Test_SumThree ************" << endl;

    int input1, input2, input3;
    int expectedOutput;
    int actualOutput;

    /* TEST 1 ********************************************/
    input1 = 1; input2 = 1; input3 = 1;
    expectedOutput = 3;

    actualOutput = SumThree( input1, input2, input3 );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_AddThree: Test 1 passed!" << endl << endl;
    }
    else
    {
        cout << "Test_AddThree: Test 1 FAILED! \n\t"
        << "Inputs: " << input1 << ", " << input2 << ", " << input3 << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 2 ********************************************/
    // CREATE YOUR OWN TEST
    input1 = -21;             // change me
    input2 = 5;             // change me
    input3 = 11;             // change me
    expectedOutput = -5;    // change me


    // Run test (keep this as-is):
    actualOutput = SumThree( input1, input2, input3 );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_AddThree: Test 2 passed!" << endl << endl;
    }
    else
    {
        cout << "Test_AddThree: Test 2 FAILED! \n\t"
        << "Inputs: " << input1 << ", " << input2 << ", " << input3 << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 3 ********************************************/
    // CREATE YOUR OWN TEST
    input1 = 125;             // change me
    input2 = 25;             // change me
    input3 = -50;             // change me
    expectedOutput = 100;    // change me


    // Run test (keep this as-is):
    actualOutput = SumThree( input1, input2, input3 );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_AddThree: Test 3 passed!" << endl << endl;
    }
    else
    {
        cout << "Test_AddThree: Test 3 FAILED! \n\t"
        << "Inputs: " << input1 << ", " << input2 << ", " << input3 << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }
}

#endif
