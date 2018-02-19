#include "Tester.hpp"

#include <string>
#include <iostream>
using namespace std; 

void Tester::RunTests()
{
    Test_IsEmpty();
    Test_IsFull();
    Test_Size();
    Test_GetCountOf();
    Test_Contains();

    Test_PushFront();
    Test_PushBack();

    Test_Get();
    Test_GetFront();
    Test_GetBack();

    Test_PopFront();
    Test_PopBack();
    Test_Clear();

    Test_ShiftRight();
    Test_ShiftLeft();

    Test_Remove();
    Test_Insert();
}

void Tester::DrawLine()
{
    cout << endl;
    for ( int i = 0; i < 80; i++ )
    {
        cout << "-";
    }
    cout << endl;
}

void Tester::Test_Init()
{
    DrawLine();
    cout << "TEST: Test_Init" << endl;

    // Put tests here
}

void Tester::Test_ShiftRight()
{
    DrawLine();
    cout << "TEST: Test_ShiftRight" << endl;

	//test 1 
	List<string> testSR;
	cout << "test 1" << endl;
	
	testSR.PushBack("A");
	testSR.PushBack("B");
	testSR.PushBack("C");
	testSR.PushBack("D");
	testSR.PushBack("E");
	testSR.PushBack("F");

	bool expectedValue = true;
	bool actualValue = testSR.ShiftRight(3); 
	cout << "Item at index 4 is " << testSR.Get(4); 

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;


	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test 2
	List<int> testSR3;
	cout << "test 2" << endl;


	expectedValue = false; 
	actualValue = testSR3.ShiftRight(5);
	
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;


	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}


}

void Tester::Test_ShiftLeft()
{
    DrawLine();
    cout << "TEST: Test_ShiftLeft" << endl;

	//test 1 
	List<string> testSL;
	cout << "test 1" << endl;

	testSL.PushBack("A");
	testSL.PushBack("B");
	testSL.PushBack("C");
	testSL.PushBack("D");
	testSL.PushBack("E");
	testSL.PushBack("F");

	bool expectedValue = true;
	bool actualValue = testSL.ShiftLeft(1);
	cout << "Item at index 1 is " << testSL.Get(1);

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;


	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}


	//test 2
	List<int> testSL3;
	cout << "test 2" << endl;


	expectedValue = false;
	actualValue = testSL3.ShiftLeft(13);

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;


	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

}

void Tester::Test_Size()
{
    DrawLine();
    cout << "TEST: Test_Size" << endl;

    {   // Test begin
        cout << endl << "Test 1" << endl;
        List<int> testList;
        int expectedSize = 0;
        int actualSize = testList.Size();

        cout << "Expected size: " << expectedSize << endl;
        cout << "Actual size:   " << actualSize << endl;

        if ( actualSize == expectedSize )
        {
            cout << "Pass" << endl;
        }
        else
        {
            cout << "Fail" << endl;
        }
    }   // Test end

    {   // Test begin
        cout << endl << "Test 2" << endl;
        List<int> testList2;

        testList2.PushBack( 1 );
		testList2.PushBack(2); 

        int expectedSize = 2;
        int actualSize = testList2.Size();

        cout << "Expected size: " << expectedSize << endl;
        cout << "Actual size:   " << actualSize << endl;

        if ( actualSize == expectedSize )
        {
            cout << "Pass" << endl;
        }
        else
        {
            cout << "Fail" << endl;
        }
    }   // Test end

	{ // test begin
		cout << endl << "Test 3" << endl;
		List<int> testList3;

		for (int i = 0; i < 100; i++) {
			testList3.PushBack(6);
		}
		
		int expectedSize = 100;
		int actualSize = testList3.Size();

		cout << "Expected size: " << expectedSize << endl;
		cout << "Actual size:   " << actualSize << endl;

		if (actualSize == expectedSize)
		{
			cout << "Pass" << endl;
		}
		else
		{
			cout << "Fail" << endl;
		}
	} // test end
}

