
public class Main {

	public static void main(String[] args) {
		Student student1=new Student("Ahmet","ahmetpolat@gmail.com",235845,2);
		Instructer instructer1=new Instructer("Engin","engnbey@gmail.com",745663,12);
		
		
		
		UserManager user=new UserManager();
		user.addUser(instructer1);
	

        StudentManager studentManager = new StudentManager();
        studentManager.addUser(student1);
        studentManager.addCourses(student1);
      
        
        InstructerManager instructerManager=new InstructerManager();
        instructerManager.addUser(instructer1);
        instructerManager.addCourses(instructer1);

	}

}
