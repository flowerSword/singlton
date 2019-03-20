/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ContainerSingletonTest
 * Author:   huchu
 * Date:     2019/3/20 9:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.test;

import com.gupaoedu.vip.pattern.singlton.singlton.register.ContainerSingleton;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {


            long begin = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singlton.singlton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }, 10, 6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时："+(end - begin)+"ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}