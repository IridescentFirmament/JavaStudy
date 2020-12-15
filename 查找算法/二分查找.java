package com.saga.contact;

public class CopyArrTest {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 6, 7, 13, 19, 21, 34, 41, 50, 66, 77, 89};
        int findValue = 89;
        for (int left = 0, right = arrInt.length - 1; left <= right;) {
            if (findValue > arrInt[(left + right) / 2]) {
                left = (left + right) / 2 + 1;
            } else if (findValue < arrInt[(left + right) / 2]) {
                right = (left + right) / 2 - 1;
            } else {
                System.out.println("找到了！" + findValue + "=" + arrInt[(left + right) / 2]);
                break;
            }
        }
    }
}

