// ___________________________[2-D]ARRAY___________________________________________
//   Array of 1-D Array
// array is linear data Structure

// class TwoDarray
// {
//     public static void main(String args[])
//     { int i,j;
//         int a[][]={{1,2,3},{6,7,8},{5,6,7}};
//         for(i=1;i<3;i++)
//         {
//      for(j=1;j<3;j++)
//      {
        
//         System.out.println(a[i][j]+ " | ");
//      }
//         System.out.println( );
//         }
//     }
//  }

  //___________________________________________[3-D]ARRAY__________________________________
   //   Array of 3-D array
//    class TwoDarray
// {
//      Boolean similar(int a[][],int b[][]){
    
//         if(a.length!=b.length)
//         {
//             System.out.println("not equal length of array");
//         }
//       for(int i=0;i<2;i++)
//       {
//         for(int j=0;j<2;j++) 
//         {
//             if(a[i][j]==b[i][j]){
            
//                 return true;
//             }
            
//             else{
                
//                 return false;}

//             }
//     }
//     return null;
// }


//     public static void main(String args[])
//     {
//        TwoDarray sim=new TwoDarray();
//        int arr1[][]={{1,2},{2,3},{4,5}};
//        int arr2[][]={{1,2},{2,3},{4,5}};
//        System.out.println(sim.similar(arr1,arr2));
//     }
// }


        
        
        
public class threeDarray {
	
	public static void main(String args[])
	{
		int a[][][]= {{{1,2},{3,4},{{5,6},{7,8}}};
		for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			for(int k=0;k<=2;k++) {
				System.out.println(a[i][j][k] +"  |  ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		}
	}
	}
}

		
		