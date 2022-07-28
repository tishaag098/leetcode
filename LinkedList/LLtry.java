public class LLtry {
    
    public static void main(String[] args){
        LL list =new LL();
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(99);
        list.insert(1000,3);
        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();



    }
}
