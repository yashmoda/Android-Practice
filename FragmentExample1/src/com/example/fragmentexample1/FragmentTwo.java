package com.example.fragmentexample1;

import com.example.fragmentexample1.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {
	@Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        // TODO Auto-generated method stub  
        return inflater.inflate(R.layout.fragment_fragment_two,container, false);  
    }  


}
