package figurasgeometricas;

public class triangulo extends valores {

    public triangulo(int area, int perimetro) {
        super(area, perimetro);
    }



    public int areacalculartriangulo() {

        int ct;
        ct = area * area / 2;
        System.out.println("area: " + ct);
        return ct;

    }

    public int perimetrocalculartriangulo() {
        int ct;
        ct = (int) (perimetro + perimetro + perimetro);
        System.out.println("perimetro: " + ct);
        return ct;
    }
}
