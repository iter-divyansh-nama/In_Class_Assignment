package feb_20_2026.entity_relationship_association_crud;

/**
 * JavaApp class contains business logic execution.
 */
public class JavaApp {

    public static void execution() {

        // Create student object
        Student student = new Student(1, "Raja", "raja@gmail.com", 9876543210L);

        // Display student details
        student.displayStudentDetails();

        // Create project object
        Project project = new Project(1, "Flight Registration System", "AI Based Java Application");

        // Perform CRUD operations
        student.createProject(project);      // CREATE
        student.readProject();               // READ
        student.updateProject(1, "Train Reservation System", "Spring AI Based Java Web App");  // UPDATE
        student.deleteProject(1);            // DELETE
        student.readProject();
    }
}