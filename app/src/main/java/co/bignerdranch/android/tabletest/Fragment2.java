package co.bignerdranch.android.tabletest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState) {
        //Toast.makeText(getActivity(),"2",Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment2, container, false);
    }
}
