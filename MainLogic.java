package springb;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("Cfg.xml");
		StudentDao dao=(StudentDao)context.getBean("studentDao");
		do {
			System.out.println("Enter your choice :");
		int n=sc.nextInt();
		switch(n) {
		case 1:System.out.println("Insertion");
		Student s1=new Student();
		System.out.println("Enter Id :");
		s1.setId(sc.nextInt());
		System.out.println("Enter Name :");
		s1.setName(sc.next());
		System.out.println("Enter Gender :");
		s1.setGender(sc.next());
		System.out.println("Enter marks :");
		s1.setMarks(sc.nextInt());
		System.out.println("Enter email : ");
		s1.setEmail(sc.next());
		System.out.println("Enter Branch : ");
		s1.setBranch(sc.next());
		int status=dao.insertStudent(s1);
		System.out.println(status);
		break;
		
		case 2:System.out.println("Updation");
		do {
			System.out.println("column to be updated : 1)Name 2)Marks 3)Email 4)Branch 5)exit");
			int m=sc.nextInt();
			Student s2=new Student();
			switch(m) {
			case 1:System.out.println("Enter student Id to be updated :");
			s2.setId(sc.nextInt());
			System.out.println("updating name");
			s2.setName(sc.next());
			int status1=dao.updateNameStudent(s2);
			System.out.println(status1);
			break;
			case 2:System.out.println("Enter student Id to be updated :");
			s2.setId(sc.nextInt());
			System.out.println("updating Marks");
			s2.setMarks(sc.nextInt());
			int status2=dao.updateMarksStudent(s2);
			System.out.println(status2);
			break;
			case 3:System.out.println("Enter student Id to be updated :");
			s2.setId(sc.nextInt());
			System.out.println("updating Email");
			s2.setEmail(sc.next());
			int status3=dao.updateEmailStudent(s2);
			System.out.println(status3);
			break;
			case 4:System.out.println("Enter student Id to be updated :");
			s2.setId(sc.nextInt());
			System.out.println("updating Branch");
			s2.setBranch(sc.next());
			int status4=dao.updateBranchStudent(s2);
			System.out.println(status4);
			break;
			case 5:System.out.println("Existing updating");
			System.exit(0);
			
			}
		}while(true);
		
		
		/*Student s2=new Student();
		System.out.println("Enter student Id to be updated :");
		s2.setId(sc.nextInt());
		System.out.println("Enter name to be updated :");
		s2.setName(sc.next());
		System.out.println("Enter marks to be updated :");
		s2.setMarks(sc.nextInt());
		int status1=dao.updateStudent(s2);
		System.out.println(status1);
		break;*/
		
		case 3:System.out.println("deletion");
		Student s3=new Student();
		s3.setId(sc.nextInt());
		int status2=dao.deleteStudent(s3);
		System.out.println(status2);
		break;
		
		case 4:System.out.println("Selecting");
		Student s4=new Student();
		List<Student> w=dao.selectStudent(s4);
		for (Student r : w) {
			System.out.println(r.getId()+"         "+r.getName()+"          "+r.getGender()+"            "+r.getMarks()+"           "+r.getEmail()+"         "+r.getBranch());
		}
		break;
		
		case 5:System.out.println("existing");
		System.exit(0);
		
		break;
		}
		}while(true);
		/*StudentDao dao=(StudentDao)context.getBean("studentDao");
		Student s1=new Student();
		s1.setId(6);
		s1.setName("pavan");
		s1.setGender("M");
		s1.setMarks(678);
		int status=dao.insertStudent(s1);
		System.out.println(status);*/
		//Student student1=(Student)context.getBean("student1");
		//JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		//insert query
		//String query="insert into student(id,name,gender,marks) values(?,?,?,?)";
		//firequery
		//int result=template.update(query,2,"kumar","M",686);
		//System.out.println(result);
		//System.out.println(student1.getId()+student1.getName()+student1.getGender()+student1.getMarks());
	}




}
