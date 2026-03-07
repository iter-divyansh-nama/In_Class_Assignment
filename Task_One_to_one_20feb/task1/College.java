package feb_20_2026.task1;

public class College {

    private int id;
    private String name;

    private Department department;

    public College(){}

    public College(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayCollege(){

        System.out.println("\nCollege ID: "+id);
        System.out.println("College Name: "+name);

        if(department!=null)
            department.displayDepartment();
        else
            System.out.println("No Department Assigned");
    }

    public void createDepartment(Department department){
        if(this.department==null){
            this.department=department;
            System.out.println("Department Created");
        }else{
            System.out.println("Department Already Exists");
        }
    }

    public void readDepartment(){
        if(department!=null)
            department.displayDepartment();
        else
            System.out.println("No Department Found");
    }

    public void deleteDepartment(int id){
        if(department!=null){
            department=null;
            System.out.println("Department Deleted");
        }else{
            System.out.println("Department Not Found");
        }
    }

    public Department getDepartment(){
        return department;
    }
}