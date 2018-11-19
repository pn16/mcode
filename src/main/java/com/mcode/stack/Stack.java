package com.mcode.stack;

public class Stack {

    private int top;
    private int[] arr;

    public Stack(int cap){
        this.arr = new int[cap];
        this.top = -1;

    }

    public void push(int data){
        if(!isFull())
            arr[++top] = data;
        else
            System.out.println("Stack overflow");
    }

    public int pop(){
        if(!isEmpty())
            return arr[top--];
        else{
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top == arr.length -1)
            return true;
        else
            return false;
    }

}
