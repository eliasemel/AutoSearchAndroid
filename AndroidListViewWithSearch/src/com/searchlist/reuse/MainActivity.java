package com.searchlist.reuse;

import java.util.ArrayList;
import java.util.HashMap;

import com.androidhive.androidlistviewwithsearch.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	// List view
	private ListView lv;

	// Listview Adapter
	ArrayAdapter<String> adapter;
	ArrayList<String> arr;

	// Search EditText
	EditText inputSearch;
	PhotoSearchList searchAdapter;

	// ArrayList for Listview
	ArrayList<HashMap<String, String>> productList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		arr = new ArrayList<String>();

		// Listview Data
		// String[] product = {"Dell Inspiron", "HTC One X", "HTC Wildfire S",
		// "HTC Sense", "HTC Sensation XE",
		// "iPhone 4S", "Samsung Galaxy Note 800",
		// "Samsung Galaxy S3", "MacBook Air", "Mac Mini", "MacBook Pro"};

		arr.add("Samsung Galaxy S3");
		arr.add("Mac Mini");
		arr.add("MacBook Air");
		arr.add("Mac Mini");
		arr.add( "MacBook Pro");
		arr.add("Dell Inspiron");
		arr.add("Samsung Galaxy Note 800");
		arr.add("iphone");

		// arr.add("Dell Inspiron");
		// arr.add("Dell Inspiron");
		// arr.add("Dell Inspiron");
		// arr.add("Dell Inspiron");
		// arr.add("Dell Inspiron");
	

		lv = (ListView) findViewById(R.id.list_view);
		inputSearch = (EditText) findViewById(R.id.inputSearch);
		searchAdapter = new PhotoSearchList(this, arr,inputSearch);
		//
		// // Adding items to listview
		// adapter = new ArrayAdapter<String>(this, R.layout.list_item,
		// R.id.product_name, products);
		lv.setAdapter(searchAdapter);

		/**
		 * Enabling Search Filter
		 * */
		
	}

}
