package callcenter;

import java.util.*;

public class CustomerQueue {
	
	private Customer head;
	private Customer tail;
	
	private PriorityQueue<String> vipQueue = new PriorityQueue();
	
	// call coount
	private HashMap<String, Integer> callCount = new HashMap<>();
	
	public void add(String name, boolean isVip) {
		
		callCount.put(name, callCount.getOrDefault(name, 0) +1);
		
		if(isVip) {
			vipQueue.add(name);
			System.out.println(name + " Added to vip queue");
			return;
		}
		
		Customer newCustomer = new Customer(name);
		
		if(head==null) {
			head = tail = newCustomer;
			
			System.out.println(name + " added to queue");
			return;
		}
		
		tail.next = newCustomer;
		tail = newCustomer;
		System.out.println(name + " added to queue");
		
	}
	public void remove() {
		
		//vip has priority
		if(!vipQueue.isEmpty()) {
			System.out.println("Serving VIP customer " + vipQueue.poll());
			return;
		}
		
		
		if(head == null) {
			System.out.println("No customer in Queue to remove");
			return;
		}
		else if(head == tail) {
			System.out.println("Serving Normal Customer: " + head.name);
			head = tail = null;
			
		}
		else {
			System.out.println("Serving Normal Customer: " + head.name);
			head = head.next;
			
		}
	}
	public PriorityQueue displayVIPQueue() {
		return vipQueue;
		
	}
	public void displayNormalQueue() {
		if(head==null) {
			System.out.println("Normal Queue: empty");
			return;
		}
		Customer temp = head;
		System.out.print("Normal Queue: [ ");
		while(temp!=null){
			System.out.print(temp.name);
			temp = temp.next;
		}
		System.out.print(" ]");
	}
	
	// Display call count;
	public void displayCallCount() {
		System.out.println("Customer Call Count: ");
		System.out.print(callCount);
	}
	 
	

}
