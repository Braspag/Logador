package br.com.braspag.logador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.braspag.cieloecommerceoauth.network.Environment
import br.com.braspag.cieloecommerceoauth.network.HttpCredentialsClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logador.info("Logador funciona")
    }
}
