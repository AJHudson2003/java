package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

/**

This app displays an order form to order coffee
*/
public class MainActivity extends AppCompatActivity {
int numofcoffes = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}

/**

This method is called when the order is clicked.
*/
public void submitOrder(View view) {

numofcoffes++;
 display(numofcoffes);
displayPrice(numofcoffes * 5);
}
/**

This method displays the given quantity value on screen.
*/
private void display(int number) {
TextView quantityTextView = findViewById(R.id.quantity_text_view);
quantityTextView.setText("" + number);
}
/**

This method displays the given price on the screen.
*/
private void displayPrice(int number) {
TextView priceTextView = findViewById(R.id.zero_text_view);
priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(number));
}
}