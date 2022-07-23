package fedorovsa.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerWeight).reversed());

        final int CAPACITY = 7;
        
        int currentWeight = 0;
        double currentValue = 0;
        int currentItem = 0;
        
        while (currentItem < items.length && currentWeight != CAPACITY) {
            if (currentWeight + items[currentItem].getWeight() < CAPACITY) {
                currentValue += items[currentItem].getValue();
                currentWeight += items[currentItem].getWeight();
            } else {
                currentValue += ((CAPACITY - currentWeight) / (double) items[currentItem].getWeight())
                        * items[currentItem].getValue();
                currentWeight = CAPACITY;
            }
            currentItem++;
        }
        System.out.println(currentValue);
    }
}

class Item {
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public double valuePerWeight() {
            return value / (double) weight;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

    @Override
    public String toString() {
        return "Item{"
                + "weight=" + weight
                + ", value=" + value
                + '}';
    }
}
