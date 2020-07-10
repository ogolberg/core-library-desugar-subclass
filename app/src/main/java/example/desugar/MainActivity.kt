package example.desugar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import example.Cache

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cache = Cache<String, String>()

        // java.lang.NoSuchMethodError: j$.util.concurrent.ConcurrentMap$-CC.$default$putIfAbsent
        cache.putIfAbsent("a", "b")
    }
}