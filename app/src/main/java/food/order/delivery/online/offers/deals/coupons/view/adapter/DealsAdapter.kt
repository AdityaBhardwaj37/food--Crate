package food.order.delivery.online.offers.deals.coupons.view.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import food.order.delivery.online.offers.deals.coupons.buy.R
import food.order.delivery.online.offers.deals.coupons.view.listener.deals.DealClickListener
import food.order.delivery.online.offers.deals.coupons.view.listener.deals.CouponInfoClickListener
import food.order.delivery.online.offers.deals.coupons.view.viewholder.InvestViewHolder

class DealsAdapter(val context: Context?, val fundsList: List<List<String>>, val couponInfoClickListener: CouponInfoClickListener, val dealClickListener: DealClickListener) : RecyclerView.Adapter<InvestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InvestViewHolder {
        return InvestViewHolder(LayoutInflater.from(context).inflate(R.layout.card_deals_portal_layout,parent,false))
    }

    override fun onBindViewHolder(holder: InvestViewHolder, position: Int) {
        Log.d("TAG", "onBindViewHolder: "+fundsList.size)
        Glide.with(context!!).load(fundsList.get(position).get(2)).into(holder.ivStoreIcon)

        holder.tvCoupons.setOnClickListener {
            couponInfoClickListener.onClickCoupon(fundsList.get(position))
        }

        holder.ivDeals.setOnClickListener {
            dealClickListener.onClickDeal(fundsList.get(position))
        }
    }

    override fun getItemCount(): Int {
        return fundsList.size
    }
}