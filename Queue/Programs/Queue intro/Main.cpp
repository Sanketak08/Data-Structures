#include <iostream>
#include <iomanip>
#include "Queue.cpp"
using namespace std;

#define SIZE 100

int main()
{
    Queue q1;

    q1.Display();

    q1.enQueue(1);
    q1.enQueue(2);
    q1.enQueue(3);
    q1.enQueue(4);
    q1.enQueue(5);

    q1.Display();

    q1.deQueue();

    q1.Display();

    return 0;
}