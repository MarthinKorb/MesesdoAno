package com.mobile.aula.mesesdoano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private ListView ListViewMeses;
    private String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewMeses = findViewById(R.id.ListViewMesesId);

        ArrayAdapter listaMeses = new ArrayAdapter<>(
                getApplicationContext(), //contexto
                android.R.layout.simple_list_item_1, //layout
                android.R.id.text1, //id de dentro do ListView
                meses// A lista de itens
        );

        ListViewMeses.setAdapter(listaMeses);

        ListViewMeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position + 1){
                    case 1:
                        Toast.makeText(MainActivity.this, "Janeiro é o primeiro mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "Fevereiro é o segundo mês do ano" +
                                ", e tem 28 dias e em anos bisextos tem 29 dias.", LENGTH_LONG).show();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "Março é o terceiro mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 4:
                        Toast.makeText(MainActivity.this, "Abril é o quarto mês do ano" +
                                ", e tem 30 dias.", LENGTH_LONG).show();
                        break;

                    case 5:
                        Toast.makeText(MainActivity.this, "Maio é o quinto mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 6:
                        Toast.makeText(MainActivity.this, "Junho é o sexto mês do ano" +
                                ", e tem 30 dias.", LENGTH_LONG).show();
                        break;

                    case 7:
                        Toast.makeText(MainActivity.this, "Julho é o sétimo mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 8:
                        Toast.makeText(MainActivity.this, "Agosto é o oitavo mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 9:
                        Toast.makeText(MainActivity.this, "Setembro é o nono mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 10:
                        Toast.makeText(MainActivity.this, "Outubro é o décimo mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;

                    case 11:
                        Toast.makeText(MainActivity.this, "Novembro é o décimo primeiro mês do ano" +
                                ", e tem 30 dias.", LENGTH_LONG).show();
                        break;

                    case 12:
                        Toast.makeText(MainActivity.this, "Dezembro é o décimo segundo mês do ano" +
                                ", e tem 31 dias.", LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}
