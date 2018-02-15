package eecs1022.eecs1022___lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class lab3Activity extends AppCompatActivity
{
    Game ra3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        ra3 = new Game();
        setContentsOfTextView(R.id.labelResult, ra3.toString(0));
    }

    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void button1Clicked(View view) {
        String n1 = getInputOfTextField(R.id.inputName1);
        String n2 = getInputOfTextField(R.id.inputName2);
        String p1 = getItemSelected(R.id.spinnerR1P1);
        String p2 = getItemSelected(R.id.spinnerR1P2);
        ra3.setName(n1, n2);
        ra3.play(1, p1, p2);
        setContentsOfTextView(R.id.labelResult, ra3.toString(1));
    }

    public void button2Clicked(View view) {
        String p1 = getItemSelected(R.id.spinnerR2P1);
        String p2 = getItemSelected(R.id.spinnerR2P2);
        ra3.play(2, p1, p2);
        setContentsOfTextView(R.id.labelResult, ra3.toString(2));
    }

    public void button3Clicked(View view) {
        String p1 = getItemSelected(R.id.spinnerR3P1);
        String p2 = getItemSelected(R.id.spinnerR3P2);
        ra3.play(3, p1, p2);
        setContentsOfTextView(R.id.labelResult, ra3.toString(3));
    }

    public void buttonNewClicked(View view) {
        ra3 = new Game();
        setContentsOfTextView(R.id.labelResult, ra3.toString(0));
    }
}

