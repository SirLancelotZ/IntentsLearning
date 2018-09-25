package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private Button buttonSendMessage;
    private EditText editTextMessage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
    }

    private void wireWidgets(){
        buttonSendMessage = findViewById(R.id.button_sendmessage_msg);
        editTextMessage = findViewById(R.id.editText_sendmessage_msg);
    }

    ButtonSendMessage.setOn


    intentSendMessage.putExtra("themesage", message);
}
