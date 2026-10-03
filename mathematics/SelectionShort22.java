class SelectionShort22
{
    public static void main(String args[])
    {
        int a[]={10,20,30,15,25};
        for(int i=0;i<a.length;i++)
        { int minindex=i;
            for(int j=i+1;j<a.length;j++)
            {
              if(a[j]>a[minindex])    // For assending order a[j]<a[minindex]
              {
                minindex=j;
              }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
        System.out.println("After Selection Sorting: ");
        for(int value : a)
        {
            System.out.println(value +" ");
        }
    }
}