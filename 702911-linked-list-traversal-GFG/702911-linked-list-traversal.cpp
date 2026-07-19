/*
class Node {
  public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};
*/

class Solution {
  public:
    void printList(Node* head) {
        // code here
        Node* temp = head;
        
        while(temp != NULL){
            cout << temp->data<<" ";
            temp = temp->next;
        }
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna