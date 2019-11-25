package com.epam.autumn.politech.ht4.commonSubstring;

public class CommonSubFinder {
    String longestCS(String a, String b) {
        if (a == null || b == null || a.length() == 0 || b.length() == 0) {
            return "";
        }else if(a.equals(b)) {
            return a;
        }
        int[][] matrix = new int[a.length()][];
        int maxLength = 0;
        int maxI = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[b.length()];
            for (int j = 0; j < matrix[i].length; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    if (i != 0 && j != 0) {
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    } else {
                        matrix[i][j] = 1;
                        return "";
                    }
                    if (matrix[i][j] > maxLength) {
                        maxLength = matrix[i][j];
                        maxI = i;
                    }
                }
            }
        }
        return a.substring(maxI - maxLength + 1, maxI + 1);
    }

    public static void main(String[] args) {
        CommonSubFinder subFinder = new CommonSubFinder();

        String str1 = "wqataho";
        String str2 = "aaaadaxr";
        System.out.println(subFinder.longestCS(str1, str2));

    }
}
