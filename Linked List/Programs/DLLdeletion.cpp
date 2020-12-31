#include <iostream>
#include <iomanip>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node *prev;
};

Node *head = NULL; //Declaring head node

void createList();             //Function prototype for creting list
void traverseList(Node *head); //Function prototype for traversing list
void deleteNode();             //Function prototype for deleting node

int main()
{
    head = new Node(); //Allocating memory on heap

    createList(); //creating linked list

    traverseList(head); //printing linked list

    deleteNode(); //deleting node

    traverseList(head);
}

//Create Linked List
void createList()
{
    int data{}, n{};
    cout << "\nEnter total no. of nodes: ";
    cin >> n;
    Node *new_node = NULL;
    Node *temp = NULL;

    new_node = new Node();

    if (new_node == NULL)
    {
        cout << "Unable to allocate memory!!";
    }
    else
    {
        cout << "\nEnter data of node 1: ";
        cin >> data;

        //for head node
        new_node->data = data;
        new_node->prev = NULL;
        new_node->next = NULL;
        head = new_node;
        temp = new_node;

        //for remaining nodes
        if (new_node == NULL)
        {
            cout << "Unable to allocate memory!!";
        }
        else
        {
            for (int i = 2; i <= n; i++)
            {
                new_node = new Node();

                cout << "\nEnter data of node " << i << ": ";
                cin >> data;

                new_node->data = data;
                new_node->prev = temp; //Linking previous node of new node
                new_node->next = NULL;
                temp->next = new_node; //Linking next node of previous node to the new node
                temp = new_node;
            }
        }
    }
}

//Traversing Linked List
void traverseList(Node *head)
{
    Node *temp = NULL;
    Node *last = NULL;

    if (head == NULL)
    {
        cout << "List is Empty!!";
    }
    else
    {
        temp = head;
        cout << "\nTraversal in forward direction: ";
        while (temp != NULL)
        {
            cout << "\nData : " << temp->data;
            last = temp;
            temp = temp->next; //Similar to i++
        }

        cout << "\nTraversal in reverse direction: ";
        while (last != NULL)
        {
            cout << "\nData : " << last->data;
            last = last->prev;
        }
    }
}

//Deleting Node
void deleteNode()
{
    int p{};
    cout << "\nEnter position of the node to be deleted: ";
    cin >> p;

    Node *toDelete = NULL;
    Node *temp = NULL;

    temp = head;
    toDelete = head;

    if (p == 0) //to delete head node
    {
        head = head->next;
        toDelete->next->prev = NULL;

        free(toDelete);
    }

    //to delete remaining nodes
    for (int i = 1; i < p - 1; i++) //to get the previous node of the node to be deleted
    {
        temp = temp->next;
    }

    //disconnecting the node to be deleted
    toDelete = temp->next;
    temp->next = toDelete->next;
    toDelete->next->prev = temp;

    free(toDelete);
}