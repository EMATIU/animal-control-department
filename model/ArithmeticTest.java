package model;

import model.Arithmetic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @DisplayName("Addition")
    @CsvSource({"-1, 5, 4", "100, 12, 112", "4.5, 1.1, 5.6"})
    void Add(double a, double b, double c) {
        var arithmetic = new Arithmetic();
        assertEquals(c, arithmetic.add(a, b));
    }

    @DisplayName("Substraction")
    @CsvSource({"-10, -20, -30", "100, 12, 88", "4.5, 1.1, 3.4"})
    void Subst(double a, double b, double c) {
        var arithmetic = new Arithmetic();
        assertEquals(c, arithmetic.substract(a, b));
    }

    @DisplayName("Multiply")
    @CsvSource({"-1, 5, -5", "100, 12, 1200", "2, 1.1, 2.2"})
    void Multiply(double a, double b, double c) {
        var arithmetic = new Arithmetic();
        assertEquals(c, arithmetic.multiply(a, b));
    }

    @DisplayName("Division")
    @CsvSource({"-10, 5, -2", "100, 2, 50", "4.5, 2, 2.25"})
    void Div(double a, double b, double c) {
        var arithmetic = new Arithmetic();
        assertEquals(c, arithmetic.divide(a, b));
    }
}
