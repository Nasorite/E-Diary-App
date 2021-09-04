package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class Activity2 extends AppCompatActivity {

    private Button btnGenerate;
    private TextView tvQuote;
    public RelativeLayout relativeLayout;

   private ArrayList<String> quotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        btnGenerate = (Button) findViewById(R.id.btnGenerate);
        tvQuote = (TextView) findViewById(R.id.tvQuote);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fillQuotes();
                generateQuote();
            }
        });
    }
    public void fillQuotes() {
        quotes = new ArrayList<>();
        quotes.add("I’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life and that is why I succeed.” – Michael Jordan");
        quotes.add("It’s hard to beat a person who never gives up.” – Babe Ruth");
        quotes.add("If people are doubting how far you can go, go so far that you can’t hear them anymore.” – Michele Ruiz");
        quotes.add("We need to accept that we won’t always make the right decisions, that we’ll screw up royally sometimes – understanding that failure is not the opposite of success, it’s part of success.” – Arianna Huffington");
        quotes.add("There is hope, even when your brain tells you there isn’t.”\n" +
                "John Green");
        quotes.add("Sometimes, life will kick you around, but sooner or later, you realize you’re not just a survivor. You’re a warrior, and you’re stronger than anything life throws your way.\"\n" +
                "Brooke Davis");
        quotes.add("And if today all you did was hold yourself together, I’m proud of you.");
        quotes.add("Sometimes you climb out of bed in the morning and you think, I’m not going to make it, but you laugh inside – remembering all the times you’ve felt that way.”\n" +
                "Charles Bukowski from “Gamblers All”\n");
        quotes.add("In the middle of winter I at last discovered that there was in me an invincible summer.”\n" +
                "Albert Camus from “Return to Tipasa”");
        quotes.add("Give yourself another day, another chance. You will find your courage eventually. Don’t give up on yourself just yet.");

    }
    public String getQuote(int index){
        return quotes.get(index);
    }

    public void generateQuote() {
        Random random= new Random();
        int indexQuote = random.nextInt(quotes.size());
        String quote = getQuote(indexQuote);

        tvQuote.setText(quote);
    }







}