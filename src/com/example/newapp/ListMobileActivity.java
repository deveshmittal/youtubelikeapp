package com.example.newapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ListMobileActivity extends Activity {

    ListView listViewItems=null;
    MobileArrayAdapter adapter;
    ImageView conveyanceIcon ;


	static final String[] MOBILE_OS = new String[] { "Android", "iOS","WindowsMobile", "Blackberry"};

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mobile_list_activity);
		//setListAdapter(new ArrayAdapter<String>(this, R.layout.list_mobile,
		//		R.id.label, MOBILE_OS));
		adapter = new MobileArrayAdapter(this, MOBILE_OS);
		
        listViewItems = (ListView)findViewById(R.id.legslen);
        if(listViewItems != null){
            listViewItems.setAdapter(adapter);} else{}
        
        
        
          conveyanceIcon = (ImageView)findViewById(R.id.imgview);
  //  String imageFile = conveyance;
        
        
        
        
        
        
        
        
        
            listViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    

          
                                @Override
                                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                                {
                                
                                	
                                	String selectedValue = (String)adapter.getItem(position);
                                	String imageFile = selectedValue.toLowerCase();
                                	
                                	conveyanceIcon.setImageResource(getApplicationContext().getResources().getIdentifier(imageFile, "drawable", getApplicationContext().getPackageName()));
                             
                                	
                            //    Toast.makeText(ListMobileActivity.this,selectedValue, Toast.LENGTH_SHORT).show();
                                
                                	
                                
                                	}
                                

		
                                
                                
		//setListAdapter(new MobileArrayAdapter(this, MOBILE_OS));
		

	});
	
/*
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		//get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

	}
*/
	}
}