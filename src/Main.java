public class Main {
    public static void main(String[] args) {

        //Здесь просто тренировка


        String phone = "+917-222 22-22";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79172222222";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        String ss = "My name is Ivan";
        String[] words = ss.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+", ");
        }
        String s = "abcde";
        char c = s.charAt(2);
/* c будет инициализировано значением c, так как именно оно стоит
на третьей позиции в строке s (строка — это массив, т. е. 3-я позиция
располагается под индексом 2) */

        s = "abcd";
        String s1 = s.toUpperCase();
/* s1 будет присвоена копия строки s, где все символы будут в верхнем
регистре, т. е. "ABCD" */

        s = "ABCD";
        String s11 = s.toLowerCase();
/* s1 будет присвоено значение строки s, но все символы снова перейдут
 в нижний регистр, т. е. "abcd" */

        s = "   abcd    ";
        String s12 = s.trim();
/* s1 будет присвоено значение строки s, но без «лидирующих» и
«завершающих» пробелов, они будут удалены, т. е. "abcd" */

        s = "My name is Ivan";
        String[] words1 = s.split(" ");
/* Данный метод создаст из строки массив, разбив ее на части.
Разделитель указывается в скобках. Мы указали в скобках пробел,
следовательно, делить строку на элементы метод будет в тех местах,
где стоит пробел, т. е. words будет равно {"My", "name", "is", "Ivan"} */

        s = "abcd";
        char[] c1 = s.toCharArray();
/* Преобразует строку в массив символов, присвоив c массив
вида {'a', 'b', 'c', 'd'} */

        s = "abcdef";
        String s2 = s.substring(2, 4);
/* s1 получит значение, которое находится в строке s, начиная
с индекса 2 включительно и заканчивая индексом 4 не включительно, т. е. "cd" */

        String s8 = "ab c de";
        String s3 = s8.replace("", " ");
/* s1 получит копию строки s, но из этой копии будут удалены все
 пробелы (заменены символы из первого параметра (пробел) на символ
из второго параметра (пустая строка)) */

        String s4 = s.replace('a', 'b');
/* s2 получит строку s, где все символы 'a' (первый параметр)
будут заменены на 'b' (второй параметр), т. е. "bb c de" */

        s = "#";
        String s5 = s.repeat(10);
/* s1 получит строку s, которая будет повторена 10 раз (значение из скобок),
т. е. "##########" */

    }
}