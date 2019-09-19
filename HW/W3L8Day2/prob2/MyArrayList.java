package W3L8Day2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortbySales implements Comparator<Marketing> 
{
    public int compare(Marketing a, Marketing b) 
    { 
        return (int)(a.getSalesamount() - b.getSalesamount()); 
    } 
}

public class MyArrayList {

	private ArrayList<Marketing> mlist;

	public MyArrayList() {

		this.mlist = new ArrayList<Marketing>();

	}

	public void add(String e, String p, double sa) {
		Marketing m = new Marketing(e, p, sa);
		mlist.add(m);
	}
	public List<Marketing> get() {
		return this.mlist;
	}
	public void remove(String e, String p, double sa) {
		Marketing r = new Marketing(e, p, sa);
		
		if(mlist.size() > 0) {
			for(int i = 0; i < mlist.size(); i++) {
				if(mlist.get(i).equals(r)) mlist.remove(i);
			}
		}
	}

	public int size() {
		return mlist.size();
	}

	public void sort() {
		Collections.sort(mlist);
	}
	public void sortbySales() {
		Collections.sort(mlist, new SortbySales());
	}
	public List<Marketing> listMoreThan1000() {
		List<Marketing> tmp = new ArrayList<Marketing>();
		Collections.sort(mlist);
		for(Marketing m : mlist) {
			if(m.getSalesamount() >= 1000) tmp.add(m);
		}
		return tmp;
	}
	@Override
	public String toString() {
		String str = "";
		for(Marketing m : mlist) {
			str += m.toString() + '\n';
		}
		return str;
	}

}
