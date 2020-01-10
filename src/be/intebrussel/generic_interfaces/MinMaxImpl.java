package be.intebrussel.generic_interfaces;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

    T [] values;

    public MinMaxImpl(T[] array) {
        this.values = array;
    }

    @Override
    public T min() {
        T value = values[0];
        for (int i  = 0; i< values.length;i++){
            if (values[i].compareTo(value) < 0){
                value = values[i];
            }
        }
        return value;
    }

    @Override
    public T max() {
        T value = values[0];
        for (int i  = 0; i< values.length;i++){
            if (values[i].compareTo(value) > 0){
                value = values[i];
            }
        }
        return value;    }
}
