package com.tengu.annotation;

import java.lang.annotation.*;

/**
 * Table注解,被注解的对象代表是数据库的一张表.
 * 注解中可以设置表的各个属性,从而无需SQL直接创建表.
 *
 * @author 404NotFoundx
 * @version 1.0.0
 * @date 2019/11/4 14:22
 * @since 1.8
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Model {

    /**
     * 表名
     * @return
     */
    String value() default "";

    /**
     * 设置表的储存引擎，默认InnoDB
     * @return
     */
    Engine engine() default Engine.INNODB;

}