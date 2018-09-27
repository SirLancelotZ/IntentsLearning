package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class SendMessageActivity extends AppCompatActivity {

    private EditText message;
    private Button send;
    private Button share;

    public static final String EXTRA_SENT_MESSAGE = "the message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        wireWidgets();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the text from the edittext
                String msg = message.getText().toString();
                //create an intent: where the msg is coming from and where is it going
                Intent intentSendMsg = new Intent(SendMessageActivity.this, ReceiveMessageActivity.class);
                //package the text into the intent
                intentSendMsg.putExtra(EXTRA_SENT_MESSAGE, msg);
                //start the new activity
                startActivity(intentSendMsg);

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create an intent with no arguments
                Intent intentShare = new Intent();
                intentShare.setType("text/plain");
                intentShare.putExtra(EXTRA_SENT_MESSAGE, message.getText().toString());
                startActivity(intentShare);
            }
        });
    }

    private void wireWidgets() {
        message = findViewById(R.id.editText_sendmessage_msg);
        send = findViewById(R.id.button_sendmessage_send);
        share = findViewById(R.id.button_sendmessage_share);
    }
}
