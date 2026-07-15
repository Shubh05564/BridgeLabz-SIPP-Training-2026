public class MaxSubarraySum {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            // Add current element to window
            windowSum += cpuLoad[end];

            // When window size becomes k
            if (end >= k - 1) {

                // Update maximum sum
                maxSum = Math.max(maxSum, windowSum);

                // Remove leftmost element
                windowSum -= cpuLoad[start];

                // Slide window
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpuLoad = {10, 20, 30, 40, 50, 60};
        int k = 3;

        int result = maxSubarrayOfSizeK(cpuLoad, k);

        System.out.println("Maximum Sum = " + result);
    }
}