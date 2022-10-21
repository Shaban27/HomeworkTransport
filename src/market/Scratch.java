package market;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Scratch {
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public static final List<String> NAMES = List.of(
            "Иван",
            "Владимир",
            "Евгений",
            "Дарья",
            "Елена Ивановна",
            "Сергей Александрович",
            "Евгений Александрови",
            "Алексей",
            "Ирина Александровна",
            "Ольга");

    public static void randomFiling(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer((NAMES.get(RANDOM.nextInt(NAMES.size()))));

        }
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю");
            return;
        }
        if (queue2.size() < queue1.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }


    }

}











