class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int res=0;
        int n=speed.length;
        int p2=Integer.MAX_VALUE;
        int s2=p2;
        for(int i=n-1;i>=0;i--){
            int p=position[i];
            int s=speed[i];
            if(p2-p>distance && s<=s2){
                res++;
                s2=s;
            }
            p2=p;
        }
        return res;
    }
}