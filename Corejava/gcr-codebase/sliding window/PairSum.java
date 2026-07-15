class PairSum {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                return new int[]{transactions[left], transactions[right]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] transactions = {5000, 8000, 12000, 18000, 22000, 30000};
        int target = 40000;

        int[] result = findPairSum(transactions, target);

        if (result[0] != -1) {
            System.out.println("Pair Found: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}