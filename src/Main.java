public class Main {
    public static void main(String[] args) {
        ejercicioCasteo1();
        ejercicioCasteo2();
        ejercicioCasteo3();
        ejercicioCasteo4();
        ejercicioCasteo5();
        ejercicioCasteo6();
        ejercicioCasteo7();
        ejercicioCasteo8();
        ejercicioCasteo9();
        ejercicioCasteo10();
        ejercicioAsignacion1();
        ejercicioAsignacion2();
        ejercicioAsignacion3();
        ejercicioAsignacion4();
        ejercicioAsignacion5();
        incrementoDecremento1();
        incrementoDecremento2();
        incrementoDecremento3();
        incrementoDecremento4();
        incrementoDecremento5();
        ejercicioCombinado1();
        ejercicioCombinado2();
        ejercicioCombinado3();
        ejercicioCombinado4();
        ejercicioCombinado5();
        ejercicioCombinado6();
        ejercicioCombinado7();
        ejercicioCombinado8();
        ejercicioCombinado9();
        ejercicioCombinado10();
    }

    // Implementación de los ejercicios de casteo
    public static void ejercicioCasteo1() {
        System.out.println("Casteo: Ejercicio 1");
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x); // 8
    }

    public static void ejercicioCasteo2() {
        System.out.println("Casteo: Ejercicio 2");
        char c = 'A';
        int ascii = (int) c;
        System.out.println(ascii); // 65
    }

    public static void ejercicioCasteo3() {
        System.out.println("Casteo: Ejercicio 3");
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println(i); // 100
    }

    public static void ejercicioCasteo4() {
        System.out.println("Casteo: Ejercicio 4");
        String numberString = "123";
        int number = Integer.parseInt(numberString);
        System.out.println(number); // 123
    }

    public static void ejercicioCasteo5() {
        System.out.println("Casteo: Ejercicio 5");
        System.out.println((int) (char) (byte) -1); // 65535
    }

    public static void ejercicioCasteo6() {
        System.out.println("Casteo: Ejercicio 6");
        int num = 65;
        char charFromInt = (char) num;
        System.out.println(charFromInt); // A
    }

    public static void ejercicioCasteo7() {
        System.out.println("Casteo: Ejercicio 7");
        // long longNum = 100000L;
        // int intNum = longNum; // Error de compilación, se requiere casteo explícito
        // System.out.println(intNum);
    }

    public static void ejercicioCasteo8() {
        System.out.println("Casteo: Ejercicio 8");
        float floatNum = 12.34f;
        String floatString = Float.toString(floatNum);
        System.out.println(floatString); // 12.34
    }

    public static void ejercicioCasteo9() {
        System.out.println("Casteo: Ejercicio 9");
        double num = 10.99;
        int intFromDouble = (int) num;
        System.out.println(intFromDouble); // 10
    }

    public static void ejercicioCasteo10() {
        System.out.println("Casteo: Ejercicio 10");
        byte b = 50;
        short s = b;
        System.out.println(s); // 50
    }

    // Implementación de los ejercicios de operadores de asignación
    public static void ejercicioAsignacion1() {
        System.out.println("Operadores de Asignación: Ejercicio 1");
        int x = 10;
        x += 5;
        System.out.println(x); // 15
    }

    public static void ejercicioAsignacion2() {
        System.out.println("Operadores de Asignación: Ejercicio 2");
        int y = 20;
        y -= 3;
        System.out.println(y); // 17
    }

    public static void ejercicioAsignacion3() {
        System.out.println("Operadores de Asignación: Ejercicio 3");
        int z = 7;
        z *= 2;
        System.out.println(z); // 14
    }

    public static void ejercicioAsignacion4() {
        System.out.println("Operadores de Asignación: Ejercicio 4");
        int a = 9;
        a /= 3;
        System.out.println(a); // 3
    }

    public static void ejercicioAsignacion5() {
        System.out.println("Operadores de Asignación: Ejercicio 5");
        int b = 8;
        b %= 3;
        System.out.println(b); // 2
    }

    // Implementación de los ejercicios de incremento y decremento
    public static void incrementoDecremento1() {
        System.out.println("Incremento y Decremento: Ejercicio 1");
        int x = 5;
        x++;
        System.out.println(x); // 6
    }

    public static void incrementoDecremento2() {
        System.out.println("Incremento y Decremento: Ejercicio 2");
        int y = 10;
        y--;
        System.out.println(y); // 9
    }

    public static void incrementoDecremento3() {
        System.out.println("Incremento y Decremento: Ejercicio 3");
        int a = 7;
        int b = ++a;
        System.out.println(a); // 8
        System.out.println(b); // 8
    }

    public static void incrementoDecremento4() {
        System.out.println("Incremento y Decremento: Ejercicio 4");
        int c = 15;
        int d = c--;
        System.out.println(c); // 14
        System.out.println(d); // 15
    }

    public static void incrementoDecremento5() {
        System.out.println("Incremento y Decremento: Ejercicio 5");
        int e = 20;
        e += 1;
        e -= 2;
        System.out.println(e); // 19
    }

    // Implementación de los ejercicios combinados
    public static void ejercicioCombinado1() {
        System.out.println("Ejercicio Combinado 1");
        int x = 5;
        x += 10;
        x--;
        System.out.println(x); // 14
    }

    public static void ejercicioCombinado2() {
        System.out.println("Ejercicio Combinado 2");
        double y = 3.14;
        int z = (int) y;
        z *= 2;
        System.out.println(z); // 6
    }

    public static void ejercicioCombinado3() {
        System.out.println("Ejercicio Combinado 3");
        String str = "123";
        int num = Integer.parseInt(str);
        num++;
        System.out.println(num); // 124
    }

    public static void ejercicioCombinado4() {
        System.out.println("Ejercicio Combinado 4");
        char c = 'B';
        int ascii = (int) c;
        ascii += 3;
        System.out.println(ascii); // 68
    }

    public static void ejercicioCombinado5() {
        System.out.println("Ejercicio Combinado 5");
        int a = 10;
        a *= 2;
        a -= 5;
        System.out.println(a); // 15
    }

    public static void ejercicioCombinado6() {
        System.out.println("Ejercicios Combinados: Ejercicio 6");
        long longNum = 100000L;
        short shortNum = (short) longNum;
        shortNum *= 3;
        System.out.println(shortNum); // 300000 % 65536 = 34464
    }

    public static void ejercicioCombinado7() {
        System.out.println("Ejercicios Combinados: Ejercicio 7");
        int x = 10;
        x += (x++) + (++x);
        System.out.println(x); // 32
    }

    public static void ejercicioCombinado8() {
        System.out.println("Ejercicios Combinados: Ejercicio 8");
        float floatNum = 5.5f;
        byte byteNum = (byte) floatNum;
        byteNum--;
        System.out.println(byteNum); // 4
    }

    public static void ejercicioCombinado9() {
        System.out.println("Ejercicios Combinados: Ejercicio 9");
        int i3 = 257;
        byte b = (byte) i3;
        System.out.println(b); // 1
    }

    public static void ejercicioCombinado10() {
        System.out.println("Ejercicios Combinados: Ejercicio 10");
        double d3 = 8.5;
        int intNum2 = (int) d3;
        intNum2 += 5;
        intNum2++;
        System.out.println(intNum2); // 14
    }
}


