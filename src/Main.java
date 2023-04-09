import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaLinkata queue = new ListaLinkata();

        int scelta = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("0. Esci");

            System.out.print ("\nScelta: ");

            scelta = input.nextInt();
            switch (scelta) {
                case 1 -> {
                    System.out.print("Inserisci un numero: ");
                    int num = input.nextInt();
                    queue.enqueue(num);
                    System.out.println("\n" + num + " enqueued.");
                }
                case 2 -> {
                    int dequeued = queue.dequeue();
                    System.out.println("\n" + dequeued + " dequeued.");
                }
                case 3 -> {
                    int peeked = queue.peek();
                    System.out.println("\nIn coda: " + peeked);
                }
                case 0 -> System.out.println("\nArrivederci.");

                default -> System.out.println("\nScelta non valida. Riprova");
            }

        } while (scelta != 0);
        input.close();
    }
}