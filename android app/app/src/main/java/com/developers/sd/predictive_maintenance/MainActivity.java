package com.developers.sd.predictive_maintenance;

        import android.graphics.Color;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.CompoundButton;
        import android.widget.SeekBar;
        import android.widget.Spinner;
        import android.widget.Switch;

        import java.util.ArrayList;
        import java.util.List;

        import at.grabner.circleprogress.AnimationState;
        import at.grabner.circleprogress.AnimationStateChangedListener;
        import at.grabner.circleprogress.CircleProgressView;
        import at.grabner.circleprogress.Direction;
        import at.grabner.circleprogress.TextMode;
        import at.grabner.circleprogress.UnitPosition;


public class MainActivity extends AppCompatActivity {

    /**
     * The log tag.
     */
    private final static String TAG = "MainActivity";

    CircleProgressView mCircleView;
    CircleProgressView mCircleView1;
    CircleProgressView mCircleView2;
    CircleProgressView mCircleView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ENGINE 1

        mCircleView = (CircleProgressView) findViewById(R.id.circleView);
        mCircleView.setOnProgressChangedListener(new CircleProgressView.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(float value) {
                Log.d(TAG, "Progress Changed: " + value);
            }
        });

//        value setting
        mCircleView.setMaxValue(100);
        mCircleView.setValue(0);
        int x = 111;
        mCircleView.setValueAnimated(x);

        //growing/rotating counter-clockwise
        mCircleView.setDirection(Direction.CCW);

//        //text sizes
        mCircleView.setTextSize(50); // text size set, auto text size off
        mCircleView.setUnitSize(40); // if i set the text size i also have to set the unit size
        mCircleView.setAutoTextSize(true); // enable auto text size, previous values are overwritten
        //if you want the calculated text sizes to be bigger/smaller you can do so via
        mCircleView.setUnitScale(0.9f);
        mCircleView.setTextScale(0.9f);

//        //color
//      you can use a gradient
        mCircleView.setBarColor(getResources().getColor(R.color.primary), getResources().getColor(R.color.accent));
//
//        //colors of text and unit can be set via
        mCircleView.setTextColor(Color.RED);
        mCircleView.setTextColor(Color.BLUE);
//        //or to use the same color as in the gradient
        mCircleView.setTextColorAuto(true); //previous set values are ignored
//
//        //text mode
        mCircleView.setText("111"); //shows the given text in the circle view
        mCircleView.setTextMode(TextMode.TEXT); // Set text mode to text to show text
//
//        //in the following text modes, the text is ignored
        mCircleView.setTextMode(TextMode.VALUE); // Shows the current value
        mCircleView.setTextMode(TextMode.PERCENT); // Shows current percent of the current value from the max value
        //Engine 2
        mCircleView1 = (CircleProgressView) findViewById(R.id.circleView1);
        mCircleView1.setOnProgressChangedListener(new CircleProgressView.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(float value) {
                Log.d(TAG, "Progress Changed: " + value);
            }
        });

//        value setting
        mCircleView1.setMaxValue(100);
        mCircleView1.setValue(0);
        int x1 = 96;
        mCircleView1.setValueAnimated(x1);

        //growing/rotating counter-clockwise
        mCircleView1.setDirection(Direction.CCW);

//        //text sizes
        mCircleView1.setTextSize(50); // text size set, auto text size off
        mCircleView1.setUnitSize(40); // if i set the text size i also have to set the unit size
        mCircleView1.setAutoTextSize(true); // enable auto text size, previous values are overwritten
        //if you want the calculated text sizes to be bigger/smaller you can do so via
        mCircleView1.setUnitScale(0.9f);
        mCircleView1.setTextScale(0.9f);

//        //color
//      you can use a gradient
        mCircleView1.setBarColor(getResources().getColor(R.color.primary), getResources().getColor(R.color.accent));
//
//        //colors of text and unit can be set via
        mCircleView1.setTextColor(Color.RED);
        mCircleView1.setTextColor(Color.BLUE);
//        //or to use the same color as in the gradient
        mCircleView1.setTextColorAuto(true); //previous set values are ignored
//
//        //text mode
        mCircleView1.setText("Text"); //shows the given text in the circle view
        mCircleView.setTextMode(TextMode.TEXT); // Set text mode to text to show text
