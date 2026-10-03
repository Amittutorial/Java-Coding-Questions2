class Target
{
   public static void main(String args[])
   {
    int a[]={11,12,13,14,15};
    int target=25;
    int start=0;
    int end=a.length-1;
    while(start <end)
    {
      int sum=a[start]+a[end];
      if(sum==target)
      {
         System.out.println(a[start]+" | "+a[end]);
         break;
      }
      else if(sum<target)
      {
         start++;
      }
      else
      {
         end--;
      }
    }
   }
}