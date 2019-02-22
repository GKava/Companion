package allinone.help.fortnite.battleroyalecompanion.InfoContent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import allinone.help.fortnite.battleroyalecompanion.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentInfoFragment extends Fragment {
    int bundleInt;
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private ContentAdapter adapter;

    public ContentInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_info_content, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);

//        Display display = getActivity().getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        int width = size.x;

        Bundle bundle = getArguments();
        if (bundle != null) {
            bundleInt = bundle.getInt("bundle_int");
        }


        adapter = new ContentAdapter();
        recyclerView.setAdapter(adapter);

        if (bundleInt == 0) {
            adapter.addMessage(new InfoContentItem(R.drawable.lama, "1","2","3"));
        }
        if (bundleInt == 1) {
            adapter.addMessage(new InfoContentItem(R.drawable.landing, "1", "2", "3"));
        }


        return view;
    }
}