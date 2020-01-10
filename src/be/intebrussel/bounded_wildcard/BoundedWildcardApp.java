package be.intebrussel.bounded_wildcard;

import static be.intebrussel.bounded_wildcard.BoundedWildcard.*;

public class BoundedWildcardApp {
    public static void main(String[] args) {

        TwoD[] twoDS = {
                new TwoD(1,6),
                new TwoD(9,3),
                new TwoD(2,8)
        };

        Coordinates<TwoD> coordinates = new Coordinates<>(twoDS);
        showXY(coordinates);

        ThreeD[] threeDS = {
                new ThreeD(1,5,9),
                new ThreeD(2,3,9)
        };

        Coordinates<ThreeD> coordinates1 = new Coordinates<>(threeDS);
        showXYZ(coordinates1);
        showXY(coordinates1);

        FourD[] fourDS = {
                new FourD(1,5,9,5),
                new FourD(2,3,9,8)
        };

        Coordinates<FourD> coordinates2 = new Coordinates<>(fourDS);
        showXYZT(coordinates2);
    }
}
