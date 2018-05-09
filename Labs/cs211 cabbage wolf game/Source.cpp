#include <iostream>
using namespace std;

void DisplayStateIsland(char island[2][4]) {
	cout << "ISLAND 1 : ";

	for (int i = 0; i < 4; i++) {
		cout << island[0][i] << ", ";
	}

	cout << endl << "ISLAND 2 : ";

	for (int i = 0; i < 4; i++) {
		cout << island[1][i] << ", ";
	}
}
int DisplayChoices() {
	int choiceNum;

	cout << endl << "1. Go to other island" << endl;
	cout << "2. Move Cabbage" << endl;
	cout << "3. Move Goat" << endl;
	cout << "4. Move Wolf" << endl;

	cout << " >> ";
	cin >> choiceNum;
	return choiceNum;
}

int location(char island[2][4], char personFinding) {

	for (int islandNumber = 0; islandNumber < 2; islandNumber++) {

		for (int personSpot = 0; personSpot < 4; personSpot++) {

			if (island[islandNumber][personSpot] == personFinding) {
				return islandNumber;
			}
		}
	}
	return -1;
}

void Move(char island[2][4], char personMoving) {

	if (location(island, personMoving) == location(island, 't')) {

		// moving from island 1 to island 2 
		if (location(island, personMoving) == 0) {

			for (int i = 0; i < 4; i++) {

				if (island[0][i] == 't') {

					for (int k = 0; k < 4; k++) {

						if (island[1][k] == ' ') {

							island[1][k] = 't';
							island[0][i] = ' ';
							break;
						}
					}
				}

				if (island[0][i] == personMoving) {

					for (int j = 0; j < 4; j++) {

						if (island[1][j] == ' ') {

							island[1][j] = personMoving;
							island[0][i] = ' ';
							break;
						}
					}
				}
			} // end for loop 


		}
		else {  //moving from island 2 to island 1 
			for (int i = 0; i < 4; i++) {

				if (island[1][i] == 't') {

					for (int k = 0; k < 4; k++) {

						if (island[0][k] == ' ') {

							island[0][k] = 't';
							island[1][i] = ' ';
							break;
						}
					}
				}

				if (island[1][i] == personMoving) {

					for (int j = 0; j < 4; j++) {

						if (island[0][j] == ' ') {

							island[0][j] = personMoving;
							island[1][i] = ' ';
							break;
						}
					}
				}
			} // end for loop 


		}
	}
}

bool GameOver(char island[2][4]) {

	//if goat/cabbage are alone without the traveler
	if ((location(island, 'g') == location(island, 'c')) && (location(island, 'g') != location(island, 't'))) {

		cout << endl << "The goat and the cabbage were left alone - the goat ate the cabbage. GAME OVER.";
		return true;

	}

	//if wolf/goat are alone together without the traveler
	if ((location(island, 'g') == location(island, 'w')) && (location(island, 'g') != location(island, 't'))) {

		cout << endl << "The wolf and goat were left alone - the wolf ate the goat. GAME OVER.";
		return true;
	}

	return false;
}

bool GameWon(char island[2][4]) {

	// everybody is on the second island, so the game is won !
	if ((location(island, 't') == 1) && (location(island, 'c') == 1) &&
		(location(island, 'g') == 1) && (location(island, 'w') == 1)) {

		cout << "You won the game";
		return true;
	}
	else {
		return false;
	}
}
int main() {
	char island[2][4];

	//first island is 0 row 
	island[0][0] = 't';
	island[0][1] = 'c';
	island[0][2] = 'g';
	island[0][3] = 'w';

	//second island is 1 row, empty for now
	island[1][0] = ' ';
	island[1][1] = ' ';
	island[1][2] = ' ';
	island[1][3] = ' ';

	bool done = false;
	while (!done) {
		cout << endl << "----------------------------------------------------------" << endl;
		DisplayStateIsland(island);

		cout << endl << endl << "Traveller is on island " << location(island, 't') << endl;

		int choice = DisplayChoices();
		switch (choice)
		{
		case 1:
			Move(island, 't');
			break;

		case 2:
			Move(island, 'c');
			break;

		case 3:
			Move(island, 'g');
			break;

		case 4:
			Move(island, 'w');
			break;

		default:
			cout << "Invalid option, please choose a valid one" << endl;
			break;
		}

		if ((GameOver(island) == true) || (GameWon(island) == true)) {

			done = true;
		}

	}

	cin.ignore();
	cin.get();
	return 0;
}