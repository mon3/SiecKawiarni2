package com.pum.monikas.sieckawiarni;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


//FOR COMMIT
public class KelnerFragment extends ListFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // inflate the fragment layout file
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_klientdata,container,false);
        // Create klient data source
        String [] kelnerData = {"Menu","Zamówienia","Rezerwacje","Stoliki", "Transakcje"};
        // create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.fragment_kelnerdata_list, R.id.kelnerDataItem, kelnerData);
        // bind adapter to the listfragment
        setListAdapter(adapter);
        // Retains listfragment instance actross configuration changes
        setRetainInstance(true);
        return rootView;
    }

    // handling item click
    public void onListItemClick(ListView l, View view, int position, long id){
        ViewGroup viewGroup = (ViewGroup) view;
        TextView kelnertxt = (TextView) viewGroup.findViewById(R.id.kelnerDataItem);
        Toast.makeText(getActivity(),kelnertxt.getText().toString(),Toast.LENGTH_LONG);

    }

}
