#include <iostream>
#include <iomanip>
#include "Queue.h"
using namespace std;

#define SIZE 100

Queue::Queue()
{
    front = -1;
    rear = -1;
}

bool Queue::isFull()
{
    if (front == 0 && rear == SIZE - 1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool Queue::isEmpty()
{
    if (front == -1 & rear == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void Queue::enQueue(int ele)
{
    if (isFull())
    {
        cout << "\nQueue Overflow!!";
    }
    else
    {
        if (front == -1)
        {
            front = 0;
        }
        rear++;
        arr[rear] = ele;
        cout << "\n"
             << ele << " enqueued successfully!";
    }
}

void Queue::deQueue()
{
    if (isEmpty())
    {
        cout << "\nQueue underflow!!";
    }
    else
    {
        int temp{};
        temp = arr[front];
        if (front >= rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front++;
        }
        cout << "\n"
             << temp << " dequeued successfully!";
    }
}

void Queue::Display()
{
    if (isEmpty())
    {
        cout << "Queue is Empty!!";
    }
    else
    {
        cout << "\nFront index -> " << front;
        cout << "\nRear index -> " << rear;
        for (int i = front; i <= rear; i++)
        {
            cout << endl;
            cout << arr[i] << " ";
        }
    }
}