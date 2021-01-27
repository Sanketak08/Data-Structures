//Problem Statement ->
//Write	a	program	to	reverse	the	string	in	place.

#include <iostream>
#include <string>
using namespace std;

void reverse(string s1)
{
    for (int i = 0; i < s1.length(); i++)
    {
        cout << s1[s1.length() - i - 1];
    }
}

int main()
{
    string s1 = "";

    cout << "\nEnter the string: ";
    cin >> s1;

    reverse(s1);

    return 0;
}