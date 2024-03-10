package Step2;

public class Stack {
    // Вершина стеку
    private Node top;

    // Конструктор стеку
    public Stack() {
        // На початку стек порожній, тому вершина - null
        this.top = null;
    }

    // Метод для додавання елемента в стек
    public void push(String data) {
        // Створюємо новий вузол з даними
        Node newNode = new Node(data);
        // Якщо стек не порожній, встановлюємо посилання нового вузла на поточну вершину
        if (top != null) {
            newNode.next = top;
        }
        // Встановлюємо новий вузол як вершину стеку
        top = newNode;
    }

    // Метод для видалення елемента зі стеку
    public void pop() {
        // Якщо стек не порожній, видаляємо верхній елемент, переміщуючи вершину на наступний вузол
        if (top != null) {
            top = top.next;
        }
    }

    // Метод для виведення вмісту стеку
    public void printStack() {
        // Починаємо з вершини стеку
        Node temp = top;
        // Проходимо через вузли стеку, поки не дійдемо до кінця
        while (temp != null) {
            // Виводимо дані поточного вузла
            System.out.println(temp.data);
            // Переходимо до наступного вузла
            temp = temp.next;
        }
    }
}