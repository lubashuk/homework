public class homework2 {

    public static void main(String[] args) {
        //завдання 1
        int a = 5;
        int b = 3;
        int c = 2;
        int w = 6;
        int q = 10;
        int r = 4;
        int v = 15;
        int i = 60;
        int z = 2;
        int l = 30;
        int y = 50;
        int x = 21;
        int result1 = a + b * (w / q) * r + l;
        int result2 = b + v - i * z;
        int result3 = x + y + z * c;

        System.out.println("a + b * (w / q) * r = " + result1);
        System.out.println("b + v - i * z = " + result2);
        System.out.println("x + y + z * c = " + result3);

        //завдання 2
        int letterH = 72;
        int letterE = 101;
        int letterL = 108;
        int letterO = 111;
        int letterW = 119;
        int letterR = 114;
        int letterD = 100;

        System.out.println("" + (char)letterH + (char)letterE + (char)letterL + (char)letterL + (char)letterO
                            + ' ' + (char)letterW + (char)letterO + (char)letterR + (char)letterL + (char)letterD);

        //завдання 3
        boolean result;
        result = 10 < 9;
        System.out.println("10 < 9 -> " + result);
        result = 3 == 4;
        System.out.println("3 == 4 -> " + result);
        result = 2 != 2;
        System.out.println("2 != 2 -> " + result);
        result = 9 >= 8;
        System.out.println("9 >= 8 -> " + result);
    }
}