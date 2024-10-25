/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */
// Time Complexity :O(logn)
// Space Complexity : O(1)
// Approach : We need to create a range utilizing reader in such a way that target is included in it (high not exceeding target) and then perform Binary Search.

class Solution {
    public int search(ArrayReader reader, int target) {
        int low=0;
        int high = 1;
        while(reader.get(high)<target){
            low=high;
            high=2*high;
        }
        // now range is estabilished - perform binary search
        while (low<=high){
            int mid = low + (high -low)/2;
            if (reader.get(mid)==target){
                return mid;
            } else if (reader.get(mid)> target){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return -1;

    }
}






/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */
// Time Complexity :O(logn)
// Space Complexity : O(1)
// Approach : Brute Force Approach by assuming high as Integer max Value and performing Binary Search. 
class Solution {
    public int search(ArrayReader reader, int target) {
        int low = 0;
        int high = Integer.MAX_VALUE-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(reader.get(mid)==target){
                return mid;
            } else if(reader.get(mid)>target){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return -1;
    }
}