//singly linked list

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    private class Node 
    {
        private int value;
        private Node next;

        public Node (int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    public void insertFirst(int data){
        Node newHead=new Node(data);
        newHead.next=head;
        head=newHead;

        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int data)
    {
        if(tail==null)
        {
            insertFirst(data);
            return;
        }
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void insert(int data,int index)
    {
        if(index==0)
        {
            insertFirst(data);
            return;
        }
        if(index==size)
        {
            insertLast(data);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        Node newNode =new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;

        size++;

    }
    // insert using recursion
    // we can use this when we are not given the size and the tail ie. only head is known
    public void insertRec(int data,int index)
    {
        
    }

    public int deleteFirst()
    {
        int data=head.value;
        head=head.next;
        if(head==null)
          tail=null;
        size--;
        return data;
    }

    public int deleteLast()
    {
        if(size<=1)
           return deleteFirst();
        
        Node secondLast=get(size-2);
        int data=tail.value;
        tail=secondLast;
        tail.next=null;
        return data;
        
    }
    public Node get(int index)
    {
        Node temp= head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public int delete(int index)
    {
        if(index==0)
          return deleteFirst();
        if(index==size-1)
            return deleteLast();
        
        Node prev_node=get(index-1);
        int data=prev_node.next.value;
        prev_node.next=prev_node.next.next;

        return data;
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
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    
}
