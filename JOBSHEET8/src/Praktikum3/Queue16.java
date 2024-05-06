package Praktikum3;

public class Queue16 {
    Costumer16[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue16(int n) {
        max = n;
        antrian = new Costumer16[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Pembeli paling depan: " + antrian[front].nama + ", No HP: " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Pembeli paling belakang: " + antrian[rear].nama + ", No HP: " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (i - front + 1));
                    return;
                }
            }
            System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void enqueue(Costumer16 p) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = p;
            size++;
        }
    }

    public Costumer16 dequeue() {
        Costumer16 p = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            p = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return p;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Pembeli: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Pembeli: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pembeli:");
            int i = front;
            while (i != rear) {
                System.out.println("Pembeli: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Pembeli: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
        }
    }
}
