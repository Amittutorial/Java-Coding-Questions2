class PalindromeString
{
    public static void main(String args[])
    {
        String a = "abcba";
        int left=0;
        int right= a.length()- 1;
        boolean palindrome =true;
       while(left<right)
       {
        if(a.charAt(left)!=a.charAt(right))
        {
            palindrome =false;
            break;
        }
        left++;
        right--;
       }
       if(palindrome)
       {
        System.out.println("Palindrome");
       }
       else
       {
        System.out.println("Not palindrome");
       }
    }
}