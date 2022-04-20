package lesson4hw;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {
    public static final char X = 'X';
    public static final char O = 'O';
    public static final char SPACE = '•';
    public static char[][] map;
    public static int countTurns, lastRow, lastCol, size, winSize, difficult, row, col;
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            preGame();
            initMap();
            drawMap();
            startGame();
        } while (playAgain());
        sc.close();
    }

    private static void preGame() {
        do {
            System.out.print("Введите размер поля от 3 до 11 - ");
            size = sc.nextInt();
        } while (!(size >= 3 && size <= 11));
        switch (size) {
            case 3, 4, 5 -> winSize = 3;
            case 6,7,8,9,10 -> winSize = 4;
            default -> winSize = 5;
        }
        do {
            System.out.print("Выберите сложность компьютера 1 - тупица, 2 - гений! - ");
            difficult = sc.nextInt();
        } while (!(difficult == 1 || difficult == 2));
        System.out.printf("Поле %dx%d, фишек для победы - %d\n", size, size, winSize);
    }

    private static void startGame() {
        countTurns = 0;
        while (true) {
            youTurn();
            drawMap();
            if (chckWin(X)) {
                System.out.println("Поздравляю ты победил!!");
                break;
            }
            if (mapIsFull()) {
                System.out.println("У вас ничья!");
                break;
            }
            aiTurn();
            drawMap();
            if (chckWin(O)) {
                System.out.println("Компьютер победил!!");
                break;
            }
            if (mapIsFull()) {
                System.out.println("У вас ничья!");
                break;
            }
        }
    }

    private static boolean playAgain() {
        System.out.print("Сыграем еще y\\n? - ");
        return sc.next().equals("y");
    }

    private static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = SPACE;
            }
        }

    }

    private static void drawMap() {
        for (int i = 0; i <= size; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", (i + 1));
            for (int j = 0; j < size; j++) {
                System.out.printf("%3s", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void youTurn() {
        int row, col;
        do {
            System.out.print("Введите номер строки - ");
            row = sc.nextInt() - 1;
            System.out.print("Введите номер столбца - ");
            col = sc.nextInt() - 1;
        } while (!rowAndColIsValid(row, col, X));
        map[row][col] = X;
        countTurns++;
        lastRow = row;
        lastCol = col;
    }

    private static void aiTurn() {
        if (difficult == 1) {
            do {
                row = random.nextInt(size);
                col = random.nextInt(size);
            } while (!rowAndColIsValid(row, col, O));
            map[row][col] = O;
            countTurns++;
            lastRow = row;
            lastCol = col;
            System.out.printf("Компьютер ходит %d %d\n", row + 1, col + 1);
        } else if (difficult == 2) {
            do {
                for (int i = 1; i < size; i++) {
                    row = lastRow + random.nextInt(-i, i + 1);
                    col = lastCol + random.nextInt(-i, i + 1);
                    if (rowAndColIsValid(row, col, O)) {
                        break;
                    }
                }
            } while (!rowAndColIsValid(row, col, O));
            map[row][col] = O;
            countTurns++;
            lastRow = row;
            lastCol = col;
            System.out.printf("Компьютер ходит %d %d\n", row + 1, col + 1);
        }
    }


    private static boolean rowAndColIsValid(int row, int col, char symb) {
        if (symb == X) {
            if (row >= 0 && row < size && col >= 0 && col < size) {
                if (map[row][col] == SPACE) {
                    return true;
                } else {
                    System.out.println("Эта клетка уже занята!");
                    return false;
                }
            } else {
                System.out.println("Введите допустимое значение!");
                return false;
            }
        } else {
            return row >= 0 && row < size && col >= 0 && col < size && map[row][col] == SPACE;
        }
    }

    private static boolean chckWin(char symb) {
        if (winX(symb) || winY(symb) || diagD(symb) || diagU(symb)) {
            return true;
        }
        return false;
    }

    private static boolean winX(char symb) {
        int win = 0;
        for (int i = 0; i < size; i++) {
            if (map[lastRow][i] == symb) {
                win++;
                if (win == winSize) {
                    return true;
                }
            } else {
                win = 0;
            }
        }
        return false;
    }

    private static boolean winY(char symb) {
        int win = 0;
        for (int i = 0; i < size; i++) {
            if (map[i][lastCol] == symb) {
                win++;
                if (win == winSize) {
                    return true;
                }
            } else {
                win = 0;
            }
        }
        return false;
    }

    private static boolean diagD(char symb) {
        int win = 0;
        if (lastCol >= lastRow) {
            for (int i = 0, j = lastCol - lastRow; i < size - j; i++) {
                if (map[i][j + i] == symb) {
                    win++;
                    if (win == winSize) {
                        return true;
                    }
                } else {
                    win = 0;
                }
            }
        }
        if (lastRow > lastCol) {
            for (int i = 0, j = lastRow - lastCol; i < size - j; i++) {
                if (map[j + i][i] == symb) {
                    win++;
                    if (win == winSize) {
                        return true;
                    }
                } else {
                    win = 0;
                }
            }
        }
        return false;
    }

    private static boolean diagU(char symb) {
        int win = 0;
        if (lastCol + lastRow < size) {
            for (int i = 0, j = lastRow + lastCol; i < j + 1; i++) {
                if (map[i][j - i] == symb) {
                    win++;
                    if (win == winSize) {
                        return true;
                    }
                } else {
                    win = 0;
                }
            }
        }
        if (lastCol + lastRow >= size) {
            for (int i = size - 1, j = lastRow + lastCol - size + 1, m = 0; i > j - 1; i--, m++) {
                if (map[i][j + m] == symb) {
                    win++;
                    if (win == winSize) {
                        return true;
                    }
                } else {
                    win = 0;
                }
            }
        }
        return false;
    }

    public static boolean mapIsFull() {
        return countTurns >= size * size;
    }
}