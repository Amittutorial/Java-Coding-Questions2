class StudentRR
{
   private String name;
   private String course;
   private String city;
   private double  marks;
   public void setName(String name)
   {
	   this.name =name;
   }
   public String getName()
   {
	   return name;
   }
   public void setCourse(String course)
   {
	   this.course =course;
   }
   public String getCourse()
   {
	   return course;
   }
   public void setCity(String city)
   {
	   this.city =city;
   }
   public String getCity()
   {
	   return city;
   }
   public void setMarks(double marks)
   {
	   this.marks =marks;
   }
   public double  getMarks()
   {
	   return marks;
   }

public static void main(String args[])
{
	 StudentRR s=new StudentRR();
	 s.setName("Amit");
	 s.setCourse("B.A");
	 s.setCity("Lucknow");
	
	 System.out.println(s.getName());
	 System.out.println(s.getCourse());
	 System.out.println(s.getCity());
	 System.out.println(s.getMarks());
}
}/*
	 the data is usiuly declared at private and excess is providedthrough public geter and seter method
	 
	 QUE:---
	 Why do be need  Incapsulation
	 
	 [1]= protect data throw unatorised excess
	 [2]=Improves Sequrity 
	 [3]=provides control excess
	 [5]=makes code maintainable
	 [6]= Supports Data hiding
	 [7]=improves Flaxibility
	 
	 QUE;--
	 How to achieve incapsulation
	 
	 [1]=Declear variables as private
	 [2]=Create public geter method to read
	 [3]=Create public seter method to improve data	 
	 
			 */
