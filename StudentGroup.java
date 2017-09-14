import java.time.Period;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;


public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	
	public Student[] getStudents() {
		
		
	
		return students;
		
	
	}

	
	public void setStudents(Student[] students) {
		// Add your implementation here
		
	}

	
	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
		
	}

	
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
	}

	
	public void addFirst(Student student) {
		// Add your implementation here
		Student[] temp = null;
		 int n=students.length;
		for(int i=0;i<n;i++)
		{
			temp[i]=students[i];
		}
		students[0]=student;
		
		for(int i=0;i<n;i++)
		{
			students[i+1]=temp[i];
		}
		
		
	}

	
	public void addLast(Student student) {
		// Add your implementation here
		
		 int n=students.length;
		 students[n+1]=student;
	
		
	}

	
	public void add(Student student, int index) {
		// Add your implementation here
		Student[] temp = null;
		 int n=students.length;
		for(int i=0;i<n;i++)
		{
			temp[i]=students[index+i];
		}
		students[index]=student;
		for(int i=0;i<n;i++)
			{
			students[index+i+1]=temp[i];
			}
	}

	
	public void remove(int index) {
		// Add your implementation here
		Student[] temp = null;
		 int n=students.length;
		for(int i=0;i<n;i++)
		{
			temp[i]=students[index+i+1];

		}
		for(int i=0;i<n;i++)
		{
			students[index+i]=temp[i];

		}
		
		
		
		
	}

	public void remove(Student student) {
		// Add your implementation here
		int index=0;
		while(students[index]==student)
		{index++;
		
		
		}
		Student[] temp = null;
		 int n=students.length;
		for(int i=0;i<n;i++)
		{
			temp[i]=students[index+i+1];

		}
		for(int i=0;i<n;i++)
		{
			students[index+i]=temp[i];

		}
		
	}

	public void removeFromIndex(int index) {
		// Add your implementation here
		int n= students.length;
		for( int i=index;i<n;i++)
		{
			students[i]=null;
		}
	
	}

	public void removeFromElement(Student student) {
		// Add your implementation here
		int index=0;
		int n= students.length;
		while(students[index]==student)
		{index++;
		}
		for( int i=index;i<n;i++)
		{
			students[i]=null;
		}
		
	}

	public void removeToIndex(int index) {
		// Add your implementation here
		for( int i=0;i<index;i++)
		{
			students[i]=null;
		}
	}

	public void removeToElement(Student student) {
		// Add your implementation here
		int index=0;
		int n= students.length;
		while(students[index]==student)
		{index++;
		}
		for( int i=0;i<index;i++)
		{
			students[i]=null;
		}
	}

	public void bubbleSort() {
		// Add your implementation here
		
		Student temp;
		int n=students.length;
		 for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(students[j-1].getAvgMark() > students[j].getAvgMark()){  
                             //swap elements  
                             temp = students[j-1];  
                             students[j-1] = students[j];  
                             students[j] = temp;  
                     }  
                      
             }  
     }  
	}

	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int n=students.length;
		Student[] bdays = null;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(students[i].getBirthDate().equals(date))
			{
				bdays[j]=students[i];
				j++;
			}
		}
		return bdays;
		
	}

	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] bdays = null;
		int n= students.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if((firstDate.after(students[i].getBirthDate()) && (lastDate.before(students[i].getBirthDate()))))
					{
						bdays[j]=students[i];
						j++;
					}
		}
		return null;
	}

	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		int n=students.length;
		Student[] Dates = null;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if((students[i].getBirthDate().getDate()<= date.getDay()+days) && (students[i].getBirthDate().getMonth()<= date.getMonth()))
			{Dates[j]=students[i];
			j++;
			}
		}
		
		return Dates;
	}

	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		int i= indexOfStudent;
		int aget;
		Calendar c = Calendar.getInstance();
		Date d= c.getTime();
		int year1 = d.getYear();
		int year2 = students[i].getBirthDate().getYear();
	 aget = year1 - year2;
		int month1 = d.getMonth();
		int month2 = students[i].getBirthDate().getMonth();
		if (month2 > month1) {
		  aget--;
		} else if (month1 == month2) {
		  int day1 = d.getDay();
		  int day2 = students[i].getBirthDate().getDay();
		  if (day2 > day1) {
		    aget--;
		  }
		}
		
		
		
		return aget;
	}

	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Calendar c = Calendar.getInstance();
		Date d= c.getTime();
		int aget;
		int j=0;
		 
		
		int n=students.length;
		Student[] agetable = null;
		for(int i=0;i<n;i++)
		{
			int year1 = d.getYear();
			int year2 = students[i].getBirthDate().getYear();
		 aget = year1 - year2;
			int month1 = d.getMonth();
			int month2 = students[i].getBirthDate().getMonth();
			if (month2 > month1) {
			  aget--;
			} else if (month1 == month2) {
			  int day1 = d.getDay();
			  int day2 = students[i].getBirthDate().getDay();
			  if (day2 > day1) {
			    aget--;
			  }
			}
			if(aget==age)
			{
				agetable[j]=students[i];
				j++;
			}

		    
			
		
		}
		
		return agetable;
	}

	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here

		Student temp;
		Student[] top = null;
		int k=0;
		int n=students.length;
		 for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(students[j-1].getAvgMark() > students[j].getAvgMark()){  
                             //swap elements  
                             temp = students[j-1];  
                             students[j-1] = students[j];  
                             students[j] = temp;  
                     }  
                      
             }  
     }  
		for(int j=0;j<n;j++)
		{
			if(students[j].getAvgMark()==students[n].getAvgMark())
			{
				top[k]=students[j];
				k++;
			}
		}
		return top;
	}

	public Student getNextStudent(Student student) {
		// Add your implementation here
		int n=students.length;
		int i=0;
		for( i=0;i<n;i++)
		{
			if(students[i]==student)
			{
				break;
			}
		}
		return students[i+1];
	}
}
