package org.example;

import java.util.Arrays;
public class forLoopCopyExample {
    public static void main(String[] args)
    {

        int[] sourceArrays = {2,3,4,5,10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }

        targetArrays[3]=700;
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if(Arrays.equals(targetArrays,sourceArrays))
        {
            System.out.println("HERE Same instance");
        }
        if (targetArrays == sourceArrays) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }
    }
}
