package com.epicodus.moviedatabase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.moviedatabase.Movie;
import com.epicodus.moviedatabase.MovieDetailFragment;

import java.util.ArrayList;

public class MoviePagerAdapter extends FragmentPagerAdapter{
    private ArrayList<Movie> mMovies;

    public MoviePagerAdapter(FragmentManager fm, ArrayList<Movie> movies) {
        super(fm);
        mMovies = movies;
    }

    @Override
    public Fragment getItem(int position) {
        return MovieDetailFragment.newInstance(mMovies.get(position));
    }

    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mMovies.get(position).getTitle();
    }
}
