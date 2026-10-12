
package demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "Impartire la zero!"
            );
        }

        return a / b;
    }

    public String classifyNumber(int number) {
        if (number > 0) {
            return "Pozitiv";
        } else if (number < 0) {
            return "Negativ";
        } else {
            return "Zero";
        }
    }
}
