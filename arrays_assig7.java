public class arrays_assig7 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertPos = 0;

        // Move non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill the remaining positions with zeros
        while (insertPos < n) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}
