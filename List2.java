package Linkedlist;

import java.util.*;
class LinkedList2{
    
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    
    LinkedList2(){
        head=null;
    }
    
    public void Append(int val){
        Node newNode = new Node(val);
        
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    /*public void display(){
        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }*/
    
    public void position(int pos, int val){
        Node newNode = new Node(val);
        Node temp = head;
         for(int i=1;i<pos;i++){
             temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next=newNode; 
    }
    
    public void display(){
        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class List2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList2 list = new LinkedList2();
		int data;
		
		while((data=sc.nextInt()) != -1){
		    list.Append(data);
		}
		int pos = sc.nextInt();
		int val1 = sc.nextInt();
		System.out.println("Before Insertion:");
		list.display();
		//System.out.println("\nAfter Insertion:");
		
		list.position(pos,val1);
		System.out.println("\nAfter Insertion:");
		list.display();
	}
}
