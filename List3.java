package Linkedlist;

import java.util.*;
class LinkedList3{
    
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }
    
    LinkedList3(){
        //head=null;
        tail=null;
    }
    
    public void Append(int val){
        Node newNode = new Node(val);
        
        if(tail==null){
            head = newNode;
            tail = newNode;
            //return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
       /* Node temp = head;
        
        while(temp.next!=null){
            temp = temp.next;
            temp.next = newNode;
           // return;
        }*/
    }
    
    public int max(){
        if(head==null){
            System.out.println("Empty");
        }
        
        int max = head.data;
        Node current = head.next;
        
        while(current!=null){
            if(current.data > max){
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}


public class List3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList3 list = new LinkedList3();
		
		int data;
		System.out.println("Enter the student mark:");
		
		while((data=sc.nextInt()) != -1){
		    list.Append(data);
		    //System.out.println("Enter the Student mark:");
		}
 		//int ma = max;
	//	System.out.println("The Student's marks are:");
		list.display();
		int max = list.max();
		System.out.println("\nThe Maximum mark is "+max+".");
	}
}

