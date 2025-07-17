import java.util.*;

public class LL{


    public static void main (String args[]){

        LinkedList<String> list = new LinkedList<String>();


        list.add("is");
        list.add("a");
        System.out.println(list);


        list.addFirst("this");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.add(3, "Linked");
        System.out.println(list);



        System.out.println(list.get(0));
        System.out.println(list.get(3));

        list.remove(3);
        System.out.println(list);

        list.add("Linked");
        System.out.println(list);


        list.remove(4);
        System.out.println(list);

        list.removeLast();
        list.removeFirst();
        System.out.println(list);

       int size = list.size();
       System.out.println(size); 
       
    }
}





import java.util.*;

public class LL{

    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<Integer>();


        list.add(90);
        list.add(9);
        list.add(9000);
        list.add(9);
        System.out.println(list);



        list.addFirst(0);
        System.out.println(list);

        list.addLast(33);
        System.out.println(list);


        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


        System.out.println(list.get(0));

        System.out.println(list.get(3));


        int size = list.size();
        System.out.println(size);
    }
}


 scratch implementes 

class LL{

    Node head;

    public class Node{

        String data;
        Node next;

    
        
        Node (String data){

            this.data = data;
            this.next = null;
            size++;

        }
    }

    public void AddFirst (String data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(String data){
      Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode.next = newnode;
        }

        public printList(){
            Node currNode = head;

            while( currNode != null){
                System.out.print(currNode. data " -->");

                currNode = currNode.next;
            }
            System.out.println("null")
        }

        
        public void removeFirst (){

            if(head == null){
                System.out.println("Empty line nothing to delate");
                return;
            }
            head = this.head.head.next;
            size--;
        }
        public void removeLast(){

            if(head == null){
                System.out.println("Empty line nothing to delate");
                size--;
                return;
            }
            if(head.next == null){
                head = null;
                return;
     
            }

            Node currNode = head;
            Node LastNode = head.next;

            while(LastNode.next != null){

                currNode = currNode.next;
                Last Node = LastNode.next;
            }
            currNode.next = null;
            size--;
        }
        public int getsize(){
            return size;
        }

        public static void main(String args[]){

            LL list = New LL();

            list.addLast ("is");
            list.addLast ("a");
            list.addLast("list");

            list.printList();

            list.addFirst("this");
            list.printList();

            System.out.println(list.getsize());

            list.removeFirst();

            list.printList();
        
        }
    }
}



class LL{

    Node head;

    class Node{

        String data;
         Node next;


        Node(String data){ // constructor

            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(String data){
Node newnode = new Node(data);
    
if(head == null){
    head = newnode;
    return;
}

        newnode.next = head;
        head = newnode;
    }


    public void addLast(String data){

        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;

        }
        lastNode.next = newnode;
    }

    
    public void printList(){

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;

        }
        System.out.println("null");
    }


    public void RemoveFirst(){

        if(head == null){
        System.out.println("Empty list is nothig to delete");
        return;
        }

        head = head.next;
    }

    public void RemoveLast(){
        if(head == null){
            System.out.println("Empty list nothig to delete");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node Secondlast = head;
        Node last = head.next;

        while(last.next != null){

         Secondlast = Secondlast.next;
         last = last.next;
        }
        Secondlast.next = null;
    }


    public static void main(String args[]){

        LL list = new LL();

        list.addFirst("my");
        list.addFirst("name");
        list.addFirst("vinit");
       list.printList();


       list.addLast("vinit");
       list.printList();


       list.RemoveFirst();
       list.printList();


       list.RemoveLast();
       list.printList();
    }
}















