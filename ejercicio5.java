import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7 para obtener el día de la semana: ");

        int numeroDia = scanner.nextInt();

        String diaSemana;
        switch (numeroDia) {
        
        case 1:
                diaSemana = "Lunes";
                break;
        case 2:
                diaSemana = "Martes";
                break;            
        case 3:
                diaSemana = "Miercoles";
                break;           
        case 4:
                diaSemana = "Jueves";
                break;
        case 5:
                diaSemana = "Viernes";
                break;                
        case 6:
                diaSemana = "Sabado";
                break;                
        case 7:
                diaSemana = "Domingo";
                break;                

        default:diaSemana = "Número de día inválido";
                break;              
                
        System.out.println("día de la semana es: " + diaSemana);
   
    }
}
}


