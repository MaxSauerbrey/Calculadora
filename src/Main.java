public class Main {
    public static void main(String[] args) {

    }

    public static void suma(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void resta(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void multiplicar(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void restringirCeros(int num1,int num2) {

        if (num2 != 0) {
            System.out.println(num1/num2);
        } else {
            System.out.println("No se puede dividir por cero")
        }

    }



}