// Lab - Standard Template Library - Part 3 - Queues
// Madison Hubbard

#include <iostream>
#include <string>
#include <queue>
using namespace std;

int main()
{
	queue<float> line;

	bool done = false;
	while (!done) {
		cout <<endl <<  "-----------------------------";
		cout << endl << "Transactions queued : " << line.size() << endl; 
 		cout << "1. Enqueue transaction 2. Continue" << endl; 

		cout << ">>  "; 
		int choice;
		cin >> choice;
		
		float amount;
		if (choice == 1) { 
			
			cout << endl << "Enter amount ( positive or negative ) for next transaction: "; 
			cin >> amount; 

			line.push(amount); 

		}
		else if (choice == 2) { 
			//float balance = 0;
			done = true; 
		}

	}
	float balance = 0;
	
	while (!line.empty()) { // line queue is not empty 
		float item = line.front(); // gets the first item at front of queue
		cout << endl << item  << " pushed to account" << endl; // prints out first item of queue
		float newBalance = item; 
		balance+= newBalance; 
		line.pop(); // removes the first item of the queue 
	}
	cout << endl << "Final Balance = $" << balance
		<< "\n Goodbye"; 
	

    cin.ignore();
    cin.get();
    return 0;
}
