public class main {
    public static void main(String[] args) {
        Window window = Window.getWindow();

        Thread thread = new Thread(window);
        thread.start();
    }
}