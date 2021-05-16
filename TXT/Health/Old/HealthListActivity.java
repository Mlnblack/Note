package com.example.myfirst;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import static com.example.myfirst.DBHelper.TAG;

public class HealthListActivity extends Activity {
    DBHelper mDBHelper=new DBHelper(this);
    Cursor mCursor ;
    SimpleCursorAdapter mCursorAdapter;
    final ListView mListView=findViewById(R.id.mhlistv);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_list);

        findAll();


    }


    private void findAll(){
        SQLiteDatabase db=mDBHelper.getReadableDatabase();

        String[] colums=new String[]{SysConst.TABLE_FIELD_DATE,SysConst.TABLE_FIELD_INPUT,SysConst.TABLE_FIELD_OUTPUT,SysConst.TABLE_FIELD_OUTPUT,SysConst.TABLE_FIELD_WEIGHT,SysConst.TABLE_FIELD_ANOUNTEXERCISE};
        mCursor=db.query(SysConst.TABLE_NAME,colums,null,null,null,null,SysConst.TABLE_FIELD_DATE+"asc");
    }
    while(mCursor.moveToNext()){
        Log.d(TAG,mCursor.getString(mCursor.getColumnIndex(SysConst.TABLE_FIELD_INPUT)));
        Log.d(TAG,mCursor.getString(mCursor.getColumnIndex(SysConst.TABLE_FIELD_OUTPUT)));
    }


    startManagingCursor(mCursor);
    mCursorAdapter=new SimpleCursorAdapter(this,R.layout.listitem,mCursor,colums,new int[]{R.id.date,R.id.output,R.id.weight,R.id.amountExercise});

    mListView.setAdapter(mCursorAdapter);


    }
}
