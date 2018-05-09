
// Lab - Standard Template Library - Part 4 - Stacks
// Madison Hubbard

#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main()
{
	stack<string> words;

	
	cout << "Enter the next letter of the word , or UNDO to undo , or DONE to stop." << endl;


	bool done = false;

	while (!done) {
		cout << ">>  "; 
		string choice;
		cin >> choice;


		if (choice == "UNDO") {
			cout << endl << "removed " << words.top() << endl;
			words.pop();

		} else if (choice == "DONE") {
			
			cout << endl;
			cout << endl << "FINISHED WORD: "; 
			done = true;
			

		} else if ((choice != "UNDO") || (choice != "DONE")) {
			
				words.push(choice); 

		}
	}

	while (!words.empty()) {
		cout << words.top();
		words.pop();
		
	}
	
	cin.ignore();
	cin.get();
	return 0;
}


