package LEAPStudy;

//PROBLEM DOMAIN
// Detect if a linked list is looped or not.
//assume node class has ints as values

import java.util.LinkedList;

//Reference/refresh with https://java2blog.com/how-to-detect-loop-in-linkedlist-in/
public class LinkedListLoop {


    private static Node head;

    public boolean isLoop(){
        boolean result = false;

        //edge case for if LL has no nodes in it yet
        if(head == null){
            return result;
        }

        //set two pointers on LL and see if they are ever equal
        Node current1 = head;
        Node current2 = head;

        //edge case for if LL is only one Node
        if (current2 == null){
            return result;
        } else {
            //as long as both pointers aren't null, keep moving through LL
            //current 1 is moving 1 step at a time
            //current 2 is moving 2 steps at a time
            while(current1 != null && current2 != null){
                current1 = current1.next;
                current2 = current2.next.next;

                //if two pointers are ever equal then their is a loop in the linked list

                if(current1 == current2){
                    result = true;
                }
            }
        } return result;
    }


    public void addTail (Node tailNode){
        if(head == null){
            head = tailNode;
        } else {
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = tailNode;
        }
    }

    public void removeNode(int location){
        if (location <0 ){
            System.out.println("not possible location please use only positive integers");
            return;
        }
        if (head == null){
            return;
        }
        Node temp = head;

        if (location == 0){
            head = temp.next;
            return;
        }

        for(int i = 0; temp != null && i< location -1; i ++) {
            temp = temp.next;

            //since I haven't implemented size method on LL
            //in case location is higher than number of nodes in LL
            if (temp == null || temp.next == null) {
                System.out.println("sorry, there aren't that many nodes in this list \n the location can't be found.");
                return;
            }
            //else point to the node pointing to the location to be removed
            Node next = temp.next.next;
            //unlink node so it is removed from LL
            temp.next = next;
        }


    }

    /* This function prints contents of linked list starting from
       the given node */
    public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.value+", ");
            current = current.next;
        }
    }

}
