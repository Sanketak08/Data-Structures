//Problem Statement ->
// Write	a	program	to	check	whether	given	two	strings	are	anagram	or
// not.
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool isAnagram(string s1, string s2)
{
    int n1 = s1.length();
    int n2 = s2.length();

    if (n1 != n2)
    {
        return false;
    }

    sort(s1.begin(), s1.end());
    sort(s2.begin(), s2.end());

    for (int i = 0; i < n1; i++)
    {
        if (s1[i] != s2[i])
        {
            return false;
        }
    }

    return true;
}

int main()
{
    string s1 = "";
    string s2 = "";

    cout << "\nEnter the 1st string: ";
    cin >> s1;
    cout << "\nEnter the 2nd string: ";
    cin >> s2;

    if (isAnagram(s1, s2))
    {
        cout << "\nGiven strings are Anagram";
    }
    else
    {
        cout << "\nGiven strings are not Anagram";
    }

    return 0;
}