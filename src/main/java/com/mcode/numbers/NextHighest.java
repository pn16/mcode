package com.mcode.numbers;

/* ques : From a given number, find the next greatest number Ex: input -13534 output - 1433  */

import java.util.Arrays;

public class NextHighest {

    public static void main(String[] args) {

        int gnNumber = 1243;

        int len = Integer.toString(gnNumber).length();
        int[] arr = new int[len];
        int j = 0;


        while(gnNumber > 0){
            arr[--len] = gnNumber%10;
            gnNumber = gnNumber/10;
        }

       int nextHeight = 0;
       boolean isPossible = false;
       int pos = arr.length-1;
       int max = -1;

        for(int z=0;z<arr.length;z++)
            System.out.print(arr[z]+" ");



        for(int i=arr.length-1;i>=0;i--){
           if(arr[i] > arr[i-1])
           {
               isPossible = true;
               pos = i-1;
               max = arr[i-1];
               break;
           }
       }

       if(isPossible){
           int min = 10;
          for(int i=arr.length-1;i>pos;i--){
              if(min > arr[i] && arr[i] < arr[pos+1])
                  arr[pos] = arr[i];
                  arr[i] = max;
          }
         //  Arrays.sort(arr,pos+1,arr.length);

       }
       else
           System.out.println("Not Possible");

       System.out.println("----------------------------");
       for(int z=0;z<arr.length;z++)
           System.out.print(arr[z]+" ");
    }

}
