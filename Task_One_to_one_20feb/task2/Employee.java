package feb_20_2026.task2;

public class Employee {

    private int id;
    private String name;
    private double salary;

    private Project project;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        if(project != null)
            project.displayProject();
        else
            System.out.println("No Project Assigned");
    }

    public void createProject(Project project){
        if(this.project == null){
            this.project = project;
            System.out.println("Project Created");
        }else{
            System.out.println("Project Already Exists");
        }
    }

    public void readProject(){
        if(project != null)
            project.displayProject();
        else
            System.out.println("No Project Found");
    }

    public void updateProject(int id,String name,String desc){
        if(project != null && project.getId()==id){
            project.setName(name);
            project.setDescription(desc);
            System.out.println("Project Updated");
        }else{
            System.out.println("Project Not Found");
        }
    }

    public void deleteProject(int id){
        if(project != null && project.getId()==id){
            project=null;
            System.out.println("Project Deleted");
        }else{
            System.out.println("Project Not Found");
        }
    }
}