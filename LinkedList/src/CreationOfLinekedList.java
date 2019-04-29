
import java.util.Scanner;

public class CreationOfLinekedList {

    class Node {

        int data;
        Node ptr;
    }
    Node root = null;

    void CreationLinkedList() {
        Node temp = new Node();
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            a = sc.nextInt();
            if (a < 0) {
                break;
            }
            Node nn = new Node();
            nn.data = a;
            if (root == null) {
                root = nn;
            } else {
                temp.ptr = nn;
            }
            temp = nn;
        }
        temp.ptr = null;

    }

    void AAF(int x) {

        Node nn = new Node();
        nn.data = x;
        nn.ptr = root;
        root = nn;

    }

    void Print() {
        Node root1 = root;
        while (root1 != null) {
            System.out.print(root1.data);
            System.out.print(' ');
            root1 = root1.ptr;

        }
    }

    void AAL(int x) {
        Node t = root;
        while (t.ptr.ptr != null) {
            t = t.ptr;
        }
        Node nn = new Node();
        nn.data = x;
        nn.ptr = null;
        t.ptr = nn;

    }

    public static void main(String args[]) {
        try {
            CreationOfLinekedList ref = new CreationOfLinekedList();
            ref.CreationLinkedList();
            ref.Print();
            System.out.println("Add At First-->");
            ref.AAF(10);
            ref.Print();
            ref.AAL(6);
            ref.Print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }}
