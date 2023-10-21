package com.test;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       ArrayList<Integer> L=new ArrayList<>();
       
       Scanner scanner=new Scanner(System.in);
       int N=scanner.nextInt();
       
       for(int i=0;i<N;i++)
       {
           L.add(i,scanner.nextInt());
       }
       
      int Q=scanner.nextInt();
      
      
      for(int i=1;i<=Q;i++)
      {
          String s=scanner.next();
          
          if(s.equals("Insert"))
          {   int x=scanner.nextInt();
              int y=scanner.nextInt();
              L.add(x,y);
          }
          
          if(s.equals("Delete"))
          {
              int x=scanner.nextInt();
              L.remove(x);
          }
      } 
      
      
         for(int i=0;i<L.size();i++)
       {
           System.out.print(L.get(i)+" ");
       }
       
       
       
       
       
    }
}