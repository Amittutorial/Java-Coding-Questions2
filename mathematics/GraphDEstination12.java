class GraphDEstination12 {
   int vertices;
   int graph[][];

  GraphDEstination12 (int vertices)
   {
    this .vertices=vertices;
    graph= new int[vertices][vertices];
   }

   void add(int s,int d)
   {
    graph[s][d]=1;
   
   }

   void remove(int s,int d)
   {
    graph[s][d]=0;
    
   }

   boolean EdgeisPresent(int s, int d) {
    if( graph[s][d] == 1 )
    {
        return true;
    }
    else{
        return false;
    }
}
   int TotalMember(int v)
   {
     int count = 0;
     for(int i=0;i<vertices;i++)
     {
     for (int j = 0; j < vertices; j++)
     {
         if (graph[i][j]==1)
         {
             count++;
         }
     }
    }
     return count;
   }

    void display()
    {
        for( int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(" "+graph[i][j]+" ");
            }
            System.out.println();
        }
    }
     
     
        public static void main(String args[])
            {GraphDEstination12 n=new GraphDEstination12(5);
              n.add(0,4);
              n.add(4,3);
              n.add(3,2);
               n.add(0,1);
                n.add(1,4);
                 n.add(1,2);
                  n.add(1,4);
                  

              
              n.display();
              System.out.println("Remove Matrix");
              n.remove(0,1 );
              n.display();
              System.out.println("Edge is Present");
              System.out.println(n.EdgeisPresent(1,2));
              System.out.println(n.TotalMember(1));
            }
        
    }