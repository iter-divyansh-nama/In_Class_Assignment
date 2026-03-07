package feb_20_2026.task1;

public class JavaApp {

    public static void execution() {

        University university = new University(1,"JU");

        College college = new College(101,"JF");

        Department department = new Department(201,"MCA");

        Student student = new Student(301,"Raja","raja@gmail.com",9876543210L);

        Project project = new Project(401,"Flight System","AI Based Java App");

        university.createCollege(college);

        college.createDepartment(department);

        department.createStudent(student);

        student.createProject(project);

        university.displayUniversity();

        student.updateProject(401,"Train Reservation","Spring Boot AI App");

        student.readProject();

        student.deleteProject(401);

        student.readProject();
    }
}