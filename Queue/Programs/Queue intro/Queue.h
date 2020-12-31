#ifndef QUEUE_H_
#define QUEUE_H_
#include <iostream>
#include <iomanip>
using namespace std;
#define SIZE 100

class Queue
{
private:
    int rear, front, arr[SIZE];

public:
    Queue();
    bool isFull();
    bool isEmpty();
    void enQueue(int ele);
    void deQueue();
    void Display();
};

#endif /*QUEUE_H_*/