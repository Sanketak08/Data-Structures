#include <iostream>
#include <iomanip>
#include <array>
#include "Circular.h"
using namespace std;

#define SIZE 50

CircularQueue::CircularQueue()
{
    front = -1;
    rear = -1;
}

bool CircularQueue::isFull()
{
    if (front == 0 && rear == SIZE - 1)
    {
        return true;
    }
    if (front == rear + 1)
    {
        return true;
    }
    return false;
}

bool CircularQueue::isEmpty()
{
    if (front == -1)
    {
        return true;
    }
    return false;
}

void CircularQueue::EnQueue(int x)
{
    if (isFull())
    {
        cout << "\nCircular Queue Overflow!!";
    }
    else
    {
        if (front == -1)
        {
            front = 0;
        }
        rear = (rear + 1) % SIZE;
        arr[rear] = x;

        cout << "\n"
             << x << " inserted Successfully!";
    }
}

void CircularQueue::DeQueue()
{
    if (isEmpty())
    {
        cout << "\nCircular Queue Underflow!!";
    }
    else
    {
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }

        front = (front + 1) % SIZE;

        cout << "\nDeleted Successfully!";
    }
}

void CircularQueue::Display()
{
    if (isEmpty())
    {
        cout << "\nCircular Queue is Empty!!";
    }
    else
    {
        cout << "\n";
        for (int i = front; i != rear + 1; i = (i + 1) % SIZE)
        {
            cout << arr[i] << " ";
        }
    }
}