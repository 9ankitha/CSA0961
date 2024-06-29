class LargestSubarraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
       
        Result result = findMaxSubarray(nums);
       
        System.out.println("Input nums = " + arrayToString(nums));
        System.out.println("Output: " + result.maxSum);
        System.out.println("Explanation: The subarray " + arrayToString(result.subarray) + " has the largest sum " + result.maxSum);
    }
    static class Result {
        int maxSum;
        int[] subarray;

        Result(int maxSum, int[] subarray) {
            this.maxSum = maxSum;
            this.subarray = subarray;
        }
    }

    public static Result findMaxSubarray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
       
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                tempStart = i;
            } else {
                maxEndingHere += nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }
        int[] subarray = new int[end - start + 1];
        System.arraycopy(nums, start, subarray, 0, end - start + 1);

        return new Result(maxSoFar, subarray);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
