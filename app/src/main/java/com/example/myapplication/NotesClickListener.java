package com.example.myapplication;

import androidx.cardview.widget.CardView;

import com.example.myapplication.Modules.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick(Notes notes, CardView cardView);


}
