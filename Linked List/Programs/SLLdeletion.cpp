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
void deleteNode();             //Function prototype to delete the given node

int main()
{
    //Allocating memory dynamically
    head = new Node();

    //Creating Linked list
    createList();
    // Traversing Linked list
    traverseList(head);
    //Deleting a node
    deleteNode();

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

void deleteNode()
{
    int n{};
    cout << "\n\nEnter the position of the node to be deleted: ";
    cin >> n;
    Node *toDelete;
    Node *last;

    toDelete = head;
    last = head;

    //To delete head node
    if (n == 0)
    {
        head = head->next;
        free(toDelete);
    }

    //To delete remaining nodes
    for (int i = 1; i < n - 1; i++)
    {
        last = last->next; //previous node
    }

    toDelete = last->next; //node to be deleted

    last->next = toDelete->next; //linking previous node to the next node

    free(toDelete);
}