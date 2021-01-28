//Problem Statement ->
//Write	a	program	to	reverse	each word individually in	the	given string.

#include <iostream>
#include <string>
#include <vector>
using namespace std;

void reverseWord(string s1)
{
    vector<char> store;

    for (int i = 0; i < s1.length(); i++)
    {
        if (s1[i] != ' ')
        {
            store.push_back(s1[i]);
        }
        else
        {
            for (int j = 0; j < store.size(); j++)
            {
                cout << store[store.size() - j - 1];
            }
            cout << " ";
            store.clear();
        }
    }

    //To reverse the last word in the vector
    for (int k = 0; k < store.size(); k++)
    {
        cout << store[store.size() - k - 1];
    }
}

int main()
{
    string s1 = "";

    cout << "\nEnter the string: ";
    getline(cin, s1);

    reverseWord(s1);

    return 0;
}