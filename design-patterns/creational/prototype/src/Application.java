// Client
public class Application {
  public static void main(String[] args) {
    // Creating a Prototype
    IdCard prototype = new IdCard(
        "id-1",
        "prototype-employee",
        "XYZ Company",
        "logo-url",
        new Address("Bangalore", "India")
    );

    // Creating objects by cloning the prototype
    IdCard emp1 = prototype.clone();
    IdCard emp2 = prototype.clone();

    // Update employee details wrt each employee
    emp1.setEmployeeId("id-202503503");
    emp1.setEmployeeName("Raghu Pratap Singh");

    emp2.setEmployeeId("id-350395u30");
    emp2.setEmployeeName("Anush Rajput");

    System.out.println(emp1);
    System.out.println(emp2);
  }
}
