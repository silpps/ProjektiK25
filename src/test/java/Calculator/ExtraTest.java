package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), DELTA, "Nollaus ei toimi");
    }


    @ParameterizedTest(name = "Luvun {0} neliöön korotus")
    @CsvSource({"2, 4", "4, 16", "5, 25"})
    public void testNelio(double luku, double tulos) {
        laskin.nelio(luku);
        assertEquals(tulos, laskin.annaTulos(), DELTA, "Luvun " + luku + " neliöön korotus väärin");
    }

    @ParameterizedTest (name = "Luvun {0} neliöjuuri")
    @CsvSource({"4, 2", "16, 4", "25, 5"})
    public void testNeliojuuri(double luku, double tulos) {
        laskin.neliojuuri(luku);
        assertEquals(tulos, laskin.annaTulos(), DELTA,"Luvun " + luku + " neliöjuuri väärin");
    }


    @ParameterizedTest (name="Lasketaan luvun {0} negatiivinen neliöjuuri")
    @CsvSource({"-2", "-4", "-5"})
    public void testNeliojuuriNegat(double luku){
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            laskin.neliojuuri(luku);
        });
        assertEquals("Negatiiviselle luvulle ei voi laskea neliöjuurta", exception.getMessage());
    }


}
