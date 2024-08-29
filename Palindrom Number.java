//Palindrom Number

  class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int revNum=0;
        while(x>0)
        {
            int rem=x%10;
            revNum=(revNum*10)+rem;
            x=x/10;

        }
        if(revNum==temp)
        {
          return true;
        }
        else
        {
        return false;
        }

        
    }
    

}