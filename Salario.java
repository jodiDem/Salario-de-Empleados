import java.util.Scanner;
/**
 * Crear un programa que calcule el salario neto semanal de los trabajadores de una empresa
  de acuerdo a las siguientes normas:
• Horas semanales que se deben trabajar son 40.
• Salario por hora: 20.00.
• Horas extras (Después de 40 horas) se pagan al doble de una hora normal.
• Descuento de Impuestos de 0%, si el salario bruto es menor o igual a 750 ; 10%, si el salario
bruto es mayor que 750.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salario
{
    public static void main () {
        double horas;
        double salarioNeto;
        double descuento;
        System.out.print('\u000c');
        Scanner hours = new Scanner(System.in);
        System.out.println("Captura el numero de horas trabajado esta semana: ");
        horas = hours.nextInt();
        
        salarioNeto = horas * 20;
        if (horas < 40)
        {
            System.out.println("Insuficientes horas trabajado.");    
        }
            
        else 
            
            if(horas == 40)
        {    
            salarioNeto = horas * 20;
            System.out.println("Salario neto de esta semana: " + "$" + salarioNeto);                                  
        }
            else 
        {  
           salarioNeto = (40 * 20) + ((horas - 40) * 40);
            System.out.println("Salario neto de esta semana: " + "$" + salarioNeto);
        }
        
        
        if (salarioNeto >= 750)
        {
            descuento = salarioNeto * 0.1;
            System.out.println("Decuento de impuestos: " + "$" + descuento);
        }
        else 
        { 
           System.out.println("No hay descuento de impuestos."); 
        }
    }
}
