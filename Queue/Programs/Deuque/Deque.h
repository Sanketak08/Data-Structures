#ifndef DEQUE_H_
#define DEQUE_H_
#include <iostream>
#include <iomanip>
using namespace std;
#define SIZE 100

class Deque
{
private:
    int rear, front;
    int arr[SIZE];

public:
    Deque();
    void insertFront(int x);
    void insertRear(int x);
    void deleteFront();
    void deleteRear();
    void getFront();
    void getRear();
    bool isFull();
    bool isEmpty();
};

#endif /*DEQUE_H_*/