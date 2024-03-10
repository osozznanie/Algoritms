package Step3;

public class Node {
    // Дані вузла, які містять число
    protected double data;
    // Посилання на наступний вузол у стеку або черзі
    protected Node next;

    // Конструктор вузла
    public Node(double data) {
        // Ініціалізуємо дані вузла
        this.data = data;
        // На початку наступний вузол відсутній, тому встановлюємо його як null
        this.next = null;
    }
}