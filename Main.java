public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000); // Ждём 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
