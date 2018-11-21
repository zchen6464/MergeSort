package com.company;

import java.util.Arrays;

public class sort
{
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1, temp);
    }
    public static void mergeSortHelper(int[] arr,int from, int to, int[]temp)
    {
        if(from<to)
        {
            int middle = (from+to)/2;
            mergeSortHelper(arr,from,middle,temp);
            mergeSortHelper(arr,middle+1,to,temp);
            merge(arr,from,middle,to,temp);
        }
    }
    public static void merge(int[] arr, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid +1;
        int k = from;

        while(i <= mid && j <= to)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= to)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = from; k <= to; k++)
        {
            arr[k] = temp[k];
        }
    }
}

