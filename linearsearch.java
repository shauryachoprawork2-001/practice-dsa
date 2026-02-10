// public class linearsearch {

//     public static void main(String[] args) {
//         int n=5;
//         int marks[]={12,2,3,4,5,6,23,34,5};
//         for(int i =0;i<=marks.length-1;i++){
//             if (marks[i]==n){
//                 System.err.println(i);
//                 return;
//             }
//         }
//     }
// }
public class linearsearch{
    public static void ls(int marks[],int key){
        for(int i =0;i<=marks.length-1;i++){
            if(marks[i]==key){
                System.err.println("this is it ye number hai : "+i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int key= 4;
        int marks[]={1,2,3,5,6,4,65,43,2,5};
        ls(marks, key);
            

            }
        }
        
    
