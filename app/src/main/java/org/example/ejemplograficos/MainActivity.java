package org.example.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
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
        private ShapeDrawable miImagen;
        public EjemploView (Context context) {
            super(context);
            miImagen = new ShapeDrawable(new OvalShape());
            miImagen.getPaint().setColor(0xff0000ff);
            miImagen.setBounds(10, 10, 310, 60);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            miImagen.draw(canvas);
        }
    }
}