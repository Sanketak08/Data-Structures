//Problem Statement -> Find	the	range of the array. Range means the	difference between the
//                     maximum and minimum element in the array.

#include <iostream>
#include <iomanip>
#include <array>
using namespace std;

#define SIZE 10

void Range(int arr[])
{
    int min = arr[0], max = arr[0];
    int ran{0};

    for (int i = 0; i < SIZE; i++)
    {
        //For minimum number
        if (arr[i] < min)
        {
            min = arr[i];
        }

        //For maximum number
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }

    ran = max - min;
    cout << "\nRange is: " << ran;
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

    Range(arr);

    return 0;
}