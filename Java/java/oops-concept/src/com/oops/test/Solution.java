package com.oops.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.lang.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String array[][]=new String[6][6];
         int sum=0, sumOfHourGlass=0 ;  
      
         
       for(int i=0;i<6;i++)
       {
            
             array[i]=scanner.nextLine().split(" "); 
           
           
       }
       
       
       for(int i=0;i<6;i++)
       {
            
             System.out.print(array[i]);
           
           
       }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
              sum=(Integer.valueOf(array[i][j])+ Integer.valueOf(array[i][j+1])+Integer.valueOf(array[i][j+2]))+(Integer.valueOf(array[i+1][j+1]))  
              +(Integer.valueOf(array[i+2][j])+ Integer.valueOf(array[i+2][j+1])+Integer.valueOf(array[i+2][j+2]));
              
              if(sum>sumOfHourGlass)  
              {
                  sumOfHourGlass=sum;
              }
              
           }
       }
      System.out.println(sumOfHourGlass);
    
}
}
