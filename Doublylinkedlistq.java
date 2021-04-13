import java.util.Scanner;

public class Doublylinkedlistq<E> {
    private Node<E> header;
    private Node<E> tailer;
    private int size = 0;
     Student s=new Student("wafaa","alsalfi",20,7777,"ppp",1,2);
    Scanner input=new Scanner(System.in);
    public Doublylinkedlistq() {
        header = new Node<>(null, null, null);
        tailer = new Node<>(null, header, null);
        header.setNext(tailer);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tailer.getPev().getElement();
    }

    public void addbetwwen(E element, Node<E> p, Node<E> s) {
        Node<E> newst = new Node<>(element, p, s);
        p.setNext(newst);
        s.setPev(newst);
        size++;
    }

    public void addfirst(E element) {
        addbetwwen(element, header, header.getNext());
    }

    public void addlast(E element) {
        addbetwwen(element, tailer.getPev(), tailer);
    }

    public E remove(Node<E> x) {
        Node<E> p = x.getPev();
        Node<E> s = x.getNext();
        p.setNext(s);
        s.setPev(p);
        size--;
        return x.getElement();
    }

    public E removefirt() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removelast() {
        if (isEmpty()) return null;
        return remove(tailer.getPev());
    }

public boolean edit(int id)
{
    System.out.println("enter the id");
    s.setId(input.nextInt());
    s.setId(input.nextInt());
    return true;

}

    public void printNodes() {
        //Node current will point to head
      Node c = header.getNext();
        System.out.println("Nodes of doubly linked list: ");
        while(c != null) {
            //Print each node and then go to next.
            System.out.print(c.element );
            c = c.next;
        }
        System.out.println();
    }

    public void printNodes(boolean edit) {
        Node c = header.getNext();
        System.out.println("Nodes of doubly linked list: ");
        while(c != null) {
            //Print each node and then go to next.
            System.out.print(c.element );
            c = c.next;
        }
        System.out.println();
    }



    private static class Node<E> {
        E element;
        Node<E> pev;
        Node<E> next;

        public Node(E element, Node<E> pev, Node<E> next) {
            this.element = element;
            this.pev = pev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPev() {
            return pev;
        }

        public void setPev(Node<E> pev) {
            this.pev = pev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
