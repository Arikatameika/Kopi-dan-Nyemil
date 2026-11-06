package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menuList: List<MenuItem>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPhoto: ImageView = itemView.findViewById(R.id.iv_menu_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_menu_name)
        val tvDesc: TextView = itemView.findViewById(R.id.tv_menu_desc)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_menu_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = menuList[position]
        holder.tvName.text = item.name
        holder.tvDesc.text = item.description
        holder.tvPrice.text = item.price
        holder.ivPhoto.setImageResource(item.imageResId)
    }

    override fun getItemCount(): Int = menuList.size
}