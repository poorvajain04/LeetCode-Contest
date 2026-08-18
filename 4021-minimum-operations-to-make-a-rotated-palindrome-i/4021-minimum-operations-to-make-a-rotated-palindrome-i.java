class Solution {
    public int minOperations(String s) {
        int n=s.length();
        String dummy=s;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int res=i;
            for(int j=0;j<n/2;j++){
                char a=dummy.charAt((i+j)%n);
                char b=dummy.charAt((n-1-j+i)%n);
                int x=(b-a+26)%26;
                int y=(a-b+26)%26;
                res+=Math.min(x,y);
            }
            ans=Math.min(ans,res);
        }
    return ans;
    }
}