void Tester::Test_IsEmpty()
{
    DrawLine();
    cout << "TEST: Test_IsEmpty" << endl;

    // Put tests here
	//test 1
	cout << "test 1" << endl;
	
	List<int> listEmpty;
	bool expectedValue = true;
	bool actualValue = listEmpty.IsEmpty();
	//cout << "created list didnt add anything, should be " << endl;
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed"; 
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<int> listEmpty2;
	listEmpty2.PushBack(1); 

	
	expectedValue = false;
	actualValue = listEmpty2.IsEmpty();
	
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
}

void Tester::Test_IsFull()
{
    DrawLine();
    cout << "TEST: Test_IsFull" << endl;

    // test 1
	cout << "test 1" << endl;

	List<string> listF;

	bool expectedValue = false;
	bool actualValue = listF.IsFull();
	
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<string> listF2; 
	listF2.PushBack("A");
	listF2.PushBack("A");

	expectedValue = false;
	actualValue = listF2.IsFull();
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test 3
	cout << endl << "Test 3" << endl;
	List<string> testFull3;

	for (int i = 0; i < 100; i++) {
		testFull3.PushBack("m");
	}

	expectedValue = true;
	actualValue = testFull3.IsFull();
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test 4
	cout << endl << "Test 4" << endl;
	List<string> testFull4;

	for (int i = 0; i < 105; i++) {
		testFull4.PushBack("m");
	}

	expectedValue = true;
	actualValue = testFull4.IsFull();
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
} 



void Tester::Test_PushFront()
{
    DrawLine();
    cout << "TEST: Test_PushFront" << endl;

    // test 1
	List<string> testPf;
	cout << "test 1" << endl;
	for (int i = 0; i < 100; i++) {
		testPf.PushFront("A");
	}

	
	bool expectedValue = false;
	bool actualValue = testPf.PushFront("A");
	cout << "size of list " << testPf.Size();

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testPf2;
	cout << "test 2" << endl;

	testPf2.PushFront("A");
	testPf2.PushFront("B");
	testPf2.PushFront("C");




	expectedValue = true;
	actualValue = testPf2.PushFront("D"); 
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	cout << endl << "size of list " << testPf2.Size(); 
	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
	
}

void Tester::Test_PushBack()
{
    DrawLine();
    cout << "TEST: Test_PushBack" << endl;

	//test 1 
	List<string> testPb;
	cout << "test 1" << endl;
	for (int i = 0; i < 100; i++) {
		testPb.PushBack("A");
	}


	bool expectedValue = false;
	bool actualValue = testPb.PushBack("A");
	cout << "size of list " << testPb.Size();

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testPb2;
	cout << "test 2" << endl;

	testPb2.PushBack("A");
	




	expectedValue = true;
	actualValue = testPb2.PushBack("B");
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	cout << "size of list " << testPb2.Size();
	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}


}

void Tester::Test_PopFront()
{
    DrawLine();
    cout << "TEST: Test_PopFront" << endl;


	//test 1 
	List<int> testPopf;
	cout << "test 1" << endl;
	
	testPopf.PushBack(1);
	testPopf.PushBack(2);
	testPopf.PushBack(3);
	testPopf.PushBack(4);


	bool expectedValue = true;
	bool actualValue = testPopf.PopFront();
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	cout << "size of list " << testPopf.Size();
	//cout << "\n item at front of list " << testPopf.GetFront(); 

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testPopf2;
	cout << "test 2" << endl;

	expectedValue = false;
	actualValue = testPopf2.PopFront();
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	
	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

}

void Tester::Test_PopBack()
{
    DrawLine();
    cout << "TEST: Test_PopBack" << endl;


	//test 1 
	List<string> testPopb;
	cout << "test 1" << endl;
	
	testPopb.PushBack("A");
	testPopb.PushBack("B");
	testPopb.PushBack("C");
	testPopb.PushBack("D");
	testPopb.PushBack("E");

	bool expectedValu = true;
	bool actualValu = testPopb.PopBack();
	cout << "expected value" << expectedValu << endl;
	cout << "accepted value" << actualValu << endl;

	cout << "size of list " << testPopb.Size();
	//cout << "\n item at back of list " << testPopb.GetBack();

	if (actualValu == expectedValu) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testPopb2;
	cout << "test 2" << endl;


	expectedValu = false;
	actualValu = testPopb2.PopBack();
	cout << "expected value" << expectedValu << endl;
	cout << "accepted value" << actualValu << endl;


	if (actualValu == expectedValu) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

}

