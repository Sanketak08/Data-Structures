#include <iostream>
#include <iomanip>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};

//Declaring head node
Node *head = NULL;

void createList();             //Function prototype to create linked list
void traverseList(Node *head); //Function prototype to traverse linked list
void insertAtBeginning();      //Function prototype to insert at beg
void inserAtEnd();             //Function prototype to insert at end
void insertAtAnyPosiion();     //Function prototype to insert at given position

int main()
{
    //Allocating memory dynamically
    head = new Node();

    //Creating Linked list
    createList();
    // Traversing Linked list
    traverseList(head);
    //Insertion at beg
    insertAtBeginning();
    //Insertion at end
    inserAtEnd();
    //Insertion at given position
    insertAtAnyPosiion();

    traverseList(head);
}

//CreateList function
void createList()
{
    int data{}, n{};
    cout << "\nEnter the no. of nodes: ";
    cin >> n;
    Node *new_node = NULL;
    Node *temp = NULL;
    new_node = new Node();

    if (new_node == NULL)
    {
        cout << "\nUnable to allocate memory!!";
    }
    else
    {
        cout << "\nEnter the data of node 1: ";
        cin >> data;

        //For head node
        new_node->data = data; //allocating data
        new_node->next = NULL; //next pointer to null
        head = new_node;
        temp = new_node;

        //For remaining nodes
        for (int i = 2; i <= n; i++)
        {
            new_node = new Node();
            if (new_node == NULL)
            {
                cout << "\nUnable to allocate memory!!";
            }
            else
            {
                cout << "\nEnter the data of node " << i << ": ";
                cin >> data;

                new_node->data = data;
                new_node->next = NULL;
                temp->next = new_node; //Next pointer to previous node
                temp = temp->next;
            }
        }
    }
}

//Traversing linked list
void traverseList(Node *head)
{
    Node *temp = NULL;
    if (head == NULL)
    {
        cout << "List is Empty!!";
    }
    else
    {
        temp = head;
        while (temp != NULL)
        {
            cout << "\nData : " << temp->data;
            temp = temp->next; //Similar to i++
        }
    }
}

//Insert At Beginning
void insertAtBeginning()
{
    int data;
    cout << "\nEnter the data to insert at beginning: ";
    cin >> data;
    Node *temp;
    temp = new Node();
    if (temp == NULL)
    {
        cout << "Unable to allocate memory!!";
    }
    else
    {
        temp->data = data;
        temp->next = head; //Linking to head node

        head = temp; //New node as head node
    }
}

//Insert At End
void inserAtEnd()
{
    int data;
    cout << "\nEnter the data to insert at end: ";
    cin >> data;
    Node *temp;
    Node *last;

    temp = new Node();

    if (temp == NULL)
    {
        cout << "Unable to allocate memory!!";
    }
    else
    {
        last = head;
        while (last->next != NULL) //to get the last of present linked list
        {
            last = last->next;
        }

        temp->data = data; //new last node
        temp->next = NULL;

        last->next = temp; //linking previous last node to the new one
    }
}

//Insert At any position
void insertAtAnyPosiion()
{
    int data, n;
    cout << "\nEnter the data to insert at given position: ";
    cin >> data;
    cout << "Enter the position to insert: ";
    cin >> n;

    Node *temp;
    Node *last;

    temp = new Node();

    if (temp == NULL)
    {
        cout << "Unable to allocate memory!!";
    }
    else
    {
        last = head;
        for (int i = 0; i < n - 1; i++)
        {
            last = last->next;
        }
        if (temp != NULL)
        {
            temp->data = data;
            temp->next = last->next; //Linking new node to the next node

            last->next = temp; //Linking previous node to the new node
        }
        else
        {
            cout << "Unable to insert the node!!";
        }
    }
}