//Problem Statement -> Find	the	Kth	largest	and	Kth	smallest number	in	an	array.

#include <iostream>
#include <array>
#include <algorithm>
#include <iomanip>
using namespace std;

#define SIZE 10

void Result(int arr[], int n, int k)
{
    sort(arr, arr + n);
    cout << "\n"
         << k << "th minimum number -> " << arr[k - 1];
    cout << "\n"
         << k << "th maximum number -> " << arr[SIZE - (k + 1)];
}

int main()
{
    int n{0};
    int k{0};
    int arr[SIZE];

    cout << "\nEnter the elemnts of the array: " << endl;
    for (int i = 0; i < SIZE; i++)
    {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }

    cout << "\nEnter the value of k: ";
    cin >> k;

    Result(arr, n, k);

    return 0;
}