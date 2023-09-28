import java.util.Scanner;

public class Data {
    public static String inputData() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public static String[] getData(String origStr) {
        origStr = origStr.trim();
        String[] origArr = origStr.split(" ");
        String[] resultArr = new String[6];
        int fio = 0;
        for (String s : origArr) {
            // name, surname and patronymic
            if (fio <= 2 && Check.hasOnlyLetters(s) && s.length() > 1) {
                if (fio == 0) {
                    resultArr[0] = s;
                } else if (fio == 1) {
                    resultArr[1] = s;
                } else {
                    resultArr[2] = s;
                }
                fio++;
            }
            // birthday
            if (Check.hasSymbols(s, '.') == 2) {
                String[] dateArr = s.split("\\.");
                if (Check.hasOnlyDigits(dateArr[0]) && Check.hasOnlyDigits(dateArr[1]) && Check.hasOnlyDigits(dateArr[2])
                        && dateArr[0].length() == 2 && dateArr[1].length() == 2 && dateArr[2].length() == 4
                        && Integer.parseInt(dateArr[0]) <= 31 && Integer.parseInt(dateArr[1]) <= 12)
                    resultArr[3] = s;
            }
            // phone
            if (Check.hasOnlyDigits(s))
                resultArr[4] = s;
            // sex
            if (Check.hasOnlyLetters(s) && s.equalsIgnoreCase("f") | s.equalsIgnoreCase("m")) {
                resultArr[5] = s;
            }
        }
        return resultArr;
    }
}