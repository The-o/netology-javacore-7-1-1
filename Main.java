import ru.netology.pyas.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(10, 5);
        int b = calc.minus.apply(6, 1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }

}