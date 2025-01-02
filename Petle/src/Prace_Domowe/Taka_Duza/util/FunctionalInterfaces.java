package Prace_Domowe.Taka_Duza.util;

import Prace_Domowe.Taka_Duza.model.Product;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class FunctionalInterfaces {
    public abstract Predicate<Product> isAvailableAndCheap();
    public abstract Predicate<Product> isElectronics();
    public  abstract Function<Product, String> productToString();
    public abstract Consumer<String> printString();
}

