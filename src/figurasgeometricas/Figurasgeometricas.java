package figurasgeometricas;

import java.util.Scanner;

public class Figurasgeometricas {

    public static void main(String[] args) {

    }

    public void captura(valores obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del area");
        obj.setArea(sc.nextInt());
        System.out.println("Ingrese el valor del perimetro");
        obj.setPerimetro(sc.nextInt());

    }

    public void imprimir() {
        System.out.println("\n rectangulo");

        rectangulo rec = new rectangulo();
        System.out.println("" + rec.areacalcularrectangulo());
        System.out.println("" + rec.perimetrocalcularrectangulo());
        System.out.println("\n triangulo");

        triangulo tri = new triangulo();
        System.out.println("" + tri.areacalculartriangulo());
        System.out.println("" + tri.perimetrocalculartriangulo());
        System.out.println("\n rombo");

        rombo rom = new rombo();
        System.out.println("" + rom.areacalcularrombo());
        System.out.println("" + rom.perimetrocalcularrombo());
        System.out.println("\n circulo");

        circulo cir = new circulo();
        System.out.println("" + cir.areacalcularcirculo());
        System.out.println("" + cir.perimetrocalcularcirculo());

        
    }

}
