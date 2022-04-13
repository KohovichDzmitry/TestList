package task;

import java.util.List;

public class Produce<T> {

    List<T> list;
    int amount;
    T value;

    public Produce(List<T> list, int amount, T value) {
        this.list = list;
        this.amount = amount;
        this.value = value;
    }

    public long addValueToEnd() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.add(value);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long addValueToStart() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.add(0, value);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long addValueInMiddle() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.add(list.size() / 2, value);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long getValueInEnd() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.get(list.size() - 1);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long getValueInStart() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.get(0);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long getValueInMiddle() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.get(list.size() / 2);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long removeValueToEnd() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.remove(list.size() - 1);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long removeValueToStart() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.remove(0);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }

    public long removeValueInMiddle() {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.remove(list.size() / 2);
        }
        long finish = System.nanoTime();
        return (finish - start) / 1_000_000;
    }
}
