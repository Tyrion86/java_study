package com.tyrion.sort_function;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
// import java.util.Arrays;

class ListNode{
    int val;
    ListNode next=null;
    
    public ListNode(){}
    
    public ListNode(int val){
        this.val=val;
    }
}

public class test {

    // static int max=Integer.MIN_VALUE;
    // static int nums=0;

    // private static void helper(int[] balls,int sum, int index,int k1,int k2,int chosen,LinkedList<Integer> array){
    //     if(index>=balls.length) return;
        
        
    //     for(int i=index;i<balls.length;i++){
    //         sum+=balls[i];
    //         chosen++;
    //         // array.add(i);
    //         if(sum%k1==0 && sum%k2!=0 && chosen>1){
    //             // nums++;
    //             array.add(sum);
    //             max=max>sum?max:sum;
    //         }
    //         helper(balls,sum,i+1,k1,k2,chosen,array);

    //         sum-=balls[i];
    //         chosen--;
    //         // array.removeLast();
    //     }

        
    // }
    public int oct_to_binary(int input_int) {
        // write code here
        int res=0;
        for(int i=0;i<32;i++){
            if((input_int & (1<<i)) !=0){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        //4
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int k1=sc.nextInt();
        // int k2=sc.nextInt();
        // int[] balls=new int[n];
        // for(int i=0;i<n;i++){
        //     balls[i]=sc.nextInt();
        // }

        
        // LinkedList<Integer> array=new LinkedList<>();
        // helper(balls, 0, 0, k1, k2, 0, array);
        // int nums=0;
        // for(int i : array){
        //     if(i==max)  nums++;
        // }
        // System.out.println(max+" "+nums%998244353);


        
        
        //3
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int m1=sc.nextInt();
        // int m2=sc.nextInt();
        // int[] file_1_start=new int[m1];
        // int[] file_1_end=new int[m1];
        // int[] file_2_start=new int[m2];
        // int[] file_2_end=new int[m2];

        // for(int i=0;i<m1;i++){
        //     file_1_start[i]=sc.nextInt();
        // }
        // for(int i=0;i<m1;i++){
        //     file_1_end[i]=sc.nextInt();
        // }
        // for(int i=0;i<m2;i++){
        //     file_2_start[i]=sc.nextInt();
        // }
        // for(int i=0;i<m2;i++){
        //     file_2_end[i]=sc.nextInt();
        // }

        // boolean[] file=new boolean[n];
        // boolean[] file_0=new boolean[n];
        // for(int i=0;i<m1;i++){
        //     int start=file_1_start[i]-1;
        //     int end=file_1_end[i]-1;
        //     for(int j=start;j<=end;j++){
        //         file[j]=true;
        //     }
        // }

        
        // for(int i=0;i<m2;i++){
        //     int start=file_2_start[i]-1;
        //     int end=file_2_end[i]-1;
        //     for(int j=start;j<=end;j++){
        //         file_0[j]=true;
        //     }

        // }
        // int res=0;
        // for(int i=0;i<n;i++){
        //     if(file_0[i] && file[i]){
        //         res++;
        //     }
        // }
        // System.out.println(String.valueOf(res));

        //2.
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int choose=sc.nextInt();
        // String s=sc.next();
        // if(choose==1){
        //     StringBuffer sb_origin=new StringBuffer(s);
        //     StringBuffer res=new StringBuffer();
            
        //     for(int i=0;i<n;i++){
        //         int index=(0+sb_origin.length()-1)/2;
        //         res.append(sb_origin.charAt(index));
        //         sb_origin.delete(index,index+1);

        //     }
        //     System.out.println(res.toString());

        // }else if(choose==2){
        //     StringBuffer sb_origin=new StringBuffer(s);
        //     StringBuffer res=new StringBuffer();

        //     for(int i=0;i<n;i++){
        //         if(i%2==1){
        //             res.append(sb_origin.charAt(i));
        //         }else{
        //             res.insert(0,sb_origin.charAt(i));
        //         }
                
        //     }
        //     System.out.println(res.toString());
        // }
        
        
        
        //1.
            // Scanner sc = new Scanner(System.in);
            // int n=sc.nextInt();
            // int[] origin=new int[n];
            // for(int i=0;i<n;i++){
            //     origin[i]=sc.nextInt();
            // }
            // int[] discount=new int[n];
            // for(int i=0;i<n;i++){
            //     discount[i]=sc.nextInt();
            // }
            
            // int m=sc.nextInt();
            // int[] rule_1=new int[m];
            // for(int i=0;i<m;i++){
            //     rule_1[i]=sc.nextInt();
            // }
            // int[] rule_2=new int[m];
            // for(int i=0;i<m;i++){
            //     rule_2[i]=sc.nextInt();
            // }

            // int sum_dis=0, sum_origin=0, sum_rule=0;
            // String res="";

            // for(int i=0;i<n;i++){
            //     sum_dis+=discount[i];
            //     sum_origin+=origin[i];
            //     sum_rule=sum_origin;
            //     for(int j=0;j<m;j++){
            //         if(sum_origin>rule_1[j]){
            //             if(sum_origin-rule_2[j]<sum_rule){
            //                 sum_rule=sum_origin-rule_2[j];
            //             }
            //         }
            //     }
            //     if(sum_dis<sum_rule){
            //         res=res+"Z";
            //     }else if(sum_dis==sum_rule){
            //         res=res+"B";
            //     }else{
            //         res=res+"M";
            //     }
            // }

            // System.out.println(res);



        }

 
}
