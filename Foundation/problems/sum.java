import java.util.* ;

class Main {
    static int sum(int... nums){
        int sum =0;
        for(int i:nums){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }
}