package com.example.listviewdemo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity  {
    ListView listView ;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = (ListView) findViewById(R.id.listView1);
        
        String[] values ={ "C","C++","Oracle","Android","php","Core Java","Advance Java","Java Script","Angular js","JQuery","Laravel","Bootstrap","MangoDB"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1,values);


 
        listView.setAdapter(adapter); 
        
 
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
                
 
               int itemPosition= position;
               
                String itemValue=(String)listView.getItemAtPosition(position);
                  
 
                Toast.makeText(getApplicationContext(),
                  "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG).show();
              }

         }); 
    }
}