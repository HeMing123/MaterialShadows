package com.sdsmdg.harjot.materialshadowsdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.sdsmdg.harjot.materialshadows.MaterialShadowViewWrapper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox calculateAsync;
    private CheckBox showWhenAllReady;

    private MaterialShadowViewWrapper shadowViewWrapper;
    private RelativeLayout shadowViewWrapper1;
    private MaterialShadowViewWrapper shadowViewWrapper2;
    private SeekBar l;
    private SeekBar t;
    private SeekBar r;
    private SeekBar b;
    private ShadowContainer s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        /*shadowViewWrapper = (MaterialShadowViewWrapper) findViewById(R.id.shadow_wrapper);
        shadowViewWrapper1 = findViewById(R.id.shadow_wrapper1);
        shadowViewWrapper2 = (MaterialShadowViewWrapper) findViewById(R.id.shadow_wrapper2);

        calculateAsync = (CheckBox) findViewById(R.id.cb_calculate_async);
        showWhenAllReady = (CheckBox) findViewById(R.id.cb_show_when_all_ready);

        findViewById(R.id.btn_re_render).setOnClickListener(this);
        s = findViewById(R.id.s);
        l = findViewById(R.id.l);
        t = findViewById(R.id.t);
        r = findViewById(R.id.r);
        b = findViewById(R.id.b);
        l.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                s.setDeltaLengthLeft(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                s.setDeltaLengthTop(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                s.setDeltaLengthRight(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                s.setDeltaLengthBottom(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ((SeekBar) findViewById(R.id.con)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                s.setCornerRadius(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ((SeekBar) findViewById(R.id.shco)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float v = progress * getResources().getDimension(R.dimen.dp_30)/30f;
                ((TextView) findViewById(R.id.sc_siz)).setText("阴影范围:" + progress);
                s.setShadowRadius(v);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/
    }

    @Override
    public void onClick(View v) {
        shadowViewWrapper.setShouldCalculateAsync(calculateAsync.isChecked());
        shadowViewWrapper.setShowShadowsWhenAllReady(showWhenAllReady.isChecked());
        shadowViewWrapper.requestLayout();
    }

    public void setColor(View view) {
        String color = ((EditText) findViewById(R.id.et)).getText().toString();
        this.s.setShadowColor(Color.parseColor(color));
    }
}
