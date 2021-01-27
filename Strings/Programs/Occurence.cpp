//Problem Statement ->
// Write a program to count the number of occurrences of each character
// in the string and print it.

#include <iostream>
#include <string>
using namespace std;

int charOccur(string s1, char ch)
{
    int count{0};
    for (int i = 0; i < s1.length(); i++)
    {
        if (s1[i] == ch)
        {
            count++;
        }
    }

    return count;
}

int main()
{
    string s1 = "";
    char ch;

    cout << "\nEnter the string: ";
    cin >> s1;

    cout << "\nEnter the character to find its occurence: ";
    cin >> ch;

    int result = charOccur(s1, ch);

    cout << "\nThe given character has occured " << result << " times";

    return 0;
}