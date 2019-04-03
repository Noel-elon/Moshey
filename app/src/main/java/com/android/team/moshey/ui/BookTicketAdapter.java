package com.android.team.moshey.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.team.moshey.R;
import com.android.team.moshey.models.entities.AvailableTicket;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created By blackcoder
 * On 03/04/19
 **/
public final class BookTicketAdapter extends RecyclerView.Adapter<BookTicketAdapter.BookTicketViewHolder> {
    private List<AvailableTicket> mAvailableTickets;

    BookTicketAdapter(List<AvailableTicket> mAvailableTickets) {
        this.mAvailableTickets = mAvailableTickets;
    }

    @NonNull
    @Override
    public BookTicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tickets_available, parent, false);
        return new BookTicketViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookTicketViewHolder holder, int position) {
        for (AvailableTicket vAvailableTicket : mAvailableTickets) {
            holder.tvTicketsLeft.setText(String.valueOf(vAvailableTicket.getLeft()));
            holder.tvTo.setText(vAvailableTicket.getTo());
            holder.tvFrom.setText(vAvailableTicket.getFrom());
        }
    }

    @Override
    public int getItemCount() {
        return mAvailableTickets.size();
    }

    class BookTicketViewHolder extends RecyclerView.ViewHolder {

        TextView tvFrom, tvTo, tvTicketsLeft;

        BookTicketViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFrom = itemView.findViewById(R.id.text_view_from);
            tvTo = itemView.findViewById(R.id.text_view_to);
            tvTicketsLeft = itemView.findViewById(R.id.text_view_ticket_remaining);
        }
    }
}
