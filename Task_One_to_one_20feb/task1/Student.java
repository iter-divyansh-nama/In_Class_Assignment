package feb_20_2026.task1;

public class Student {

    private int id;
    private String name;
    private String mailId;
    private long contactNumber;

    private Project project;

    public Student() {}

    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
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
    public void displayStudentDetails() {

        System.out.println("\nStudent Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mailId);
        System.out.println("Contact: " + contactNumber);

        if(project != null)
            project.displayProjectDetails();
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
            project.displayProjectDetails();
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