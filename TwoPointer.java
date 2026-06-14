public class TwoPointer {
    public static int[] findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Pair not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 10;

        int[] result = findPair(arr, target);

        System.out.println("Pair: " + result[0] + ", " + result[1]);
    }
}