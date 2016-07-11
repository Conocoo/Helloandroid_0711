package com.dodream.www.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class a_main extends AppCompatActivity {

    EditText edit_input;
    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        edit_input = (EditText) findViewById(R.id.edit_input);
        tv_show = (TextView) findViewById(R.id.text_show);

        Button button = (Button) findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String text = edit_input.getText().toString();
                //tv_show.setText(text);
                tv_show.setText(edit_input.getText().toString());
            }
        });

        button = (Button) findViewById(R.id.btn_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = getResources().getString(R.string.toast);
                Toast.makeText(a_main.this, s, Toast.LENGTH_SHORT).show();
                //Toast.makeText(a_main.this,R.string.toast,Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.btn_google);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn_call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01083667792"));
                startActivity(intent);
            }
        });
    }//onCreate
}//class