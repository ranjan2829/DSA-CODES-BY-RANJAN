package src;

import java.util.Stack;

public class stkq2n {
    class main{
        public static void main(String[] args) {

        }

    }
    class StkusingQ{
        private Stack<Integer> first;
        private Stack<Integer> second;
        public StkusingQ(){
            first=new Stack<>();
            second=new Stack<>();

        }
        public void add(int item) {
            first.push(item);
        }



        public int remove() throws Exception{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed= second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());

            }
            return removed;
        }

    }

}
