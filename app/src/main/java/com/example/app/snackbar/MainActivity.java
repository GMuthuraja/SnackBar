package com.example.app.snackbar;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout) findViewById(R.id.parentView);
        Snackbar.make(layout, "Awesome! SnackBar created.", Snackbar.LENGTH_LONG).show();
    }


    public void bottomNotification(View v){
        Snackbar bar = Snackbar.make(v, "You have pressed FAB button!", Snackbar.LENGTH_SHORT)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "You pressed Close!", Toast.LENGTH_LONG).show();
                    }
                });


        View view = bar.getView();
        view.setBackgroundColor(Color.parseColor("#ff0000"));

//        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] {0xFF616261,0xFF131313});
//        gd.setCornerRadius(10);
//        view.setBackgroundDrawable(gd);

//        view.setBackgroundResource(R.color.colorPrimary);

        TextView tv = view.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextColor(Color.WHITE);

        bar.setActionTextColor(Color.YELLOW);
        bar.show();
    }


}
