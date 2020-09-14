package com.example.haverim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.example.haverim.MainActivity.isRepeatChorus;
import static com.example.haverim.MainActivity.isShowChords;
import static com.example.haverim.MainActivity.reference;

//отображение слов
public class LyricsActivity extends AppCompatActivity {
    TextView lyricsTextView;

    private String keynote;
    private String modeOfLyrics;
    private ArrayList<String> chorus;
    private ArrayList<String> chorus2;
    private ArrayList<String> chorus3;
    private ArrayList<String> chorus4;
    private ArrayList<String> chorus5;
    private ArrayList<String> chorusLast;
    private ArrayList<String> couplet1;
    private ArrayList<String> couplet2;
    private ArrayList<String> couplet3;
    private ArrayList<String> couplet4;
    private ArrayList<String> couplet5;
    private ArrayList<String> couplet6;
    private ArrayList<String> couplet7;
    private ArrayList<String> couplet8;
    private ArrayList<String> bridge;
    private ArrayList<String> bridge2;
    private ArrayList<String> bridgeLast;
    private ArrayList<String> chordsChorus;
    private ArrayList<String> chordsCouplet;
    private ArrayList<String> chordsBridge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        lyricsTextView = (TextView)findViewById(R.id.lyricsView);
        lyricsTextView.setTextSize(TypedValue.COMPLEX_UNIT_PT, 9.50f);
        lyricsTextView.setMovementMethod(new ScrollingMovementMethod());
        lyricsTextView.setTextIsSelectable(true);
        chorus = new ArrayList<String>();
        chorus2 = new ArrayList<String>();
        chorus3 = new ArrayList<String>();
        chorus4 = new ArrayList<String>();
        chorus5 = new ArrayList<String>();
        chorusLast = new ArrayList<String>();
        couplet1 = new ArrayList<String>();
        couplet2 = new ArrayList<String>();
        couplet3 = new ArrayList<String>();
        couplet4 = new ArrayList<String>();
        couplet5 = new ArrayList<String>();
        couplet6 = new ArrayList<String>();
        couplet7 = new ArrayList<String>();
        couplet8 = new ArrayList<String>();
        bridge = new ArrayList<String>();
        bridge2 = new ArrayList<String>();
        bridgeLast = new ArrayList<String>();
        chordsChorus = new ArrayList<String>();
        chordsCouplet = new ArrayList<String>();
        chordsBridge = new ArrayList<String>();

