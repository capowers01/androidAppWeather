package powers.chris.weather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weatherForecast = findViewById<Button>(R.id.forecastButton)

        weatherForecast.setOnClickListener {
            println("You hit the forecast button")

            var moveToForecastListView = Intent(getApplicationContext(), WeatherForeCast::class.java)//This is an intent which helps to move from one activity to another.
            startActivity(moveToForecastListView)
        }
    }
}
