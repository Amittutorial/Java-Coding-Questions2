 import java .util.LinkedList;
 class Listrepresent {
	int vertices;
	LinkedList<Integer>[]list;
	Listrepresent(int vertices) {		
		this.vertices = vertices;
		list = new LinkedList[vertices];
		for(int i =0;i<vertices;i++) {
			list[i] = new LinkedList<>();
		}
} 
	void addEdge(int s,int d) {
		list[s].add(d);
		list[d].add(s);
	}
	void display() {
		int count=0;
		for(int i=0;i<vertices;i++) {
			for(int element :list[i]) {
				System.out.print(element + "  ");
			}
				
				System.out.println();
			count++;
			
		}
		
				System.out.println(count);
		
	}
boolean EdgePresent(int s,int d)
{
    if (s < 0 || s >= vertices) return false;
    if (d < 0 || d >= vertices) return false;
    if (list[s] == null) return false;
    return list[s].contains(d);
}
void remove(int s,int d)
{
	list[s].remove(Integer.valueOf(d));
	list[d].remove(Integer.valueOf(s));
}
public static void main(String[] args) {
	Listrepresent l = new Listrepresent(5); 
	l.addEdge(0, 1);
	l.addEdge(0, 3);
	System.out.println(" ");
	l.addEdge(1, 3);
	l.addEdge(1, 0);
	l.addEdge(1, 2);
	System.out.println(" ");
	l.addEdge(2, 1);
	l.addEdge(2, 3);
	System.out.println(" ");
	l.addEdge(3, 0);
	l.addEdge(3, 2);
	l.addEdge(3, 1);
	
	l.display();
System.out.println(l.EdgePresent(0,1));
		l.remove(0, 1);
		l.display();
}
 }