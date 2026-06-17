import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSkillAssignment {

    // Recursive function to find all subsets with target sum
    public static void findTeams(int[] skills, int index, int target,
                                 ArrayList<Integer> currentTeam) {

        // Target achieved
        if (target == 0) {
            System.out.println(currentTeam);
            return;
        }

        // End of array or target becomes negative
        if (index == skills.length || target < 0) {
            return;
        }

        // Include current employee
        currentTeam.add(skills[index]);
        findTeams(skills, index + 1, target - skills[index], currentTeam);

        // Backtrack
        currentTeam.remove(currentTeam.size() - 1);

        // Exclude current employee
        findTeams(skills, index + 1, target, currentTeam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] skills = new int[n];

        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        System.out.print("Enter target skill score: ");
        int target = sc.nextInt();

        System.out.println("Possible Teams:");
        findTeams(skills, 0, target, new ArrayList<>());

        sc.close();
    }
}