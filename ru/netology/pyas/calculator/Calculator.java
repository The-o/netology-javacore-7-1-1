package ru.netology.pyas.calculator;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {

    public static final Supplier<Calculator> instance = Calculator::new;

    public final BinaryOperator<Integer> plus = (x, y) -> x + y;
    public final BinaryOperator<Integer> minus = (x, y) -> x - y;
    public final BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public final BinaryOperator<Integer> divide = (x, y) -> x / y;

    public final UnaryOperator<Integer> sqr = (x) -> x * x;
    public final UnaryOperator<Integer> abs = (x) -> x < 0 ? -x : x;

    public final Predicate<Integer> isPositive = (x) -> x > 0;
    public final Consumer<Integer> println = System.out::println;


    public Calculator() {}

}
