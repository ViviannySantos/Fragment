package developer.app.com.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 *
 * Created by Vivianny Santos on 14/02/2018.
 */
public class FragmentActivity1 extends Fragment {

    private List<String> listString = new ArrayList<String>();
    private ListView list;

    public static FragmentActivity1 newInstance() {
        FragmentActivity1 fragment = new FragmentActivity1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        listString.add("Chuck");
        listString.add("Friends");
        listString.add("Brooklyn 99");

        final View rootView = inflater.inflate(R.layout.fragment2, container, false);

        //Cria um adapter para a lista
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, listString);

        list = (ListView) rootView.findViewById(R.id.listFilme);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getActivity(), "Serie:"  , Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}
