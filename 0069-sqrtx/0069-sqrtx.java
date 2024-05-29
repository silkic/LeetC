class Solution {
    public int mySqrt(int x) {
        double sqr = Math.sqrt(x);
        if (sqr < 0){
            Math.abs(sqr);
        }
        return (int)sqr;
    }
}