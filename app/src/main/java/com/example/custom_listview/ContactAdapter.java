package com.example.custom_listview;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public ContactAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ContactAdapter(@NonNull Context context, int resource, @NonNull Contact[] objects) {
        super(context, resource, objects);
    }

    public ContactAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Contact[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
    }

    public ContactAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Contact> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
