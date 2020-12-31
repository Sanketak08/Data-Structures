#include <iostream>
#include <iomanip>
using namespace std;

int LinearSearch(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            return i;
        }
    }
    return -1;
}

int Delete(int arr[], int n, int k)
{
    for (int i = k; i < n; i++)
    {
        arr[i] = arr[i + 1];
    }
    return n - 1;
}

void Print(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int n{}, key{}, k{};
    int arr[n] = {};
    cout << "\nEnter the size of the array: ";
    cin >> n;
    cout << "\nEnter the elements: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "\nEnter the element to delete: ";
    cin >> key;

    cout << "\nArray before Deletion:" << endl;
    Print(arr, n);
    k = LinearSearch(arr, n, key);
    n = Delete(arr, n, k);
    cout << "\n";
    cout << "\nArray after Deletion:" << endl;
    Print(arr, n);
}