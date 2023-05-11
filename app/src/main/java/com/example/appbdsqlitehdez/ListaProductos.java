package com.example.appbdsqlitehdez;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListaProductos extends AppCompatActivity {
    public TextView tvSalidaprecio;
    public ListView lvProductos;
    //arreglo para regresar productos
    public  String productos[] = {"smart tv" , "tablet" , "PC" , "radio" , "Smart warch"};
    public  String precio[] = {"18000","900","4000","500","300"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        tvSalidaprecio=findViewById(R.id.tvSalidaPrecio);
        lvProductos=(ListView)findViewById(R.id.lvProductos);
        //
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,productos);
        //
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                tvSalidaprecio.setText("Precio de venta:"+ precio[position]);
            }
        });

    }//termina oncreate
}//termina clase