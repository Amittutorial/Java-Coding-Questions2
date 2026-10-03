class Waitedgraph {
   int vertices;
   int graph[][];

   Waitedgraph(int vertices)
   {
    this .vertices=vertices;
    graph= new int[vertices][vertices];
   }

   void add(int s,int d,int w)
   {
    graph[s][d]=w;
    graph[d][s]=w;
   }

   void remove(int s,int d)
   {
    graph[s][d]=0;
    graph[d][s]=0;
   }

   boolean EdgeisPresent(int s, int d,int w) {
    if( graph[s][d] != 1 && graph[d][s]!=1)
    {
        return true;
    }
    else
        {
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
         if (graph[i][j]!=0)
         {
             count++;
         }
     }
    }
     return count/2;
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
            {
             Waitedgraph n=new Waitedgraph(4);
              n.add(0,1,10);
              n.add(1,2,20);
              n.add(2,3,35);
               n.add(0,3,15);
                n.add(3,0,15);
                 n.add(1,3,40);
                  

              
              n.display();
              System.out.println("Remove Matrix");
              n.remove(0,1 );
              n.display();
              System.out.println("Edge is Present");
              System.out.println(n.EdgeisPresent(1,2,20));
              n.display();
              System.out.println(n.TotalMember(1));
            }
        
    }