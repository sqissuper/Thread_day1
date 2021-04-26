package thread_0422;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
            }
        });

        //启动线程
        thread.start();
    }
}
