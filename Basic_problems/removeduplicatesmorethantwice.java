package Basic_problems;

class Removeduplicates{
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If array has 2 or fewer elements, return as is.

        int index = 2; // Start from the third element

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Allow at most two occurrences
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // New length of the modified array
    }

    public static void main(String[] args) {
        Removeduplicates sol = new Removeduplicates();
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int len1 = sol.removeDuplicates(nums1);
        System.out.print("Output: " + len1 + ", nums = ");
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int len2 = sol.removeDuplicates(nums2);
        System.out.print("Output: " + len2 + ", nums = ");
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
