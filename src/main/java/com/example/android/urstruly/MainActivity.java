package com.example.android.urstruly;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button1=(Button) findViewById(R.id.b11);
//        button1.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_CALL);
//                intent.setData(Uri.parse("tel:112"));
//                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(intent);
//            }});
//    }
    }

    public void call1(View view){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:112"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);

            }
        }
////        else
////        {
////            Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();
////            return;
////        }

    public void about1(View view){
        Toast.makeText(this,"It can be dialed free of charge from most phones in order to reach emergency services. All GSM-compatible handsets are able to dial 112 even when locked or, in some countries, with no SIM card present.",Toast.LENGTH_LONG).show();
           return;
    }
    public void send1(View view) {
        EditText nameinput = (EditText) findViewById(R.id.name_input);
        String name = nameinput.getText().toString();
        EditText addressinput = (EditText) findViewById(R.id.address_input);
        String address = addressinput.getText().toString();
        EditText numinput = (EditText) findViewById(R.id.number_input);
        String num = numinput.getText().toString();
        EditText reasoninput = (EditText) findViewById(R.id.reason_input);
        String reason = reasoninput.getText().toString();
        String Message = "Name:  " + name +
                "\n" + "Address:  " + address +
                "\n" + "Mobile No.:  " + num +
                "\n" + "Emergency:  " + reason;
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(Uri.parse("mailto:"));
        sendIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"saema.nadim@gmail.com"});
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, name + "asked for help!");
        sendIntent.putExtra(Intent.EXTRA_TEXT, Message);
        // sendIntent.setType("text/plain");

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }

    public void call2(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:100"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about2(View view){
        Toast.makeText(this,"A Police Force is a constituted body of persons empowered by the state to enforce the law, to protect people and property, and to prevent crime and civil disorder.",Toast.LENGTH_LONG).show();
        return;
    }
    public void call3(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:101"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about3(View view){
        Toast.makeText(this,"A Fire Department is an organisation that primarily provides firefighting services for a specific geographic area.",Toast.LENGTH_LONG).show();
        return;
    }
    public void call4(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:102"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about4(View view){
        Toast.makeText(this,"An Ambulance is a medium for transportation between places of treatment. It also provides out of hospital medical care to the patient in emergencies.",Toast.LENGTH_LONG).show();
        return;
    }
    public void call5(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:108"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about5(View view){
        Toast.makeText(this,"Disaster Management Service is a charter obligation of the Philippine Red Cross, primarily tasked to deliver humanitarian assistance to the most vulnerable affected by natural hazards or human-induced emergencies.",Toast.LENGTH_LONG).show();
        return;
    }
    public void call6(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1091"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about6(View view){
        Toast.makeText(this,"A Helpline for women who want to report harassment, stalking or phone-related abuse.",Toast.LENGTH_LONG).show();
        return;
    }
    public void call7(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:181"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about7(View view) {
        Toast.makeText(this, "Helpline for women suffering from Domestic Violence.", Toast.LENGTH_LONG).show();
        return;
    }
    public void call8(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:9540161344"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about8(View view) {
        Toast.makeText(this, "Air Ambulance is a means of transport through airto move patients to and from healthcare facilities and accidental scenes.", Toast.LENGTH_LONG).show();
    }
    public void call9(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1098"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about9(View view) {
        Toast.makeText(this, "Helpline for children if they are abused physically, sexually, psychologically or by any other way, especially by a parent or other caregiver.", Toast.LENGTH_LONG).show();
    }
    public void call10(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1291"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about10(View view) {
        Toast.makeText(this, "Helpline for Senior Citizens if they are abused in any way or need help.", Toast.LENGTH_LONG).show();
    }
//    public void call11(View view){
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:1070"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//
//        }
//    }
//    public void about11(View view) {
//        Toast.makeText(this, "Helpline to be used during Natural Calamities", Toast.LENGTH_LONG).show();
//    }
    public void call12(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1073"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about12(View view) {
        Toast.makeText(this, "Road Accident Emergency Services can be reached through this helpline.", Toast.LENGTH_LONG).show();
    }
    public void call13(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1072"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about13(View view) {
        Toast.makeText(this, "Railway Accident Emergency Services can be reached through this helpline.", Toast.LENGTH_LONG).show();
    }
//    public void call14(View view){
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:139"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//
//        }
//    }
//    public void about14(View view) {
//        Toast.makeText(this, "Helpline for customers to enquire about ant type of Railway information.", Toast.LENGTH_LONG).show();
//    }

//    public void call15(View view){
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//
//        }
//    }
//    public void about15(View view) {
//        Toast.makeText(this, "Use this Helpline if LPG gas leak occurs.", Toast.LENGTH_LONG).show();
//    }
    public void call16(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1551"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
    public void about16(View view) {
        Toast.makeText(this, "Helpline to be used for queries regarding agriculture by farmers.", Toast.LENGTH_LONG).show();
    }
}