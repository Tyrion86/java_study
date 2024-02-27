package com.tyrion.sort_function;

import java.util.*;

public class ex{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int size=sc.nextInt();
            int[] array=new int[size];
            for(int j=0;j<size;j++){
                array[j]=sc.nextInt();
            }
            int res=0;
            int cur=1;
            int times=0;
            for(int k=0;k<32;k++){
                for(int j=0;j<size;j++){
                    if(array[j]%2==1){
                        times++;
                    }
                    array[j]=array[j]/2;
                }
                if(times>0){
                    res+=cur;
                }
                times=0;
                cur*=2;
            }
            System.out.println(String.valueOf(res));


        }
        
        
    }

    public static int[] heap_top_k (int[] nums, int k) {
        Queue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2){
                return i1-i2;
            } 
        });

        for(int i=0;i<nums.length;i++){
            if(queue.size()<k){
                queue.add(nums[i]);
            }else{
                int temp=queue.peek();
                if(temp>nums[i]){
                    continue;
                }else{
                    queue.poll();
                    queue.add(nums[i]);
                }
                
            }
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=queue.poll();
        }
        return res;
    }


    public int EatingSpeed (ArrayList<Integer> p, int h) {
        // write code here
        int max=0;
        for(int i:p){
            max=Math.max(i,max);
        }
        int min=1;
        while(min<=max){
            int middle=min+(max-min)/2;
            int time=0;
            for(int i:p){
                time+=(int)Math.ceil((double)i/(double)middle);

            }
            if(time>h){
                min=middle+1;
            }else{
                max=middle-1;
            }
        }
        return min;
    }
    
    public int MatchString(String s, String t) {
        // write code here
        int[] chars=new int[128];
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'A';
            chars[temp]+=1;
        }

        int times=0;
        int index=0;
        while(true){
            int temp=t.charAt(index)-'A';
            if(chars[temp]>0){
                chars[temp]-=1;
                if(index==t.length()-1){
                    times++;
                    index=0;
                }else{
                    index++;
                }                
            }else{
                break;
            }
        }

        return times;
    }
    

}