/*
* Created by 智捷课堂
* 本书网站：http://www.51work6.com
* 智捷课堂在线课堂：http://www.zhijieketang.com/
* 智捷课堂微信公共号：zhijieketang
* QQ：569418560 邮箱：eorient@sina.com
* QQ交流群：162030268
*/

package com.a51work6.health;

public interface SysConst {
    //文件名
    public static final String DATABASE_NAME = "Health.db";
    //健康表名
    public static final String TABLE_NAME = "Health";
    //应用的数据版本
    public static final int DATABASE_VERSION = 2;
    //日期
    public static final String TABLE_FIELD_DATE = "_id";
    //摄入热量
    public static final String TABLE_FIELD_INPUT = "input";
    //消耗热量
    public static final String TABLE_FIELD_OUTPUT = "output";
    //体重
    public static final String TABLE_FIELD_WEIGHT = "weight";
    //运动情况
    public static final String TABLE_FIELD_AMOUNTEXERCISE = "amountExercise";
    //日期格式
    public static final String DATE_FORMATE = "yyyy-MM-dd HH:mm:ss";

}
