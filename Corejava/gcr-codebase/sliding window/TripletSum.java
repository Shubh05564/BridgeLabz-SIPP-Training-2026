import java.util.*;

public class TripletSum {

    public static List<List<Integer>> findTriplets(int[] jobs, int target) {

        Arrays.sort(jobs);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < jobs.length - 2; i++) {

            // Skip duplicate anchor values
            if (i > 0 && jobs[i] == jobs[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = jobs.length - 1;

            while (left < right) {

                int sum = jobs[i] + jobs[left] + jobs[right];

                if (sum == target) {

                    result.add(Arrays.asList(jobs[i], jobs[left], jobs[right]));

                    // Skip duplicate left values
                    while (left < right && jobs[left] == jobs[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && jobs[right] == jobs[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] jobs = {200, 300, 400, 500, 600, 700};
        int target = 1200;

        List<List<Integer>> triplets = findTriplets(jobs, target);

        if (triplets.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Triplets:");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
    }
}