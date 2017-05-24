package com.cyy.simple;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.cyy.pagerslidingtabstrip.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity {

    protected PagerSlidingTabStrip pagerSlidingTabStrip;
    protected ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();

        viewPager.setAdapter(new MyAdapter());
        viewPager.setPageMargin(15 * 3);
        viewPager.setOffscreenPageLimit(3);
        pagerSlidingTabStrip.bindViewPager(viewPager);
    }

    private void initView() {
        pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.pagerSlidingTabStrip);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

    }

    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_view, null);
            TextView t = (TextView) view.findViewById(R.id.textView);
            t.setText("" + position);
            container.addView(view);
            return view;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return super.getPageTitle(position);
        }

        @Override
        public float getPageWidth(int position) {
            return 1.0f;
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }
    }
}
