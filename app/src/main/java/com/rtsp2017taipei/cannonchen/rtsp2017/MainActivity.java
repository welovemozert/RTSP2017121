package com.rtsp2017taipei.cannonchen.rtsp2017;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.VideoView;

public class MainActivity extends Activity implements OnClickListener{

    EditText rtspUrlOK ;
    Button playButtonOK ;
    VideoView videoViewOK ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rtspUrlOK = (EditText)this.findViewById(R.id.editText2017);
        videoViewOK = (VideoView)this.findViewById(R.id.rtspVideo2017);
        playButtonOK = (Button)this.findViewById(R.id.playButton2017);
        playButtonOK.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.playButton:
                RtspStream(rtspUrlOK.getEditableText().toString());
                break;
        }
    }

    private void RtspStream(String rtspUrl){
        videoViewOK.setVideoURI(Uri.parse(rtspUrl));
        videoViewOK.requestFocus();
        videoViewOK.start();
    }

}