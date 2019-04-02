package com.android.team.moshey.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created By blackcoder
 * On 01/04/19
 **/

@Entity(tableName = "my_tickets")
public final class Ticket {

    @PrimaryKey(autoGenerate = true)
    private long _id;
    private String ticketId;
    private String destinationPoint;
    private String departurePoint;
    private String date;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", destinationPoint='" + destinationPoint + '\'' +
                ", departurePoint='" + departurePoint + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
