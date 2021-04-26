package thread_0422;

public class ThreadText {
    public static final Long count = 5_0000_0000L;
    public static void main(String[] args) {

        //调用多线程的方法
        concorrency();

        //调用单线程的执行方法
        single();
    }

    //单线程的方法
    private static void single() {
        //开始时间
        Long sTime = System.currentTimeMillis();

        int a = 0;
        for (int i = 0; i < 3 * count; i++) {
            a++;
        }

        //结束时间
        Long eTime = System.currentTimeMillis();
        System.out.println("单线程的执行时间：" + (eTime - sTime));
    }

    //多线程的方法
    private static void concorrency() {


        //开始时间
        Long sTime = System.currentTimeMillis();

        //创建线程任务1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }
            }
        });

        //开始执行线程1
        t1.start();

        //创建线程任务2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }
        });
        //开始执行线程2
        t2.start();

        //主线程执行
        int c = 0;
        for (int i = 0; i < count; i++) {
            c++;
        }


        //结束时间
        Long eTime = System.currentTimeMillis();
        //结果
        System.out.println("多线程执行时间:" + (eTime - sTime));
    }
}
