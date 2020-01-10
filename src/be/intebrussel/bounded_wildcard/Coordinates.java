package be.intebrussel.bounded_wildcard;

public class Coordinates<T extends TwoD> {

     T[] coords;

    public Coordinates(T[] coords) {
        this.coords = coords;
    }
}
