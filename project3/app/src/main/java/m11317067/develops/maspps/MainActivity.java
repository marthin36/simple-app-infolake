package m11317067.develops.maspps;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Danau Toba","Danau Mantano",
            "Danau Poso","Danau Singkarak",
            "Danau Maninjau","Danau Towuti","Danau Sentani","Danau Ranau","Danau Patenggang","Danau Limboto","Danau Tondano"
    };

    String[] subtitle ={
            "Sumatera Utara","Sulawesi Selatan",
            "Sulawesi Tengah","Sumatera Barat",
            "Sumatera Barat","Sulawesi Selatan","Papua","Sumatera Selatan","Jawa Barat","Gorontalo","Sulawesi Utara"
    };

    Integer[] imgid={
            R.drawable.download_1,R.drawable.download_2,
            R.drawable.download_3,R.drawable.download_4,
            R.drawable.download_5,R.drawable.download_6,R.drawable.download_7,R.drawable.download_8,R.drawable.download_9,R.drawable.download_10,R.drawable.download_11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );




        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {

                if(position == 0) {

                    Intent myIntent = new Intent(v.getContext(), Detail1.class);

                    startActivityForResult(myIntent, 0);                }

                else if(position == 1) {

                    Intent myIntent = new Intent(v.getContext(), Detail2.class);

                    startActivityForResult(myIntent, 0);
                }

                else if(position == 2) {

                    Intent myIntent = new Intent(v.getContext(), Detail3.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 3) {

                    Intent myIntent = new Intent(v.getContext(), Detail4.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 4) {

                    Intent myIntent = new Intent(v.getContext(), Detail5.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 5) {

                    Intent myIntent = new Intent(v.getContext(), Detail6.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 6) {

                    Intent myIntent = new Intent(v.getContext(), Detail7.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 7) {

                    Intent myIntent = new Intent(v.getContext(), Detail8.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 8) {

                    Intent myIntent = new Intent(v.getContext(), Detail9.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 9) {

                    Intent myIntent = new Intent(v.getContext(), Detail10.class);

                    startActivityForResult(myIntent, 0);
                }
                else if(position == 10) {

                    Intent myIntent = new Intent(v.getContext(), Detail11.class);

                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.miCompose) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected( item );
    }


//    public void pindah (View v) {
//        Intent intent = new Intent(this, Home.class);
//        startActivity(intent);
//    }
}
