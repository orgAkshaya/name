import java.util.Arrays;

public class Prac {
   class Node{
	   int val;
	   Node next;
	   public Node(int val) {
		   this.val=val;
	   }
   }
  static Node head=null;
  Node tail=null;
  public void AtendNode(int val) {
	  Node newnode=new Node(val);
	  if(head==null) {
		  head=newnode;
		  tail=newnode;
	  }else {
		  tail.next=newnode;
		  newnode.next=null;
		  tail=newnode;
	  }
  }
  public void print(Node head) {
	  Node Current=head;
	  while(Current!=null) {
		  System.out.println(Current.val);
		  Current=Current.next;
	  }
  }
	public static void main(String[] args) {
		Prac p=new Prac();
		p.AtendNode(10);
		p.AtendNode(20);
		p.AtendNode(30);
		p.print(head);
	}

}

