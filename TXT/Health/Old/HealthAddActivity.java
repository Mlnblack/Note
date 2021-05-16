package com.example.myfirst;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthAddActivity extends Activity {
    private EditText txtInput;
    private EditText txtOutput;
    private EditText txtWeight;
    private EditText txtAmountExercise;
    private Button btnOK;
    private Button btnCancel;

    private DBHelper mDBHelper;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_mod);
        mDBHelper=new DBHelper(this);

        txtInput=findViewById(R.id.txtInput);
        txtOutput=findViewById(R.id.txtOutput);
        txtWeight=findViewById((R.id.txtWeight));
        txtAmountExercise=findViewById(R.id.txtAmountExercise);
        btnOK=findViewById(R.id.btnOK);
        btnCancel=findViewById(R.id.btnCancel);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date=new Date();
                SimpleDateFormat df=new SimpleDateFormat(SysConst.DATE_FORMATE);

                SQLiteDatabase db=mDBHelper.getWritableDatabase();
                ContentValues values=new ContentValues();
                values.put(SysConst.TABLE_FIELD_DATE,df.format(date));
                values.put(SysConst.TABLE_FIELD_INPUT,txtInput.getText().toString());
                values.put(SysConst.TABLE_FIELD_OUTPUT,txtOutput.getText().toString());
                values.put(SysConst.TABLE_FIELD_WEIGHT,txtWeight.getText().toString());
                values.put(SysConst.TABLE_FIELD_AMOUNTEXERCISE,txtAmountExercise.getText().toString());

                long ronId=db.insert(SysConst.TABLE_NAME,null,values);

                finish();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    finish();

            }
        });
    }
}
