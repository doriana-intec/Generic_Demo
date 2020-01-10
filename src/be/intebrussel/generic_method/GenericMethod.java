package be.intebrussel.generic_method;

public class GenericMethod {

    public static <T extends Comparable<T>, V extends T> String showResult
            (T number, T[] array){
        String result = "";
        for (int i = 0; i< array.length;i++){
            if (number.equals(array[i])){
                 result = "This nr is in the array";
                 break;
            }else{
                result ="This number is not in the array";
                break;
            }

        }
    return result;
    }

    public static void main(String[] args) {
        Integer[] arrayOfInts = {5,8,9,10};
        System.out.println(showResult(5, arrayOfInts));
        System.out.println(showResult(7, arrayOfInts));

    }
}
