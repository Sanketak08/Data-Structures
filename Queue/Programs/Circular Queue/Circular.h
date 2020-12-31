#ifndef CIRCULAR_H_
#define CIRCULAR_H_
#include <iostream>
#include <iomanip>
#include <array>
using namespace std;

#define SIZE 50

class CircularQueue
{
private:
    int front{}, rear{};
    int arr[SIZE];

public:
    CircularQueue();
    bool isFull();
    bool isEmpty();
    void EnQueue(int x);
    void DeQueue();
    void Display();
};

#endif /*CIRCULAR_H_*/