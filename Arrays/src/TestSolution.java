
public class TestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] lists=new ListNode[3];
		ListNode temp;
		ListNode l1=new ListNode();
		ListNode l2=new ListNode();
		ListNode l3=new ListNode();
		l1.val=1;
		l1.next=new ListNode();
		temp=l1.next;
		temp.val=4;
		temp.next=new ListNode();
		temp=temp.next;
		temp.val=5;
		
		l2.val=1;
		l2.next=new ListNode();
		temp=l2.next;
		temp.val=3;
		temp.next=new ListNode();
		temp=temp.next;
		temp.val=4;
		
		l3.val=2;
		l3.next=new ListNode();
		l3.next.val=6;
		
		lists[0]=l1;
		lists[1]=l2;
		lists[2]=l3;
		
		ListNode [] lists1=new ListNode[2];
		lists1[0]=new ListNode(1);
		lists1[1]=new ListNode(0);
		Solution sol=new Solution();
		temp=sol.mergeKLists(lists1);
		System.out.println("The Resultant Linked List is:");
		if(temp==null) {
			System.out.println("Nothing to print");
		}
		else{
			System.out.print("[");
			while(temp!=null) {
				System.out.print(temp.val+",");
				temp=temp.next;
			}
			System.out.print("]");
		}
	}

}
