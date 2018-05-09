// Lab - Standard Template Library - Part 2 - Lists
// Madison Hubbard
#include <iostream>
#include <list>
#include <string>
using namespace std;

void DisplayList(list < string >& states) {
	for (list < string >::iterator it = states.begin(); it != states.end(); it++) {

		cout << *it << " \t ";
	}

	cout << endl;
}

int main()
{
	list<string> states;

	bool done = false;
	while (!done) {
		cout << endl << "---------------------------"; 
		cout << endl << "State list size = " << states.size() << endl; 
		cout << "(1) Add new states to front of list, (2) Add new state to back of list, "
			<< "(3) Pop state from front of list, (4) Pop state from end of list, "
			<< "and (5) Continue." << endl << "\n";  

		cout << ">>  "; 
		int choice;
		cin >> choice;
		string stateName;

		if (choice == 1) { //
			
			cout << endl << "ADD STATE TO FRONT\n" << "Enter new state name: "; 
			cin >> stateName;

			states.push_front(stateName); //push new state name to front of list

			} else if (choice == 2) { //
				cout << endl << "ADD STATE TO BACK\n" << "Enter new state name: ";
				cin >> stateName;

				states.push_back(stateName);

			} else if (choice == 3) { //
				cout << endl << "REMOVE STATE FROM FRONT\n" << "State removed" << endl;
				states.pop_front();

			} else if (choice == 4) { //
				cout << endl << "REMOVE STATE FROM BACK\n" << "State removed" << endl;
				states.pop_back();
				
			} else if (choice == 5) { // quit while loop and continue
				
				cout << endl << "ORIGINAL LIST: " << endl;
				DisplayList(states);
				
				states.reverse();
				cout << endl  << endl << "REVERSED LIST: " << endl;
				DisplayList(states); 

				states.sort();
				cout << endl << endl << "SORTED LIST: " << endl;
				DisplayList(states);

				states.reverse();
				cout << endl << endl << "REVERSE-SORTED LIST: " << endl;
				DisplayList(states);

				cout << endl << "Goodbye!";
				done = true;
			}
		
	}

    cin.ignore();
    cin.get();
    return 0;
} 

