package com.cyy.pagerslidingtabstrip;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/**
 * Created by chenyuanyang on 2017/5/24.
 *
 */

public class PagerSlidingTabStrip extends HorizontalScrollView {

    private LinearLayout tabsContainer;

    public PagerSlidingTabStrip(Context context) {
        super(context);
        init();
    }

    public PagerSlidingTabStrip(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PagerSlidingTabStrip(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PagerSlidingTabStrip(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        tabsContainer = new LinearLayout(this.getContext());
        tabsContainer.setOrientation(LinearLayout.HORIZONTAL);
        tabsContainer.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT));

        addView(tabsContainer);


    }

    public void bindViewPager(ViewPager viewPager){
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null){
            throw new IllegalStateException("没有adapter");
        }
        viewPager.addOnPageChangeListener(pageChangeListener);
        notifyDataSetChanged();
    }

    private void notifyDataSetChanged(){

    }

    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageSelected(int position) {
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    };

}
