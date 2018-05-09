// Lab - Standard Template Library - Part 1 - Vectors
//Madison Hubbard

#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main()
{
	vector<string> courses; //string array of courses

	bool done = false;
	while (!done) {
		cout << endl << "-----------------------------";
		cout << endl << "Course list size = " << courses.size();
		cout << endl << "1. Add a new course, 2. Remove the last course, "
			<< "3. Display the course list, and 4. Quit." << endl << endl; 
		
		int choice;
		cout << ">>  "; 
		cin >> choice;
		cout << endl;

		if (choice == 1) { //add course
			string courseName;
			cout << "Enter new course name: ";
			cin >> courseName;

			cin.ignore();
			getline(cin, courseName);

			courses.push_back(courseName); //add to the list of courses

		} else if (choice == 2) { //remove course
			courses.pop_back(); // remove last line in list of courses
			cout << "Last course added was removed" << endl; 

		} else if (choice == 3) { //display list
			for (unsigned int i = 0; i < courses.size(); i++) { // unsigned int gets rid of the unsigned/signed mismatch error
				cout << "Course " << i << " = " << courses[i] << endl; // vectors used like an array
			}
			

		} else if (choice == 4) { // quit while loop
			cout << "Goodbye" << endl;
			done = true;
		}
	}

    cin.ignore();
    cin.get();
    return 0;
}
