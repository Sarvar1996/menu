import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.gridtask.FirstFragment
import com.example.gridtask.SecondFragment
import com.example.gridtask.ThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> SecondFragment()
            else -> {
                return ThirdFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Menu"
            1 -> "1chi ovqat"
            else -> {
                return "2chi ovqat"
            }
        }
    }
}