package wprowadzenie.threads.ex1;

public class MonitoringThread implements Runnable {
    StringHolder stringHolder;
    private boolean isWorking;

    public MonitoringThread(StringHolder stringHolder) {
        this.stringHolder = stringHolder;
        this.isWorking = true;
    }

    @Override
    public void run() {
        String previousName = "";
        while (isWorking) {
            if (!stringHolder.getName().equals(previousName)) {
                System.out.println("Prev :" + previousName + " new name: " + stringHolder.getName());
                previousName = stringHolder.getName();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
