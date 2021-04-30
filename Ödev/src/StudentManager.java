
public class StudentManager {
	public void addUser(User user)
	{
		System.out.println(user.getName()+" adlý ve "+ user.getEmail()+" email adresli ögrencimiz  eklenmistir.");
	}
	public void addCourses(Student student)
	{
		System.out.println(student.getStudCourses()+" adet dersi bulunmaktadır.");
}
}
