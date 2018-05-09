#include "CourseCatalog.hpp"

#include <iostream>
#include <iomanip>
#include <fstream>
using namespace std;

#include "UTILITIES/Menu.hpp"
#include "EXCEPTIONS/CourseNotFoundException.hpp"
#include "DATA_STRUCTURES/Stack.hpp" // LinkedStack

CourseCatalog::CourseCatalog()
{
	LoadCourses();
}

void CourseCatalog::LoadCourses() // done
{
	Menu::Header("LOADING COURSES");

	ifstream input("courses.txt");

	if (!input.is_open())
	{
		cout << "Error opening input text file, courses.txt" << endl;
		return;
	}

	string label, courseCode, courseName, prerequisite;
	Course newCourse;

	while (input >> label)
	{
		if (label == "COURSE")
		{
			if (newCourse.name != "")
			{
				m_courses.PushBack(newCourse);
				newCourse.Clear();
			}

			input >> newCourse.code >> newCourse.name;
		}
		else if (label == "PREREQ")
		{
			input >> newCourse.prereq;
		}
	}

	input.close();

	cout << " * " << m_courses.Size() << " courses loaded" << endl << endl;
}

void CourseCatalog::ViewCourses() noexcept
{
	Menu::Header("VIEW COURSES");

	cout << left << setw(4) << "#" << setw(10) << "CODE"
		<< setw(10) << "PREREQ" << setw(10) << "NAME" << endl;

	for (int i = 0; i < m_courses.Size(); i++) {

		cout << left << setw(4) << i << setw(10) << m_courses[i].code
			<< setw(10) << m_courses[i].prereq << setw(10) << m_courses[i].name << endl;

	}
}

Course CourseCatalog::FindCourse(const string& code)
{
	for (int i = 0; i < m_courses.Size(); i++) {

		if (m_courses[i].code == code) {
			return m_courses[i];
		}
	}

	throw CourseNotFound("\nError! Cannot find course: " + code);
}

void CourseCatalog::ViewPrereqs() noexcept
{
	Menu::Header("GET PREREQS");

	string code;
	cout << "Enter class code\n\n>> ";
	cin >> code;

	Course current;

	try {
		current = FindCourse(code);
	}
	catch (CourseNotFound ex) {
		cout << ex.what() << endl;
		return;
	}

	LinkedStack<Course> prereqs;
	prereqs.Push(current);

	while (current.prereq != "") {

		try {
			current = FindCourse(current.prereq);
			prereqs.Push(current);
		}
		catch (CourseNotFound ex) {
			cout << ex.what() << endl;
			break;
		}
	}

	int i = 1;
	cout << endl << "Classes to take:\n";
	while (prereqs.Size() > 0) {

		cout << i << "\t" << prereqs.Top().code << "\t" << prereqs.Top().name << endl;

		prereqs.Pop();
		i++;
	}
	cout << endl;
}

void CourseCatalog::Run()
{
	bool done = false;
	while (!done)
	{
		Menu::Header("MAIN MENU");

		int choice = Menu::ShowIntMenuWithPrompt({ "View all courses", "Get course prerequisites", "Exit" });

		switch (choice)
		{
		case 1:
			ViewCourses();
			break;

		case 2:
			ViewPrereqs();
			break;

		case 3:
			done = true;
			break;
		}
	}
}
