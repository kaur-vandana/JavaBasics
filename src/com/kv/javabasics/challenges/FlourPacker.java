package com.kv.javabasics.challenges;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount, int goal) {

        int sum;
        if(bigCount>0 && smallCount>0 && goal>0)
        {
            int i= goal/5;
            if(i<=bigCount) {
                sum = i*5 + smallCount;
                if(sum>=goal)
                    return true;
            }
            else {
                sum = bigCount * 5;
                if(sum>goal)
                    return false;
                sum = sum+smallCount;
                if(sum>=goal)
                    return true;
            }
        }
        else if(bigCount==0 && goal<=smallCount) {
            return true;
        } else if(smallCount==0 && goal==bigCount*5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//       System.out.println(canPack(1,0,4));
      //  System.out.println(canPack(5,3,24));//false
//        System.out.println(canPack(2,2,12)); //true
//        System.out.println(canPack(2,10,18));//true
//        System.out.println(canPack(2,1,5)); //true
        System.out.println(canPack(2,7,18));
    }
}
