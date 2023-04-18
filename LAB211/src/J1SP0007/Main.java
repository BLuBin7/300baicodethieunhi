package J1SP0007;

import java.util.Scanner;

/**
 * Created by Binh
 * Date : 4/15/2023 - 10:46 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Graph graph = new Graph(4 );
        graph.addEdge(2, 4);
        graph.addEdge(4, 4);
        graph.addEdge(2, 5);
        System.out.println("Enter the start point: ");
        int start = input.nextInt();
        input.nextLine();

        System.out.println("Enter the end point: ");
        int end = input.nextInt();

        System.out.println((graph.isEdge(start, end) ? "" : " not ") + " an edge");
    }
}
