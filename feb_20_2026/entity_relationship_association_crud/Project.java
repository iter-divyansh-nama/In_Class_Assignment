package feb_20_2026.entity_relationship_association_crud;

/**
 * Project class represents a project entity.
 * It contains project details like id, name and description.
 */
public class Project {

    // Instance variables (Project attributes)
    private int id;
    private String name;
    private String description;

    // Default constructor
    public Project() {
    }

    // Parameterized constructor to initialize project
    public Project(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getter and Setter methods (Encapsulation)

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method to display project details
     */
    public void displayProjectDetails() {
        System.out.println("Project Details:");
        System.out.println("---------------------------");
        System.out.println("Project ID: " + id);
        System.out.println("Project Name: " + name);
        System.out.println("Description: " + description);
        System.out.println();
    }
}