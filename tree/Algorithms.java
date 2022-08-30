package tree;

public class Algorithms {

	public static void main(String[] args) {
		Node rootNode = new Node();
		rootNode.data = 2;
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = rootNode;
		
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(6);
		tree.insert(9);
		tree.insert(5);
		
		System.out.println(tree.contains(1)); //true
		System.out.println(tree.contains(0)); //false
		System.out.println(tree.contains(55)); //false
		System.out.println(tree.contains(6)); //true
		System.out.println(tree.contains(-5)); //false
	}

}
