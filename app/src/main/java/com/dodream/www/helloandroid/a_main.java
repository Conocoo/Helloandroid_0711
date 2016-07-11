package com.dodream.www.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class a_main extends AppCompatActivity {

    EditText edit_input;
    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        edit_input = (EditText) findViewById(R.id.edit_input);
        tv_show = (TextView) findViewById(R.id.text_show);

        Button btn_send = (Button) findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = edit_input.getText().toString();
                //tv_show.setText(text);
                tv_show.setText(edit_input.getText().toString());
            }
        });
    }//onCreate

}//class