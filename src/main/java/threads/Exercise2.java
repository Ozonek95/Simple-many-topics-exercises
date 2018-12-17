package threads;

public class Exercise2 implements Runnable {

    String name;

    public Exercise2(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println("Uruchamiam wątek "+name);
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Kończę pracę - wątek "+name);
    }
}
