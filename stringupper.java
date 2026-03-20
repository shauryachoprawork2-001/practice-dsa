public class stringupper{
    public static String toupper(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i =1;i<str.length();i++){
            char ch =str.charAt(i);
            if(str.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }

            }
            return sb.toString();
 
    }
    public static void main(String[] args) {
        String str ="hello world";
        System.out.println(toupper(str));
    }
}