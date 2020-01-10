package be.intebrussel.bounded_types;

public class Statistics<T extends Number> {

    private T[] array;

    public Statistics(T[] array) {
        this.array = array;
    }

    public double average() {
        double sum= 0.0;
        for (T a : array) {
            sum+= a.doubleValue();
        }
        return sum / array.length;
    }

    public boolean sameAvg(Statistics<?> statistics){
       if (average() == statistics.average()){
           return true;
       }
      return false;
    }
}
