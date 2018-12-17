package wprowadzenie.threads.ex1;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        StringHolder stringHolder = new StringHolder();
        MonitoringThread monitoringThread = new MonitoringThread(stringHolder);
        Thread thread = new Thread(monitoringThread);
        thread.start();
        Scanner scanner = new Scanner(System.in);
        do {
            String name = scanner.nextLine();
            stringHolder.setName(name);
        } while (!stringHolder.getName().equals("koniec"));
        monitoringThread.setWorking(false);

    }
}
