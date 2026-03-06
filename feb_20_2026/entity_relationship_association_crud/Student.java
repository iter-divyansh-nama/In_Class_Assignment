package feb_20_2026.entity_relationship_association_crud;

/**
 * Student class represents a student entity.
 * It demonstrates Association (Student HAS-A Project).
 */
public class Student {

    // Student attributes
    private int id;
    private String name;
    private String mailId;
    private long contactNumber;

    // Association: Student has a Project
    private Project project;

    // Parameterized constructor
    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    // Default constructor
    public Student() {
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Display student details.
     * Also displays project details if assigned.
     */
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("---------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println();

        // Check if project exists
        if (project != null) {
            project.displayProjectDetails();
        } else {
            System.out.println("No Project Assigned.");
        }

        System.out.println("---------------------------");
    }

    /**
     * CREATE operation for Project
     */
    public void createProject(Project project) {

        // Ensure student does not already have a project
        if (this.project == null) {

            // Validate project details
            if (project != null
                    && project.getId() != 0
                    && project.getName() != null
                    && !project.getName().isEmpty()
                    && project.getDescription() != null
                    && !project.getDescription().isEmpty()) {

                this.project = project;
                System.out.println("Project Created Successfully!");

            } else {
                System.out.println("Invalid Project Details!");
            }

        } else {
            System.out.println("Project already exists!");
        }
    }

    /**
     * READ operation for Project
     */
    public void readProject() {
        if (project != null) {
            project.displayProjectDetails();
        } else {
            System.out.println("No Project Assigned.");
        }
    }

    /**
     * UPDATE operation for Project
     */
    public void updateProject(int id, String name, String description) {

        if (project != null) {

            // Check if ID matches
            if (project.getId() == id) {
                project.setName(name);
                project.setDescription(description);
                System.out.println("Project Updated Successfully!");
            } else {
                System.out.println("Project ID does not match.");
            }

        } else {
            System.out.println("No Project to Update.");
        }
    }

    /**
     * DELETE operation for Project
     */
    public void deleteProject(int id) {

        if (project != null) {

            // Check if ID matches
            if (project.getId() == id) {
                project = null;
                System.out.println("Project Deleted Successfully!");
            } else {
                System.out.println("Project ID not found.");
            }

        } else {
            System.out.println("No Project to Delete.");
        }
    }
}