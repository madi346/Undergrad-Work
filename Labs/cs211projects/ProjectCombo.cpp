#include <iostream>
#include <cmath>

//madisonhubbardcs211

using namespace std;

int Permutation(int, int);
int Combination(int, int);
int UoList(int, int);
double OList(int, int);
int Factorial(int);


int main() {
	int nVal, rVal, choice; 
		

	bool quit = false;
	while (!quit) {
		
		cout << endl << "Select one of the following : 1.) Permutation, 2.) Combination, 3.) Ordered List, 4.) Unordered List, or 5.) Quit" << endl;
		cout << " >> ";
		cin >> choice;

		if (choice == 5) {
			
			cout << "Goodbye!" << endl;
			quit = true;
		}

		if (choice != 5) {


			cout << "What is your n value ?" << endl;
			cout << " >> ";
			cin >> nVal;

			cout << "What is your r value ?" << endl;
			cout << " >> ";
			cin >> rVal;

			if (choice == 1) {
				cout << endl << "Permutation(" << nVal << ", " << rVal << ") = " << Permutation(nVal, rVal) << endl;
			}
			else if (choice == 2) {
				cout << endl << "Combination(" << nVal << ", " << rVal << ") = " << Combination(nVal, rVal) << endl;
			}
			else if (choice == 3) {
				cout << endl << "OrderedList(" << nVal << ", " << rVal << ") = " << OList(nVal, rVal) << endl;
			}
			else if (choice == 4) {
				cout << endl << "UnorderedList(" << nVal << ", " << rVal << ") = " << UoList(nVal, rVal) << endl;
			}
		}


	}

	cin.ignore();
	cin.get();
	return 0;
}

int Factorial(int n)
{
	if (n == 0) {
		return 1;
	}

	return n * Factorial(n - 1);
}

int Permutation(int n, int r) {
	int nr, nFact, nrFact; 
	nr = n - r;
	nFact = Factorial(n);
	nrFact = Factorial(nr);
	return nFact / nrFact;


}

int Combination(int n, int r) {
	int nr, nFact, rFact, nrFact;
	nr = n - r;
	nFact = Factorial(n);
	rFact = Factorial(r);
	nrFact = Factorial(nr);
	return nFact / (rFact * nrFact);

}

int UoList(int n, int r) {
	int UO;
	UO = r + n - 1;
	return Combination(UO, r);
}

double OList(int n, int r) {
	double result = pow(n, r);
	return result; 
}
