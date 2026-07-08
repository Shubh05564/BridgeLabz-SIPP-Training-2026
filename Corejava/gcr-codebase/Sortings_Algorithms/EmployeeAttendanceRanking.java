import java.util.Arrays;
import java.util.Comparator;

public class EmployeeAttendanceRanking {

    static class Employee {
        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;

        Employee[] employees = new Employee[n];

        // Store employee details
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        // Sort by attendance (descending)
        // If attendance is same, sort by employee ID (ascending)
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.attendance != e2.attendance) {
                    return e2.attendance - e1.attendance;
                }

                return e1.id - e2.id;
            }
        });

        // Store top K employee IDs
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;

        int[] result = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(result));
    }
}