package ac.id.itb.d4.minimart.costumer.adapter;

import ac.id.itb.d4.minimart.costumer.view.fragment.ProfileDetailsFragment;
import ac.id.itb.d4.minimart.costumer.view.fragment.ProfileInfoFragment;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProfilePagerAdapter extends FragmentPagerAdapter {
	private Context ctx;
	public int totalPage = 2;

	public ProfilePagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		this.ctx = context;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment f = new Fragment();
		switch (position) {
		case 0:
			f = ProfileInfoFragment.newInstance(ctx);
			break;
		case 1:
			f = ProfileDetailsFragment.newInstance(ctx);
			break;
		}
		return f;
	}

	@Override
	public int getCount() {
		return totalPage;
	}

}
