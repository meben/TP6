package com.mehdi.tp6;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	// TODO Auto-generated method stub
    	
    	switch (item.getItemId()) {
    		case R.id.action_settings:
    		Toast.makeText(this, "Item Settings", Toast.LENGTH_SHORT).show();
    		return true;
    		
    		case R.id.action_quitter:
    		finish();
    		return true;
    		
    	}
    	
    	
    	return super.onMenuItemSelected(featureId, item);
    }
    
}
