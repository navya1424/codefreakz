package com.codefreak.educationalApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.*
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class RegisterActivity : AppCompatActivity() {
//     lateinit var mInterstitialAdd : InterstitialAd
    //    private var mAuth: FirebaseAuth? = null
    private lateinit var auth: FirebaseAuth
//    private var edtPhone: EditText? = null
//    private var edtOTP: EditText? = null
//    private var verifyOTPBtn: Button? = null
//    private var generateOTPBtn: Button? = null

    //    private var verificationId: String? = null
    private val RC_SIGN_IN: Int = 123
    private val TAG = "SignInActivity Tag"
    private lateinit var googleSignInClient: GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        MobileAds.initialize(this@RegisterActivity)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

//        mInterstitialAdd = InterstitialAd(this)
//        mInterstitialAdd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
//        mInterstitialAdd.loadAd(AdRequest.Builder().build())
//
//        mInterstitialAdd.adListener = object : AdListener() {
//            override fun onAdClosed() {
//                Toast.makeText(this@RegisterActivity, "Add Closed", Toast.LENGTH_SHORT).show()
////                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
//            }
//        }

//        mInterstitialAdd.adListener = object : AdListener{} {
//            fun onAdClosed() {
//            Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
//        }



//        mAuth = FirebaseAuth.getInstance()
//        edtPhone = findViewById(R.id.idEdtPhoneNumber)
//        edtOTP = findViewById(R.id.idEdtOtp)
//        verifyOTPBtn = findViewById(R.id.idBtnVerify)
//        generateOTPBtn = findViewById(R.id.number)
//
//        findViewById<Button>(R.id.number).setOnClickListener {
//
//            if (TextUtils.isEmpty(findViewById<EditText>(R.id.idEdtPhoneNumber).text.toString())) {
//
//                Toast.makeText(this, "Please enter a valid phone number.", Toast.LENGTH_SHORT).show()
//            } else {
//
//                val phone =  findViewById<EditText>(R.id.idEdtPhoneNumber).text.toString()
//                sendVerificationCode(phone)
//            }
//        }


//        findViewById<Button>(R.id.idBtnVerify).setOnClickListener {
//
//            if (TextUtils.isEmpty(findViewById<EditText>(R.id.idEdtOtp).text.toString())) {
//
//                Toast.makeText(this, "Please enter OTP", Toast.LENGTH_SHORT).show()
//            } else verifyCode((findViewById<EditText>(R.id.idEdtOtp).text.toString()))
//        }

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)
        auth = Firebase.auth

        findViewById<SignInButton>(R.id.SignInButton).setOnClickListener {

//            if (mInterstitialAdd.isLoaded) {
//                mInterstitialAdd.show()
//            }
//            else {
//                Log.d("TAG", "The Interstitial Add was't Loaded Yet!!")
//            }
            signIn()
        }
        
    }

    private fun signIn() {
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account =
                completedTask.getResult(ApiException::class.java)!!
            Log.d(TAG, "firebaseAuthWithGoogle:" + account.id)
            firebaseAuthWithGoogle(account.idToken!!)
        } catch (e: ApiException) {
            Log.w(TAG, "signInResult:failed code=" + e.statusCode)
        }

    }

    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
//        findViewById<SignInButton>(R.id.SignInButton).visibility = View.GONE
        findViewById<ProgressBar>(R.id.ProgressBar).visibility = View.VISIBLE

        GlobalScope.launch(Dispatchers.IO) {
            val auth = auth.signInWithCredential(credential).await()
            val firebaseUser = auth.user
            withContext(Dispatchers.Main) {
                updateUI(firebaseUser)
            }
        }

    }

    private fun updateUI(firebaseUser: FirebaseUser?) = if (firebaseUser != null) {

        val mainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(mainActivityIntent)
        finish()
    } else {
        findViewById<SignInButton>(R.id.SignInButton).visibility = View.VISIBLE
        findViewById<ProgressBar>(R.id.ProgressBar).visibility = View.GONE
    }


    override fun onStart() {
        super.onStart()
        if (FirebaseAuth.getInstance().currentUser != null) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
//    private fun signInWithCredential(credential: PhoneAuthCredential) {
//        // inside this method we are checking if
//        // the code entered is correct or not.
//        mAuth!!.signInWithCredential(credential)
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    // if the code is correct and the task is successful
//                    // we are sending our user to new activity.
//                    val i = Intent(this, MainActivity::class.java)
//                    startActivity(i)
//                    finish()
//                } else {
//                    // if the code is not correct then we are
//                    // displaying an error message to the user.
//                    Toast.makeText(this, task.exception!!.message, Toast.LENGTH_LONG).show()
//                }
//            }
//    }
//
//    private fun sendVerificationCode(number: String) {
//        // this method is used for getting
//        // OTP on user phone number.
//        // auto verification of user.
//        val options = PhoneAuthOptions.newBuilder(mAuth)
//            .setPhoneNumber(number)       // Phone number to verify
//            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
//            .setActivity(this)                 // Activity (for callback binding)
//            .setCallbacks(mCallBack)          // OnVerificationStateChangedCallbacks
//            .build()
//        PhoneAuthProvider.verifyPhoneNumber(options)
//
//
//
////        )
//    }
//
//
//    private val mCallBack: PhoneAuthProvider.OnVerificationStateChangedCallbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//        override fun onCodeSent(s: String, forceResendingToken: PhoneAuthProvider.ForceResendingToken) {
//            super.onCodeSent(s, forceResendingToken)
//            verificationId = s
//            findViewById<LinearLayout>(R.id.PhoneLayout).visibility = View.GONE
//            findViewById<LinearLayout>(R.id.OTPLayout).visibility = View.VISIBLE
//
//        }
//
//        override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
//
//
//            val code = phoneAuthCredential.smsCode
//            if (code != null) {
//                edtOTP!!.setText(code)
//
//                verifyCode(code)
//            }
//        }
//
//
//        override fun onVerificationFailed(e: FirebaseException) {
//
//            Toast.makeText(applicationContext, e.message, Toast.LENGTH_LONG).show()
//        }
//    }
//
//
//    private fun verifyCode(code: String) {
//        findViewById<ProgressBar>(R.id.ProgressBar).visibility = View.VISIBLE
//        val credential = PhoneAuthProvider.getCredential(verificationId, code)
//
//
//        signInWithCredential(credential)
//    }
}

