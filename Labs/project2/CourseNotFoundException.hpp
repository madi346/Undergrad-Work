#ifndef _COURSE_NOT_FOUND_EXCEPT_HPP
#define _COURSE_NOT_FOUND_EXCEPT_HPP

#include <stdexcept>
using namespace std;

// Create CourseNotFound exception here
class CourseNotFound : public runtime_error {

public:
	CourseNotFound(const string& error)
		: runtime_error(error) {
		// nothing to do here
	}

};

#endif
