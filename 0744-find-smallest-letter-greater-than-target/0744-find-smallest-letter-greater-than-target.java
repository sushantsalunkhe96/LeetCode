class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int j=letters.length-1;
        int count=0;

       while(i<=j){
        int mid = (i+j)/2;

        if(target>=letters[mid]){
            i=mid+1;
        }
        
        else{
            j=mid-1;
        }
       }
       return letters[i%letters.length];
    }
}