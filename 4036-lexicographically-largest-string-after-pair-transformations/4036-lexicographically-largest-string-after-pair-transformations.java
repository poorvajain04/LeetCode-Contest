class Solution {
    public String[] largestString(int[] nums) {
        int[] arr=nums;
        String[] ans=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            StringBuilder sb=new StringBuilder();
            int z=x/(1<<25);
            x%=(1<<25);
            for(int k=0;k<z;k++){
                sb.append('z');
            }
            for(int j=24;j>=0;j--){
                int val=1<<j;
                if(val<=x){
                    x-=val;
                    char ch=(char)('a'+j);
                    sb.append(ch);
                }
            }
            ans[i]=sb.toString();
        }
        return ans;
    }
}