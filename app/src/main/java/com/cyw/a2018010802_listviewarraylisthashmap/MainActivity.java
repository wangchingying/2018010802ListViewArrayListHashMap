package com.cyw.a2018010802_listviewarraylisthashmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    //泛型+Collection, Map是Interface, HashMap是class, 都可用, 改成物件甚麼東西都能放,因為要加入圖檔,圖檔Integer不是String
    ArrayList<Map<String,Object>> mylist= new ArrayList<>();
    //ArrayList<HashMap<String,String>> mylist= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=(ListView)findViewById(R.id.listView);
        HashMap<String,Object> m1=new HashMap<>();
        HashMap<String,Object> m2=new HashMap<>();
        HashMap<String,Object> m3=new HashMap<>();
        HashMap<String,Object> m4=new HashMap<>();

        m1.put("city", "台北");
        m1.put("code","02");
        m1.put("img",R.drawable.taipei);
        mylist.add(m1);
        m2.put("city", "台中");
        m2.put("code","04");
        m2.put("img",R.drawable.taichung);
        mylist.add(m2);
        m3.put("city", "台南");
        m3.put("code","06");
        m3.put("img",R.drawable.tainan);
        mylist.add(m3);
        m4.put("city", "高雄");
        m4.put("code","07");
        m4.put("img",R.drawable.kaohsung);
        mylist.add(m4);
/*      //用Android 內建的layout放listView
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,mylist,
                android.R.layout.simple_expandable_list_item_2,
                new String[] {"city","code"},
                new int[] {android.R.id.text1,android.R.id.text2});
*/
    //自己建一個layout- myitem
    SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,mylist,
                R.layout.myitem,
                new String[] {"city","code","img"},
                //這裡面的圖只可以用已經抓好的放在res的圖
                new int[] {R.id.textView,R.id.textView2,R.id.imageView});

        lv1.setAdapter(adapter);



    }
}
