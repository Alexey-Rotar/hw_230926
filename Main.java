public class Main {
    public static void main(String[] args) {
        System.out.println("Введите данные: ");
        String str = Data.inputData();

        System.out.print("Проверка количества полей: ");
        if (Check.checkDataAmount(str) == 0)
            System.out.println("OK");
        else if (Check.checkDataAmount(str) == -1)
            System.out.println("данных недостаточно!");
        else if (Check.checkDataAmount(str) == -2)
            System.out.println("данных избыточно!");

        String[] dataArr = Data.getData(str);
        System.out.print("Проверка  данных: ");
        if (Check.checkData(dataArr)) {
            System.out.println("OK");
            System.out.print("Запись данных в файл " + dataArr[0] + ": ");
            if (File.writeFile(dataArr)) {
                System.out.println("OK");
            }
            else
                System.out.println("не выполнена!");;
        }
        else
            System.out.println("найдены некорректные значения!");
    }
}
