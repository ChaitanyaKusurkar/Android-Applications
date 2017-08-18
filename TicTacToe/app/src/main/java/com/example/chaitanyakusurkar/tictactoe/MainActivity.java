package com.example.chaitanyakusurkar.tictactoe;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    int flag = 0,i, counter=0;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if (b0.getText().toString().equals("")) {
                    if (flag == 0) {
                        b0.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b0.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b0.getText().toString().equals("X") || b0.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.btn1:
                if (b1.getText().toString().equals("")) {
                    if (flag == 0) {
                        b1.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b1.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b1.getText().toString().equals("X") || b1.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn2:
                if (b2.getText().toString().equals("")) {
                    if (flag == 0) {
                        b2.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b2.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b2.getText().toString().equals("X") || b2.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.btn3:
                if (b3.getText().toString().equals("")) {
                    if (flag == 0) {
                        b3.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b3.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b3.getText().toString().equals("X") || b3.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn4:
                if (b4.getText().toString().equals("")) {
                    if (flag == 0) {
                        b4.setText("X");
                        counter++;
                        isWinner(counter);

                        flag = 1;
                    } else if (flag == 1) {
                        b4.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b4.getText().toString().equals("X") || b4.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.btn5:
                if (b5.getText().toString().equals("")) {
                    if (flag == 0) {
                        b5.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b5.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b5.getText().toString().equals("X") || b5.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.btn6:
                if (b6.getText().toString().equals("")) {
                    if (flag == 0) {
                        b6.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b6.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b6.getText().toString().equals("X") || b6.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
            case R.id.btn7:
                if (b7.getText().toString().equals("")) {
                    if (flag == 0) {
                        b7.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b7.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b7.getText().toString().equals("X") || b7.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn8:
                if (b8.getText().toString().equals("")) {
                    if (flag == 0) {
                        b8.setText("X");
                        counter++;
                        isWinner(counter);
                        flag = 1;
                    } else if (flag == 1) {
                        b8.setText("O");
                        counter++;
                        isWinner(counter);
                        flag = 0;
                    }
                } else if (b8.getText().toString().equals("X") || b8.getText().toString().equals("O")) {
                    Toast.makeText(this, "Please Select Another Cell", Toast.LENGTH_LONG).show();

                }
                break;
        }
    }

    public void isWinner(int counter) {
        String b0_text, b1_text, b2_text, b3_text, b4_text, b5_text, b6_text, b7_text, b8_text;
        b0_text = b0.getText().toString();
        b1_text = b1.getText().toString();
        b2_text = b2.getText().toString();
        b3_text = b3.getText().toString();
        b4_text = b4.getText().toString();
        b5_text = b5.getText().toString();
        b6_text = b6.getText().toString();
        b7_text = b7.getText().toString();
        b8_text = b8.getText().toString();
        Log.d("a", "a");
        if (counter == 9) {
            if (b0_text.equals("X") && b3_text.equals("X") && b6_text.equals("X") || b1_text.equals("X") && b4_text.equals("X") && b7_text.equals("X") || b2_text.equals("X") && b5_text.equals("X") && b8_text.equals("X") || b0_text.equals("X") && b1_text.equals("X") && b2_text.equals("X") || b3_text.equals("X") && b4_text.equals("X") && b5_text.equals("X") || b6_text.equals("X") && b7_text.equals("X") && b8_text.equals("X") || b2_text.equals("X") && b4_text.equals("X") && b6_text.equals("X") || b0_text.equals("X") && b4_text.equals("X") && b8_text.equals("X")) {
                i=1;
                dialog(i);
            } else if (b0_text.equals("O") && b3_text.equals("O") && b6_text.equals("O") || b1_text.equals("O") && b4_text.equals("O") && b7_text.equals("O") || b2_text.equals("O") && b5_text.equals("O") && b8_text.equals("O") || b0_text.equals("O") && b1_text.equals("O") && b2_text.equals("O") || b3_text.equals("O") && b4_text.equals("O") && b5_text.equals("O") || b6_text.equals("O") && b7_text.equals("O") && b8_text.equals("O") || b2_text.equals("O") && b4_text.equals("O") && b6_text.equals("O") || b0_text.equals("O") && b4_text.equals("O") && b8_text.equals("O")) {
                i=2;
                dialog(i);
            } else {
                i=3;
                dialog(i);

            }
        } else if (b0_text.equals("X") && b3_text.equals("X") && b6_text.equals("X") || b1_text.equals("X") && b4_text.equals("X") && b7_text.equals("X") || b2_text.equals("X") && b5_text.equals("X") && b8_text.equals("X") || b0_text.equals("X") && b1_text.equals("X") && b2_text.equals("X") || b3_text.equals("X") && b4_text.equals("X") && b5_text.equals("X") || b6_text.equals("X") && b7_text.equals("X") && b8_text.equals("X") || b2_text.equals("X") && b4_text.equals("X") && b6_text.equals("X") || b0_text.equals("X") && b4_text.equals("X") && b8_text.equals("X"))

        {
            i=1;
            dialog(i);
        } else if (b0_text.equals("O") && b3_text.equals("O") && b6_text.equals("O") || b1_text.equals("O") && b4_text.equals("O") && b7_text.equals("O") || b2_text.equals("O") && b5_text.equals("O") && b8_text.equals("O") || b0_text.equals("O") && b1_text.equals("O") && b2_text.equals("O") || b3_text.equals("O") && b4_text.equals("O") && b5_text.equals("O") || b6_text.equals("O") && b7_text.equals("O") && b8_text.equals("O") || b2_text.equals("O") && b4_text.equals("O") && b6_text.equals("O") || b0_text.equals("O") && b4_text.equals("O") && b8_text.equals("O"))

        {
            i=2;
            dialog(i);
        }
    }
    public void dialog(int i){
        android.app.AlertDialog.Builder androidDialog = new android.app.AlertDialog.Builder(MainActivity.this);
        androidDialog.setTitle("Result");
        if(i==1){
            androidDialog.setMessage("Player 1 Wins. Do yo want to restart game?");
        }
        else if(i==2){
            androidDialog.setMessage("Player 2 Wins. Do yo want to restart game?");
        }
        else if(i==3){
            androidDialog.setMessage("Game Drawn. Do yo want to restart game?");
        }
        androidDialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        androidDialog.setPositiveButton("Restart", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent restart = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                restart.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restart);
            }
        });
        androidDialog.create().show();
    }

}


