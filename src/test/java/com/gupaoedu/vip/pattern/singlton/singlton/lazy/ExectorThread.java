/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ExectorThread
 * Author:   huchu
 * Date:     2019/3/18 15:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.lazy;

import com.gupaoedu.vip.pattern.singlton.singlton.threadLocal.ThreadLoacalSingleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/18
 * @since 1.0.0
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
        ThreadLoacalSingleton singleton = ThreadLoacalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +":"+singleton);
    }
}