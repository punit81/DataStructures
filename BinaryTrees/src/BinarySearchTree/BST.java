package BinarySearchTree;

import java.util.LinkedList;
import java.util.List;

import BinaryNode.BNode;

public class BST{
	private BNode node;
	public BST() {
		this.node=null;
	}
	public void insert(int data) {
		this.node=this.insert1(data, this.node);
	}
	private BNode insert1(int data,BNode node) {
		if(node==null) {
			node=new BNode(data);
			return node;
		}
		if((int)node.getData()<=data) {
			node.setRight(insert1(data,node.getRight()));
			return node;
		}
		node.setLeft(insert1(data,node.getLeft()));
		return node;
	}
	public void preOrder() {
		this.preOrder1(this.node);
	}
	private void preOrder1(BNode node) {
		if(node==null) {
			return;
		}
		System.out.println((int)node.getData());
		preOrder1(node.getLeft());
		preOrder1(node.getRight());
	}
	public void inOrder() {
		this.inOrder1(this.node);
	}
	private void inOrder1(BNode node) {
		if(node==null) {
			return;
		}
		inOrder1(node.getLeft());
		System.out.println((int)node.getData());
		inOrder1(node.getRight());
	}
	public void postOrder() {
		this.postOrder1(this.node);
	}
	private void postOrder1(BNode node) {
		if(node==null) {
			return;
		}
		postOrder1(node.getLeft());
		postOrder1(node.getRight());
		System.out.println((int)node.getData());
	}
	public void BFS() {
		List<BNode> ll=new LinkedList<BNode>();
		ll.add(this.node);
		this.BFS1(ll);
	}
	private void BFS1(List<BNode>ll) {
		int i=0;
		while(true) {
			if(i<ll.size()) {
				BNode temp=ll.get(i);
				if(temp==null) {
					i++;
					if(i==ll.size())
						break;
				}
				else {
					System.out.println((int)temp.getData());
					ll.add(temp.getLeft());
					ll.add(temp.getRight());
					i++;
					if(i==ll.size())
						break;
				}
			}
		}
	}
}