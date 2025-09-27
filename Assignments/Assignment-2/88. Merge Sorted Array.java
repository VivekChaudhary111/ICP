class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int cnt = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                i++;
            }else{
                int temp = nums1[i];
                nums1[i++] = nums2[j];
                nums2[j++] = temp;
                cnt++;
            }
        }
        i = 0;
        int idx = m;
        while(i<cnt && j < n){
            if(nums2[i] <= nums2[j]){
                nums1[idx++] = nums2[i++];
            }else{
                nums1[idx++] = nums2[j++];
            }
        }
        if(i<cnt){
            while(i<cnt){
                nums1[idx++] = nums2[i++];
            }
        }else{
            while(j < n){
                nums1[idx++] = nums2[j++];
            }
        }
    }
}