package com.example.myfirst;

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
