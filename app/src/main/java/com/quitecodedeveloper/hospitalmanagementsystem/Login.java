package com.quitecodedeveloper.hospitalmanagementsystem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
TextView LoginText,SignUpText,SignupLoginText,SignUpSignUpText,ForgetPassword,OrLoginWith;
CardView LoginCard,SignUpCard;
TextInputLayout filledTextField,signupemailtextinput,signupmobiletextinput,signuppasswordtextfield,signuprepasswordtextfield,filledTextField2;
CardView logincardbutton,loginlogincardbutton;
CardView Google,Microsoft,Facebook,Twitter;
float v=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginText=findViewById(R.id.logintextview);
        SignUpText=findViewById(R.id.signuptextview);
        SignUpCard=findViewById(R.id.signupcard);
        LoginCard=findViewById(R.id.logincard);
        SignupLoginText=findViewById(R.id.signuplogin);
        SignUpSignUpText=findViewById(R.id.signupsignup);
        filledTextField=findViewById(R.id.filledTextField);
        signupemailtextinput=findViewById(R.id.signupemailtextinput);
        signupmobiletextinput=findViewById(R.id.signupmobiletextinput);
        signuppasswordtextfield=findViewById(R.id.signuppasswordtextfield);
        signuprepasswordtextfield=findViewById(R.id.signuprepasswordtextfield);
        logincardbutton=findViewById(R.id.logincardbutton);
        filledTextField2=findViewById(R.id.filledTextField2);
        loginlogincardbutton=findViewById(R.id.loginlogincardbutton);
        ForgetPassword=findViewById(R.id.forgetpassword);
        OrLoginWith=findViewById(R.id.orloginwith);
        Google=findViewById(R.id.google);
        Microsoft=findViewById(R.id.microsoft);
        Facebook=findViewById(R.id.facebook);
        Twitter=findViewById(R.id.twitter);
        animation();
        LoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpCard.setVisibility(View.GONE);
                LoginCard.setVisibility(View.VISIBLE);
                LoginText.setTextColor(Color.parseColor("#FF0E0E0E"));
                SignUpText.setTextColor(Color.parseColor("#919090"));


            }
        });
        SignUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginCard.setVisibility(View.GONE);
                SignUpCard.setVisibility(View.VISIBLE);
                SignUpSignUpText.setTextColor(Color.parseColor("#FF0E0E0E"));
                SignupLoginText.setTextColor(Color.parseColor("#919090"));
                signupemailtextinput.setTranslationX(300);
                signupmobiletextinput.setTranslationX(400);
                signuppasswordtextfield.setTranslationX(500);
                signuprepasswordtextfield.setTranslationX(600);
                logincardbutton.setTranslationX(700);
                signupemailtextinput.setAlpha(v);
                signupmobiletextinput.setAlpha(v);
                signuppasswordtextfield.setAlpha(v);
                signuprepasswordtextfield.setAlpha(v);
                logincardbutton.setAlpha(v);
                signupemailtextinput.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                signupmobiletextinput.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                signuppasswordtextfield.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                signuprepasswordtextfield.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                logincardbutton.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                SignupLoginText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LoginCard.setVisibility(View.VISIBLE);
                        SignUpCard.setVisibility(View.GONE);
                        filledTextField.setTranslationX(-300);
                        filledTextField2.setTranslationX(-400);
                        loginlogincardbutton.setTranslationX(-500);
                        ForgetPassword.setTranslationX(-550);
                        OrLoginWith.setTranslationY(-200);
                        Google.setTranslationY(300);
                        Microsoft.setTranslationY(400);
                        Facebook.setTranslationY(500);
                        Twitter.setTranslationY(600);
                        filledTextField.setAlpha(v);
                        filledTextField2.setAlpha(v);
                        loginlogincardbutton.setAlpha(v);
                        ForgetPassword.setAlpha(v);
                        OrLoginWith.setAlpha(v);
                        Google.setAlpha(v);
                        Microsoft.setAlpha(v);
                        Facebook.setAlpha(v);
                        Twitter.setAlpha(v);
                        filledTextField.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        filledTextField2.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        loginlogincardbutton.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        ForgetPassword.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        OrLoginWith.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        Google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        Microsoft.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        Facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                        Twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
                    }
                });
            }
        });




        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
    }
    private void    animation(){
        filledTextField.setTranslationX(-300);
        filledTextField2.setTranslationX(-400);
        loginlogincardbutton.setTranslationX(-500);
        ForgetPassword.setTranslationX(-550);
        OrLoginWith.setTranslationY(-200);
        Google.setTranslationY(300);
        Microsoft.setTranslationY(400);
        Facebook.setTranslationY(500);
        Twitter.setTranslationY(600);
        filledTextField.setAlpha(v);
        filledTextField2.setAlpha(v);
        loginlogincardbutton.setAlpha(v);
        ForgetPassword.setAlpha(v);
        OrLoginWith.setAlpha(v);
        Google.setAlpha(v);
        Microsoft.setAlpha(v);
        Facebook.setAlpha(v);
        Twitter.setAlpha(v);
        filledTextField.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        filledTextField2.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        loginlogincardbutton.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        ForgetPassword.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        OrLoginWith.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        Google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        Microsoft.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        Facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        Twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
    }
}