import java.util.Scanner;
public class Check {
    public static int checkDataAmount(String originalStr) {
        originalStr = originalStr.trim();
        String[] strArr = originalStr.split(" ");
        if (strArr.length < 6)
            return -1;
        if (strArr.length > 6)
            return -2;
        return 0;
    }

    public static boolean checkData(String[] checkArr) {
        for (String s : checkArr) {
            if (s == null)
                return false;
        }
        return true;
    }

    public static boolean hasOnlyLetters(String str) {
        for (char c : str.toCharArray()) {
            if(!Character.isLetter(c))
                return false;
        }
        return true;
    }

    public static boolean hasOnlyDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static int hasSymbols(String str, char symbol) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == symbol)
                count++;
        }
        return count;
    }
}
