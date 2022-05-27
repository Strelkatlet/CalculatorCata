import java.io.IOException;

class Calculation {

    public void arab(String arg1, String arg2, char op) {
        int value1 = Integer.parseInt(arg1);
        int value2 = Integer.parseInt(arg2);
        int result = 0;
        result = resultA(value1, value2, op);
        System.out.println(result);
        return;

    }

    public void rim(String arg1, String arg2, char op) {
        ArabToRim arabToRim = new ArabToRim();
        ArabToRim romanNumber = new ArabToRim();
        int value1 = romanNumber.romanToNumber(arg1);
        int value2 = romanNumber.romanToNumber(arg2);
        int result = 0;
        result = resultA(value1, value2, op);
        if (result < 1) try {

            throw new IOException();
        } catch (IOException e){
            System.out.println("в римской системе нет отрицательных чисел");
        }
        String res = arabToRim.arabToRim(result);
        System.out.println(res);
        return;

    }


    public static int resultA(int val1, int val2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = val1 + val2;
                break;
            case '-':
                result = val1 - val2;
                break;
            case '*':
                result = val1 * val2;
                break;
            case '/':
                result = val1 / val2;
        }
        return result;
    }


}


