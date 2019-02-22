package allinone.help.fortnite.battleroyalecompanion;



import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenuFragment extends Fragment implements TwoImageAdapter.OnImageClickListener {

    private RecyclerView recycler;
    private LinearLayoutManager verticalLinearLayoutManager;
    private TwoImageAdapter adapter;

    public MainMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);


        recycler = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new GridLayoutManager(getActivity(), 2);
        verticalLinearLayoutManager.setStackFromEnd(false);
        recycler.setLayoutManager(verticalLinearLayoutManager);
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x/2;
        adapter = new TwoImageAdapter(width,2);
        recycler.setAdapter(adapter);

        adapter.addMessage(new Item(R.drawable.lama,"1"));
        adapter.addMessage(new Item(R.drawable.landing,"2"));
        adapter.addMessage(new Item(R.drawable.refresh,"3"));
        adapter.addMessage(new Item(R.drawable.lama,"4"));
        adapter.addMessage(new Item(R.drawable.lama,"5"));
        adapter.addMessage(new Item(R.drawable.lama,"6"));
        adapter.addMessage(new Item(R.drawable.lama,"6"));
        adapter.addMessage(new Item(R.drawable.lama,"6"));

        return view;
    }

    @Override
    public void onImageClick(int position) {
//        Fragment fr = new Content();
//        Bundle args = new Bundle();
//        args.putInt("bundle_int", position);
//        fr.setArguments(args);
//
//        getActivity().getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_container, fr)
//                .addToBackStack(null)
//                .commit();
    }

    @Override
    public void onPause() {
        if (adapter != null) {
            adapter.setListener(null);
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adapter != null) {
            adapter.setListener(this);
        }
    }
}
