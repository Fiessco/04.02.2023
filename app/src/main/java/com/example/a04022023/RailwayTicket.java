package com.example.a04022023;

public class RailwayTicket {

    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int numberOfTickets;

    public RailwayTicket(float ticketPrice, int numberOfTicket) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public RailwayTicket() {
    }

    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets;
    }

    public float getTicketPrice() {
        return numberOfTickets;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
