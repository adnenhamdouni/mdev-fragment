package tn.mdevtunisia.sample.mdev_fragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tn.mdevtunisia.sample.mdev_fragment.R;

/**
 * Created by adnenhamdouni on 01/04/2016.
 */
public class MainFragment extends Fragment {

    private TextView mTextview;

    private Context mContext;

    private String action;

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mContext = getActivity().getApplicationContext();

        View view = inflater.inflate(R.layout.fragment_main,
                container, false);

        mTextview =  (TextView) view.findViewById(R.id.textView);
        mTextview.setText("Hello Fragment :)!");


        return view;

    }



}