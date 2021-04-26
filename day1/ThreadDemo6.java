package thread_0422;

import java.util.Random;
        import java.util.concurrent.Callable;
        import java.util.concurrent.ExecutionException;
        import java.util.concurrent.Future;
        import java.util.concurrent.FutureTask;

/*
    创建并得到线程的执行结果
    实现 Callable 接口 + Future 的方式
 */
public class ThreadDemo6 {
    //创建了线程的任务
    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            //生成一个随机数
            int num = new Random().nextInt(10);
            System.out.println("子线程：" + Thread.currentThread().getName() + ",随机数：" + num);
            return num;
        };
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建 Callable
        MyCallable callable = new MyCallable();

        //创建 FutureTask 对象接收返回值
        FutureTask<Integer> future = new FutureTask<>(callable);

        //创建Thread
        Thread thread = new Thread(future);

        //执行线程
        thread.start();

        int result = future.get();

        System.out.println(String.format("线程名：%s,数字：%d",Thread.currentThread().getName(),result));

    }
}
