package org.example.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.graphics.Canvas;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
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
        private Drawable miImagen;
        public EjemploView (Context context) {
            super(context);
            miImagen = AppCompatResources.getDrawable(context, R.drawable.estrella);
            miImagen.setBounds(30, 30, 1000, 1000);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            miImagen.draw(canvas);
        }
    }
}