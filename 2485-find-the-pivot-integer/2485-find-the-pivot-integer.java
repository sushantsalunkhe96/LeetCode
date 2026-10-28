class Solution {
    public int pivotInteger(int n) {
        
        for(int i=1;i<=n;i++){
            int leftSum=0;
            int rightSum=0;
            
            for(int j=1;j<=i;j++){
                leftSum += j;
            }
            for(int k=i;k<=n ; k++){
                rightSum += k;
            }
            if(leftSum==rightSum){
                return i ;
            }
        }
        return -1;
    }
}