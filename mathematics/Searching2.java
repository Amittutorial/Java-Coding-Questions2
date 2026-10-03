// class Searching2 
// {
// 	public void main(String args[])
// 	{
// 	int a[]= {10,20,30,40,50};
// 	int target=40;
// 	int start=0;
// 	int end =a.length-1;
// 	 while(start<=end)
// 		{  
// 			int mid=start+end/2;
// 			if(a[mid]==target) {
				
// 				System.out.println("element found" +mid);
// 				break;}
// 			  else if(a[mid]>target)
				
// 					start=mid+1;
				
// 				else 
// 				end=mid-1;}
// 	}
// }


//____________________________________________________________________________

class Searching2{


boolean elementpresent(int[] a, int target) {
    int s = 0, e = a.length - 1;
    while (s <= e) {
        int m = (s + e) / 2;
        if (a[m] == target) {
            return true;
        }
        if (a[m] < target) {
            s = m + 1;
        } else {
            e = m - 1;
        }
    }
    return false;
}

public static void main(String args[]) {
    int arr[] = {10, 20, 30, 40, 50};
    int target = 40;
    Searching2 ln = new Searching2();
    System.out.println(ln.elementpresent(arr, target));
}
}