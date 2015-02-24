package com.example.connectme;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText uname = (EditText) findViewById(R.id.Username);
        final EditText passwd = (EditText) findViewById(R.id.pwd);
        
        final Button loginButton = (Button) findViewById(R.id.ViewProfile);
        
        
        loginButton.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                if ((uname.getText().toString().equals("Vaibhav")) && (passwd.getText().toString().equals("Shinde") )) {

                    // Create an explicit Intent for starting the userProfile activity.
                    // Activity
                    Intent userProfileIntent = new Intent(MainActivity.this,
                            UserProfile.class);

                    // Use the Intent to start the BusinessProfile Activity
                    startActivity(userProfileIntent);
                } 
                else if ((uname.getText().toString().equals("Pushpa")) && (passwd.getText().toString().equals("Iyer") ))
                {
                	Intent busiProfileIntent = new Intent(MainActivity.this,
                            BusiProfile.class);

                    // Use the Intent to start the HelloAndroid Activity
                    startActivity(busiProfileIntent);
                }
                else {
                    uname.setText("");
                    passwd.setText("");
                }
            }
          });
       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
