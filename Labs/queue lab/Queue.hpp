#ifndef QUEUE_HPP
#define QUEUE_HPP

#include "LinkedList.hpp"

template <typename T>
class Queue
{
public:
	void Push(T data)
	{
		m_list.PushBack(data);
	}

	void Pop()
	{
		m_list.PopFront();
	}

	T& Front()
	{
		return m_list.GetFirst(); 
	}

	int Size()
	{
		return m_list.Size();
	}

private:
	LinkedList<T> m_list; // has-a relationship 
};

#endif
