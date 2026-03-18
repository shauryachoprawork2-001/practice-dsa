public class largeststr {
    public static void largeststr(String fruits[] ){
      
        String large=fruits[0];
        for(int i =0;i<fruits.length-1;i++){
            if(large.compareTo(fruits[i])<0){
                large=fruits[i];
            }

        }  System.out.println("Largest string: " + large);
    }
    public static void main(String[] args) {
        String fruits[]={"mango","apple","banana"};
    }
}
// "apple" "mango" "banana"