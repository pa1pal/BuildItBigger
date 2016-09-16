package pa1pal.udacity.jokesview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * author: pa1pal
 * Date: 9/16/16
 */
public class JokesView extends Activity {

    public static String JOKE_KEY = "Joke key";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_view);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JokesView.JOKE_KEY);

        TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
