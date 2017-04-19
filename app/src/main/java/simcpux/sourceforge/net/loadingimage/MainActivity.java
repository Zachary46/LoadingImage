package simcpux.sourceforge.net.loadingimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private LoadingImageView ll;
    private ImageView iv;
    private int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {

        ll = (LoadingImageView) findViewById(R.id.ll);
        iv = (ImageView) findViewById(R.id.iv);
        Glide.with(this).load("http://tupian.enterdesk.com/2013/lxy/06/22/4.jpg").asBitmap().into(ll);
        Glide.with(this).load("https://timgsa.baidu" +
                ".com/timg?image&quality=80&size=b9999_10000&sec=1492518574786&di" +
                "=8cd37e70939e4d0adb68524839c3dfbb&imgtype=0&src=http%3A%2F%2Fpic1.nipic.com%2F2008-12-08%2F20081281867286_2.jpg").asBitmap().into(iv);
    }

    public void add(View view) {
        progress++;
        ll.setProgress(progress);
    }

    public void jian(View view) {
        if (progress>0){
            progress--;
        }
        ll.setProgress(progress);
    }
}
