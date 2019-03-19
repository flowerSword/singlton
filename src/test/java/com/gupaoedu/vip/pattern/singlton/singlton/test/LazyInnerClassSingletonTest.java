/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazyInnerClassSingletonTest
 * Author:   huchu
 * Date:     2019/3/18 19:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.test;

import com.gupaoedu.vip.pattern.singlton.singlton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/18
 * @since 1.0.0
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {

            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c =  clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1==o2);

        } catch (Exception e ){
            e.printStackTrace();
        }
    }

}