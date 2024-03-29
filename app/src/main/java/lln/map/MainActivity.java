package lln.map;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MAP - ";

    private Map<Integer, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialMap();

        testMapEntry();

    }

    private void setInitialMap() {
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        map.put(9, "I");
        map.put(10, "J");
        map.put(11, "K");
        map.put(12, "L");
        map.put(13, "M");
        map.put(14, "N");
        map.put(15, "O");
        map.put(16, "P");
        map.put(17, "Q");
        map.put(18, "R");
        map.put(19, "S");
        map.put(20, "T");
        map.put(21, "U");
        map.put(22, "V");
        map.put(23, "W");
        map.put(24, "X");
        map.put(25, "Y");
        map.put(26, "Z");
    }

    private void testMapEntry() {
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Log.d(TAG + "testMapEntry", entry.getKey() + " : " + entry.getValue());
        }

    }

}
