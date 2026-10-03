class Palindromenum2{

    public static void main(String args[])
    {
        String s1="abcba";
        String s2="abcda";
        StringBuilder sb=new  StringBuilder(s1);
        String reversed = sb.reverse().toString();

        if(s1.equals(reversed))
        {
            System.out.println(" First string is Palindrome");
        }
        else
        {
            System.out.println("First string is Not Palindrome");
        }
      
        StringBuilder st=new  StringBuilder(s2);
        String reverseds = st.reverse().toString();

        if(s2.equals(reverseds))
        {
            System.out.println("Second String Palindrome");
        }
        else
        {
            System.out.println(" Second String is Not Palindrome");
        }


    }
}
