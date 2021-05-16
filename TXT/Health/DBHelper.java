/*
* Created by 智捷课堂
* 本书网站：http://www.51work6.com
* 智捷课堂在线课堂：http://www.zhijieketang.com/
* 智捷课堂微信公共号：zhijieketang
* QQ：569418560 邮箱：eorient@sina.com
* QQ交流群：162030268
*/

package com.a51work6.health;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBHelper";

    public DBHelper(Context context) {
        super(context, SysConst.DATABASE_NAME, null,
                SysConst.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            StringBuffer sql = new StringBuffer();
            sql.append("CREATE TABLE ");
            sql.append(SysConst.TABLE_NAME);
            sql.append(" (");
            sql.append(SysConst.TABLE_FIELD_DATE);
            sql.append(" Text PRIMARY KEY,");
            sql.append(SysConst.TABLE_FIELD_INPUT);
            sql.append(" Text,");
            sql.append(SysConst.TABLE_FIELD_OUTPUT);
            sql.append(" Text,");
            sql.append(SysConst.TABLE_FIELD_WEIGHT);
            sql.append(" Text ,");
            sql.append(SysConst.TABLE_FIELD_AMOUNTEXERCISE);
            sql.append(" Text");
            sql.append(");");
            Log.i(TAG, sql.toString());

            db.execSQL(sql.toString());
            //插入两条测试数据
            db.execSQL("insert into weight (_id,output,input) " +
                    "values('2016-10-8 17:24:27','1300大卡','3300大卡')");
            db.execSQL("insert into weight (_id,output,input) " +
                    "values('2016-10-9 15:26:45','2500大卡','4000大卡')");

        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SysConst.TABLE_NAME);
        onCreate(db);
    }
}
