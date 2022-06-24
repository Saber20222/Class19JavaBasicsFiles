package com.syntax.class19;

public class Task1 {
    /*
    Create a method that will accept an array as parameters and will
    return a sum of all elements from that array.
    Methods should be visibly only within same package and
    accessible by the creating an instance of the class.
     */
    int returnSUM(int [] arr){
        int sum=0;
        for(int i=1; i< arr.length; i++){
            sum=sum=arr[i];
        }
    return sum;

    }

    public static void main(String[] args) {
        int[]arr= { 1,2,3,4,5};
        Task1 task1=new Task1();
        System.out.println(task1.returnSUM(arr));
    }
}
