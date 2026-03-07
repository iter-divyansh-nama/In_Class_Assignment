package feb_20_2026.task2;

public class Department {

    private int id;
    private String name;

    private Employee employee;

    public Department(){}

    public Department(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayDepartment(){

        System.out.println("\nDepartment ID: "+id);
        System.out.println("Department Name: "+name);

        if(employee!=null)
            employee.displayEmployee();
        else
            System.out.println("No Employee Assigned");
    }

    public void createEmployee(Employee employee){
        if(this.employee==null){
            this.employee=employee;
            System.out.println("Employee Added");
        }else{
            System.out.println("Employee Already Exists");
        }
    }

    public Employee getEmployee(){
        return employee;
    }
}