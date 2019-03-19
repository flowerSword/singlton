/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazyInnerClassSingleton
 * Author:   huchu
 * Date:     2019/3/18 18:58
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
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if (LazyHolder.lazy != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    /**
     * lazyHolder
     * 全程没有用到sychronized
     * 性能最优的一种写法
     * 作业:理解内部类的执行逻辑
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;

    }

    /**
     * 懒汉式单例
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazy=new LazyInnerClassSingleton();
    }

}