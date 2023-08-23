public class custom {
    private static int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStk(){
        this(DEFAULT_SIZE);
    }
    public CustomStk(int size){
        this.data=new int[size];

    }
    public boolean push(int item){
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("nope");
        }
        return data[ptr--];


    }
    public int peek(){
        return data[ptr];
    }
    private boolean isFull(){
        return ptr== data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

}
