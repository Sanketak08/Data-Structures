#include <iostream>
#include <iomanip>
#include "Deque.h"
using namespace std;

#define SIZE 100

Deque::Deque()
{
    front = -1;
    rear = -1;
}

bool Deque::isFull()
{
    if ((front == 0 && rear == SIZE - 1) || (front == rear + 1))
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool Deque::isEmpty()
{
    if (front == -1)
    {
        return true;
    }
    return false;
}

void Deque::insertFront(int x)
{
    if (isFull())
    {
        cout << "\nDeque Overflow!!";
    }
    else
    {
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if (front == 0)
        {
            front = SIZE - 1;
        }
        else
        {
            front--;
        }

        arr[front] = x;
        cout << "\n"
             << x << " inserted successfully!";
    }
}

void Deque::insertRear(int x)
{
    if (isFull())
    {
        cout << "\nDeque Overflow!!";
    }
    else
    {
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if (rear == SIZE - 1)
        {
            rear = 0;
        }
        else
        {
            rear++;
        }

        arr[rear] = x;
        cout << "\n"
             << x << " inserted successfully!";
    }
}

void Deque::deleteFront()
{
    if (isEmpty())
    {
        cout << "\nDeque Underflow!!";
    }
    else
    {
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (front == SIZE - 1)
        {
            front = 0;
        }
        else
        {
            front++;
        }

        cout << "\nElement deleted successfully!";
    }
}

void Deque::deleteRear()
{
    if (isEmpty())
    {
        cout << "\nDeque Underflow!!";
    }
    else
    {
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
        {
            rear = SIZE - 1;
        }
        else
        {
            rear--;
        }

        cout << "\nElement deleted successfully!";
    }
}

void Deque::getFront()
{
    if (isEmpty())
    {
        cout << "\nDeque is Empty!";
    }
    else
    {
        cout << "\nFront-> "
             << arr[front];
    }
}

void Deque::getRear()
{
    if (isEmpty())
    {
        cout << "\nDeque is Empty!";
    }
    else
    {
        cout << "\nRear-> "
             << arr[rear];
    }
}