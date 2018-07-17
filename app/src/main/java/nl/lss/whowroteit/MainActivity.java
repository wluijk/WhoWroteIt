package nl.lss.whowroteit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText BookInput;
    private TextView AuthorTextView;
    private TextView TitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BookInput = (EditText) findViewById(R.id.bookInput);
        AuthorTextView = (TextView) findViewById(R.id.authorText);
        TitleTextView = (TextView) findViewById(R.id.titleText);

    }

    public void searchBooks(View view) {
        String queryString = BookInput.getText().toString();
    }
}
