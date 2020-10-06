package serialization;

import java.io.Serializable;

public class Student implements Serializable {

	int rollno;
	String name;
	int mark;

	public Student(int rollno, String name, int mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;

	}

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

	public String toString() {
		return "rollno : " + rollno + "name : " + name + "mark : " + mark;
	}
}
