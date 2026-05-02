public class removeduplicate {


    // Removes duplicates from a sorted array in-place
    // Returns the number of unique elements
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Index where the next unique element should be placed
        int uniqueIndex = 0;

        for (int current = 1; current < nums.length; current++) {

            // Found a new unique value
            if (nums[current] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[current];
            }
        }

        return uniqueIndex + 1;
    }
}

class Main {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        removeduplicate solution = new removeduplicate();
        int uniqueCount = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + uniqueCount);

        System.out.print("Updated array: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

    

