#include <iostream>
#include <array>
#include "Stack.h"
#define MAX 100
using namespace std;

void Stack::push(int x)
{
    if (top < MAX)
    {
        top++;
        arr[top] = x;
        cout << "\n"
             << x << " pushed successfully";
    }
    else
    {
        cout << "Stack Overflow!!";
    }
}

void Stack::pop()
{
    if (top > 0)
    {
        top--;
        cout << "\npopped successfully";
    }
    else
    {
        cout << "Stack Underflow!!";
    }
}

int Stack::peek()
{
    if (top < 0)
    {
        cout << "Stack is Empty";
    }
    else
    {
        int x = arr[top];
        cout << "\n"
             << x;
    }
}

bool Stack::isEmpty()
{
    if (top < 0)
    {
        cout << "true";
    }
    else
    {
        cout << "false";
    }
}