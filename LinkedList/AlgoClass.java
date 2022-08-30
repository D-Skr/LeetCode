package LinkedList;

public class AlgoClass {
	// Detect cycle in LinkedList
	
	//Using a HashSet to detect the cycles
	//For each node -> check if it is in the HashSet
	//If not -> add it to the set, if yes -> list must have a cycle
	
	public static void main(String[] args) {
		CustomLinkedList noCycleLinkedList = new CustomLinkedList();
		Node firstNode = new Node(3);
		Node secondNode = new Node(4);
		Node thirdNode = new Node(5);
		Node fourthNode = new Node(6);
		
		noCycleLinkedList.head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		
		System.out.println(noCycleLinkedList.hasCycle()); //false
		
		CustomLinkedList cycleLinkedList = new CustomLinkedList();
		cycleLinkedList.head = firstNode;
		thirdNode.next = secondNode;
		System.out.println(cycleLinkedList.hasCycle()); //true
	}

}
