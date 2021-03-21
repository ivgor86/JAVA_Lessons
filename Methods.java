package lesson_Java;

// условия и методы
public class Methods {
    public static void main(String[] args) {
        doOne();
        System.out.println("a * (b + (c / d)) = " + doTwo(1,5,4,6));
        System.out.println(doThree(5, 5));
        doFour( -9);
        System.out.println(doFive(-1));
        doSix("Михаил");
         }

    private static void doSeven(int i) {
    }

    //Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void doOne() {
        System.out.println("Задание 2.");
        boolean b = false;
        byte bt = 0;
        char c = 'x';
        short s = 125;
        int i = 11;
        long l = 1111L;
        float f = 111.0f;
        double d = 222.222;
        System.out.println("boolean = " + b);
        System.out.println("byte = " + bt);
        System.out.println("char = [" + c + "]");
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static double doTwo(double a, double b, double c, double d) {
        System.out.println(" Задание 3.");
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doThree(int a, int b) {
        System.out.println(" Задание 4.");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void doFour(int a) {
        System.out.println(" Задание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean doFive(int a) {
        System.out.println(" Задание 6.");
        if (a < 0) return true;
        return false;
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void doSix(String name) {
        System.out.println(" Задание 7.");
        System.out.println("Приветствую, " + name + "!");
    }
}
