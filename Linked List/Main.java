import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        

        LinkedList l = new LinkedList();
        Node y = new Node();
        System.out.println(y);
        l.insertHead(y);

        int q= sc.nextInt();

        
        

        while(q>0)
        {

            Node n = new Node();
            int w = sc.nextInt();

            LinkedList list = new LinkedList();

            y.value=w;

            list.insert(y , n);
            y=n;



    


          


            q--;



        }

        l.show();





       
        


        


       



    }

    
}

 class Node {

    int value;
    Node next;


 
}

 class LinkedList{

    Node head = new Node();
    static Node jk = new Node();

    public void insertHead(Node s)
    {
        this.jk.next = s;
        System.out.println(jk.next);

    }


    public void insert(Node prev , Node current)
    {   
        this.head = prev; 
       
        this.head.value = prev.value;
        this.head.next = current;
        System.out.println(this.head.next);





    }
    public void show (){
        Node u = new Node();
        u = jk.next;
        System.out.println('a');
        System.out.println(u.next);

       while(u.value != 0)
       {   

    
           System.out.println(u.value);
           u=u.next;
           System.out.println(u);
           
       }
    }


   


}



