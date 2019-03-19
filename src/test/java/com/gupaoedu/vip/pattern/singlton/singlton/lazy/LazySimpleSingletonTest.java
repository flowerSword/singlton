/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LazySimpleSingletonTest
 * Author:   huchu
 * Date:     2019/3/18 15:00
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
public class LazySimpleSingletonTest {


    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("exetor end");
    }


}