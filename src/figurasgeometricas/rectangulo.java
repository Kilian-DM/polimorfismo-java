package figurasgeometricas;

public class rectangulo extends valores {

    public rectangulo(int area, int perimetro) {
        super(area, perimetro);
    }

 

    public int areacalcularrectangulo() {
        int cre;
        cre = area * area;
        System.out.println("area: " + cre);
        return cre;

    }

    public int perimetrocalcularrectangulo() {
        int cre;
        cre = (int) (perimetro + perimetro + perimetro + perimetro);
        System.out.println("perimetro: " + cre);
        return cre;
    }
}
