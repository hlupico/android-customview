package co.hannalupi.customview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
    private Button btnSelect;
    private ShapeSelectorView shapeSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shapeSelector = (ShapeSelectorView) findViewById(R.id.shapeSelector);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You selected: " +
                        shapeSelector.getSelectedShape(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
