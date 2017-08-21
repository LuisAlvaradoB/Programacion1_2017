import java.util.Scanner;

public class LiquidacionSueldo{
  /* Declaracion de variables*/
  int Sueldo;
  int DiasTrabajados;
  int HorasExtras;
  int ValorHoraExtra;
  int CalculoValorHorasExtras;
  int SueldoTotal;
  int SueldoSinHorasExtras;
  int SueldoConHorasExtras;

  /* Este metodo captura los datos del usuario por teclado */
  public void ingresoDatos() {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("-----------------------------------------------");
    System.out.println("************ Bienvenido al Sistema ************");
    System.out.println("-----------------------------------------------");
    System.out.println("Ingrese sueldo diario");
    Sueldo = sc1.nextInt();
    System.out.println("-----------------------------------------------");
    System.out.println("Ingrese dias trabajados");
    DiasTrabajados = sc1.nextInt();
    System.out.println("-----------------------------------------------");
    System.out.println("Ingrese horas extras trabajadas");
    HorasExtras = sc1.nextInt();
    System.out.println("-----------------------------------------------");
    System.out.println("Ingrese valor de la hora extra");
    ValorHoraExtra = sc1.nextInt();
    System.out.println("-----------------------------------------------");
  }

  /* Este metodo realiza el calculo de las horas extras */
  public void calcularHorasExtras() {
    CalculoValorHorasExtras = ValorHoraExtra * HorasExtras;
  }

  /* Este metodo realiza el calculo de sueldo mas las horas extras */
  public void calcularSueldo() {
    SueldoSinHorasExtras = Sueldo * DiasTrabajados;
    SueldoConHorasExtras = SueldoSinHorasExtras + CalculoValorHorasExtras;
  }

/* Este metodo realiza la impresion por pantalla */
  public void imprimirResultados() {
    System.out.println("\n");
    System.out.println("-----------------------------------------------");
    System.out.println("******** Calculo Liquidacion de Sueldo ********");
    System.out.println("-----------------------------------------------");
    System.out.println("Sueldo Diario : $" + Sueldo);
    System.out.println("-----------------------------------------------");
    System.out.println("Dias trabajados : " + DiasTrabajados);
    System.out.println("-----------------------------------------------");
    System.out.println("Horas extras trabajadas en el mes : " + HorasExtras);
    System.out.println("-----------------------------------------------");
    System.out.println("valor de la hora extra : $" + ValorHoraExtra);
    System.out.println("-----------------------------------------------");
    System.out.println("Total horas extras : $" + CalculoValorHorasExtras);
    System.out.println("-----------------------------------------------");
    System.out.println("Su sueldo total obtenido es : $" + SueldoConHorasExtras);
    System.out.println("-----------------------------------------------");

  }

  /* Metodo principal */
  public static void main(String[] args) {
    LiquidacionSueldo objeto1 = new LiquidacionSueldo(); /* Se crea el objeto */
    /* Se invocan los metodos */
    objeto1.IngresoDatos();
    objeto1.CalcularHorasExtras();
    objeto1.CalcularSueldo();
    objeto1.ImprimirResultados();
  }
}
