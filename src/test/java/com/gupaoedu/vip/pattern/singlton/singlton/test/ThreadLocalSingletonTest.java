/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ThreadLocalSingletonTest
 * Author:   huchu
 * Date:     2019/3/20 10:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.test;

import com.gupaoedu.vip.pattern.singlton.singlton.lazy.ExectorThread;
import com.gupaoedu.vip.pattern.singlton.singlton.threadLocal.ThreadLoacalSingleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLoacalSingleton.getInstance());
        System.out.println(ThreadLoacalSingleton.getInstance());
        System.out.println(ThreadLoacalSingleton.getInstance());
        System.out.println(ThreadLoacalSingleton.getInstance());
        System.out.println(ThreadLoacalSingleton.getInstance());

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();
        System.out.println("end");
    }

}