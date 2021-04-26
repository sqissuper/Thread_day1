package thread_0422;

public class ThreadDemo5 {
    public static void main(String[] args) {
//        //lambda + 匿名 Runnable 的方法  (JDK 8 后版本可使用此方法)
//        Thread thread = new Thread(()->{
//            System.out.println("当前线程名称：" + Thread.currentThread().getName());
//        });
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
