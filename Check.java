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

    public static boolean checkData(String[] checkArr) throws RuntimeException {
        boolean isEx = false;
        String msg = "\nНеверный формат в полях: ";
        String[] msgArr = {"<Имя>","<Фамилия>","<Отчество>","<Дата_рождения>","<Номер_телефона>","<Пол>"};
        for (int i=0; i < checkArr.length; i++) {
            if (checkArr[i] == null) {
                isEx = true;
                msg = msg.concat(msgArr[i] + " ");
            }
        }
        if (isEx)
            throw new RuntimeException(msg);
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