package saludpacifico.funciones;

public class funciones_pre {
    private static double getPrice() {
        return 0;
    }

    static void showMenu(){
        System.out.println("Bienvenido a nuestro ecommerce");
        System.out.println(" 1- ver zapatillas");
        System.out.println(" 2- comprar zapatillas");
        System.out.println(" 3- salir");
    }
    static String getMenu(){
        return "Esta es la primera recursión de jhon";

    }
    static void SetSaludo(String name){
        System.out.println("BIENVENIDO "+name);
    }
    public  static void main(String[] args) {
        //Opcion1: funcion sin parametro y sin tipo de retorno
        //sirve para repertir trosos de codigo

        showMenu();

        //opcion2 :funcion sin parametros y con tipo  retorno
        String saludo ;
        System.out.println(getMenu());
        double price= getPrice();
        System.out.println(price);

        //opcion3;funcion con parametros y sin tipo de retorno
        SetSaludo("jhon");

        //OPCION4:funcion con parametros y con tipo de retorno
        String nombre="Mario";
        String apellido="perez";
        String Bienvenida =obtenerSaludo(nombre,apellido);
        System.out.println(Bienvenida);
        int suma=sumar(10,20);
    }

    private static int sumar(int num1 , int num2) {
        return num1+num2;
    }

    private static String obtenerSaludo(String nombre,String apellido) {
        return "Bienvenido "+nombre+" "+apellido;
    }




}

