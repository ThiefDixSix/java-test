package thread;

public class ThreadTest1 {

    public static void main(String[] args) {
        System.out.println("main thread start");

        new Thread(()->{
            System.out.println("child thread1 start");

            System.out.println("child thread1 end");

        }).start();

        new Thread(()->{
            System.out.println("child thread2 start");
            System.out.println("child thread2 end");

        }).start();
        System.out.println("main thread end");

    }
}
