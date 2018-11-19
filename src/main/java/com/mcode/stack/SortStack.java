package com.mcode.stack;

public class SortStack {

    public static void main(String[] args) {

        Stack inStack = new Stack(100);

        inStack.push(5);
        inStack.push(10);
        inStack.push(20);
        inStack.push(2);
        inStack.push(6);

        Stack outStack = new Stack(100);
        int inTemp = 0;
        int outTemp = 0;

        while(!inStack.isEmpty()){

            inTemp = inStack.pop();

            if (!outStack.isEmpty()){
               outTemp = outStack.pop();

               while(outTemp < inTemp){
                   inStack.push(outTemp);
                   if(outStack.isEmpty())
                   {
                       outStack.push(inTemp);
                       break;
                   }
                   outTemp = outStack.pop();
               }

               if(inTemp < outTemp)
               {
                   outStack.push(outTemp);
                   outStack.push(inTemp);
               }
            }
            else
                outStack.push(inTemp);

        }


        while (!outStack.isEmpty()){
            System.out.println(outStack.pop());
        }
    }

}
