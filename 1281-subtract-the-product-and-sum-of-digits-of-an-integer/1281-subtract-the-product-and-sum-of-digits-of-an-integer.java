class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int r;

        while(n!=0){
            r=n%10;
            n=n/10;
            sum=sum+r;
            prod=prod*r;
        }
        return prod-sum;
        
    }
}