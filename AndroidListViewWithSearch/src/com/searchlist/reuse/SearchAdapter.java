/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searchlist.reuse;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * 
 * @author leo
 */
public abstract class SearchAdapter extends BaseListAdapter implements Filterable {
	public ArrayList itemsinsearch;
	
	//public Context context;
	public ArrayList filtered;
	public SearchAdapter(Context context, ArrayList items) {
		super(context, items);
		// TODO Auto-generated constructor stub
		this.itemsinsearch=items;
		filtered=new ArrayList();
	}


	public abstract View getView(int position, View v, ViewGroup parent);
		// TODO Auto-generated method stu

	@Override
	public Filter getFilter() {
		// TODO Auto-generated method stub
		return new Filter() {

			@Override
			protected void publishResults(CharSequence constraint,
					FilterResults results) {
				// TODO Auto-generated method stub

				// if constraint is empty return the original names
				SearchAdapter.this.items = filtered;
				SearchAdapter.this.notifyDataSetChanged();

			}

			@Override
			protected FilterResults performFiltering(CharSequence constraint) {
				int i;
				// TODO Auto-generated method stub
				FilterResults Result = new FilterResults();
				filtered=new ArrayList();
				items=itemsinsearch;
					for (i=0;i<items.size();i++) {
						if (constraint.toString().length() == 0) {
							filtered.add(items.get(i));
						} else if (getStringToFilterAtPosition(items, i).startsWith(constraint.toString())||getStringToFilterAtPosition(items, i).contains(constraint.toString())) {
							filtered.add(items.get(i));
						}

					}
					Result.values = filtered;
					Result.count = filtered.size();
				
				
				return Result;
			}
		};
	}
	public abstract String getStringToFilterAtPosition(ArrayList item,int position);
}
