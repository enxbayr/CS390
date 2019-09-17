package W2L7;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	MyTable() {
		for(int i = 0; i < entries.length; i++) {
			entries[i] = new Entry((char)(97+i), null);
		}	
	}

	public String get(char c) {
		String tmp = null;
		for(Entry e : entries) {
			if(e.getCh()=='c') {
				tmp = e.getStr();
			}
		}
		return tmp;
	}

	public void add(char c, String s) {
		for(Entry e : entries) {
			if(e.getCh()==c) {
				e.setStr(s);
			}
		} 
	}

	public String toString() {
		
		String list = "";
		
		for(Entry e : entries) {
			if(e.getStr()!=null) {
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

		public char getCh() {
			return ch;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			return ch + "->" + str;
		}
	}
}
