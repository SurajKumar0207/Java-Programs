package javaPrograms;

import java.util.*;
public class LinkedListNodes
{
    // DSA Linked List Managing of Elements

    int size=0;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    
    void addFirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    void addLast(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void printList() {
       Node currNode = head;
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
    System.out.print("null");
    }
    void removeFirst()
    {
        if(head==null)
        return;
        // Node currNode=head;
        // head=currNode.next;  OR
        head=head.next;
        size--;
    }
    void removeLast()
    {
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        size--;
        if(head.next==null) {
        head=null;
        return;
        }
        
        Node currNode=head;
        Node lastNode=head.next;   // OR =currNode.next;
        while(lastNode.next!=null) {
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }
    int getSize()
    {
        return size;
    }
    void addInMiddle(int index,int data) {
        Node newNode=new Node(data);
        if(index<0 || index>size)
        {
            System.out.println("Invalid Index");
            return;
        }
        size++;
        if(head==null || index==0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currNode = head;
       for(int i=1; i<size; i++) {
           if(i == index) {
               Node nextNode = currNode.next;
               currNode.next = newNode;
               newNode.next = nextNode;
               break;
           }
           currNode = currNode.next;
       }
    }
    void removeInMiddle(int index) {
        //Node newNode=new Node(data);
        if(index<0 || index>size)
        {
            System.out.println("Invalid Index");
            return;
        }
        size--;
        if(index==0)
        {
            //newNode.next=head;
            head=head.next;
            return;
        }
        Node currNode = head;
       for(int i=1; i<size; i++) {
           if(i == index) {
               currNode.next = currNode.next.next;
               break;
           }
           currNode = currNode.next;
       }
    }
    
	public static void main(String[] args) {
		LinkedListNodes obj=new LinkedListNodes();
		obj.addFirst(2);
		obj.addLast(5);
		obj.addLast(4);
		obj.addFirst(3);
		obj.printList();
	    System.out.println("\n"+"List Size is : "+obj.getSize());
		obj.removeFirst();
		obj.printList();
		System.out.println("\n"+"List Size is : "+obj.getSize());
		obj.removeLast();
		obj.printList();
		System.out.println("\n"+"List Size is : "+obj.getSize());
		obj.addFirst(1);
		obj.addLast(9);
		obj.addLast(9);
		obj.addLast(9);
		obj.addInMiddle(2,7);
		obj.addLast(0);
		obj.addInMiddle(5,0);
		obj.printList();
		System.out.println("\n"+"List Size is : "+obj.getSize());
		obj.removeInMiddle(3);
		obj.printList();
		System.out.println("\n"+"List Size is : "+obj.getSize());	
		
	}
}