class MyStack {
private Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i = 1; i < q.size();i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        int a = q.poll();
        return a;
    }
    
    public int top() {
        int b = q.peek();
        return b;
    }
    
    public boolean empty() {
        if(q.isEmpty()){
        return true;
        }
    return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */