package com.example.temp150224_4tp_1_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private String loadJsonFromAssets() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("person.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer, "UTF-8");
        } catch(IOException error) {
            Toast.makeText(this, "Error: " + error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            return "";
        }

        return json;
    }
}