#ifndef _LIST_HPP
#define _LIST_HPP

#include <iostream>
using namespace std;

const int ARRAY_SIZE = 100;

template <typename T>
class List
{
private:
    // private member variables
    int m_itemCount;
    T m_arr[ARRAY_SIZE];            // Add this!

    // functions for interal-workings
    bool ShiftRight( int atIndex )
    {

        return false; // placeholder
    }

    bool ShiftLeft( int atIndex )
    {
		if (atIndex < 0 || atIndex > m_itemCount) {
			return false; //invalid indicies
		}
		
		for (int i = atIndex + 1; i < m_itemCount; i++) {
			m_arr[i - 1] = m_arr[i];
		}
		m_itemCount--;
		return true;
    }

public:
    List()
    {
        m_itemCount = 0;
    }

    ~List()
    {
    }

    // Core functionality
    int     Size() const
    {
        return m_itemCount;
		//return this->m_itemCount; not required maybe handy for operator overloading 
    }

    bool    IsEmpty() const
    {
		return (m_itemCount == 0); 
    }

    bool    IsFull() const
    {
        return ( m_itemCount == ARRAY_SIZE );
    }

    bool    PushFront( const T& newItem )
    {
		//T oldFirstItem; 
      //  return false; // placeholder
		if (IsFull())
		{
			return false; 
		}
		
		//IF NOT FULL THEN
		
		for (int i = 0; i < m_itemCount; i++) {
			
			m_arr[i + 1] = m_arr[i]; 
		}
		m_arr[0] = newItem;
		m_itemCount++;
		
		return true;
	}

    bool PushBack( const T& newItem )
    {
	

        if ( IsFull() )
        {
            return false;   // Insert failed
        }

        m_arr[ m_itemCount ] = newItem;
        m_itemCount++;
        return true;
    }

    bool Insert( int atIndex, const T& item )
    {
		if (IsFull() || (IsEmpty() && (atIndex != 0))) {
			return false; 
	   }
		//for (int i = m_itemCount; i > ; i++) {
			//m_arr[atIndex + 1] = m_arr[atIndex]; 
		//}
		//maybe shiftright???
		
		for (int i = atIndex; i < m_itemCount; i++) {

			m_arr[i + 1] = m_arr[i];
		}
		m_arr[atIndex] = item;
		m_itemCount++;
		return true; 
    }

    bool    PopFront()
    {
		if (IsEmpty()) {
			return false;
		}
		//RemoveIndex(0);
		m_itemCount--; 
		return true; 
		
       
    }

    bool    PopBack()
		
    {// lazy deletion
		if (IsEmpty()) {
			return false; 
		}

		m_itemCount--; 
		return true;
        
    }

    bool Remove( const T& item )
    {
		if (IsEmpty()) {
			return false;
		}
       
		int removeIndex[ARRAY_SIZE]; 
		int j = 0;

		for (int i = 0; i < Size(); i++) {
			if (m_arr[i] == item) {
				removeIndex[j] = i;
				j++;
				//RemoveIndex(i); 
			}
		}

	for (int i = 0; i < j; i++) {
			RemoveIndex(removeIndex[i]); 
	}
    }

    bool    RemoveIndex( int atIndex )
    {
		//if (IsEmpty()) {
			//return false;
		//}
		return ShiftLeft(atIndex);
		
       // return false; // placeholder

    }

    void    Clear()
    {
		m_itemCount = 0; 
    }

    // Accessors
    T*      Get( int atIndex )
    {
		if (atIndex < 0 || atIndex >= m_itemCount) {
			return nullptr; //invalid indices 
		}
		return &m_arr[atIndex]; 
       
    }

    T*      GetFront()
    {
		if (IsEmpty()) {
			return nullptr; 
		}
       
		return &m_arr[0];
	}

    T*      GetBack()
    {
		if (IsEmpty()) {
			return nullptr;
		}
        
		return &m_arr[m_itemCount-1]; 
    }

    // Additional functionality
    int     GetCountOf( const T& item ) const
    {
		int counter = 0; 
		if (IsEmpty()) {
			return 0;
		}
		for (int i = 0; i < m_itemCount; i++) {
			if (m_arr[i] == item) {
				counter++;
			}
		}
		return counter; 

        
    }

    bool    Contains( const T& item ) const
    {
		return (GetCountOf(item) > 0);
    }

    friend class Tester;
};


#endif
