package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        TextView tv=findViewById(R.id.textview);
	        tv.setText(String.valueOf(sum(100)));
	    }
	    public int sum(int n) {
	        int s = 0;
	        int i = 1;
	        while (i <= n) {
	            s += i;
	            i++;
	        }
	        System.out.println("1到n累加的和为：" + s);
	        return  s;
	    }
}
