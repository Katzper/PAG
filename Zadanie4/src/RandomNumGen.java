import java.util.*;

public class RandomNumGen {
    private int max;
    private int n;
    private int s;

    public RandomNumGen(int max, int n, int s) {
        if(s > max)
            throw new IllegalArgumentException("Special value cannot be larger than maximum value");

        this.max = max;
        this.n = n;
        this.s = s;
            }

    public ArrayList<Integer> gen() {
        Random rand = new Random();
        var numbers = new ArrayList<Integer>();
        int curr;
        do {
            curr = rand.nextInt(this.max);
            numbers.add(curr);
        } while(curr != this.s);

        return numbers;
    }

    public void output() {
        var arr = this.gen();

        int amount = Math.min(this.n, arr.size());

        System.out.print("Wygenerowane liczby: ");
        for (var elem : arr)
            System.out.print(elem.toString() + ", ");

        System.out.println(' ');

        System.out.print("Lista pierwszych wygenerowanych elementów: ");
        for (int i = 0; i < amount; ++i)
            System.out.print(arr.get(i).toString() + ", ");

        System.out.println(' ');

        System.out.print("Lista ostatnich wygenerowanych argumentów: ");
        for (int i = arr.size() - 1; i > arr.size() - amount - 1; --i)
            System.out.print(arr.get(i).toString() + ", ");

        System.out.println(' ');

        Set<Integer> set = new TreeSet<>(arr);
        System.out.print("Sorted unique values: ");
        for (var elem : set)
            System.out.print(elem.toString() + ", ");

        System.out.println(' ');
    }



    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomNumGen that = (RandomNumGen) o;
        return max == that.max && n == that.n && s == that.s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, n, s);
    }
}
