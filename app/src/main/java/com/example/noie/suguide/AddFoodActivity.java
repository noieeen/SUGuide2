package com.example.noie.suguide;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.noie.suguide.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class AddFoodActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        Spinner spinner = (Spinner) findViewById(R.id.Food_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.FoodTypeSpinner, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);



        Button canCle = findViewById(R.id.CacelButton_AF);
        canCle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    //        Spinner spinner = findViewById(R.id.SpinnerFoodTypeChoose);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.name,android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);
//
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



}

/*package com.example.emergencyphonenumber;

        import android.content.ContentValues;
        import android.content.Intent;
        import android.database.sqlite.SQLiteDatabase;
        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;

        import com.example.emergencyphonenumber.db.DatabaseHelper;

        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.util.List;

        import pl.aprilapps.easyphotopicker.DefaultCallback;
        import pl.aprilapps.easyphotopicker.EasyImage;

        import static com.example.emergencyphonenumber.db.DatabaseHelper.COL_IMAGE;
        import static com.example.emergencyphonenumber.db.DatabaseHelper.COL_NUMBER;
        import static com.example.emergencyphonenumber.db.DatabaseHelper.COL_TITLE;
        import static com.example.emergencyphonenumber.db.DatabaseHelper.TABLE_NAME;

public class AddPhoneItemActivity extends AppCompatActivity {

    private static final String TAG = AddPhoneItemActivity.class.getName();

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;
    private String mLogoFilename = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phone_item);

        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();

        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doInsertPhoneItem();
            }
        });

        ImageView logoImageView = findViewById(R.id.logo_image_view);
        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyImage.openChooserWithGallery(AddPhoneItemActivity.this, "เลือกรูปภาพ",0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        EasyImage.handleActivityResult(requestCode, resultCode, data, this, new DefaultCallback() {
            @Override
            public void onImagesPicked(@NonNull List<File> list, EasyImage.ImageSource imageSource, int i) {
                File logoFile = list.get(0);
                Log.i(TAG, logoFile.getAbsolutePath());

                File privateDir = getFilesDir();
                File dstFile = new File(privateDir, logoFile.getName());
                try {
                    copy(logoFile,dstFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                mLogoFilename = logoFile.getName();
            }
        });
    }

    public static void copy(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                // Transfer bytes from in to out
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    private void doInsertPhoneItem() {
        EditText titleEditText = findViewById(R.id.title_edit_text);
        EditText numberEditText = findViewById(R.id.number_edit_text);

        String title = titleEditText.getText().toString();
        String number = numberEditText.getText().toString();

        ContentValues cv = new ContentValues();
        cv.put(COL_TITLE, title);
        cv.put(COL_NUMBER, number);
        cv.put(COL_IMAGE,mLogoFilename);
        mDb.insert(TABLE_NAME, null, cv);

        finish();
    }
}
*/
