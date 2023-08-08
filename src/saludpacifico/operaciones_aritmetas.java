package saludpacifico;

public class operaciones_aritmetas {
    public static void main(String[] args) {
        //oeradores aritmeticos
        int a = 5;
        int b = 2;
        int resultado_suma = a + b;
        boolean resultado_comp ;
        System.out.println(resultado_suma);
        // comparación
        /*
        < menor que
        > mayor que
        <= menor  igual
        >= mayor igual
        * */
        resultado_comp=a>b;
        System.out.println(resultado_comp);
        System.out.println(a<b);
        /* operadores logicos
        and &&
        or ||
        * */
        boolean resultado_logico=a>3 && b<3;

        //como debugear ?
        // usar el boton rojo que detiene el debuger

    }
}
