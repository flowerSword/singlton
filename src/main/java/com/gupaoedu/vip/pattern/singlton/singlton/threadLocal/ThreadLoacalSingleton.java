/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ThreadLoacalSingleton
 * Author:   huchu
 * Date:     2019/3/20 10:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.threadLocal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ThreadLoacalSingleton {
    private ThreadLoacalSingleton(){}
    private static final ThreadLocal<ThreadLoacalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLoacalSingleton>(){
        @Override
        protected ThreadLoacalSingleton initialValue() {
            return new ThreadLoacalSingleton();
        }
    };
    public static ThreadLoacalSingleton getInstance(){
        return THREAD_LOCAL.get();
    }

}