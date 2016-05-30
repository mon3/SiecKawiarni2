package com.pum.monikas.sieckawiarni;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


// for commit

public class UserAreaActivity extends AppCompatActivity implements DetailsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        int num = 0;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("userType");
            //try {
            switch (num = Integer.parseInt(value)) {
            }
          //  } catch (NumberFormatException num) {
                System.out.println("Could not parse " + num);
           // }
            System.out.println(num);
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (num == 1){
            //ladujemy klientFragment + DetailsFragment

            KlientFragment klientFragment = new KlientFragment();

            if (findViewById(R.id.fragment_container) != null) {


                if (savedInstanceState != null) {
                    return;
                }


                // Add the fragment to the 'fragment_container' FrameLayout
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container, klientFragment).commit();


            }

//            transaction.add(android.R.id.content,klientFragment,"klientFragment");
//            transaction.commit();




            //               // after successful login we enter UserAreaActivity
//                // if user is a client of DBs
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                KlientFragment klientFragment = new KlientFragment();
//              //  KlientFragment klientFragment = (KlientFragment)getSupportFragmentManager().findFragmentByTag("klientFragment");
//               // KelnerFragment kelnerFragment = (KelnerFragment)getSupportFragmentManager().findFragmentByTag("klientFragment");
//                if (num == 1)
//                {
//                    klientFragment = new KlientFragment();
//                    transaction.add(android.R.id.content,klientFragment,"klientFragment");
//                    transaction.commit();
//
//                }
//                else if (num == 2) {
//                    kelnerFragment = new KelnerFragment();
//                    transaction.add(android.R.id.content,kelnerFragment,"kelnerFragment");
//                    transaction.commit();
//
//                }


        }
        else if(num == 2){
            //ladujemy kelnerFragment + DetailsFragment
           KelnerFragment kelnerFragment = new KelnerFragment();



            if (savedInstanceState != null) {
                return;
            }


            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, kelnerFragment).commit();


        }

//        DetailsFragment detailsFragment = new DetailsFragment().newInstance("aaa","bbbb");
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.fragment_container2, detailsFragment).commit();
//


//        public void onKlientSelected(int position) {
//            // The user selected the headline of an article from the HeadlinesFragment
//            // Do something here to display that article
//        }
//

        }


    @Override
    public void onFragmentInteraction(Uri uri) {
//        DetailsFragment articleFrag = (DetailsFragment)
//                getSupportFragmentManager().findFragmentById(R.id.details_fragment_add);
//
//        if (articleFrag != null) {
//            // If article frag is available, we're in two-pane layout...
//
//            // Call a method in the ArticleFragment to update its content
//            articleFrag.updateArticleView(position);
//        } else {
//            // Otherwise, we're in the one-pane layout and must swap frags...
//
//            // Create fragment and give it an argument for the selected article
//            ArticleFragment newFragment = new ArticleFragment();
//            Bundle args = new Bundle();
//            args.putInt(ArticleFragment.ARG_POSITION, position);
//            newFragment.setArguments(args);
//
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//            // Replace whatever is in the fragment_container view with this fragment,
//            // and add the transaction to the back stack so the user can navigate back
//            transaction.replace(R.id.fragment_container, newFragment);
//            transaction.addToBackStack(null);
//
//            // Commit the transaction
//            transaction.commit();

    }
}


