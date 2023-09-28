public class Main {
    public static void main(String[] args) {
        boolean amount = false;
        System.out.println("Введите данные через пробел в формате:");
        System.out.println("<Имя> <Фамилия> <Отчество> <Дата_рождения(dd.mm.yyyy)> <Номер_телефона> <Пол(m/f)>");
        String str = Data.inputData();

        System.out.print("Проверка количества полей: ");
        if (Check.checkDataAmount(str) == 0) {
            System.out.println("OK");
            amount = true;
        }
        else if (Check.checkDataAmount(str) == -1)
            System.out.println("данных недостаточно!");
        else if (Check.checkDataAmount(str) == -2)
            System.out.println("данных избыточно!");

        if (amount) {
            String[] dataArr = Data.getData(str);
            System.out.print("Проверка  данных: ");
            if (Check.checkData(dataArr)) {
                System.out.println("OK");
                System.out.print("Запись данных в файл " + "'" + dataArr[0] + "': ");
                if (File.writeFile(dataArr)) {
                    System.out.println("OK");
                }
            }
        }
    }
}