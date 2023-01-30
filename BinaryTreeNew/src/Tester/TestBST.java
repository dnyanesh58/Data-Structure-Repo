package Tester;

import com.app.org.BinaryTreeNew;
import com.app.org.Node;

public class TestBST {

	public static void main(String[] args) 
	{
		BinaryTreeNew bst = new BinaryTreeNew();
		bst.insertNode(50);
		bst.insertNode(10);
		bst.insertNode(20);
		bst.insertNode(60);
		bst.insertNode(55);
		bst.insertNode(65);
		bst.insertNode(5);
		bst.insertNode(15);
		bst.insertNode(67);
		bst.insertNode(70);
		bst.inorder(bst.getRoot());
		System.out.println();
		bst.preorder(bst.getRoot());
		System.out.println();
		bst.postorder(bst.getRoot());
		System.out.println();
		System.out.println("Max : "+bst.getMax());
		System.out.println("Min : "+bst.getMin());
		bst.search(15);
	}

}
