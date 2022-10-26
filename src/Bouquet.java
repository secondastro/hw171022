import java.util.Arrays;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public double getCost() {
        double sum =0;
        for (Flower arr : flowers) {
            if (arr != null) {
                sum += arr.getCost();
            }
        }
        return sum+sum*0.1;
    }
    public int getLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (Flower arr : flowers) {
            if (arr.getLifeSpan() < min) {
                min = arr.getLifeSpan();
            }
        }
        return min;
    }

    @Override
    public String toString() {
        String[] array = new String[flowers.length];
                for (int i =0; i < flowers.length; i++) {
                    array[i] = flowers[i].getName();

        }
        return Arrays.toString(array);
    }
}
