package Tries;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.add("NOTE");
		t.add("NOTEBQRDE");
		t.add("NOTEBY");
		t.add("AND");
		
		System.out.println(t.search("NOTEBY"));
		System.out.println(t.search("NOTE"));
		t.remove("NOTEBY");
		System.out.println(t.search("NOTE"));
		System.out.println(t.search("NOTEBY"));
		System.out.println(t.search("NOTEBQRDE"));
		System.out.println(t.search("NOT"));
		System.out.println(t.search("NO"));
	}

}
