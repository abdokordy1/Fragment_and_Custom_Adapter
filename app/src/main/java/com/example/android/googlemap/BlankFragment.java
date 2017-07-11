package com.example.android.googlemap;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BlankFragment extends Fragment {

 //   private OnFragmentInteractionListener mListener;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
public void onStart()
{
    super.onStart();
    final View view=getView();

        ListView ho = (ListView) view.findViewById(R.id.lsv);
        List<String> Lines = Arrays.asList(getResources().getStringArray(R.array.color));
    ArrayList<String> as=null;
  final  ArrayList<String> abdo=new ArrayList<>();
   // Lines.add(2,"asd");
    abdo.addAll(Lines);
  //  ArrayAdapter<String> Adpter =new ArrayAdapter<>(getView().getContext(),android.R.layout.select_dialog_item ,abdo);
//Adpter.add("asd");
    //  ArrayAdapter<String> aa = ArrayAdapter.createFromResource(inflater.getContext(), R.array.color, android.R.layout.simple_list_item_1);
    //ho.setAdapter(Adpter);
    //TextView v= (TextView) view.findViewById(R.id.txt);
   // v.setText(Adpter.getItem(1));
    final Database  zero[] ={
            new Database(R.drawable.orange,"koko",0),new Database(R.drawable.red,"Mike",1)};
     class  customized_adapter<T>  extends ArrayAdapter<T>
    {
        public  customized_adapter(Context context ,ArrayList<T> users)
        {
            super(context,android.R.layout.select_dialog_item,users);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item_row, parent, false);
            }


            ImageView  s= (ImageView) convertView.findViewById(R.id.imgIcon);
            TextView view1s =(TextView) convertView.findViewById(R.id.txtTitle);



    view1s.setText(zero[position].getName());
    s.setImageResource(zero[position].getImage());

            return convertView;
        }



    }
    LayoutInflater inflater;
    customized_adapter<String> apter =new customized_adapter <>(getView().getContext(),abdo);
ho.setAdapter(apter);

}

}
