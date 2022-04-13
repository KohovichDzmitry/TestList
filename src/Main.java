import task.Produce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String value = "JAVA";
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(value);
            arrayList.add(value);
        }

        Produce<String> consumeArrayList = new Produce<>(arrayList, 10_000, value);
        Produce<String> consumeLinkedList = new Produce<>(linkedList, 10_000, value);
        String format = "%-40s %-10d %-5d %n";
        System.out.printf("%45s   %-10s %n","ArrayList", "LinkedList");
        System.out.printf(format, "Добавление в конец списка, мс", consumeArrayList.addValueToEnd(), consumeLinkedList.addValueToEnd());
        System.out.printf(format, "Добавление в начало списка, мс", consumeArrayList.addValueToStart(), consumeLinkedList.addValueToStart());
        System.out.printf(format, "Добавление в середину списка, мс", consumeArrayList.addValueInMiddle(), consumeLinkedList.addValueInMiddle());
        System.out.printf(format, "Получение из конца списка, мс", consumeArrayList.getValueInEnd(), consumeLinkedList.getValueInEnd());
        System.out.printf(format, "Получение из начала списка, мс", consumeArrayList.getValueInStart(), consumeLinkedList.getValueInStart());
        System.out.printf(format, "Получение из середины списка, мс", consumeArrayList.getValueInMiddle(), consumeLinkedList.getValueInMiddle());
        System.out.printf(format, "Удаление из конца списка, мс", consumeArrayList.removeValueToEnd(), consumeLinkedList.removeValueToEnd());
        System.out.printf(format, "Удаление из начала списка, мс", consumeArrayList.removeValueToStart(), consumeLinkedList.removeValueToStart());
        System.out.printf(format, "Удаление из середины списка, мс", consumeArrayList.removeValueInMiddle(), consumeLinkedList.removeValueInMiddle());
    }
}
