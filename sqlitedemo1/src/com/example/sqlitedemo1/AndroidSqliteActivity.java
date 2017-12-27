package com.example.sqlitedemo1;

	import android.app.Activity;
	import java.util.List;
	import android.os.Bundle;
	import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
	 
	public class AndroidSqliteActivity extends Activity {
		String log;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	         
	        DatabaseHandler db = new DatabaseHandler(this);
	        
	       
	        db.addContact(new Contact(1,"Ravi", "9100000000"));        
	        db.addContact(new Contact(2,"Srinivas", "9199999999"));
	        db.addContact(new Contact(3,"Tommy", "9522222222"));
	        db.addContact(new Contact(4,"Karthik", "9533333333"));
	         
	        List<Contact> contacts = db.getAllContacts();       
	         
	        for (Contact cn : contacts) 
	        {
	        	 log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
	                
	        	// Toast.makeText(this," "+log,Toast.LENGTH_LONG).show();    
	    }
	        
	    }
	    public void updateButton(View v)
	    {
	    	EditText ed1,ed2;
	    	ed1=(EditText) findViewById(R.id.editText2);
	    	ed2=(EditText) findViewById(R.id.editText1);
	    	String name=ed1.getText().toString();
	    	int id=Integer.parseInt(ed2.getText().toString());
	    	DatabaseHandler db = new DatabaseHandler(this);
	    	db.updateContact(new Contact(id,name));
	    	Toast.makeText(this,"Updated successfully",4000).show();
	    }
	}


