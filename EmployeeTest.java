/**
 * Test
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("SanthanaLakshmi");
        System.out.println(employee);

        Employee employee2 = new Employee(123, "SanthanaLakshmi");
        System.out.println(employee2);
        System.out.println(employee.equals(employee2));
        System.out.println(employee.hashCode() +" / "+ employee2.hashCode());
    }
}