//
//        //in the following text modes, the text is ignored
        mCircleView1.setTextMode(TextMode.VALUE); // Shows the current value
        mCircleView1.setTextMode(TextMode.PERCENT); // Shows current percent of the current value from the max value

        //ENGINE 3
        mCircleView2 = (CircleProgressView) findViewById(R.id.circleView2);
        mCircleView2.setOnProgressChangedListener(new CircleProgressView.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(float value) {
                Log.d(TAG, "Progress Changed: " + value);
            }
        });

//        value setting
        mCircleView2.setMaxValue(100);
        mCircleView2.setValue(0);
        int x2 = 67;
        mCircleView2.setValueAnimated(x2);

        //growing/rotating counter-clockwise
        mCircleView2.setDirection(Direction.CCW);

//        //text sizes
        mCircleView2.setTextSize(50); // text size set, auto text size off
        mCircleView2.setUnitSize(40); // if i set the text size i also have to set the unit size
        mCircleView2.setAutoTextSize(true); // enable auto text size, previous values are overwritten
        //if you want the calculated text sizes to be bigger/smaller you can do so via
        mCircleView2.setUnitScale(0.9f);
        mCircleView2.setTextScale(0.9f);

//        //color
//      you can use a gradient
        mCircleView2.setBarColor(getResources().getColor(R.color.primary), getResources().getColor(R.color.accent));
//
//        //colors of text and unit can be set via
        mCircleView2.setTextColor(Color.RED);
        mCircleView2.setTextColor(Color.BLUE);
//        //or to use the same color as in the gradient
        mCircleView2.setTextColorAuto(true); //previous set values are ignored
//
//        //text mode
        mCircleView2.setText("Text"); //shows the given text in the circle view
        mCircleView.setTextMode(TextMode.TEXT); // Set text mode to text to show text
//
//        //in the following text modes, the text is ignored
        mCircleView2.setTextMode(TextMode.VALUE); // Shows the current value
        mCircleView2.setTextMode(TextMode.PERCENT); // Shows current percent of the current value from the max value

        //Engine 4
        mCircleView3 = (CircleProgressView) findViewById(R.id.circleView3);
        mCircleView3.setOnProgressChangedListener(new CircleProgressView.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(float value) {
                Log.d(TAG, "Progress Changed: " + value);
            }
        });

//        value setting
        mCircleView3.setMaxValue(100);
        mCircleView3.setValue(0);
        int x3 = 81;
        mCircleView3.setValueAnimated(x3);

        //growing/rotating counter-clockwise
        mCircleView3.setDirection(Direction.CCW);

//        //text sizes
        mCircleView3.setTextSize(50); // text size set, auto text size off
        mCircleView3.setUnitSize(40); // if i set the text size i also have to set the unit size
        mCircleView3.setAutoTextSize(true); // enable auto text size, previous values are overwritten
        //if you want the calculated text sizes to be bigger/smaller you can do so via
        mCircleView3.setUnitScale(0.9f);
        mCircleView3.setTextScale(0.9f);

//        //color
//      you can use a gradient
        mCircleView3.setBarColor(getResources().getColor(R.color.primary), getResources().getColor(R.color.accent));
//
//        //colors of text and unit can be set via
        mCircleView3.setTextColor(Color.RED);
        mCircleView3.setTextColor(Color.BLUE);
//        //or to use the same color as in the gradient
        mCircleView3.setTextColorAuto(true); //previous set values are ignored
//
//        //text mode
        mCircleView3.setText("Text"); //shows the given text in the circle view
        mCircleView.setTextMode(TextMode.TEXT); // Set text mode to text to show text
//
//        //in the following text modes, the text is ignored
        mCircleView3.setTextMode(TextMode.VALUE); // Shows the current value
        mCircleView3.setTextMode(TextMode.PERCENT); // Shows current percent of the current value from the max value

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

//    private class LongOperation extends AsyncTask<Void, Void, Void> {
//        @Override
//        protected Void doInBackground(Void... params) {
//
//            MainActivity.this.runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    mCircleView.setValue(0);
//                    mCircleView.spin();
//                }
//            });
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            mCircleView.setValueAnimated(42);
//        }
//    }
}
