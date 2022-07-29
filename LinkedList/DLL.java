
// doubly linked list
public class DLL {

    Node head;

    public void insertFirst(int value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        newNode.prev=null;

        if(head!=null)
        {
            head.prev=newNode;
        }
        head=newNode;
        
    }

    public void insertLast(int value)
    {
        Node newNode = new Node(value);
        Node temp=head;
        newNode.next=null;
        if(head==null)
        {
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        
    }

    public void insertAfter(int after,int value)
    {
        Node p=search(after);

        if(p==null)
        System.out.println("Does not exist");

        Node newNode=new Node(value);
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;

        if(newNode.next!=null)
           newNode.next.prev=newNode;
    }

    public Node search(int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.value==data)
               return temp; // when ele is found return the ele
            
            temp=temp.next;
        }
        return null;// element not found

    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
