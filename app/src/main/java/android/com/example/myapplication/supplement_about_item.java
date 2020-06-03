package android.com.example.myapplication;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class supplement_about_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplement_about_item);
        TextView text = findViewById(R.id.item_cost_strike);
        text.setPaintFlags(text.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView textView = findViewById(R.id.form);
        textView.setText("\u2022 Form : Powder");
        TextView textView1 = findViewById(R.id.veg);
        textView1.setText("\u2022 Vegetarian");
        TextView textView2 = findViewById(R.id.usage);
        textView2.setText("\u2022 Usage as per Requirement");
        TextView textView3 = findViewById(R.id.type);
        textView3.setText("\u2022 Protein Type : Whey Protein");
        TextView textView4 = findViewById(R.id.pref);
        textView4.setText("\u2022 Dietary Preferences : Gluten Form");
    }
}
