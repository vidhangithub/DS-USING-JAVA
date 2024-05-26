package com.vidhan.javads.ll;
public class VidLinkedList {
    int length;
    Node head;
    Node tail;

    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
    public VidLinkedList() {
        //default constructor creates an empty list
    }
    public VidLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Append in to list
    /*public boolean append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
        return true;
    }*/

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    //Get from index
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for ( int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //Remove Last
    public Node removeLast() {
        if (head == null) return null;
        Node temp = head;
        Node pre = temp;
        if (length ==1 ) {
            head = null;
            tail = null;
        }
        while(temp.next != null) {
            pre = temp;
            temp= temp.next;
        }
        pre.next=null;
        tail = pre;
        length--;
        return temp;
    }

    //Remove First
    public Node removeFirst() {
        if (head == null) return null;
        Node temp = head;
        if (length ==1 ) {
            head = null;
            tail = null;
        }
        head=head.next;
        temp.next = null;
        length--;
        return temp;
    }

    //Insert at index
    public boolean insert(int value,int index) {
        if (index < 0 || index >= length) return false;
        else if(index == 0) {
            prepend(value);
            return true;
        }
        else if (index == length -1) {
            append(value);
            return true;
        } else  {
            Node newNode = new Node(value);
            Node pre = get(index-1);
            newNode.next= pre.next;
            pre.next = newNode;
            length ++;
            return  true;
        }
    }

    //remove at index
    public boolean remove(int index) {
        if(index < 0 || index >= length) return false;
        else if(index == 0) {
            if(removeFirst() != null) {
                return  true;
            }
        } else if(index == length -1) {
            if (removeLast() != null) {
                return true;
            }
        } else  {
            Node pre = get(index -1);
            Node toBeRemoved = pre.next;
            pre.next = toBeRemoved.next;
            toBeRemoved.next=null;
            length --;
            return true;
        }
        return false;
    }

    // Reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i<length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp=after;
        }
    }

    //print list
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value + "\n");
            temp = temp.next;
        }

    }

    public int getLength() {
        return length;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
