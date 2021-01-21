//Problem Statement -> Given an array which consists of only 0,	1 and	2.
//                     Sort the array without using any sorting algorithm.

#include <iostream>
#include <iomanip>
#include <array>
#include <vector>
using namespace std;

#define SIZE 9

void Result(int arr[])
{
    vector<int> res;
    for (int i = 0; i < SIZE; i++)
    {
        if (arr[i] == 0)
        {
            res.push_back(arr[i]);
        }
    }
    for (int j = 0; j < SIZE; j++)
    {
        if (arr[j] == 1)
        {
            res.push_back(arr[j]);
        }
    }
    for (int k = 0; k < SIZE; k++)
    {
        if (arr[k] == 2)
        {
            res.push_back(arr[k]);
        }
    }
    for (int l = 0; l < SIZE; l++)
    {
        cout << res[l] << " ";
    }
}

int main()
{
    int arr[SIZE];

    cout << "\nEnter the elements of the array: " << endl;
    for (int i = 0; i < SIZE; i++)
    {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }

    Result(arr);

    return 0;
}