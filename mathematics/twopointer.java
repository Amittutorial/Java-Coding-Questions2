/*                         [TWO POINTER]
 [1]=opposite direction
 [2]=same diresction  
 */

class twoponiter
{
   public static void main(String args[])
   {
    int a[]={11,12,13,14,15};
    int start=0;
    int end=a.length-1;
    for(int i=0;i<a.length;i++)
    {
    while(start<end)
    {
        int t=a[start];
        a[start]=a[end];
        a[end]=t;
        start++;
        end--;
    }
}
    System.out.println(a[start]);
    System.out.println(a[end]);
   } 
}