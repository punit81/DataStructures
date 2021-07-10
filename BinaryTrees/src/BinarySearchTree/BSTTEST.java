package BinarySearchTree;

import java.util.Scanner;

public class BSTTEST {

	public static void main(String[] args) {
		BST bst=new BST();
		int ch;
		try {
		do {
			System.out.println("1:Insert\n2:Inorder\n3:Preorder\n4:Postorder\n5:BFS\n0:Exit\nPlease Enter Your Choice:");
			ch=new Scanner(System.in).nextInt();
			switch(ch) {
				case 1:System.out.println("Enter the number to be inserted:");
						bst.insert(new Scanner(System.in).nextInt());
						break;
				case 2: bst.inOrder();
						break;
				case 3: bst.preOrder();
						break;
				case 4: bst.postOrder();
						break;
				case 5: bst.BFS();
						break;
				case 0: System.out.println("Thank You........!");
			}
			
		}while(ch!=0);
	}
	catch(RuntimeException e) {
		System.out.println("Error occured due to incorrect input......Exiting.....!");
	}
	}

}
