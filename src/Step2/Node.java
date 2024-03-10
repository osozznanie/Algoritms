package Step2;

public class Node {
    // Дані вузла, які містять двійкове представлення числа у вигляді рядка
    protected String data;
    // Посилання на наступний вузол у стеку
    protected Node next;

    // Конструктор вузла
    public Node(String data) {
        // Ініціалізуємо дані вузла
        this.data = data;
        // На початку наступний вузол відсутній, тому встановлюємо його як null
        this.next = null;
    }
}