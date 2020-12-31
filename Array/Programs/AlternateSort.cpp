#include <iostream>
#include <iomanip>
using namespace std;

//function to sort the array
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

//function to alternately print the sorted nos.
void AlterateSort(int arr[], int n)
{
    int i{0}, j{n - 1};
    while (i < j)
    {
        cout << arr[j] << " ";
        cout << arr[i] << " ";
        j--;
        i++;
    }

    // If size of the array is odd then to print the last middle element
    if (n % 2 != 0)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int n{};
    int arr[n] = {};
    cout << "\nEnter the size of the array: ";
    cin >> n;
    cout << "\nEnter the elemnts: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    insertionSort(arr, n);
    AlterateSort(arr, n);

    return 0;
}