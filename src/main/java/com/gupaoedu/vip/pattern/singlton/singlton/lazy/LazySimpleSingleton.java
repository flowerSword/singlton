/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazySimpleSingleton
 * Author:   huchu
 * Date:     2019/3/18 14:55
 * Description: 外部调用才开始实例化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.lazy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈外部调用才开始实例化〉
 *
 * @author huchu
 * @create 2019/3/18
 * @since 1.0.0
 */
public class LazySimpleSingleton {

    public static LazySimpleSingleton lazySimpleSingleton = null;
    private LazySimpleSingleton() {
    }
    public static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}