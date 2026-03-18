public class westeast{
    public static void checkdirection(String str){
        int x=0;
        int y=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='n'){
                y+=1;
            }else if(str.charAt(i)=='s'){
                y-=1;
            }else if(str.charAt(i)=='w'){
                x+=1;
            }else if(str.charAt(i)=='e'){
                x-=1;
            }
        }int x2=x*x;
        int y2=y*y;
       int shortest=(int)Math.sqrt(x2+y2);
        System.err.println(shortest);
    }



public static void main(String[] args) {
    String str="wmeenesennn";
    checkdirection(str);
}
}

//wmeenesennn
//so i have to give the shortest path
