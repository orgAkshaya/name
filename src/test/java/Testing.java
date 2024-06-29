import java.util.Arrays;



public class Testing {
      class Node{
    	  int val;
    	  Node next;
    	  public  Node(int val) {
    		  this.val=val;
    	  }
      }
      static Node head=null;Node tail=null;
      public void AtendNode(int val) {
    	  Node newnode=new Node(val);
//      if(head==null) {
//    	  head=newnode;
//    	  tail=newnode;
//      }else {
//    	  tail.next=newnode;
//    	  tail=newnode;
//    	  newnode.next=null;
//      }
    	  newnode.next=head;
    	  head=newnode;
      
      }
public void Display(Node head) {
    	 Node c=head;
    	 while(c!=null) {
    		 System.out.println(c.val);
    		 c=c.next;
    	 }
      }
	public static void main(String[] args) {
		Testing t=new Testing();
		t.AtendNode(10);
		t.AtendNode(20);
		t.Display(head);
	}


}

