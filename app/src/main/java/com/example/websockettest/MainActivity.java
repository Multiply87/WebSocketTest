package com.example.websockettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient.Builder().build();

        Request request = new Request.Builder()
                .url("ws://localhost:8080")
                .build();


        WebSocketGolos wsc = new WebSocketGolos();

        WebSocket ws = client.newWebSocket(request, wsc);

        client.dispatcher().executorService().shutdown();
    }
}
