package be.intebrussel.bounded_types;

public class StatisticsApp {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};

        Double[] array2 = {1.2, 5.3, 6.7, 9.1, 8.5};
        Statistics<Integer> statistics =
                new Statistics<>(array);

        Statistics<Double> statistics1 =
                new Statistics<>(array2);
        System.out.println(statistics.average());
        System.out.println(statistics1.average());

        System.out.println(statistics.sameAvg(statistics1));

    }
}
