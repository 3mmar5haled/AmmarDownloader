package com.ammar.downloader;

import android.app.Activity;
import android.os.Bundle;
import com.ammar.downloader.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // test
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
