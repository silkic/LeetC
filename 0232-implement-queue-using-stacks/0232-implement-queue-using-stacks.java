class MyQueue {
     Stack<Integer> stk = new Stack<>();
     Stack<Integer> stk2 = new Stack<>();
    public MyQueue() {
       
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        if(stk2.isEmpty()){
            while(!stk.isEmpty()){
                stk2.push(stk.pop());
            }
        }
        return stk2.pop();
    }
    
    public int peek() {
       if(stk2.isEmpty()){
          while(!stk.isEmpty()){
            stk2.push(stk.pop());
          }
       }
       return stk2.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty() && stk2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */