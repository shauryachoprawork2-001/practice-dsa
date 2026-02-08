import java.util.*;
//this has like what we call as like the class which help us import all the libraries
public class input {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       int a = sc.nextInt();
       int b=sc.nextInt();
       int sum= a+b;
       System.out.println(sum);
    }
    
}
//how to take input in java class
//scanner=built in class
//sc=obj
//next= this helps to build space in the heap memory
//nextLine =stores entire input line

//if i call like this class Solution {
    // public void printNumber(Scanner sc) {
    /* toh fir mujeh scsnner sc = new scanner(system.in)  ki need nhi
    */