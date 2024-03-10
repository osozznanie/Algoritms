package Step1;

public class Queue {
    // Масив для зберігання елементів черги
    private Double[] elements;
    // Кількість елементів в черзі
    private int size;
    // Індекс першого елемента в черзі
    private int front;
    // Індекс останнього елемента в черзі
    private int rear;

    // Конструктор черги з заданою ємністю
    public Queue(int capacity) {
        elements = new Double[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    // Перевіряє, чи повна черга
    public boolean isFull() {
        return size == elements.length;
    }

    // Перевіряє, чи порожня черга
    public boolean isEmpty() {
        return size == 0;
    }

    // Додає елемент в кінець черги
    public boolean enqueue(Double element) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
        return true;
    }

    // Видаляє елемент з початку черги
    public Double dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        Double element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    // Повертає рядкове представлення черги
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[(front + i) % elements.length]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}