package com.example.problemstatement;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapter extends android.widget.ArrayAdapter<Note> {
    Context context;
    ArrayList<Note> notes;
    int resource;
    TextView tvyear,tvtitle, tvsinger;
    ImageView iv1, iv2, iv3, iv4, iv5;
}
