public class CQ {
    private int[] data;
    private static final int DEFAULT_SIZE =10;
    protected int end=0;
    protected int front=0;
    private int size=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return size== data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;

    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed =data[front++];
        front=front% data.length;
        size--;
        return removed;

    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("naah");

        }
        return data[front];
    }
    public void display(){
        for(int i=0 ;i<end;i++){
            System.out.print(data[i]+" ");

        }
        System.out.println();
    }


}
