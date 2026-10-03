class DuplicateArray

{
    public static void main(String args[])
    {
        int a[]={10,10,20,20,30};
        int slow=0,fast;
        for(fast=0;fast<(a.length);fast++)
        {
            if(a[slow]!=a[fast])
            
                slow++;
                a[slow]=a[fast];
            
        }
            for(int i =0;i<=slow;i++)
            {
            System.out.println(a[i]);
        
        }
    }
}