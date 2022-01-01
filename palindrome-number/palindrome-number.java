class Solution {
    public boolean isPalindrome(int x) {
        
        int reverse = 0;
        int num=x; 
        
        while(num > 0){            
            reverse = reverse*10 + num%10;
            num/=10;
        }
        
        if(reverse == x)return true;
        return false; 
    }
}