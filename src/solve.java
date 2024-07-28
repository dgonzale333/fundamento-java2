public class solve {

    public static void main(String[] args) {
        int option;
        do {
            option = displayMenu();
            escogerMenu(option);
        } while (option != 0);
    }

    public static int displayMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Casteo");
        System.out.println("2. Operadores de Asignación");
        System.out.println("3. Operadores de Incremento y Decremento");
        System.out.println("4. Ejercicios Combinados");
        System.out.println("0. Salir");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static void escogerMenu(int option) {
        int subOption;
        switch (option) {
            case 1:
                subOption = menuCasteo();
                escogerCasteo(subOption);
                break;
            case 2:
                subOption = operadoresAsignacion();
                escogerAsignacion(subOption);
                break;
            case 3:
                subOption = menuDecrementoIncremento();
                escogerDecrementoIncremento(subOption);
                break;
            case 4:
                subOption = menuCombinados();
                escogerCombinados(subOption);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int menuCasteo() {
        System.out.println("1. Ejercicio Casteo 1");
        System.out.println("2. Ejercicio Casteo 2");
        System.out.println("3. Ejercicio Casteo 3");
        System.out.println("4. Ejercicio Casteo 4");
        System.out.println("5. Ejercicio Casteo 5");
        System.out.println("6. Ejercicio Casteo 6");
        System.out.println("7. Ejercicio Casteo 7");
        System.out.println("8. Ejercicio Casteo 8");
        System.out.println("9. Ejercicio Casteo 9");
        System.out.println("10. Ejercicio Casteo 10");
        System.out.println("0. Salir del menú");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static void escogerCasteo(int option) {
        switch (option) {
            case 1:
                Main.ejercicioCasteo1();
                break;
            case 2:
                Main.ejercicioCasteo2();
                break;
            case 3:
                Main.ejercicioCasteo3();
                break;
            case 4:
                Main.ejercicioCasteo4();
                break;
            case 5:
                Main.ejercicioCasteo5();
                break;
            case 6:
                Main.ejercicioCasteo6();
                break;
            case 7:
                Main.ejercicioCasteo7();
                break;
            case 8:
                Main.ejercicioCasteo8();
                break;
            case 9:
                Main.ejercicioCasteo9();
                break;
            case 10:
                Main.ejercicioCasteo10();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int operadoresAsignacion() {
        System.out.println("1. Ejercicio Operadores de Asignación 1");
        System.out.println("2. Ejercicio Operadores de Asignación 2");
        System.out.println("3. Ejercicio Operadores de Asignación 3");
        System.out.println("4. Ejercicio Operadores de Asignación 4");
        System.out.println("5. Ejercicio Operadores de Asignación 5");
        System.out.println("0. Salir del menú");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static void escogerAsignacion(int option) {
        switch (option) {
            case 1:
                Main.ejercicioAsignacion1();
                break;
            case 2:
                Main.ejercicioAsignacion2();
                break;
            case 3:
                Main.ejercicioAsignacion3();
                break;
            case 4:
                Main.ejercicioAsignacion4();
                break;
            case 5:
                Main.ejercicioAsignacion5();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }


    public static int menuDecrementoIncremento() {
        System.out.println("1. Ejercicio Incremento y Decremento 1");
        System.out.println("2. Ejercicio Incremento y Decremento 2");
        System.out.println("3. Ejercicio Incremento y Decremento 3");
        System.out.println("4. Ejercicio Incremento y Decremento 4");
        System.out.println("5. Ejercicio Incremento y Decremento 5");
        System.out.println("0. Salir del menú");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static void escogerDecrementoIncremento(int option) {
        switch (option) {
            case 1:
                Main.incrementoDecremento1();
                break;
            case 2:
                Main.incrementoDecremento2();
                break;
            case 3:
                Main.incrementoDecremento3();
                break;
            case 4:
                Main.incrementoDecremento4();
                break;
            case 5:
                Main.incrementoDecremento5();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int menuCombinados() {
        System.out.println("1. Ejercicio Combinado 1");
        System.out.println("2. Ejercicio Combinado 2");
        System.out.println("3. Ejercicio Combinado 3");
        System.out.println("4. Ejercicio Combinado 4");
        System.out.println("5. Ejercicio Combinado 5");
        System.out.println("6. Ejercicio Combinado 6");
        System.out.println("7. Ejercicio Combinado 7");
        System.out.println("8. Ejercicio Combinado 8");
        System.out.println("9. Ejercicio Combinado 9");
        System.out.println("10. Ejercicio Combinado 10");
        System.out.println("0. Salir del menú");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static void escogerCombinados(int option) {
        switch (option) {
            case 1:
                Main.ejercicioCombinado1();
                break;
            case 2:
                Main.ejercicioCombinado2();
                break;
            case 3:
                Main.ejercicioCombinado3();
                break;
            case 4:
                Main.ejercicioCombinado4();
                break;
            case 5:
                Main.ejercicioCombinado5();
                break;
            case 6:
                Main.ejercicioCombinado6();
                break;
            case 7:
                Main.ejercicioCombinado7();
                break;
            case 8:
                Main.ejercicioCombinado8();
                break;
            case 9:
                Main.ejercicioCombinado9();
                break;
            case 10:
                Main.ejercicioCombinado10();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}




