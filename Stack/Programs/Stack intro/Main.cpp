#include <iostream>
#include <array>
#include "Stack.cpp"
using namespace std;
#define MAX 100

int main()
{
    Stack s1;
    s1.isEmpty();
    cout << endl;
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);

    s1.peek();

    s1.pop();

    s1.peek();

    return 0;
}