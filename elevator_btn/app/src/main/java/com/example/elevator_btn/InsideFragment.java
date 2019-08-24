package com.example.elevator_btn;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.net.URISyntaxException;

import org.json.JSONException;
import org.json.JSONObject;

import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

public class InsideFragment extends Fragment {
    private Socket socket;
    {
        try {
            socket = IO.socket("http://15.164.68.143:9000");

        } catch (URISyntaxException e) {
            Log.d("tag", "ddd34");
            throw new RuntimeException(e);
        }
    }
    public InsideFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inside,null);
        socket.connect();
        Button one_btn = (Button)view.findViewById(R.id.in_one);
        one_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                socket.emit("normal", "1");
            }
        });

        Button two_btn = (Button)view.findViewById(R.id.in_two);
        two_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                socket.emit("normal", "2");
            }
        });

        Button three_btn = (Button)view.findViewById(R.id.in_three);
        three_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                socket.emit("normal", "3");
            }
        });

        Button four_btn = (Button)view.findViewById(R.id.in_four);
        four_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                socket.emit("normal", "4");
            }
        });


        return view;
    }

}
