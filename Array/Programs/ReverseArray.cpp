#include <iostream>
#include <iomanip>
#include <array>
using namespace std;

void reverseArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[n - i - 1] << " ";
    }
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

    reverseArray(arr, n);

    return 0;
}