package com.timteam.symbidrive.symbidrive.fragments;

import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.appspot.bustling_bay_88919.symbidrive.Symbidrive;
import com.appspot.bustling_bay_88919.symbidrive.model.SymbidriveCreatePoolRequest;
import com.appspot.bustling_bay_88919.symbidrive.model.SymbidrivePoolResponse;
import com.appspot.bustling_bay_88919.symbidrive.model.SymbidriveRegisterUserRequest;
import com.appspot.bustling_bay_88919.symbidrive.model.SymbidriveUserResponse;
import com.google.api.client.util.DateTime;
import com.timteam.symbidrive.symbidrive.R;
import com.timteam.symbidrive.symbidrive.adapters.PlacesAutoCompleteAdapter;
import com.timteam.symbidrive.symbidrive.helpers.AppConstants;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by zombie on 3/24/15.
 */
public class CreatePoolFragment extends Fragment{

    View mRootView;

    public CreatePoolFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_create_pool, container, false);
        initInterfaceElements(rootView);
        mRootView = rootView;
        return rootView;
    }

    private void setTimePickerView(View rootView) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TextView timePicker = (TextView)rootView.findViewById(R.id.tv_time_picker);
        timePicker.setText(hour + ":" + minute);
    }

    private void setDatePickerView(View rootView) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        TextView datePicker = (TextView)rootView.findViewById(R.id.tv_date_picker);
        datePicker.setText(day + "/" + month + "/" + year);
    }

    private void initInterfaceElements(View rootView) {

        AutoCompleteTextView sourceLocation = (AutoCompleteTextView) rootView.
                findViewById(R.id.et_source_location);
        if (sourceLocation != null) {
            sourceLocation.setAdapter(new PlacesAutoCompleteAdapter(getActivity(),
                    R.layout.autocomplete_list_view));
        }

        AutoCompleteTextView destinationLocation = (AutoCompleteTextView) rootView.
                findViewById(R.id.et_destination_location);
        if (destinationLocation != null) {
            destinationLocation.setAdapter(new PlacesAutoCompleteAdapter(getActivity(),
                    R.layout.autocomplete_list_view));
        }

        setTimePickerView(rootView);
        setDatePickerView(rootView);
    }

}
