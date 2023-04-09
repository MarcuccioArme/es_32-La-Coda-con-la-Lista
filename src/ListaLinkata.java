public class ListaLinkata {

    private Nodo front;
    private Nodo rear;
    private int size;

    public ListaLinkata() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(int data) {
        Nodo nuovoNodo = new Nodo(data);
        if (isEmpty()) {
            front = nuovoNodo;
        } else {
            rear.next = nuovoNodo;
        }
        rear = nuovoNodo;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("La lista è vuota.");
        }
        int dato = front.dato;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dato;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("La lista è vuota.");
        }
        return front.dato;
    }
}