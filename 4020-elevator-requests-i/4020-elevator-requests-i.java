class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int len=requests.length;
        int[] res=new int[len];
        res[0]=requests[0];
        for(int i=1;i<len;i++){
            res[i]=Math.abs(requests[i]-requests[i-1]);
        }
        int sum=0;
        for(int num:res) sum+=num;
        return sum;   
    }
}