import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.slavan.androidappforteamcity.R

class TestScreen : Screen<TestScreen>() {
    val button = KButton{withId(R.id.button)}
    val text = KTextView{withId(R.id.textView2)}
}