package android.com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SupplementActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplement_word_list);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        words.add(new Word("Optimum Nutition (ON) Gold",R.drawable.number_nine));
        /*words.add(new Word("R.K.Beach",  R.drawable.rk2));
        words.add(new Word("R.K.Beach",  R.drawable.rk2));
        words.add(new Word("R.K.Beach",  R.drawable.rk2));
        words.add(new Word("R.K.Beach",  R.drawable.rk2));
        words.add(new Word("R.K.Beach",  R.drawable.rk2));*/

        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        GridView listView = (GridView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

}
