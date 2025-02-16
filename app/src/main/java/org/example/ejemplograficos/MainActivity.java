package org.example.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.graphics.Canvas;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }
    public class EjemploView extends View {
        public EjemploView (Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Style.STROKE);
            canvas.drawCircle(100, 100, 50, pincel);
            pincel.setColor(getResources().getColor(R.color.color_circulo));
            canvas.drawCircle(150, 250, 100, pincel);
        }
    }
}