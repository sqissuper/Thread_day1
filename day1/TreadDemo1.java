package thread_0422;

/*
    继承Thread类
 */
public class TreadDemo1 {
    static class MyThread extends Thread {
        @Override
        public void run() {
            //线程执行任务
            System.out.println("当前线程名称：" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        //创建线程
        Thread t1 = new MyThread();
        //运行线程
        t1.start();

        System.out.println("主线程名称：" + Thread.currentThread().getName());
    }
}
