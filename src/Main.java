public class Main {
    public static void main(String[] args) {

        int contador = 0;

        //BUCLE WHILE
        while(contador <= 10){
            System.out.println("El valor del contador es: " + contador);
            contador++;
        }

        contador = 0;

        //BUCLE DO-WHILE

        do {
            System.out.println("El valor del contador con el bucle do-while es: " + contador);
            contador++;
        } while (contador < 10);

    }
}