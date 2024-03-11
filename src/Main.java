import java.util.*;
// Головний клас програми
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musician musician = new MusicianImpl();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати інструмент до музиканта");
            System.out.println("2. Відтворити всі інструменти на яких грає музикант");
            System.out.println("3. Створити нового музиканта");
            System.out.println("4. Вихід з програми");

            System.out.print("Виберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nДодавання інструменту:");
                    System.out.println("1. Гітара");
                    System.out.println("2. Барабан");
                    System.out.println("3. Бандура");
                    System.out.print("Виберіть інструмент для додавання: ");
                    int instrumentChoice = scanner.nextInt();
                    switch (instrumentChoice) {
                        case 1:
                            musician.addInstrument(new Guitar());
                            break;
                        case 2:
                            musician.addInstrument(new Drum());
                            break;
                        case 3:
                            musician.addInstrument(new Bandura());
                            break;
                        default:
                            System.out.println("Некоректний вибір.");
                    }
                    break;
                case 2:
                    System.out.println("\nВідтворення інструментів:");
                    musician.playInstrument();
                    break;
                case 3:
                    musician = new MusicianImpl();
                    System.out.println("\nСтарого музиканта видалено");
                    System.out.println("\nСтворено нового музиканта");
                    break;
                case 4:
                    System.out.println("\nПрограма завершує роботу.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некоректний вибір.");
            }
        }
    }
}