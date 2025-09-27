class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        for(int i = 0; i < len && cnt < n; i++){
            if(flowerbed[i] == 0){
                if(i==0){
                    if(i == len-1){
                        cnt++;
                    }else{
                        if(flowerbed[i+1]==0){
                        flowerbed[i] = 1;
                        cnt++;
                        }
                    }
                }else if(i==len-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i] = 1;
                        cnt++;
                    }
                }else{
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        cnt++;
                    }
                }
            }
        }
        return cnt >= n;
    }
}
