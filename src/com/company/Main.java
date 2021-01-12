package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// khai bao cac bien;
        int size;
        int [] arr;
    // nhap va kiem tra kich thuoc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

    // nhap gia tri cho cac phan tu;
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element "+(i+1)+" :");
            arr[i] = sc.nextInt();
            i++;
        }

    // in ra mang da nhap;
        System.out.printf("%-20s%s", "Element in array :","");
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"\t");
        }

    // dao nguoc cac phan tu trong mang;
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size-1-j];
            arr[size-1-j] = temp;
        }

    // in ra mang da dao nguoc;
        System.out.printf("%-20s%s", "Reverse arr :","");
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"\t");
        };
    }
}