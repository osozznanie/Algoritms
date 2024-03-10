package Step3;

public class Queue {
    // Передня і задня частини черги
    Node front, rear;

    // Конструктор черги
    public Queue() {
        // На початку черга порожня, тому передня і задня частини - null
        this.front = this.rear = null;
    }

    // Метод для додавання елемента до черги
    public void enqueue(double data) {
        // Створюємо новий вузол з даними
        Node newNode = new Node(data);
        // Якщо черга порожня, встановлюємо новий вузол як передню і задню частину
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        // В іншому випадку, додаємо новий вузол до кінця черги
        rear.next = newNode;
        // І встановлюємо його як задню частину
        rear = newNode;
    }

    // Метод для видалення елемента з черги
    public void dequeue() {
        // Якщо черга порожня, немає чого видаляти
        if (front == null) {
            return;
        }
        // В іншому випадку, переміщуємо передню частину на наступний вузол
        front = front.next;
        // Якщо передня частина стала null, то задня частина також стає null
        if (front == null) {
            rear = null;
        }
    }

    // Метод для виведення вмісту черги
    public void printQueue() {
        // Починаємо з передньої частини черги
        Node temp = front;
        // Проходимо через вузли черги, поки не дійдемо до кінця
        while (temp != null) {
            // Виводимо дані поточного вузла
            System.out.println(temp.data);
            // Переходимо до наступного вузла
            temp = temp.next;
        }
    }
}