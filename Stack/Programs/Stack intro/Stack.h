#ifndef STACK_H_
#define STACK_H_
#include <iostream>
#include <array>
#define MAX 100

class Stack
{
private:
    int top{};
    int x = 0;

public:
    int arr[MAX];
    Stack() { top = -1; }
    void push(int x);
    void pop();
    int peek();
    bool isEmpty();
};

#endif /*STACK_H_ */