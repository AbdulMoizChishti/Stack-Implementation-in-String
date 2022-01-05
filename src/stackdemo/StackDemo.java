/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackdemo;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.*;
  
public class StackDemo {
    
//    public int count=0;
//    public StackDemo(){
//    ++count;
//        System.out.println(count);
//    }
    
    
    public static void main(String args[])
    {  
        
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();
  


        
        
        // Use push() to add elements into the Stack
        STACK.push("Abdul");
        STACK.push("Moiz");
        STACK.push("Chishti");
        
  
        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);
  
        // Pushing elements into the stack
//        STACK.push("Hello");
//        STACK.push("World");
//  

// Poping elements out of stack
STACK.pop();

        // Displaying the final Stack
        System.out.println("Final Stack: " + STACK);
        
       
        
        
        
        
    }
}