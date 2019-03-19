/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HungrySinglton
 * Author:   huchu
 * Date:     2019/3/18 14:49
 * Description: 饿汉式单例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.singlton.singlton.hungry;

/**
 * 〈一句话功能简述〉<br> 
 * 〈饿汉式单例〉
 *
 * @author huchu
 * @create 2019/3/18
 * @since 1.0.0
 */
public class HungrySinglton {

    private static final HungrySinglton hungrySinglton;

    static {
        hungrySinglton = new HungrySinglton();
    }

    private HungrySinglton() {
    }

    public static HungrySinglton getInstance(){
        return hungrySinglton;
    }
}