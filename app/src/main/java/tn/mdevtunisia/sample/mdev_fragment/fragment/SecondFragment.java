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
public class SecondFragment extends Fragment {

    TextView mMyText;

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second,
                container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {
        mMyText = (TextView) view.findViewById(R.id.textView_second_fragment);
        mMyText.setText("Hi, I'm a Second Fragment!");
    }


}