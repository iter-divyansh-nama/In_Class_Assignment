package feb_20_2026.task1;

public class Department {

    private int id;
    private String name;

    private Student student;

    public Department(){}

    public Department(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayDepartment(){
        System.out.println("\nDepartment ID: "+id);
        System.out.println("Department Name: "+name);

        if(student!=null)
            student.displayStudentDetails();
        else
            System.out.println("No Student Assigned");
    }

    public void createStudent(Student student){
        if(this.student==null){
            this.student=student;
            System.out.println("Student Added");
        }else{
            System.out.println("Student Already Exists");
        }
    }

    public void readStudent(){
        if(student!=null)
            student.displayStudentDetails();
        else
            System.out.println("No Student Found");
    }

    public void updateStudent(int id,String name,String mail,long contact){
        if(student!=null && student.getId()==id){
            student.setName(name);
            student.setMailId(mail);
            student.setContactNumber(contact);
            System.out.println("Student Updated");
        }else{
            System.out.println("Student Not Found");
        }
    }

    public void deleteStudent(int id){
        if(student!=null && student.getId()==id){
            student=null;
            System.out.println("Student Deleted");
        }else{
            System.out.println("Student Not Found");
        }
    }

    public Student getStudent(){
        return student;
    }
}