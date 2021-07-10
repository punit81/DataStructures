package BinaryNode;

public class BNode {
	private Object data;
	private BNode left;
	private BNode right;
	private boolean isEmpty;
	public BNode() {
		this.data=new Object();
		this.left=null;
		this.right=null;
		this.isEmpty=true;
	}
	public BNode(Object data) {
		this.data=data;
		this.left=null;
		this.right=null;
		this.isEmpty=false;
	}
	public BNode(Object data,BNode left,BNode right) {
		this.data=data;
		this.left=left;
		this.right=right;
		this.isEmpty=false;
	}
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data=data;
		isEmpty=false;
	}
	public BNode getLeft() {
		return this.left;
	}
	public void setLeft(BNode left) {
		this.left=left;
	}
	public BNode getRight() {
		return this.right;
	}
	public void setRight(BNode right) {
		this.right=right;
	}
	public boolean IsEmpty() {
		return this.isEmpty;
	}
}