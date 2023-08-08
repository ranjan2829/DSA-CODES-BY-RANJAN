public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=size;
    }
    public void insertfirst(int val){
        Node node= new Node(val);
        node.next=head;
        head= node;
        if(tail==null){
            tail=head;
        }
        size+=1;


    }
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);

        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertmiddle(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;



    }
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        Node second=get(size-2);
        int val=second.value;
        tail=second;
        tail.next=null;
        return val;


    }
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;


    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");

            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
