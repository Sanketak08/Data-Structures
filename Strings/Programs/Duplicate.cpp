//Problem Statement ->
///Find Duplicate characters in a string.

#include <iostream>
#include <string>
#include <vector>
using namespace std;

void duplicate(string s1)
{
    vector<char> v1;

    for (int i = 0; i < s1.length(); i++)
    {
        for (int j = i + 1; j < s1.length(); j++)
        {
            if (s1[i] == s1[j])
            {
                v1.push_back(s1[i]);
            }
        }
    }

    for (int k = 0; k < v1.size(); k++)
    {
        cout << "\n"
             << v1[k];
    }
}

int main()
{
    string s1 = "";

    cout << "\nEnter the string: ";
    cin >> s1;

    duplicate(s1);

    return 0;
}
