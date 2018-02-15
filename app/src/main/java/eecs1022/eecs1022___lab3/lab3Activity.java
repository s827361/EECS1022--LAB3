package eecs1022.eecs1022___lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class lab3Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view=findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }
    private String getInputOfTextField(int id){
        View view =findViewById(id);
        EditText editText = (EditText) view;
        String input =editText.getText().toString();
        return input;

    }
    private String getItemSelected(int id){
        View view =findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;

    }
    public void button1clicked(View view)
    {
        String p1 = getInputOfTextField(R.id.editText);
        String p2 = getInputOfTextField(R.id.editText2);

        String p11 = getInputOfTextField(R.id.spinner);
        String p12 = getInputOfTextField(R.id.spinner2);
        String p21 = getInputOfTextField(R.id.spinner3);
        String p22 = getInputOfTextField(R.id.spinner4);
        String p31 = getInputOfTextField(R.id.spinner5);
        String p32 = getInputOfTextField(R.id.spinner6);
        double round =0;


        Game result = new Game (p1,p2,p11,p12);
        String rt = result.toString();
        setContentsOfTextView(R.id.lableAnswer, result.toString());


    }
    public void button2clicked(View view)
    {
        String p1 = getInputOfTextField(R.id.editText);
        String p2 = getInputOfTextField(R.id.editText2);


        String p21 = getInputOfTextField(R.id.spinner3);
        String p22 = getInputOfTextField(R.id.spinner4);

        double round = 1;


        Game result = new Game (p1,p2,p21,p22);
        String rt = result.toString();
        setContentsOfTextView(R.id.lableAnswer, result.toString());

    }
    public void button3clicked(View view){
        String p1 = getInputOfTextField(R.id.editText);
        String p2 = getInputOfTextField(R.id.editText2);


        String p31 = getInputOfTextField(R.id.spinner5);
        String p32 = getInputOfTextField(R.id.spinner6);
        double round = 2;

        Game result = new Game (p1,p2,p31,p32);
        String rt = result.toString();
        setContentsOfTextView(R.id.lableAnswer, result.toString());

    }
    public void startclicked(View view){
        setContentsOfTextView(R.id.lableAnswer, "New game started, Enter Names of Players");
    }
}

