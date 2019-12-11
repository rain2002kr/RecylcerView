package rain2002kr.techworld.recylcerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler1;
    recyclerAdpater adpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recycler1 = (RecyclerView) findViewById( R.id.recycler1 );
        recycler1.setLayoutManager( new LinearLayoutManager( this ) );
        adpater = new recyclerAdpater(  );
        adpater.addItem( new simpleItem( R.drawable.ic_launcher_foreground,"name","phone" ) );
        adpater.addItem( new simpleItem( R.drawable.ic_launcher_foreground,"name1","phone" ) );
        adpater.addItem( new simpleItem( R.drawable.ic_launcher_foreground,"name2","phone" ) );
        adpater.addItem( new simpleItem( R.drawable.ic_launcher_foreground,"name3","phone" ) );
        adpater.addItem( new simpleItem( R.drawable.ic_launcher_foreground,"name4","phone" ) );

        recycler1.setAdapter( adpater );
//test
    }

    class recyclerAdpater extends RecyclerView.Adapter<recyclerAdpater.ViewHolder> {

        ArrayList<simpleItem> mData = new ArrayList<simpleItem> ();


        public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            EditText editText,editText2;

            public ViewHolder(@NonNull View itemView) {
                super( itemView );
                imageView = itemView.findViewById( R.id.imageView );
                editText = itemView.findViewById( R.id.editText );
                editText2 = itemView.findViewById( R.id.editText2 );
            }
        }

        public recyclerAdpater(ArrayList<simpleItem> mData) {
            this.mData = mData;
        }

        public recyclerAdpater(){
            ;
        }
        public void addItem(simpleItem item){
            mData.add( item );


        }

        @NonNull
        @Override
        public recyclerAdpater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( LAYOUT_INFLATER_SERVICE );
            View view = inflater.inflate( R.layout.item_view, parent, false );
            recyclerAdpater.ViewHolder vh = new recyclerAdpater.ViewHolder( view );

            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull recyclerAdpater.ViewHolder holder, int position) {
            simpleItem item = mData.get( position );
            holder.imageView.setImageResource( item.resId );
            holder.editText.setText( item.name );
            holder.editText2.setText( item.phone );

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }
    }



}
