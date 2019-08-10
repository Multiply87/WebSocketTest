package com.example.websockettest;

import android.util.Log;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

public class WebSocketGolos extends WebSocketListener {
    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        webSocket.send("Hello my darling!");
    }

    @Override
    public void onMessage(WebSocket webSocket, String text)
    {
        Log.d("WStest", text);
        System.out.print(text);
    }
}
