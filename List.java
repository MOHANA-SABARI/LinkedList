package Linkedlist;

import java.util.*;
class LinkedList{
    
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        Node (int val){
            data=val;
            next=null;
        }
    }
    
    LinkedList(){
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
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}


public class List
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list =new LinkedList();
        int data;
        
        while((data = sc.nextInt()) != -1){
            list.Append(data);
        }
        
        list.display();
    }
}
