package studentclass;

import java.util.Objects;

public class Student {

	public int rollno;
	public String name;
	public int mark;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}

	/*@Override
	public int hashCode() {
		return Objects.hash(rollno,name,mark);
		
		
	}*/
	
	  @Override
	    public boolean equals(Object obj) 
	    { 
	          
	    // if both the object references are referring to the same object. 
	    if(this == obj) 
	            return true; 
	          
	        // it checks if the argument is of the type Student by comparing the classes of the passed argument and this object. 
	        // if(!(obj instanceof Student)) return false; ---> avoid. 
	        if(obj == null || obj.getClass()!= this.getClass()) 
	            return false; 
	          
	        // type casting of the argument.  
	        Student student = (Student) obj; 
	          
	        // comparing the state of argument with the state of 'this' Object. 
	        return (student.name.equals(this.name)  && student.rollno == this.rollno && student.mark== this.mark); 
	    } 
	      
	    @Override
	    public int hashCode() 
	    { 
	          
	        // We are returning the student rollno as a hashcode value. we can also return some other calculated value or may 
	        // be memory address of the Object on which it is invoked. it depends on how you implement hashCode() method. 
	        return this.rollno; 
	       // return Objects.hash(rollno,name,mark);
	    } 
	      
	} 
	
	

