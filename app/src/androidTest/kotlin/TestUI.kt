import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.slavan.androidappforteamcity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)

class TestUI {

@Rule
@JvmField
val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUI(){
        Thread.sleep(5000)
        onScreen<TestScreen> {
            button.isVisible()
            button.isClickable()
            button.click()
            Thread.sleep(1000)
            text.isVisible()
            text.hasText("Hi")
        }
    }
}