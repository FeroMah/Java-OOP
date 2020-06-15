package WorkingWithAbstraction.Exercise.JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimestions[0];
        int y = dimestions[1];

        int[][] matrix = fillTheMatrix(x, y);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int xE = evil[0];
            int yE = evil[1];

            while (xE >= 0 && yE >= 0) {
                if (isItInRangeOfMatrix(matrix, xE, yE)) {
                    matrix[xE][yE] = 0;
                }
                xE--;
                yE--;
            }

            int xI = ivoS[0];
            int yI = ivoS[1];

            while (xI >= 0 && yI < matrix[1].length) {
                if (isItInRangeOfMatrix(matrix, xI, yI)) {
                    sum += matrix[xI][yI];
                }

                yI++;
                xI--;
            }

            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static boolean isItInRangeOfMatrix(int[][] matrix, int x, int y) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length;
    }

    private static int[][] fillTheMatrix(int x, int y) {
        int value = 0;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
