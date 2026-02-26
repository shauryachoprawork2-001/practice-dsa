public class trappingrainwater {

    public static void trp(int arr[]) {

        int n = arr.length;

   
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

       
        int right[] = new int[n];
        right[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        
        int water = 0;
        for(int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println(water);
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,5,3,9};
        trp(arr);
    }
}