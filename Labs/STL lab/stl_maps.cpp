// Lab - Standard Template Library - Part 5 - Maps
// madison hubbard

#include <iostream>
#include <string>
#include <map>
using namespace std;

int main()
{
	map<char, string> colors;

	colors['r'] = "FF0000";
	colors['g'] = "00FF00";
	colors['b'] = "0000FF";
	colors['c'] = "00FFFF";
	colors['m'] = "FF00FF";
	colors['y'] = "FFFF00";

	bool done = false;

	while (!done) {

		char color;

		cout << endl << "Enter color letter or 'q' to stop: "; 

		cin >> color;

		if (color == 'q') {

			cout << "Goodbye!"; 
			done = true;

		} else if (color != 'q') {

			cout << "Hex: " << colors[color] << endl;

		}

	}
    cin.ignore();
    cin.get();
    return 0;
}
