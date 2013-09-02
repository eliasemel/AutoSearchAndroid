package com.searchlist.reuse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;


/**
 *
 * @author leo
 */
public class BaseListAdapter extends BaseAdapter {

    public ArrayList items;
    public Context context;

    public BaseListAdapter(Context context, ArrayList items) {
        this.items = items;
        this.context = context;
    }
    public BaseListAdapter(Context context, List items) {
        this.items = (ArrayList)items;
        this.context = context;
    }
    public View getView(int position, View v, ViewGroup parent) {

        return new RelativeLayout(context);

    }
    public long getItemId(int position) {
        return position;
    }
    public void setItems(ArrayList items)
    {
        this.items = items;
        Log.e("size","size"+items.size());	
    }
      public ArrayList getItems()
    {
        return items;
    }
    public void addItems(ArrayList items)
    {
        this.items.addAll(items);
    }
     public void clearItems()
    {
        this.items.clear();
    
    }
    public Object getItem(int position) {
        return this.items.get(position);
    }

    public int getCount() {
        return this.items.size();
    }
   
    public void removeShowMore(int i)
    {
        items.remove(i);
    }
   
    public void removeNoItems(int i)
    {
        items.remove(i);
    }
   
}
