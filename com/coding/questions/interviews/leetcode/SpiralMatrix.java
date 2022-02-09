package com.coding.questions.interviews.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrix {
    public static void main(String[] args) {

        int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralMatrix(a).stream().forEach(System.out::print);

    }

    public static List<Integer> spiralMatrix(int matrix[][]){
        List<Integer> numList = new ArrayList<>();
        if(matrix.length==0){
            return numList;
        }
        int top=0,left=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int size=matrix.length*matrix[0].length;
        while(numList.size()<size){

            for(int i=left;i<=right && numList.size()<size;i++){
                numList.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom && numList.size()<size;i++){
                numList.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left && numList.size()<size;i--){
                numList.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top && numList.size()<size;i--){
                numList.add(matrix[i][left]);
            }
            left++;
        }
        return numList;
    }
}
