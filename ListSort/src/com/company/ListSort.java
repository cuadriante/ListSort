package com.company;

public class ListSort {

    public static int []numbers = { 43, 89, 76, 12, 90, 77, 40, 5, 91};

    public static int size;

    public static void main(String[] args) {
        selectionSort();
        bubbleSort();
        insertionSort();
    }

    public static <T> void swap(int current, int index) {
        int temp = numbers[current];
        numbers[current] = numbers[index];
        numbers[index] = temp;
    }


    public static <T extends Comparable<T>> void selectionSort() {
        int endIndex = size - 1;
        for (int current = 0; current < endIndex; current++) {
            swap(current, minIndex(current, endIndex));
        }
    }

    public static int minIndex(int start, int end) {
        int indexOfMin = start;
        for (int index = start + 1; index <= end; index++) {
            if (numbers[index] < numbers[indexOfMin]) {
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }


    public static void bubbleSort() {
        int in;
        int out;

        for (out = size - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (numbers[in] > numbers[in + 1])
                swap(in, in + 1);
            }
        }
    }


    public static void insertionSort() {
        int in;
        int out;

        for (out = 1; out < size; out++) {
            int temp = numbers[out];
            in = out;
            while (in > 0 && numbers[in-1] >= temp) {
                numbers[in] = numbers[in-1];
                --in;
            }
            numbers[in] = temp;
        }

    }

}

