public class functions2 {
    public static int fact(int n) {
        int factorial = 1;

    for(int i = 1; i <= n; i++){
        factorial = factorial * i;
    }

    return factorial;
    
}public static void main(String[] args) {
    int n=4;
     int l=fact(5);
    System.err.println(l);
}
}

