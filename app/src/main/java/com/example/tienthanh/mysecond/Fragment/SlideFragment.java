package com.example.tienthanh.mysecond.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tienthanh.mysecond.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SlideFragment extends Fragment {



    public SlideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_slide, container, false);
        CircleImageView circle1 = view.findViewById(R.id.circle1);
        CircleImageView circle2 = view.findViewById(R.id.circle2);
        CircleImageView circle3 = view.findViewById(R.id.circle3);
        CircleImageView circle4 = view.findViewById(R.id.circle4);
        CircleImageView circle5 = view.findViewById(R.id.circle5);

        if (bundle != null) {
            int id = bundle.getInt("ID");

            switch (id) {
                case 1:
                    circle1.setCircleBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case 2:
                    circle2.setCircleBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case 3:
                    circle3.setCircleBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case 4:
                    circle4.setCircleBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case 5:
                    circle5.setCircleBackgroundColor(getResources().getColor(R.color.white));
                    break;
            }

            int oldId = bundle.getInt("OLDID");

            switch (oldId) {
                case 1:
                    circle1.setCircleBackgroundColor(getResources().getColor(R.color.circle_color));
                    break;
                case 2:
                    circle2.setCircleBackgroundColor(getResources().getColor(R.color.circle_color));
                    break;
                case 3:
                    circle3.setCircleBackgroundColor(getResources().getColor(R.color.circle_color));
                    break;
                case 4:
                    circle4.setCircleBackgroundColor(getResources().getColor(R.color.circle_color));
                    break;
                case 5:
                    circle5.setCircleBackgroundColor(getResources().getColor(R.color.circle_color));
                    break;
            }

        }
        return view;
    }


}
