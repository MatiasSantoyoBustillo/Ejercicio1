import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int anonacimiento = Esdia.readInt("Introduzca año de nacimineto:\n");
        System.out.printf("Año de nacimiento %d\n", anonacimiento);

        int anoactual = Esdia.readInt("Introduzca año actual:\n");
        System.out.printf("Año actual %d\n", anoactual);

        int edad = (anoactual - anonacimiento);
        System.out.printf("Tu edad es %d\n", edad);





    }
}
