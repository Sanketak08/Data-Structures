#include <iostream>
#include <iomanip>
#include <array>
#include "Circular.cpp"
using namespace std;

#define SIZE 50

int main()
{
    CircularQueue c1;

    c1.Display();

    c1.EnQueue(1);
    c1.EnQueue(2);
    c1.EnQueue(3);
    c1.EnQueue(4);
    c1.EnQueue(5);
    c1.Display();

    c1.DeQueue();
    c1.Display();

    return 0;
}