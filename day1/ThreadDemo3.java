package thread_0422;

public class ThreadDemo3 {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("当前线程名称：" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        //新建Runnable
        MyRunnable runnable = new MyRunnable();
        //创建线程
        Thread thread = new Thread(runnable);
        //启动线程
        thread.start();
    }
}
