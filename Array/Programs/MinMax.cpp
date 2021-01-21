#include <iostream>
#include <iomanip>
#include <array>
using namespace std;

void minmax(int arr[], int n)
{
    int min = arr[0], max = arr[0];

    for (int i = 0; i < n; i++)
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

    cout << "\nMinimum Number -> " << min;
    cout << "\nMaximum Number -> " << max;
}

int main()
{
    int n{0};
    int arr[n];

    cout << "\nEnter the size of the array: ";
    cin >> n;

    cout << "\nEnter the elemnts of the array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }

    minmax(arr, n);

    return 0;
}