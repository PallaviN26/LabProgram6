package com.example.labprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        Button btn_xml,btn_json;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn_xml = (Button)findViewById(R.id.b_xml);
            btn_json = (Button)findViewById(R.id.b_json);
            btn_xml.setOnClickListener(this);
            btn_json.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if (v.equals(btn_json))
            {
                Intent it = new Intent(this,ViewActivity.class);
                it.putExtra("mode",1);
                startActivity(it);
            }
            else if(v.equals(btn_xml))
            {
                Intent it = new Intent(this,ViewActivity.class);
                it.putExtra("mode",2);
                startActivity(it);

            }

        }
    }