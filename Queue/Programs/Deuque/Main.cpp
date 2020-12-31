#include <iostream>
#include <iomanip>
#include "Deque.cpp"
using namespace std;

#define SIZE 100

int main()
{
    Deque d1;

    d1.getFront();
    d1.getRear();

    d1.insertFront(1);
    d1.insertFront(2);
    d1.insertFront(3);
    d1.getFront();

    d1.insertRear(4);
    d1.insertRear(5);
    d1.insertRear(6);
    d1.getRear();

    d1.deleteFront();
    d1.getFront();

    d1.deleteRear();
    d1.getRear();

    return 0;
}