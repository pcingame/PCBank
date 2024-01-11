package pcingame.app.pcbank.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pcingame.app.pcbank.R


class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}