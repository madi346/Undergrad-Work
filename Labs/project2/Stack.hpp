#ifndef _STACK_HPP
#define _STACK_HPP

#include "Node.hpp"
#include "LinkedList.hpp"

template <typename T>
class LinkedStack : public LinkedList<T>
{
public:
	LinkedStack() : LinkedList<T>()
	{
	}

	void Push(const T& newData)
	{
		LinkedList<T>::PushBack(newData);
	}

	T& Top()
	{
		return LinkedList<T>::GetBack();
	}

	void Pop()
	{
		LinkedList<T>::PopBack();
	}

	int Size()
	{
		return LinkedList<T>::Size();
	}

private:
	Node<T>* m_ptrFirst;
	Node<T>* m_ptrLast;
	int m_itemCount;
};

#endif
