package be.intebrussel.bounded_wildcard;

public class FourD extends ThreeD {

    private int t;

    public FourD() {
    }

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}
