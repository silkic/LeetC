class Solution {
    public int minOperations(String[] logs) {
        int dep = 0;
        for(String log : logs){
            if(log.equals("../")){
                if(dep > 0){
                    dep--;
                }
            }
            else if(!log.equals("./")){
                dep++;
            }
        }
        return dep;
    }
}