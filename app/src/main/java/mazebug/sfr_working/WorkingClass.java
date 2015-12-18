package mazebug.sfr_working;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

/**
 * Created by Provorny on 12/5/2015.
 */
public class WorkingClass extends AppCompatActivity{
    private Button show; private Button hide;
    private RelativeLayout panel;
    private RelativeLayout.LayoutParams ah = new RelativeLayout.LayoutParams(40, 100);
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(Button)findViewById(R.id.openNav);
        hide=(Button)findViewById(R.id.hideNav);
        panel=(RelativeLayout)findViewById(R.id.navPanel);
        show.bringToFront();
        panel.setVisibility(View.INVISIBLE);
        hide.setVisibility(View.INVISIBLE);
        show.setVisibility(View.VISIBLE);


    }

    public void openPanel(View view) {
        show.setVisibility(View.INVISIBLE);
        panel.setVisibility(View.VISIBLE);
        hide.setVisibility(View.VISIBLE);
    }

    public void hidePanel(View view) {
        panel.setVisibility(View.INVISIBLE);
        hide.setVisibility(View.INVISIBLE);
        show.setVisibility(View.VISIBLE);
    }

    public void showNavButt(View view) {
        n++;
        if((n % 2)==1){
        panel.setVisibility(View.INVISIBLE);
        hide.setVisibility(View.INVISIBLE);
        show.setVisibility(View.INVISIBLE);}
        else{
            show.setVisibility(View.VISIBLE);
            panel.setVisibility(View.INVISIBLE);
            hide.setVisibility(View.INVISIBLE);

        }
    }

    public void dontHide(View view) {
        show.setVisibility(View.INVISIBLE);
        panel.setVisibility(View.VISIBLE);
        hide.setVisibility(View.VISIBLE);

    }
}
