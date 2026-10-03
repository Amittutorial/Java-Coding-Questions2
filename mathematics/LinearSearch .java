 class LinearSearch {
	// boolean elementpreasnt(int a[],int target)
	// {
	// 	int count =0;
	// 	for(int i=0;i<a.length;i++) {
	// 		if(a[i]==target)
	// 		{
	// 			count++;
	// 			break;
	// 		}
	// 	}
	// 	return(count==0)?false:true;
	// }
	
	
		int elementatindex(int a[],int target)
		{
			int position=0;
			for( int i=0;i<a.length;i++)
			{
				if(a[i]==target) {
					position=i+1;
					break;
				}
				}
			if(position!=0)
			{
				System.out.println("element is present in array");
			}
			else {
				System.out.println("Elenment is not present in array");
				
			}return position;
		
		}
	
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50};
		int target=40;
		LinearSearch ln=new LinearSearch();
		// System.out.println(ln.elementpreasnt(arr,target));
		System.out.println(ln.elementatindex(arr,target));
	}
}

