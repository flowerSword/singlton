/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazyCheckSingleton
 * Author:   huchu
 * Date:     2019/3/18 18:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.lazy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/18
 * @since 1.0.0
 */
public class LazyCheckSingleton {
    private static LazyCheckSingleton lazy=null;
    private LazyCheckSingleton() {
    }

    //双重锁检查
    //适中的方案
    public static LazyCheckSingleton getInstance(){
        if (lazy == null){
            synchronized (LazyCheckSingleton.class){
                if (lazy == null){
                    lazy = new LazyCheckSingleton();
                    //cpu执行时候会转化成jvm指令执行
                    //指令重排序的问题 volatile
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次访问
                }
            }
        }
        return lazy;
    }
}