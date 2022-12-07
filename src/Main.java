public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — "+ fullName);
        //Задача 2
        System.out.println("Задача 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  "+fullNameUpperCase);
        //Задача 3
        System.out.println("Задача 3");
        String fullNameRus = "Иванов Семён Семёнович";
        String fullNameRusNew = fullNameRus.replace("ё", "е");
        System.out.println(fullNameRusNew);
    }
}