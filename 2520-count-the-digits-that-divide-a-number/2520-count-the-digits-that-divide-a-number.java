class Solution {
    public int countDigits(int num) {
        int count=0;
        int r;
        int copy=num;
        while(num!=0){
            r=num%10;
            
            if(copy%r==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}