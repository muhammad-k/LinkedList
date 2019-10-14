package com.company;

public class LinkedList {

    Node head;

    public void insert(int data){

        //Creating a new node and assigning the value
        // and next as null for default
        Node node = new Node();
        node.data = data;
        node.next = null;

        //Checking if this is the first node
        if(head == null)
            head = node;
        //Otherwise insert at the end
        else{
            Node n = head;

            //Traversing until the end of the linked list
            while(n.next != null){
                n = n.next;
            }

            //Since we went to the end of the list, we place
            //our new node at the end
            n.next = node;
        }


    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        //If the node is the head node
        if(index == 0){
            insertAtStart(data);
        }
        else{
            //Searching for the index and setting n = next
            Node n = head;
            for(int i =0; i < index-1; i++){
                n = n.next;
            }

            node.next = n.next;
            n.next =  node;
        }

    }

    public void deleteAt(int index){

        //If you want to delete the head node
        if(index == 0){
            head = head.next;
        }
        //For all other indices
        else{
            Node n = head;
            Node n1 = null;
            for(int i =0; i < index-1; i++){
                n = n.next;
            }

            //EXAMPLE: deleteAt(1)
            /*
             *       n0 ---
             *            |
             *       n1   |
             *            |
             *       n2 <--
             * */

            //Just setting the value of the n's next to the node after the next
            //This can be done in one line but can't delete the value
            //-----------------------
           // n.next = n.next.next ;

            //This method can creates a new value and allows for garbage collection
            n1 = n.next;
            n.next = n1.next;
            n1=null;
        }
    }

    public void display(){
        Node node = head;
        int i = 0;

        //Here we iterate through the items in the list
        //I included an "i" value just for the clarity of output
        while(node.next != null){

            if(i == 0){
                System.out.print("[ HEAD | ");
                System.out.print(node.data + " ]");
                System.out.print("  ----->  ");
            }
            else{
                System.out.print("[ " + i + " | ");
                System.out.print(node.data + " ]");
                System.out.print("  ----->  ");
            }


            //Iterating through the list
            node = node.next;
            i++;
        }

        //Because the while loop stops at null and the last value's next = null
        //We print the final node outside the loop
        System.out.print("[ " + i + " | ");
        System.out.print(node.data + " ]");
        System.out.print("  ----->  NULL");

        System.out.println();

    }



}
