package com.example.ig4ever.chatbot;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ig4ever.chatbot.tabs_fragments.KeduaFragment;
import com.example.ig4ever.chatbot.tabs_fragments.KeempatFragment;
import com.example.ig4ever.chatbot.tabs_fragments.KelimaFragment;
import com.example.ig4ever.chatbot.tabs_fragments.KetigaFragment;
import com.example.ig4ever.chatbot.tabs_fragments.PertamaFragment;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int[] tabIcons = {R.drawable.ic_person_white_24dp,R.drawable.ic_chat_bubble_white_24dp,R.drawable.ic_access_time_white_24dp,R.drawable.ic_note_add_white_24dp,
    R.drawable.ic_more_horiz_white_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        viewPager = (ViewPager)findViewById(R.id.view_pager_1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);

    }

    @Override
    protected void onStart() {
        if(tabLayout.getTabAt(0).isSelected()){
            getSupportActionBar().setTitle("Teman");
        }else if(tabLayout.getTabAt(1).isSelected()){
            getSupportActionBar().setTitle("Obrolan");
        }else if(tabLayout.getTabAt(2).isSelected()){
            getSupportActionBar().setTitle("Timeline");
        }else if(tabLayout.getTabAt(3).isSelected()){
            getSupportActionBar().setTitle("Save");
        }else if(tabLayout.getTabAt(4).isSelected()){
            getSupportActionBar().setTitle("Profil");
        }
        super.onStart();
    }

    public void setupViewPager(ViewPager viewPager) {
        //adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PertamaFragment());
        adapter.addFragment(new KeduaFragment());
        adapter.addFragment(new KetigaFragment());
        adapter.addFragment(new KeempatFragment());
        adapter.addFragment(new KelimaFragment());
        viewPager.setAdapter(adapter);
    }
}
