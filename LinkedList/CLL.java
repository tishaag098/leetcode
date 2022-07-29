public class CLL {

    private Node head;
    private Node tail;

    public CLL()
    {
        this.head=null;
        this.tail=null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }
    }

    public void insert(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }

    public int delete(int value)
    {
        Node temp=head;
        if(temp==null)
           return;
        if(temp.value==value)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node current=temp.next;
            if(current.value==value)
            {
                temp.next=current.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);

    }

    public void display()
    {
        Node temp=head;
        if(head!=null)
        {
            do{
                System.out.print(temp.value +" -> ");
                temp=temp.next;
            }while(temp!=head);
        }
            System.out.println();
    }
}
    
