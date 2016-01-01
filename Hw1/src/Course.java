import java.util.ArrayList;


public class Course {
	
	private String CourseName;
    private int CourseNumber;
   
	
	public Course(String CourseName, String CourseNumber)
	    {
		CourseName = CourseName;
		CourseNumber = CourseNumber;
	    }

	private ArrayList<Student> student = new ArrayList <Student>();


	
	
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getCourseNumber() {
		return CourseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		CourseNumber = courseNumber;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}
	
 
	}