void Tester::Test_Clear()
{
    DrawLine();
    cout << "TEST: Test_Clear" << endl;

    // test 1 
	List<string> testClr;
	cout << "test 1" << endl;
	
		testClr.PushBack("M");
		testClr.PushBack("N");
		testClr.PushBack("O");
		testClr.PushBack("P");

		testClr.Clear(); 
		cout << "size of list " << testClr.Size();
		if (testClr.IsEmpty() == true) {
			cout << "list is empty" << endl; 
		}


	//bool expectedValue = false;
	//bool actualValue = true;
	//bool actualValue = testClr.Clear(); 
	//cout << "expected value" << expectedValue << endl;
	//cout << "accepted value" << actualValue << endl;

	
	//if (actualValue == expectedValue) {
		//cout << "test passed";
	//}
	//else {
		//cout << "test failed";
	//}

}

void Tester::Test_Get()
{
    DrawLine();
    cout << "TEST: Test_Get" << endl;

	//test 1 
	List<string> testG;
	cout << "test 1" << endl; 
	testG.PushBack("A");
	testG.PushBack("B");
	testG.PushBack("C");
	testG.PushBack("D");
	testG.PushBack("E");

	string expectedVal = "C"; 
	string* actualVal = testG.Get(2); 

	if (actualVal == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}

	cout << "expected value" << expectedVal << endl;
	cout << "accepted value" << *actualVal << endl;

	
	if (*actualVal == expectedVal) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testG2;
	cout << "test 2" << endl;

	for (int i = 0; i < 100; i++) {
		testG2.PushBack("M");
	}
	expectedVal = "M"; 
	actualVal = testG2.Get(99); 

	if (actualVal == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}


	cout << "expected value" << expectedVal << endl;
	cout << "accepted value" << *actualVal << endl;


	if (*actualVal == expectedVal) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

}

void Tester::Test_GetFront()
{
    DrawLine();
    cout << "TEST: Test_GetFront" << endl;

    // test 1
	List<string> testGF;
	cout << "test 1" << endl;
	testGF.PushBack("H");
	testGF.PushBack("E");
	testGF.PushBack("L");
	testGF.PushBack("L");
	testGF.PushBack("O");

	string expectedVal = "H"; 
	string* actualVal = testGF.GetFront();

	if (actualVal == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}

	cout << "expected value" << expectedVal << endl;
	cout << "accepted value" << *actualVal << endl;


	if (*actualVal == expectedVal) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testGF2;
	cout << "test 2" << endl;

	
	string* expectedV = nullptr;
	string* actualV = testGF2.GetFront();

	if (actualV == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}

	cout << "expected value" << expectedV << endl;
	cout << "accepted value" << actualV << endl;


	if (actualV == expectedV) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
}

void Tester::Test_GetBack()
{
    DrawLine();
    cout << "TEST: Test_GetBack" << endl;

    //test1
	List<int> testGB;
	cout << "test 1" << endl;
	testGB.PushBack(1);
	testGB.PushBack(2);
	testGB.PushBack(3);
	testGB.PushBack(4);
	testGB.PushBack(5);
	testGB.PushBack(6);
	testGB.PushBack(7);

	int expectedVl = 7; 
	int* actualVl = testGB.GetBack();

	if (actualVl == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}

	cout << "expected value" << expectedVl << endl;
	cout << "accepted value" << *actualVl << endl;


	if (*actualVl == expectedVl) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	// test 2
	List<string> testGB2;
	cout << "test 2" << endl;

	
	string* expectedVal = nullptr; 
	string* actualVal = testGB2.GetBack();

	if (actualVal == nullptr)
	{
		cout << "nullptr" << endl;
		return;
	}

	cout << "expected value" << expectedVal << endl;
	cout << "accepted value" << actualVal << endl;


	if (actualVal == expectedVal) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
}

