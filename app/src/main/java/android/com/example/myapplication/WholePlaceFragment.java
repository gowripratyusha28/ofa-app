package android.com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WholePlaceFragment#} factory method to
 * create an instance of this fragment.
 */
public class WholePlaceFragment extends Fragment {


    public WholePlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_whole_place, container, false);
        /*RadioGroup radioGroup = (RadioGroup) view .findViewById(R.id.radiogroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.checkbox1:
                        // switch to fragment 1
                        Intent intent = new Intent(getContext(),CartActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.checkbox2:
                        // Fragment 2
                        Intent intent1 = new Intent(getContext(),UselessActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.checkbox3:
                        Intent intent3 = new Intent(getContext(),UselessActivity.class);
                        startActivity(intent3);
                }
            }
        });*/
        return view;
    }
}
