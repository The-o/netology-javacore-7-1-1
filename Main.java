import java.util.Random;

import ru.netology.pyas.calculator.Calculator;
import ru.netology.pyas.calculator.DivideByZeroException;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        Random rng = new Random(0);

        for (int i = 0; i < 10; ++i) {
            int p = rng.nextInt(10);
            int r = rng.nextInt(10);
            int s = rng.nextInt(10);
            int t = rng.nextInt(10);

            System.out.printf("(%d + %d) / (%d - %d) = ", p, r, s, t);

            try {
                int a = calc.plus.apply(p, r);
                int b = calc.minus.apply(s, t);
                int c = calc.divide.apply(a, b);

                calc.println.accept(c);
            } catch (DivideByZeroException e) {
                System.out.println("Ошибка деления на ноль");
            }
        }

        
    }

}
