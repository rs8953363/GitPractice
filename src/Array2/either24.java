/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
package Array2;
*/

public class either24 {
    public static void main(String[] args) {

    }

    public static boolean either24(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                for (int j = i + 2; j < nums.length; i++) {
                    if (nums[j] == 4 && nums[j + 1] == 4)
                        return false;
                }
            }else
                  return true;
            if (nums[i]==4 && nums[i+1]==4){
                for (int j = i + 2; j < nums.length; i++) {
                    if (nums[j] == 2 && nums[j + 1] == 2)
                        return false;
                }
            }else
                return true;
        }

            return false;
    }

    }

