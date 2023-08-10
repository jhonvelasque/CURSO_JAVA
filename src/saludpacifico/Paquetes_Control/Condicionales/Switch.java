package saludpacifico.Paquetes_Control.Condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia ="dfdfsdf";
        switch (dia){
            case"lunes":
                System.out.println("Es un lunes");
                break;
            case"martes":
                System.out.println("Es un martes");
                break;
            case"miercoles":
                System.out.println("Es un miercoles");
                break;
            case"jueves":
                System.out.println("Es un jueves");
                break;
            case"viernes":
                System.out.println("Es un viernes");
                break;
            default:
                System.out.println("No es un dia valiudo mi king");
        }
    }
}
