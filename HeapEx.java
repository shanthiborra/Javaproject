package xyz;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		
		minHeap.add(20);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(10);
		
		System.out.println("min Heap Output");
		
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
			
		}
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		maxHeap.add(20);
		maxHeap.add(5);
		maxHeap.add(15);
		maxHeap.add(10);
		System.out.println("max Heap Output");
		
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
			
		}
		

	}

}