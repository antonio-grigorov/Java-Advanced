package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> filesToPrint = new ArrayDeque<>();

        while (!"print".equals(input)) {

            switch (input) {
                case "cancel":
                    if (filesToPrint.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {
                        System.out.println("Canceled " + filesToPrint.poll());
                    }
                    break;
                default:
                    filesToPrint.offer(input);
                    break;

            }
            input = scanner.nextLine();
        }

        while (!filesToPrint.isEmpty()) {

            System.out.println(filesToPrint.poll());
        }


    }
}
