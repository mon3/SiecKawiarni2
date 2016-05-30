package com.pum.monikas.sieckawiarni;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class KlientFragment extends ListFragment {
//    OnKlientSelectedListener mCallback;
//
//    // Container Activity must implement this interface
//    public interface OnKlientSelectedListener {
//        public void onKlientSelected(int position);
//    }
//
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//
//        // This makes sure that the container activity has implemented
//        // the callback interface. If not, it throws an exception
//        try {
//            mCallback = (OnKlientSelectedListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnKlientSelectedListener");
//        }
//    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       // inflate the fragment layout file
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_klientdata,container,false);
        // Create klient data source
        String [] klientdata = {"Menu","Moje konto","Zamówienia"};
        // create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.fragment_klientdata_list, R.id.klientDataItem, klientdata);
        // bind adapter to the listfragment
        setListAdapter(adapter);
        // Retains listfragment instance actross configuration changes
        setRetainInstance(true);
        return rootView;
    }
//for commit
// handling item click
//    public void onListItemClick(ListView l, View view, int position, long id){
//        ViewGroup viewGroup = (ViewGroup) view;
//        TextView klienttxt = (TextView) viewGroup.findViewById(R.id.klientDataItem);
//        Toast.makeText(getActivity(),klienttxt.getText().toString(),Toast.LENGTH_LONG);
//
//    }

//    @Override
//    public void onListItemClick(ListView l, View v, int position, long id) {
//        // Send the event to the host activity
//        mCallback.onKlientSelected(position);
//    }

}
