#include <iostream>
#include <iomanip>
using namespace std;

//Left Rotation of Array
void leftRotate(int arr[], int p, int n)
{
    int temp{}; //temporary variable to store the value till pivot
    for (int j = 0; j < p; j++)
    {
        temp = arr[0]; //first element changes every time after the iteration so arr[0]
        for (int i = 0; i < n; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; //shifting first element to last
    }

    cout << "Array after Rotation: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int n{}, p{};
    cout << "Enter size of array: " << endl;
    cin >> n;
    int arr[n];
    cout << "\nEnter the elemnts: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "Array before Rotation: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << "\nEnter the pivot point: " << endl;
    cin >> p;

    leftRotate(arr, p, n);
}