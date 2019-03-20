/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConcurrentExecutor
 * Author:   huchu
 * Date:     2019/3/20 9:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ConcurrentExecutor {
    public static void execute(final RunHandler runHandler,int executeCount,int concurrentCount) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();

        //控制信号量此处用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);
        //闭锁实现计数递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i=0;i<executeCount;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //执行此方法用于获取执行许可，当总计未释放的许可数不超过executeCount时,
                        //则允许同性，否则线程阻塞等待，知道获取到许可
                        semaphore.acquire();
                        runHandler.handler();
                        semaphore.release();

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();//线程阻塞，知道闭锁值为0时，阻塞才释放，继续往下执行
        executorService.shutdown();

    }

    public interface RunHandler{
        void handler();
    }
}
