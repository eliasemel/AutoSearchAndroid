package com.searchlist.reuse;

import java.util.ArrayList;

import com.androidhive.androidlistviewwithsearch.R;



import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class PhotoSearchList extends SearchAdapter implements TextWatcher{
	EditText inputSearch;

	public PhotoSearchList(Context context, ArrayList items,EditText inputtext) {
		super(context, items);
		this.inputSearch=inputtext;
		inputSearch.addTextChangedListener(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View v, ViewGroup parent) {
		// TODO Auto-generated method stub
		v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
		TextView textView=(TextView) v.findViewById(R.id.product_name);
		textView.setText(items.get(position).toString());
		return v;
	}

	@Override
	public String getStringToFilterAtPosition(ArrayList item, int position) {
		// TODO Auto-generated method stub
		return item.get(position).toString();
	}

	@Override
	public void afterTextChanged(Editable cs) {
		// TODO Auto-generated method stub
		this.getFilter().filter(cs);
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		
	}

}
