package fibonacci;

public class Fibonacci {

    public int findFibonacci(int n) {
        if (n<=0){
            return -1;
        } else if (n==1) {
            return 0;
        } else if (n==2) {
            return 1;
        }
        return n;
    }
}
