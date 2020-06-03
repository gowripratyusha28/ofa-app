package android.com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ImageFragment extends Fragment {

    private int mPosition;

    public ImageFragment(){

    }

    public static ImageFragment newInstance(int pos){
        ImageFragment frag = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt("pos", pos);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPosition = getArguments().getInt("pos");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_whole_place, container, false);
        /*TextView textView = v.findViewById(R.id.strikeText1);
        TextView textView2 = v.findViewById(R.id.strikeText2);
        TextView textView3 = v.findViewById(R.id.strikeText3);
        TextView costView1 = v.findViewById(R.id.cost1);
        TextView costView2 = v.findViewById(R.id.cost2);
        TextView costView3 = v.findViewById(R.id.cost3);
        TextView text = v.findViewById(R.id.monthLine);
        switch(mPosition){
            case 1:
                //set background view image 2

                textView.setText(" ₹ 4800");
                textView2.setText(" ₹ 6300 ");
                textView3.setText(" ₹ 7500 ");
                costView1.setText(" ₹ 4800 ");
                costView2.setText(" ₹ 6300 ");
                costView3.setText(" ₹ 7500 ");
                text.setText("Monthly two times a day");
                break;
            case 2:
                //set background view image 3

                textView.setText(" ₹ 6800 ");
                textView2.setText(" ₹ 9000 ");
                textView3.setText(" ₹ 10000 ");
                costView1.setText(" ₹ 6800 ");
                costView2.setText(" ₹ 9000 ");
                costView3.setText(" ₹ 10000 ");
                text.setText("Monthly three times a day");
                break;
            default:
                //set background view image 1

                textView.setText(" ₹ 2700 ");
                textView2.setText(" ₹ 3500 ");
                textView3.setText(" ₹ 4000 ");
                costView1.setText(" ₹ 2700 ");
                costView2.setText(" ₹ 3500 ");
                costView3.setText(" ₹ 4000 ");
                text.setText("Monthly one time a day");
                break;
        }*/
        return v;
    }

}
