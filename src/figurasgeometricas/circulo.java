package figurasgeometricas;

public class circulo extends valores {

    public circulo(int area, int perimetro) {
        super(area, perimetro);
    }



    public int areacalcularcirculo() {

        int cc1, cc2;
        cc1 = (int) (3.1416 * area);
        cc2 = (int) Math.pow(cc1, 2);
        System.out.println("area: " + cc2);
        return cc2;

    }

    public int perimetrocalcularcirculo() {
        int cc;
        cc = (int) (2 * 3.1416 * perimetro);
        System.out.println("perimetro: " + cc);
        return cc;
    }
}
