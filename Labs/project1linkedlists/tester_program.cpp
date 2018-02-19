#include <iostream>
#include <string>
#include "Tester.hpp"

using namespace std;

int main()
{
    Tester tester;
    tester.RunTests();

	// to prevent from closing 
	cin.ignore();
	cin.get();
    return 0;
}


