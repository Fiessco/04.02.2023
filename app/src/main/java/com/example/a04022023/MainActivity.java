package com.example.a04022023;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RailwayTicket railwayTicket = new RailwayTicket(120, 2);

    RailwayTicket railwayTicketChild = new RailwayTicketChild(120, 14, 50);

    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketTotalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);

        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + "монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + "монет");
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll()) + "монет");



    }
}