import java.io.IOException;

class ArabToRim {
    static String[] rim1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static String[] rim2 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    static String arabToRim(int number) {
        String res = "";
        int a = 0;
        if (number < 1){

        }
        if (number > 10) {
            a = number / 10;
            int z = number % (a * 10);
            res = rim2[a - 1] + rim1[z - 1];
        } else {
            int z = number;
            res = rim1[z - 1];
        }

        return res;
    }

    static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            } throw new IOException();
        } catch (IOException e) {
            System.out.println("неверно введены аргументы");
        }
        return 0;
    }

}

