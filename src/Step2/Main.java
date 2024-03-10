package Step2;

public class Main {
    public static void main(String[] args) {
        // Створюємо новий стек
        Stack stack = new Stack();

        // Додаємо елементи до стеку
        // Конвертуємо число 1 в двійкову форму і додаємо до стеку
        stack.push(Integer.toBinaryString(1));
        // Конвертуємо число 2 в двійкову форму і додаємо до стеку
        stack.push(Integer.toBinaryString(2));
        // Конвертуємо число 3 в двійкову форму і додаємо до стеку
        stack.push(Integer.toBinaryString(3));

        // Друкуємо вміст стеку
        System.out.println("Стек після додавання елементів:");
        stack.printStack();

        // Видаляємо елементи зі стеку
        // Видаляємо верхній елемент стеку
        stack.pop();
        // Видаляємо наступний верхній елемент стеку
        stack.pop();

        // Друкуємо вміст стеку
        System.out.println("Стек після видалення елементів:");
        stack.printStack();
    }
}