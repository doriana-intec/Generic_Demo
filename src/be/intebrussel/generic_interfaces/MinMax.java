package be.intebrussel.generic_interfaces;

public interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}
