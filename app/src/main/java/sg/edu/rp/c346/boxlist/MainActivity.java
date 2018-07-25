package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBox;
    ArrayList<BoxListItem> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBoxList = new ArrayList<>();
        BoxListItem item1 = new BoxListItem("blue");
        BoxListItem item2 = new BoxListItem("orange");
        BoxListItem item3 = new BoxListItem("brown");
        alBoxList.add(item1);
        alBoxList.add(item2);
        alBoxList.add(item3);

        caBox = new CustomAdapter(this, R.layout.boxlist_items,alBoxList);

        lvBox.setAdapter(caBox);
    }
}
