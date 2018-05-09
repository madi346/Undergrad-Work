#ifndef _function4
#define _function4

#include <string>
using namespace std;

int GetLength(string word)
{
    int length = word.size();
    return length;
}

void Test_GetLength()
{
    cout << "************ Test_GetLength ************" << endl;

    string input;
    int expectedOutput;
    int actualOutput;

    /* TEST 1 ********************************************/
    input = "cat";
    expectedOutput = 3;

    actualOutput = GetLength( input );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_GetLength: Test 1 passed!" << endl << endl;
    }
    else
    {
        cout << "Test_GetLength: Test 1 FAILED! \n\t"
        << "Input: " << input << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 2 ********************************************/
    // CREATE YOUR OWN TEST
    input = "coffee";             // change me
    expectedOutput = 6;     // change me

    actualOutput = GetLength( input );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_GetLength: Test 2 passed!" << endl;
    }
    else
    {
        cout << "Test_GetLength: Test 2 FAILED! \n\t"
        << "Input: " << input << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }

    /* TEST 3 ********************************************/
    // CREATE YOUR OWN TEST
    input = "supercalifragilisticexpialidocious";             // change me
    expectedOutput = 34;     // change me

    actualOutput = GetLength( input );
    if ( actualOutput == expectedOutput )
    {
        cout << "Test_GetLength: Test 3 passed!" << endl;
    }
    else
    {
        cout << "Test_GetLength: Test 3 FAILED! \n\t"
        << "Input: " << input << "\n\t"
        << "Expected: " << expectedOutput << "\n\t"
        << "Actual: " << actualOutput << endl << endl;
    }
}

#endif



