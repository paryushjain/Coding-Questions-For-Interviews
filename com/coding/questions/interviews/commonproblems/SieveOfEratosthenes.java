package com.coding.questions.interviews.commonproblems;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        boolean isPrime[]=sieveOfEratosthenes(100);
        for(int i=0;i<isPrime.length;i++){
            if(isPrime[i]) System.out.print(i+" ");
        }
    }

    private static boolean[] sieveOfEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }

    private static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

}
