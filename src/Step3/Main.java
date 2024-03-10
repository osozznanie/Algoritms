package Step3;

public class Main {
    public static void main(String[] args) {

        // Створюємо нову чергу
        Queue queue = new Queue();
        // Створюємо новий стек
        Stack stack = new Stack();

        // Додаємо елементи до черги
        queue.enqueue(1.1);
        queue.enqueue(-2.2);
        queue.enqueue(3.3);

        // Друкуємо вміст черги
        System.out.println("Черга після додавання елементів:");
        queue.printQueue();

        // Формуємо стек і видаляємо від'ємні елементи з черги
        Node temp = queue.front;
        while (temp != null) {
            if (temp.data < 0) {
                // Видаляємо від'ємний елемент з черги
                queue.dequeue();
            } else {
                // Додаємо елемент до стеку у двійковому форматі
                stack.push(Double.parseDouble(Integer.toBinaryString((int) Math.round(temp.data))));
                // Видаляємо елемент з черги
                queue.dequeue();
            }
            temp = queue.front;
        }

        // Друкуємо вміст черги і стеку
        System.out.println("Черга після формування стеку і видалення від'ємних елементів:");
        queue.printQueue();
        System.out.println("Стек після формування його з черги:");
        stack.printStack();
    }
}