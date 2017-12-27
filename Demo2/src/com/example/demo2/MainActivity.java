package com.example.demo2;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
public class MainActivity extends FragmentActivity implements ActionBar.TabListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //GET AND SETUP ACTIONBAR
        final ActionBar ab=getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
      //ADD THE TABS
        ab.addTab(ab.newTab().setText("Man Utd").setTabListener(this));
        ab.addTab(ab.newTab().setText("Chelsea").setTabListener(this));
        ab.addTab(ab.newTab().setText("Arsenal").setTabListener(this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
  @Override
  public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
    // TODO Auto-generated method stub
  }
  @Override
  public void onTabSelected(Tab tab, FragmentTransaction ft) {
    // TODO Auto-generated method stub
    //FIRST TAB SHOW MAN UTD
    if(tab.getPosition()==0)
    {
      ManUtdFragment mu=new ManUtdFragment();
      getSupportFragmentManager().beginTransaction().replace(R.id.container, mu).commit();
    }else if(tab.getPosition()==1)
    {
       ChelseaFragment c=new ChelseaFragment();
       getSupportFragmentManager().beginTransaction().replace(R.id.container, c).commit();
    }else if(tab.getPosition()==1)
    {
       ArsenalFragment a=new ArsenalFragment();
       getSupportFragmentManager().beginTransaction().replace(R.id.container, a).commit();
    }
  }
  @Override
  public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
    // TODO Auto-generated method stub
  }
}