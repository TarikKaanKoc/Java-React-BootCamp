
public class Main {
	//sdas

	public static void main(String[] args) {

		Course course1 = new Course(01,100,"C# + ANGULAR", "Engin Demiro�", "�cretsiz");
		Course course2 = new Course(02,101, "Java + React", "Engin Demiro�", "�cretsiz");
		Course course3 = new Course(03,102, "Programlama Giri� ��in Temel Kurs", "Engin Demiro�", "�cretsiz");

		Course[] course = { course1, course2, course3 };

		for (Course cour : course) {
        
			System.out.println(cour.courseName +" "+cour.teacher +" "+cour.detail);			
		}
        
		Category category1 = new Category(100,"Basic Level Programming language","Engin Demiro�");
		Category category2 = new Category(101,"Frontend","Engin Demiro�");
		Category category3 = new Category(102,"Backend","Engin Demiro�");

		Category[] category = { category1, category2, category3 };
 
		for(Category cat : category) { 
			
			System.out.println(cat.id+" "+cat.branch+" "+cat.Instructor);
		}
	
		// 2 i� s�n�f� 
		CourseManager courseM = new CourseManager();
		courseM.addToCourse(course1);
		courseM.addToCourse(course2);
		courseM.addToCourse(course3);
		
		CourseManager courseM2 = new CourseManager();
		courseM2.finishCourse(course1);
		courseM2.finishCourse(course2);
		courseM2.finishCourse(course3);

	}
}