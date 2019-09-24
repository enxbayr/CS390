package W2L7;

public class MyTable {
	private Entry[] entries;

	MyTable() {
		entries = new Entry[26];
	}

	public String get(char c) {
		String tmp = null;
		int i = (int) c - 97;
		tmp = entries[i].toString();
		return tmp;
	}

	public void add(char c, String s) {
		int i = (int) c - 97;
		Entry e = new Entry(c, s);
		entries[i] = e;
	}

	public String toString() {

		String list = "";

		for (Entry e : entries) {
			if (e != null) {
				list += e.toString() + '\n';
			}
		}

		return list;
	}

	private class Entry {
		private char ch;
		private String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			return ch + "->" + str;
		}
	}
}
