/**
 * ConcretePrototype
 * We are building ad Id Card system for company employees,
 * The ID Card follow same format for all employees, like companyName, address, logo etc.
 * Only employee specific details are different.
 */
public class IdCard implements Prototype<IdCard> {
  // Each employee will have there own unique id and name
  private String employeeId;
  private String employeeName;

  // Fields that are same for all employees
  private String companyName;
  private String logo;

  // This field might vary because a same company might have different branches in
  // different locations. Each branch might have its own address, so it might vary
  // depending on the branch of employees.
  private Address address;

  // Constructor
  public IdCard(String employeeId, String employeeName, String companyName,
                String logo, Address address) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.companyName = companyName;
    this.logo = logo;
    this.address = address;
  }

  // Deep copy via copy constructor
  private IdCard(IdCard other) {
    this.employeeId = other.employeeId;
    this.employeeName = other.employeeName;
    this.companyName = other.companyName;
    this.logo = other.logo;
    this.address = new Address(other.address); // deep copy
  }

  /**
   * Implementing clone method
   *
   * @return cloned object of IdCard
   */
  @Override
  public IdCard clone() {
    return new IdCard(this);
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  @Override
  public String toString() {
    return "IdCard{" +
        "employeeId='" + employeeId + '\'' +
        ", employeeName='" + employeeName + '\'' +
        ", companyName='" + companyName + '\'' +
        ", logo='" + logo + '\'' +
        ", address=" + address +
        '}';
  }
}