        Intent intent = getIntent();
        String val = intent.getStringExtra("radio");
        MainActivity.database = FirebaseDatabase.getInstance();
        reference = MainActivity.database.getReference(val);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    for(DataSnapshot childSnapshot : dataSnapshot.getChildren()){
                        String id = childSnapshot.getKey();
                        if(id.equals("chorus")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorus.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chorus2")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorus2.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chorus3")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorus3.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chorus4")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorus4.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chorus5")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorus5.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chorusLast")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chorusLast.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet1")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet1.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet2")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet2.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet3")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet3.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet4")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet4.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet5")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet5.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet6")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet6.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet7")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet7.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("couplet8")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                couplet8.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("bridge")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                bridge.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("bridge2")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                bridge2.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("bridgeLast")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                bridgeLast.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chordsCh")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chordsChorus.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chordsCo")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chordsCouplet.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("chordsBr")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                chordsBridge.add(String.valueOf(childSnapshot.child(idChild).getValue()));
                            }
                        }
                        if(id.equals("instruction")){
                            for(DataSnapshot postChild: childSnapshot.getChildren()) {
                                String idChild = postChild.getKey();
                                if(idChild.equals("1")) keynote = String.valueOf(childSnapshot.child(idChild).getValue());
                                if(idChild.equals("2"))modeOfLyrics = String.valueOf(childSnapshot.child(idChild).getValue());
                            }
                        }
                    }
                }else lyricsTextView.setText("Something wrong!!!!!");


                if(modeOfLyrics.length()> 0){
                    lyricsTextView.setText(" ");
                    printLyrics(modeOfLyrics);
                }
                else lyricsTextView.setText("Ошибка! Некорректный тест песни. Обратитеть в поддержку Хаверим.");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { }
        });

        lyricsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lyricsTextView.setText(" ");
                if(modeOfLyrics.length()> 0)printLyrics(modeOfLyrics);
                else lyricsTextView.setText("Ошибка! Некорректный тест песни. Обратитеть в поддержку Хаверим.");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.item_chorus){
            if(!isRepeatChorus) {
                isRepeatChorus =true;
            } else isRepeatChorus = false;
        }
        if(id == R.id.item_chords){
            if(!isShowChords) {
                isShowChords =true;
            } else isShowChords = false;
        }
        lyricsTextView.callOnClick();
        return super.onOptionsItemSelected(item);
    }

    private SpannableString ss;
    private void coupletLyrics(ArrayList<String> couplet){
        if(couplet.size() > 0){
            for(String i : couplet) {
               if(isShowChords == true && chordsCouplet.size() >0){
//                   ss = new SpannableString(chordsCouplet.get(couplet.indexOf(i)) + "\n");
//                   ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.RED);
//                   ss.setSpan(colorSpan,0,i.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                   lyricsTextView.append(ss+"\n");
                   lyricsTextView.append(chordsCouplet.get(couplet.indexOf(i)) + "\n");
               }
                lyricsTextView.append(i+"\n");
            }
        }
    }

    private void chorusLyrics(ArrayList<String> chorushlyrics){
        if(chorushlyrics.size() > 0){
            lyricsTextView.append("\nПрипев:\n");
            for(String i : chorushlyrics) {
                if(isShowChords == true && chordsChorus.size()>0)lyricsTextView.append(chordsChorus.get(chorushlyrics.indexOf(i)) + "\n");
                lyricsTextView.append(i+"\n");
            }
        }
    }

    private void bridgeLyrics(ArrayList<String> bridgelyrics){
        if(bridgelyrics.size() > 0){
            lyricsTextView.append("\nМост:\n");
            for(String i : bridgelyrics) {
                if(isShowChords == true && chordsBridge.size()> 0) lyricsTextView.append(chordsBridge.get(bridgelyrics.indexOf(i))+"\n");
                lyricsTextView.append(i+"\n");
            }
        }
    }


    private void printLyrics(String mode){
        switch (mode){
            case"10":
                printLyricsTen();
                break;
            case "2":
                printLyricsTwo();
                break;
            case "5":
                printLyricsFive();
                break;
            case "8":
                printLyricsEight();
                break;
            case"4":
                printLyricsFour();
                break;
                default: lyricsTextView.setText("Ошибка! Некорректный тест песни. Обратитеть в поддержку Хаверим.");
        }
    }

    //1.куплет - мост - припев - куплет - мост - припев ... последний припев.
    //2.куплет - припев - куплет - припев ... последний припев.
    //3.куплет - припев ...
    //4.куплет - куплет - ... - куплет.
    //5.куплет - припев ... последний мост
    //В режиме повтора припева, после последнего куплета (мост+) припев не отображается!!!!
    private void printLyricsTen() {
        if(keynote.length() > 0)lyricsTextView.append("\t\t\t" + keynote + "\n");
        lyricsTextView.append("\n1:\n");
        coupletLyrics(couplet1);
        bridgeLyrics(bridge);
        chorusLyrics(chorus);
        if(couplet2.size()> 0)lyricsTextView.append("\n2:\n");
        coupletLyrics(couplet2);
        if(couplet3.size() == 0){
            chorusLyrics(chorusLast);
        }
        else if(isRepeatChorus){
            bridgeLyrics(bridge);
            chorusLyrics(chorus);
        }
        if (couplet3.size() > 0) {
            lyricsTextView.append("\n3:\n");
            coupletLyrics(couplet3);
            if(couplet4.size() == 0){
                chorusLyrics(chorusLast);
            }
            else if(isRepeatChorus){
                bridgeLyrics(bridge);
                chorusLyrics(chorus);
            }
            if (couplet4.size() > 0) {
                lyricsTextView.append("\n4:\n");
                coupletLyrics(couplet4);
                if(couplet5.size() == 0)chorusLyrics(chorusLast);
                else if(isRepeatChorus){
                    bridgeLyrics(bridge);
                    chorusLyrics(chorus);
                }
                if (couplet5.size() > 0) {
                    lyricsTextView.append("\n5:\n");
                    coupletLyrics(couplet5);
                    if(couplet6.size() == 0)chorusLyrics(chorusLast);
                    else if(isRepeatChorus){
                        bridgeLyrics(bridge);
                        chorusLyrics(chorus);
                    }
                    if (couplet6.size() > 0) {
                        lyricsTextView.append("\n6:\n");
                        coupletLyrics(couplet6);
                        if(couplet7.size() == 0)chorusLyrics(chorusLast);
                        else if(isRepeatChorus){
                            bridgeLyrics(bridge);
                            chorusLyrics(chorus);
                        }
                        if (couplet7.size() > 0) {
                            lyricsTextView.append("\n7:\n");
                            coupletLyrics(couplet7);
                            if(couplet8.size() == 0)chorusLyrics(chorusLast);
                            else if(isRepeatChorus){
                                bridgeLyrics(bridge);
                                chorusLyrics(chorus);
                            }
                            if (couplet8.size() > 0) {
                                lyricsTextView.append("\n8:\n");
                                coupletLyrics(couplet8);
                                if(chorusLast.size() > 0)chorusLyrics(chorusLast);
                                else if(isRepeatChorus){
                                    bridgeLyrics(bridge);
                                    chorusLyrics(chorus);
                                }
                            }
                        }
                    }
                }
            }
        }
        if(bridgeLast.size() > 0) bridgeLyrics(bridgeLast);
    }


    //1.куплет1 - припев1 - куплет2 - припев2 - .... куплетN - припевN - последний припев.
    //2.куплет1 - припев1 - куплет2 - припев2 - .... куплетN - припевN.
    private void printLyricsTwo(){
        if(keynote.length() > 0)lyricsTextView.append("\t\t\t" + keynote + "\n");
        lyricsTextView.append("\n1:\n");
        coupletLyrics(couplet1);
        chorusLyrics(chorus);
        if(couplet2.size()> 0)lyricsTextView.append("\n2:\n");
        coupletLyrics(couplet2);
        chorusLyrics(chorus2);
        if(couplet3.size()> 0){
            lyricsTextView.append("\n3:\n");
            coupletLyrics(couplet3);
            chorusLyrics(chorus3);
            if(couplet4.size()> 0){
                lyricsTextView.append("\n4:\n");
                coupletLyrics(couplet4);
                chorusLyrics(chorus4);
                if(couplet5.size()> 0){
                    lyricsTextView.append("\n5:\n");
                    coupletLyrics(couplet5);
                    chorusLyrics(chorus5);
                    if(couplet6.size()> 0){
                        lyricsTextView.append("\n6:\n");
                        coupletLyrics(couplet6);
                        chorusLyrics(chorusLast);
                    }
                }
            }
        }
        if(chorusLast.size()> 0)chorusLyrics(chorusLast);
    }


    //1.куплет1 - куплет2 - припев - куплет3 - припев ... последний куплете/мост
    private void printLyricsFive(){
        if(keynote.length() > 0)lyricsTextView.append("\t\t\t" + keynote + "\n");
        lyricsTextView.append("\n1:\n");
        coupletLyrics(couplet1);
        lyricsTextView.append("\n2:\n");
        coupletLyrics(couplet2);
        chorusLyrics(chorus);
        lyricsTextView.append("\n3:\n");
        coupletLyrics(couplet3);
        if(isRepeatChorus) chorusLyrics(chorus);

        if(couplet4.size() > 0){
            lyricsTextView.append("\n4:\n");
            coupletLyrics(couplet4);
            if(isRepeatChorus) chorusLyrics(chorus);
            if(couplet5.size() > 0){
                lyricsTextView.append("\n5:\n");
                coupletLyrics(couplet5);
                if(isRepeatChorus) chorusLyrics(chorus);
                if(couplet6.size() > 0){
                    lyricsTextView.append("\6:\n");
                    coupletLyrics(couplet6);
                    if(isRepeatChorus) chorusLyrics(chorus);
                    if(couplet7.size() > 0){
                        lyricsTextView.append("\n7:\n");
                        coupletLyrics(couplet7);
                        if(isRepeatChorus) chorusLyrics(chorus);
                        if(couplet8.size() > 0){
                            lyricsTextView.append("\n8:\n");
                            coupletLyrics(couplet8);
                            if(isRepeatChorus) chorusLyrics(chorus);
                        }
                    }
                }
            }
        }
        if(bridgeLast.size() > 0) bridgeLyrics(bridgeLast);
        if(chorusLast.size()> 0) chorusLyrics(chorusLast);
    }

    // куплет - мост - припев - куплет - мост - припев - куплет - последний мост - припев/ последний припев
    private  void printLyricsEight(){
        if(keynote.length() > 0)lyricsTextView.append("\t\t\t" + keynote + "\n");
        lyricsTextView.append("\n1:\n");
        coupletLyrics(couplet1);
        bridgeLyrics(bridge);
        chorusLyrics(chorus);
        lyricsTextView.append("\n2:\n");
        coupletLyrics(couplet2);
        bridgeLyrics(bridge2);
        if(isRepeatChorus)chorusLyrics(chorus);
        if(couplet3.size() > 0){
            lyricsTextView.append("\n3:\n");
            coupletLyrics(couplet3);
            bridgeLyrics(bridgeLast);
            if (isRepeatChorus)chorusLyrics(chorus);
        }
        if(chorusLast.size()> 0) chorusLyrics(chorusLast);
    }


    // припев - куплет- припев - куплет -...- припев/ последний припев
    private void printLyricsFour(){
        if(keynote.length() > 0)lyricsTextView.append("\t\t\t" + keynote + "\n");
        chorusLyrics(chorus);
        lyricsTextView.append("\n1:\n");
        coupletLyrics(couplet1);
        chorusLyrics(chorus);
        if(couplet2.size()> 0){
            lyricsTextView.append("\n2:\n");
            coupletLyrics(couplet2);
            if (isRepeatChorus)chorusLyrics(chorus);
            if(couplet3.size()> 0){
                lyricsTextView.append("\n3:\n");
                coupletLyrics(couplet3);
                if (isRepeatChorus)chorusLyrics(chorus);
                if(couplet4.size()> 0){
                    lyricsTextView.append("\n4:\n");
                    coupletLyrics(couplet4);
                    if (isRepeatChorus)chorusLyrics(chorus);
                    if(couplet5.size()> 0){
                        lyricsTextView.append("\n5:\n");
                        coupletLyrics(couplet5);
                        if (isRepeatChorus)chorusLyrics(chorus);
                        if(couplet6.size()> 0){
                            lyricsTextView.append("\n6:\n");
                            coupletLyrics(couplet6);
                            if (isRepeatChorus)chorusLyrics(chorus);
                            if(couplet7.size()> 0){
                                lyricsTextView.append("\n7:\n");
                                coupletLyrics(couplet7);
                                if (isRepeatChorus)chorusLyrics(chorus);
                                if(couplet8.size()> 0){
                                    lyricsTextView.append("\n8:\n");
                                    coupletLyrics(couplet8);
                                    if (isRepeatChorus)chorusLyrics(chorus);
                                }
                            }
                        }
                    }
                }
            }
        }
        if(bridge.size()> 0) bridgeLyrics(bridge);
        if(chorusLast.size()> 0) chorusLyrics(chorusLast);
    }
}
