package com.example.receptapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class RecepieListFragmentActivity extends Fragment{


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecepieListAdapter adapter;
    private DividerItemDecoration itemDecoration;
    private ImageView favoriteButton;
    private ArrayList<Recept> receptLista;

    private FirebaseFirestore db; // = FirebaseFirestore.getInstance();
//    private CollectionReference receptRef = db.collection("recept");

    private String title;
    private String desc;
    private ArrayList<String> ingredients;
    private String inst;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View v =  inflater.inflate(R.layout.activity_recepie_list, container, false);
        FirebaseApp.initializeApp(container.getContext());
//        db = FirebaseFirestore.getInstance();

  //      final Recept recept = new Recept(title, desc, ingredients, inst);

        final ArrayList<Recept> receptLista;
        receptLista = new ArrayList<Recept>();
/*
//         public void loadRecepes(View v){
        receptRef.get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for(QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots){
                            Recept recept = documentSnapshot.toObject(Recept.class);
                            receptLista.add(recept);
                        }
                    }
                });


//         }*/






            receptLista.add(new Recept("Toast Skagen", "Bröd och skagenröra", R.drawable.beef_liten));
            receptLista.add(new Recept("Pasta carbonara", "Pasta, ost, bacon och grädde", R.drawable.beef_liten));
            receptLista.add(new Recept("Spaghetti och köttfärssås", "Köttfärs, tomatsås, spaghetti", R.drawable.beef_liten));
            receptLista.add(new Recept("Pannkakor", "Mjölk, ägg och mjöl", R.drawable.beef_liten));
            receptLista.add(new Recept("Sallad", "Tomater, Gurka, Paprika och salladsblad"));
            receptLista.add(new Recept("Muffins", "Mjöl, socker, kakao, ägg"));


            recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewID);
            layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);

            //itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL );
            //recyclerView.addItemDecoration(itemDecoration);

            adapter = new RecepieListAdapter(receptLista);
            recyclerView.setAdapter(adapter);


        return v;

    }
}
