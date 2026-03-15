public class problem11 {
    public static void remmoved(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx ==str.length()){
            System.err.println(newStr);
            return;
        }char currchar=str.charAt(idx);
        if (map[currchar-'a']==true){
            remmoved(str,idx+1,newStr,map);}
    else{
        map[currchar-'a']=true;
        remmoved(str, idx+1, newStr.append(currchar), map);}

    }
    public static void main(String[] args) {
        String str="appnacollege";
        remmoved(str, 0, new StringBuilder(""), new boolean[26]);
         
    }
}
//new variable lenge(string buildr)
//idx variable to track konse index pe hai 
//ek teesra hum wo lenge ek array boolean type ka map konsa aa chuka hai konsa nhi 26 size
//0map a so on
//type. cnversion jab bhi koi char kisi expressin mai aate hai toh woh integer mai convert hoate hai
//currchar-a 