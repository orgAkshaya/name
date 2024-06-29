import java.util.Arrays;

public class Pra {
    class Node{
    	int val;
    	Node next;
    	public Node(int val) {
    		this.val=val;
    	}
    }
    static Node head=null;
    Node tail=null;
    public void StartNode(int val) {
    	Node n=new Node(val);
    	if(head==null) {
    		head=n;
    		tail=n;
    	}else {
    		tail.next=n;
    		n.next=null;
    		tail=n;
    	}
    	
    }
    public void PrintNode(Node Headnode) {
    	Node Current=Headnode;
    	while(Current!=null) {
    		System.out.println(Current.val);
    		Current=Current.next;
    	}
    	
    }
	public static void main(String[] args) {
		Pra p=new Pra()	;
		p.StartNode(10);p.StartNode(20);p.StartNode(30);
		p.PrintNode(head);
	}

}