void Tester::Test_GetCountOf()
{
    DrawLine();
    cout << "TEST: Test_GetCountOf" << endl;

	// test 1
	cout << "test 1" << endl;

	List<string> listGC;

	int expectedVl = 0; 
	int actualVl = listGC.GetCountOf("A"); 
	cout << "created list didnt add anything, should be " << endl;
	cout << "expected value" << expectedVl << endl;
	cout << "accepted value" << actualVl << endl;

	if (actualVl == expectedVl) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<string> listGC2;
	listGC2.PushBack("A");
	listGC2.PushBack("B");
	listGC2.PushBack("c");
	listGC2.PushBack("A");


	expectedVl = 2;
	actualVl = listGC2.GetCountOf("A"); 
	cout << "expected value" << expectedVl << endl;
	cout << "accepted value" << actualVl << endl;

	if (actualVl == expectedVl) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

}

void Tester::Test_Contains()
{
    DrawLine();
    cout << "TEST: Test_Contains" << endl;
	//test1
	List<string> testCon; 
	cout << "test 1" << endl;
	
	testCon.PushBack("A");
	testCon.PushBack("B");
	testCon.PushBack("C");
	testCon.PushBack("D");

	bool expectedValue = true;
	bool actualValue = testCon.Contains("D"); 
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

    // test 2
	List<string> testCon2;
	cout << "test 2" << endl;

	testCon2.PushBack("H");
	testCon2.PushBack("E");
	testCon2.PushBack("L");
	testCon2.PushBack("L");
	testCon2.PushBack("O");

	expectedValue = false;
	actualValue = testCon2.Contains("R");
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
}

void Tester::Test_Remove()
{
    DrawLine();
    cout << "TEST: Test_Remove" << endl;

	// test 1
	cout << "test 1" << endl;

	List<string> listR;
	listR.PushBack("A");
	listR.PushBack("B");
	listR.PushBack("C");
	listR.PushBack("D");
	listR.PushBack("E");
	listR.PushBack("G");


	bool expectedValue = true;
	bool actualValue = listR.Remove("D"); 
	cout << "size of list " << listR.Size();
	cout << "\n item at index 3 " << listR.Get(3);

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<string> listR2;

	
	expectedValue = false;
	actualValue = listR2.Remove("R"); 
	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test 3
	cout << "test 3" << endl;
	List<string> listR3;
	
		listR3.PushBack("A");
		listR3.PushBack("A");
		listR3.PushBack("B");
		listR3.PushBack("A");
	

	expectedValue = true;
	actualValue = listR3.Remove("A");
	cout << "size of list " << listR3.Size();
	cout << "\n item at index 0 " << listR3.Get(0);

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;


	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}



	cout << "TEST: Test_RemoveIndex" << endl;
	// test 1
	cout << "test 1" << endl;

	List<string> listRI;
	
	
		listRI.PushBack("A"); 
		listRI.PushBack("C");
		listRI.PushBack("A");
	
	expectedValue = true;
	actualValue = listRI.RemoveIndex(1);

	cout << "size of list " << listRI.Size();
	cout << "\n item at index 1 " << listRI.Get(1);

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<string> listRI2;
	
	listRI2.PushBack("C");
	listRI2.PushBack("C");
	listRI2.PushBack("C");
	listRI2.PushBack("C");

	expectedValue = false;
	actualValue = listRI2.RemoveIndex(10);

	cout << "size of list " << listRI2.Size();
	

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}


	
}

void Tester::Test_Insert()
{
    DrawLine();
    cout << "TEST: Test_Insert" << endl;

	// test 1
	cout << "test 1" << endl;

	List<string> listI;

	bool expectedValue = true; 
	bool actualValue = listI.Insert(0, "A"); 
	cout << "size of list " << listI.Size();

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}

	//test2
	cout << "test 2" << endl;
	List<string> listI2;
	
	
	expectedValue = false;
	actualValue = listI2.Insert(5, "B"); 
	cout << "size of list " << listI2.Size();

	cout << "expected value" << expectedValue << endl;
	cout << "accepted value" << actualValue << endl;

	if (actualValue == expectedValue) {
		cout << "test passed";
	}
	else {
		cout << "test failed";
	}
}
