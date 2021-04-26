package thread_0422;

public class TreadDemo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
            }
        };

        //执行线程
        thread.start();
    }
}
