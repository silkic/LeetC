class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        int i = 0; int cnt = 0;
        while(!q.isEmpty() && cnt < q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                i++;
                cnt = 0;
            }
            else{
                q.add(q.poll());
                cnt++;
            }
        }
        return q.size();
    }
}