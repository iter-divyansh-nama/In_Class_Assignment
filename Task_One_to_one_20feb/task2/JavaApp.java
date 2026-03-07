package feb_20_2026.task2;

public class JavaApp {

    public static void execution() {

        Company company = new Company(1,"Capgemini");

        Branch branch = new Branch(101,"Bangalore Branch");

        Department department = new Department(201,"Java Application Developer");

        Employee employee = new Employee(301,"Aditya",7000000);

        Project project = new Project(401,"Banking System","Spring Boot Application");

        company.createBranch(branch);

        branch.createDepartment(department);

        department.createEmployee(employee);

        employee.createProject(project);

        company.displayCompany();

        employee.updateProject(401,"Online Banking System","Microservices Application");

        employee.readProject();

        employee.deleteProject(401);

        employee.readProject();
    }
}