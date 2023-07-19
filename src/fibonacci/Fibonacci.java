package fibonacci;

public class Fibonacci {

    public int findFibonacci(int n) {
        if (n<=0){
            return -1;
        } else if (n==1 || n==2) {
            return n-1;
        }else {
           return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
}
