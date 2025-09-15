class Solution {
    public int addDigits(int num) {
        if(num<=9 && num>=0){
            return num;
        }
        int sum=0;
        while(num!=0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
        return addDigits(sum);
    }
}