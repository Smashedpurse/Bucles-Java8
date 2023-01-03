public class Main {
    public static void main(String[] args) {

        int contador = 0;

        //BUCLE WHILE
        System.out.println("WHILE *************");
        while(contador <= 10){
            System.out.println("El valor del contador es: " + contador);
            contador++;
        }

        contador = 0;

        //BUCLE DO-WHILE
        System.out.println("DO WHILE *************");
        do {
            System.out.println("El valor del contador con el bucle do-while es: " + contador);
            contador++;
        } while (contador <= 10);

        //BUCLE FOR
        System.out.println("BUCLE FOR");
        for (int i = 0; i <= 10 ; i++){
            System.out.println("El valor de nuestra variable i con el bucle for es: "+ i);
        }

    }
}