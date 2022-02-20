package com.coding.questions.interviews.leetcode;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = new int[] { 3,2,8,4 };
        System.out.println(areaOfBiggestContainer(a));
    }

    private static int areaOfBiggestContainer(int[] height){
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int area = Math.min(height[i],height[j])*(j-i);
                if(maxArea<area){
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }

    private static int areaOfBiggestContainerOptimised(int[] height){
        int maxArea=0;
        int a=0,b=height.length-1;
        while(a<b){
            int area = Math.min(height[a],height[b])*(b-a);
            maxArea=Math.max(area,maxArea);
            if(height[a]>height[b]){
                b--;
            }else{
                a++;
            }
        }
        return maxArea;
    }

}
