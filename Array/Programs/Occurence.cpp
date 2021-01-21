#include <iostream>
#include <iomanip>
#include <array>
using namespace std;

void Occurence(int arr[], int n, int val)
{
    int count{0};

    for (int i = 0; i < n; i++)
    {
        if (val == arr[i])
        {
            count++;
        }
    }

    cout << "\nThe occurence of the element is " << count << "times";
}

int main()
{
    int n{0};
    int val{0};
    int arr[n];

    cout << "\nEnter the size of the array: ";
    cin >> n;

    cout << "\nEnter the elements of the array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }

    cout << "\nEnter the value: ";
    cin >> val;

    Occurence(arr, n, val);

    return 0;
}