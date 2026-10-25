package javaCollege;

import java.util.*;
public class twoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//                int[] nums = {2, 7, 11, 15};
//                int target = sc.nextInt();
////                int left = 0;
////                int right = nums.length - 1;
////                while (left < right) {
////                    int sum = nums[left] + nums[right];
////                    if (sum == target) {
////                        System.out.println("Found at indices: " + left + " and " + right);
////                        return;
////                    }
////                    if (sum < target) {
////                        left++;
////                    } else {
////                        right--;
////                    }
////                }
////                System.out.println("No pair found");

                // Most Water
        int ar[] = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        int l = 0;
        int r = ar.length - 1;
        while (l < r) {
            int h = Math.min(ar[l], ar[r]);
            int w = r-l;
            int area = h*w;
            maxArea = Math.max(maxArea, area);
            if(ar[l]<ar[r]) {
                l++;
            }
            else{
                r--;
            }
            System.out.println(maxArea);

            // Mid value using slow and fast pointers
        }

            }
        }