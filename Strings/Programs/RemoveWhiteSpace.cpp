//Problem Statement ->
//Write a program to remove all whitespaces in a given string.

#include <iostream>
#include <string>
using namespace std;

void removeSpace(string s1)
{
    for (int i = 0; i < s1.length(); i++)
    {
        if (s1[i] != ' ')
        {
            cout
                << s1[i];
        }
    }
}

int main()
{
    string s1 = "";

    cout << "\nEnter the string: ";
    getline(cin, s1);

    removeSpace(s1);

    return 0;
}