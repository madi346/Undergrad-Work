#ifndef DICTIONARY_HPP
#define DICTIONARY_HPP

#include <string>
#include <iomanip>
#include <iostream>
#include <stdexcept>
using namespace std;

#include "Node.hpp"

//! The maximum size of the array.
const int TABLE_SIZE = 131;

//! An enumeration to stand for which collision method to use
enum CollisionMethod { LINEAR, QUADRATIC, DOUBLE };

//! key-value array using a hash table
template <typename TK, typename TD>
class HashTable
{
public:
	HashTable();
	void SetCollisionMethod(CollisionMethod cm);
	CollisionMethod GetCollisionMethod();

	bool IsEmpty();
	int Size();
	void Clear();

	void Insert(const TK& key, const TD& data);
	void Remove(const TK& key);
	TD& GetItem(const TK& key);
	bool Contains(const TK& key);

	void Print(const string& filename);

private:
	int GetIndex(int key, bool unused);
	int GetUnusedIndex(int key);
	int GetItemIndex(int key);
	int HashFunction(int key);

	int LinearProbe(int key);
	int QuadraticProbe(int key, int& addValue);
	int HashFunction2(int key);

	//! The internal array
	Node<TK, TD> m_data[TABLE_SIZE];

	//! Which collision method is being used
	CollisionMethod m_collisionMethod;

	//! The amount of items being stored in the array
	int m_size;

	friend class Tester;
};

//! Returns true if the table is empty, or false if it is not.
template <typename TK, typename TD>
bool HashTable<TK, TD>::IsEmpty()
{
	if (m_size == 0) {
		return true;
	}
	else {
		return false;
	}
}

//! Returns the amount of items stored in the table
template <typename TK, typename TD>
int HashTable<TK, TD>::Size()
{
	return m_size;
}

//! Clears out the table
template <typename TK, typename TD>
void HashTable<TK, TD>::Clear()
{
	for (int i = 0; i < TABLE_SIZE; i++) {
		m_data[i].hasData = false;
	}

	m_size = 0;
}

template <typename TK, typename TD>
int HashTable<TK, TD>::GetIndex(int key, bool unused)
{
	if (unused)
	{
		return GetUnusedIndex(key);
	}
	else
	{
		return GetItemIndex(key);
	}
}


//! Get an available index to use for a new item
template <typename TK, typename TD>
int HashTable<TK, TD>::GetUnusedIndex(int key)
{

	int originalIndex = HashFunction(key); //generates an index 
	int secondHash;
	int index = originalIndex;
	int collisions = 0;

	while (m_data[index].hasData == true) {

		switch (m_collisionMethod)
		{
		case LINEAR:
			index = LinearProbe(index) % TABLE_SIZE;
			collisions++;
			break;

		case QUADRATIC:
			index = QuadraticProbe(originalIndex, collisions) % TABLE_SIZE;
			collisions++;
			break;

		case DOUBLE:
			secondHash = HashFunction2(key);
			index = ((index + (secondHash * collisions)) % TABLE_SIZE);
			collisions++;
			break;
		}
	}

	return index;
}

//! Get the index of an existing item, given some key.
template <typename TK, typename TD>
int HashTable<TK, TD>::GetItemIndex(int key)
{
	int originalIndex = HashFunction(key); //generates an index 
	int secondHash;
	int index = originalIndex;
	int collisions = 0;

	while (m_data[index].key != key && m_data[index].hasData == true) {

		switch (m_collisionMethod)
		{
		case LINEAR:
			index = LinearProbe(index) % TABLE_SIZE;
			collisions++;
			break;

		case QUADRATIC:
			index = QuadraticProbe(originalIndex, collisions) % TABLE_SIZE;
			collisions++;
			break;

		case DOUBLE:
			secondHash = HashFunction2(key);
			index = ((index + (secondHash * collisions)) % TABLE_SIZE);
			collisions++;
			break;
		}
	}

	if (m_data[index].hasData == false) {
		return -1;
	}
	else {
		return index;
	}
}

//! Generates an index for the new item using the key and stores it in the array.
template <typename TK, typename TD>
void HashTable<TK, TD>::Insert(const TK& key, const TD& data)
{
	if (m_size != TABLE_SIZE) { //table is not full

		int indexValue = GetUnusedIndex(key);

		m_data[indexValue].key = key;
		m_data[indexValue].data = data;
		m_data[indexValue].hasData = true;

		m_size++;
	}
}

//! Soft-removes the item at the given key
template <typename TK, typename TD>
void HashTable<TK, TD>::Remove(const TK& key)
{
	int indexRemove = GetItemIndex(key);

	if (indexRemove >= 0) {  //index is found

		m_data[indexRemove].hasData = false;
		m_size--;
	}
}

//! Returns the data for the item, given some key.
template <typename TK, typename TD>
TD& HashTable<TK, TD>::GetItem(const TK& key)
{
	int indexVal;

	try {
		indexVal = GetItemIndex(key);

		if (indexVal == -1)
		{
			throw runtime_error("error item can't be found");
		}
		return m_data[indexVal].data;
	}
	catch (exception ex) {
		throw runtime_error("error item cant be found");
	}
}

//! Tries to find an item given some key, and returns true if found, false if not.
template <typename TK, typename TD>
bool HashTable<TK, TD>::Contains(const TK& key)
{
	for (int i = 0; i < TABLE_SIZE; i++) {

		if ((m_data[i].key == key) && (m_data[i].hasData == true)) {
			return true;
		}
	}
	return false;
}

//! Primary hash function
template <typename TK, typename TD>
int HashTable<TK, TD>::HashFunction(int key)
{
	return key % TABLE_SIZE;
}

//! Steps the index forward by one
template <typename TK, typename TD>
int HashTable<TK, TD>::LinearProbe(int index)
{
	return index + 1;
}

//! Steps the index forward quadratically
template <typename TK, typename TD>
int HashTable<TK, TD>::QuadraticProbe(int index, int& addValue)
{
	return (index + (addValue*addValue));
}

//! Secondary hash function
template <typename TK, typename TD>
int HashTable<TK, TD>::HashFunction2(int key)
{
	return (7 - (key % 7));
}

/* ******************************************************************** Functions I've already completed */

//! Initialize the hash table
template <typename TK, typename TD>
HashTable<TK, TD>::HashTable()
{
	m_collisionMethod = LINEAR; // default
	m_size = 0;
}

//! Set the collision method
template <typename TK, typename TD>
void HashTable<TK, TD>::SetCollisionMethod(CollisionMethod cm)
{
	m_collisionMethod = cm;
}

//! Returns the collision method
template <typename TK, typename TD>
CollisionMethod HashTable<TK, TD>::GetCollisionMethod()
{
	return m_collisionMethod;
}

//! Writes out all the set data from the table to a file
template <typename TK, typename TD>
void HashTable<TK, TD>::Print(const string& filename)
{
	ofstream output(filename);
	output << left
		<< setw(10) << "INDEX"
		<< setw(10) << "KEY"
		<< setw(10) << "DATA"
		<< endl;

	for (int i = 0; i < TABLE_SIZE; i++)
	{
		if (m_data[i].hasData)
		{
			output << left
				<< setw(10) << i
				<< setw(10) << m_data[i].key
				<< setw(10) << m_data[i].data
				<< endl;
		}
		else
		{
			output << left
				<< setw(10) << i
				<< setw(10) << "--------------------------------------------"
				<< endl;
		}
	}
	output.close();
}

#endif
