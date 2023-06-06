import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @DisplayName("Dodawanie")
    @Test
    void checkIfAddMethodReturnPositiveNumber() {

        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @DisplayName("Odejmowanie")
    @Test
    void checkIfSubtractMethodReturnPositiveNumber() {

        Assertions.assertEquals(4, calculator.subtract(8, 4));
    }
    @DisplayName("Mnożenie")
    @Test
    void checkIfMultiplyMethodReturnPositiveNumber() {

        Assertions.assertEquals(4, calculator.multiply(2, 2));
    }
    @DisplayName("Dzielenie")
    @Test
    void checkIfDivideMethodReturnPositiveNumber() {

        Assertions.assertEquals(4, calculator.divide(8, 2));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void adding(double a , double b , double c){
        Assertions.assertEquals(c, calculator.add(a,b));
    }
     private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(4,4,8),
                Arguments.of(8,8,16),
                Arguments.of(32,32,64)
        );
    }
}
