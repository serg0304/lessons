public class Task1 {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("variables");
        System.out.println("==================================");

        byte a1 = 21;
        short a2 = 22;
        int a3 = 1;
        long a4 = 3333333;
        float a5 = 9.4F;
        double a6 = 2.2;
        boolean a7 = true;
        char a8 = 'd';

        String str = "%";

        System.out.println("byte = " + a1);
        System.out.println("short = " + a2);
        System.out.println("int = " + a3);
        System.out.println("long = " + a4);
        System.out.println("float = " + a5);
        System.out.println("double = " + a6);
        System.out.println("boolean = " + a7);
        System.out.println("char = " + a8);

        System.out.println("String " + str);

        System.out.println("==================================");
        System.out.println("operations");
        System.out.println("==================================");


        Object [] arr = new Object[]{
                a1, a2, a3, a4, a5, a6, a7, a8
        };

        for (Object o : arr) {
            try {
                operations(o);
            } catch (IllegalStateException a){
                System.out.println(a);
            }
        }

    }






    static Object operations(Object a) throws IllegalStateException {
        switch (a.getClass().getSimpleName()) {
            case "Integer": {
                int_operations((Integer) a);
                break;
            }
            case "Double": {
                double_operations((Double) a);
                break;
            }

            case "Byte": {
                byte_operations((Byte) a);
                break;
            }

            case "Float": {
                float_operations((Float) a);
                break;
            }

            case "Long": {
                long_operations((Long) a);
                break;
            }

            case "Short": {
                short_operations((Short) a);
                break;
            }

            default:
                throw new IllegalStateException("Тип переменной не является числовым " + a.getClass().getSimpleName() );
        }

        return a;
    }

    static byte byte_operations(byte a) {
        System.out.println("========byte========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }

    static short short_operations(short a) {
        System.out.println("========short========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }

    static int int_operations(int a) {
        System.out.println("========int========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }

    static long long_operations(long a) {
        System.out.println("========long========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }

    static float float_operations(float a) {
        System.out.println("========float========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }

    static double double_operations(double a) {
        System.out.println("========double========");
        System.out.println((a * 2) + " Умножение");
        System.out.println((a / 2) + " Деление");
        System.out.println((a + 2) + " Сложение");
        System.out.println((a - 2) + " Вычитание");
        System.out.println((a % 2) + " Остаток от деления");
        System.out.println((++a) + " Инкремент");
        System.out.println((--a) + " Декремент");
        return a;
    }


}

