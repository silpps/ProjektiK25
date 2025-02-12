package Calculator;

public class Laskin {

    private double tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos = tulos - n;
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) {
    	 if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public void nelio(double n) {
        tulos = n*n;
    }

    public void neliojuuri(double n) {
        if (n<0) throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        tulos = Math.sqrt(n);
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
        System.out.println("Laskin käynnistyy");
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
        System.out.println("Laskin sammuu, nollataan tulos");
        tulos = 0;
    }

}
