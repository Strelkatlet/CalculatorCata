import java.io.IOException;
import java.util.Scanner;

class Main {

    final static String[] mas_arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    final static String[] mas_rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Считываем
        String input_First = scanner.nextLine();
        String[] input_Line = input_First.split(" ");
        if (input_First.length() < 2) {
            try {
                throw new IOException();
            } catch (IOException e){
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }
        } else if (input_Line.length != 3) {
            try {
                throw new IOException();
            } catch (IOException e){
                System.out.println("throws Exception //т.к. отсутствуют пробелы или формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } else {
            calc(input_Line); // вызываем метод из тз
        }
    }

    public static String[] calc(String[] input) {
        Calculation calculation = new Calculation();
        char op = operation(input[1]);
        int q = 0;

        for (int i = 0; i < 10; i++) {
            if (input[0].equals(mas_arab[i])) {
                for (int j = 0; j < 10; j++) {
                    if (input[2].equals(mas_arab[j])) {
                        q++;
                        calculation.arab(input[0], input[2], op);
                        break;
                    } else {
                        if (j == 9) {
                            try {
                                throw new IOException();
                            } catch (IOException e){
                                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                            }
                        }
                    }
                }

                } else if (input[0].equals(mas_rim[i])) {
                    for (int d = 0; d < 10; d++) {
                        if (input[2].equals(mas_rim[d])) {
                            q++;
                            calculation.rim(input[0], input[2], op);
                            break;
                        } else {
                            if (d == 9) {
                                try {
                                    throw new IOException();
                                } catch (IOException e){
                                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                                }
                            }
                        }

                    }

                }

            }
        if (q == 0) {
            try {
                throw new IOException();
            } catch (IOException e){
                System.out.println("неверно введены аргументы");
            }
        }
        return input;
    }

    public static char operation(String arg) {
        char[] mas_sign = new char[]{'+', '-', '*', '/'};
        char op = arg.charAt(0);
        for (int i = 0; i < mas_sign.length; i++)
            if (mas_sign[i] == op) {
                op = mas_sign[i];
                break;
            } else if (mas_sign[i] != op && i == 3) {
                try {
                    throw new IOException();
                } catch (IOException e){
                    System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
        return op;
    }
}