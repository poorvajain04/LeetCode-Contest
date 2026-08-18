class Solution {
    public int kthDigit(long k) {
       if(k<=9) return (int)k;
        k-=9;
        long start=1;
        int digits=2;
        while(true){
            long end=start*10-1;
            long nb=end-start+1;
            long gl=nb*10*digits;
            if(k>gl){
                k-=gl;
                start*=10;
                digits++;
            }
            else{
                break;
            }
        }
        long bl= 10L*digits;
        long b=start+(k-1)/bl;
        long pos=(k-1)%bl;
        int index=(int)(pos/digits);
        int di=(int)(pos%digits);
        long num;
        if(b%2==0){
            num=10*b+index;
        }
        else num=10*b+(9-index);
        String str=String.valueOf(num);
        return str.charAt(di)-'0';
    }
}