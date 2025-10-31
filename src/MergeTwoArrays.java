import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,0}, b = {4,5,6,7};
        int[] newIntComb = new int[a.length+b.length];

        System.arraycopy(a, 0, newIntComb, 0, a.length);
        System.arraycopy(b, 0, newIntComb, a.length, b.length);
        Arrays.stream(newIntComb).filter(x -> x != 0).sorted().forEach(System.out::println);




    }
}
