package figurasgeometricas;

public class rombo extends valores {

    public rombo(int area, int perimetro) {
        super(area, perimetro);
    }

  

    public int areacalcularrombo() {

        int cro;
        cro = area * area / 2;
        System.out.println("area: " + cro);
        return cro;

    }

    public int perimetrocalcularrombo() {
        int cro;
        cro = (int) (perimetro + perimetro + perimetro + perimetro);
        System.out.println("perimetro: " + cro);
        return cro;
    }
}
