package willians.camaioni.applistacontato.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.inflate
import willians.camaioni.applistacontato.R
import willians.camaioni.applistacontato.models.Contato
import java.util.zip.Inflater


//o viewholder mostra as coisas na tela e faz a reciclagem das view, tirando as velhas e mostrando as novas
class AdapterContatos(var contexto:Context, var listaContatos: List<Contato>) : Adapter<RecyclerView.ViewHolder>(){



    class MeuViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        var Inflater:LayoutInflater = LayoutInflater.from(contexto)
        var view = Inflater.inflate(R.layout.contato_item,parent,false)
        return  MeuViewHolder(view)


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return this.listaContatos.size
    }


}

