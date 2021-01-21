#include <iostream>
#include <iomanip>
#include <array>
#include <vector>
using namespace std;

#define SIZE 10

void move(int arr[])
{
    int count{0};
    vector<int> res;
    for (int i = 0; i < SIZE; i++)
    {
        if (arr[i] < 0)
        {
            res.push_back(arr[i]);
        }
    }
    for (int j = 0; j < SIZE; j++)
    {
        if (arr[j] > 0)
        {
            res.push_back(arr[j]);
        }
    }
    for (int k = 0; k < SIZE; k++)
    {
        cout << res[k] << " ";
    }
}

int main()
{

    int arr[SIZE];

    cout << "\nEnter the elemnts of the array: " << endl;
    for (int i = 0; i < SIZE; i++)
    {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }

    move(arr);

    return 0;
}