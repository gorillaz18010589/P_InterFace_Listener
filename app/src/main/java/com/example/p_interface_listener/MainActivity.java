package com.example.p_interface_listener;
/*一開始創建一個Counter物件裡面有一個send方法,利用thared在執行緒背景每一秒印一次,但當秒數結束我無法得知*
故我需要一個監聽者去監聽
/
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Counter counter = new Counter();
    private TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMsg = findViewById(R.id.tvMsg);

         counter.setOnCountListener(new Counter.OnCountListener() {
             @Override
             public void onCount(int count) {
                 Log.v("hank","onCount:" + count);
             }
         });

        counter.printCount();

    }
}