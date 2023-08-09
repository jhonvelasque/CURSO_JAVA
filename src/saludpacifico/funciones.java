public class funciones {
    public  static void main(String[] args) {
        //Opcion1: funcion sin parametro y sin tipo de retorno
        //sirve para repertir trosos de codigo

        showMenu();
        //opcion2 :funcion sin parametros y con tipo  retorno
        //opcion3:

    }
    static void showMenu(){
        System.out.println("Bienvenido a nuestro ecommerce");
        System.out.println(" 1- ver zapatillas");
        System.out.println(" 2- comprar zapatillas");
        System.out.println(" 3- salir");
    };
    static String getMenu(){
        return "Bienvenido a nuestro ecommerce";

    }
}

