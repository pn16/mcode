package com.mcode.stack;

public class NGE {

    public static void main(String[] args){

        int[] arr = {4,5,3,20,6};

        Stack s = new Stack(100);

        if(arr.length > 0)
           s.push(arr[0]);

        int element = 0;
        int next;

        for(int i=1;i<arr.length;i++){

            if(!s.isEmpty())
                element = s.pop();

            next = arr[i];

            while(element < next){
                System.out.println(element+"-> "+next+", ");
                if(s.isEmpty())
                    break;

                element = s.pop();
            }

            if(element > next)
                s.push(element);

            s.push(next);
        }

        while(!s.isEmpty()){
            System.out.println(s.pop()+"-> -1"+", ");
        }


    }
}
