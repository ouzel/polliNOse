package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PollenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PollenFragment extends Fragment {
    BarChart barChart;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    // variable for our bar chart


    public PollenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PollenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PollenFragment newInstance(String param1, String param2) {
        PollenFragment fragment = new PollenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        // initializing variable for bar chart.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pollen, container, false);
        barB();

        Button btn = view.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barB();
            }
        });

        Button btn1 = view.findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barO();
            }
        });

        Button btn2 = view.findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barL();
            }
        });

        Button btn3 = view.findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barD();
            }
        });

        Button btn4 = view.findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barT();
            }
        });

        Button btn5 = view.findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barS();
            }
        });

        return view;
    }


    private void barB(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(0f, 1));
        entries.add(new BarEntry(1f, 2));
        entries.add(new BarEntry(1f, 3));
        entries.add(new BarEntry(4f, 4));
        entries.add(new BarEntry(4f, 5));
        entries.add(new BarEntry(4f, 6));
        entries.add(new BarEntry(4f, 7));
        entries.add(new BarEntry(3f, 8));
        entries.add(new BarEntry(2f, 9));
        entries.add(new BarEntry(2f, 10));
        entries.add(new BarEntry(2f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца березы (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);
    }

    private void barO(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(2f, 1));
        entries.add(new BarEntry(4f, 2));
        entries.add(new BarEntry(4f, 3));
        entries.add(new BarEntry(4f, 4));
        entries.add(new BarEntry(3f, 5));
        entries.add(new BarEntry(2f, 6));
        entries.add(new BarEntry(2f, 7));
        entries.add(new BarEntry(1f, 8));
        entries.add(new BarEntry(1f, 9));
        entries.add(new BarEntry(1f, 10));
        entries.add(new BarEntry(1f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца ольхи (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);
    }

    private void barL(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);
        barChart.setMaxVisibleValueCount(4);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(1f, 1));
        entries.add(new BarEntry(2f, 2));
        entries.add(new BarEntry(3f, 3));
        entries.add(new BarEntry(3f, 4));
        entries.add(new BarEntry(3f, 5));
        entries.add(new BarEntry(1f, 6));
        entries.add(new BarEntry(1f, 7));
        entries.add(new BarEntry(1f, 8));
        entries.add(new BarEntry(0f, 9));
        entries.add(new BarEntry(0f, 10));
        entries.add(new BarEntry(0f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца лещины (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);
    }

    private void barD(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(0f, 1));
        entries.add(new BarEntry(0f, 2));
        entries.add(new BarEntry(0f, 3));
        entries.add(new BarEntry(0f, 4));
        entries.add(new BarEntry(1f, 5));
        entries.add(new BarEntry(2f, 6));
        entries.add(new BarEntry(2f, 7));
        entries.add(new BarEntry(3f, 8));
        entries.add(new BarEntry(1f, 9));
        entries.add(new BarEntry(0f, 10));
        entries.add(new BarEntry(0f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца дуба (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);

    }

    private void barT(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(0f, 1));
        entries.add(new BarEntry(1f, 2));
        entries.add(new BarEntry(1f, 3));
        entries.add(new BarEntry(3f, 4));
        entries.add(new BarEntry(4f, 5));
        entries.add(new BarEntry(3f, 6));
        entries.add(new BarEntry(2f, 7));
        entries.add(new BarEntry(2f, 8));
        entries.add(new BarEntry(1f, 9));
        entries.add(new BarEntry(0f, 10));
        entries.add(new BarEntry(0f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца тополя (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);
    }

    private void barS(){
        BarChart barChart = (BarChart) view.findViewById(R.id.idBarChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 0));
        entries.add(new BarEntry(0f, 1));
        entries.add(new BarEntry(0f, 2));
        entries.add(new BarEntry(0f, 3));
        entries.add(new BarEntry(0f, 4));
        entries.add(new BarEntry(1f, 5));
        entries.add(new BarEntry(1f, 6));
        entries.add(new BarEntry(4f, 7));
        entries.add(new BarEntry(4f, 8));
        entries.add(new BarEntry(4f, 9));
        entries.add(new BarEntry(3f, 10));
        entries.add(new BarEntry(2f, 11));

        BarDataSet bardataset = new BarDataSet(entries, "Пыльца сосны (уровень концентрации)");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("");
        labels.add("Март");
        labels.add("");
        labels.add("");
        labels.add("Апрель");
        labels.add("");
        labels.add("");
        labels.add("Май");
        labels.add("");
        labels.add("");
        labels.add("Июнь");
        labels.add("");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        //barChart.setDescription("Set Bar Chart Description Here");  // set the description
        //bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);
    }

}