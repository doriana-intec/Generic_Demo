package be.intebrussel.generic_interfaces;

public class MinMaxApp {
    public static void main(String[] args) {

        Integer[] numbers = {1, 3, 6};
        Character[] characters = {'a', 'b', 'd'};

        MinMaxImpl<Integer> integerMinMax = new MinMaxImpl<>(numbers);
        System.out.println(integerMinMax.min());
        System.out.println(integerMinMax.max());

        MinMaxImpl<Character> characterMinMax = new MinMaxImpl<>(characters);
        System.out.println(characterMinMax.min());
        System.out.println(characterMinMax.max());
    }
}
