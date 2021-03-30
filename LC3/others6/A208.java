package others6;

public class A208 {
//	class Trie {
//
//		/** Initialize your data structure here. */
//		public Trie() {
//
//		}
//
//		/** Inserts a word into the trie. */
//		public void insert(String word) {
//
//		}
//
//		/** Returns if the word is in the trie. */
//		public boolean search(String word) {
//
//		}
//
//		/**
//		 * Returns if there is any word in the trie that starts with the given prefix.
//		 */
//		public boolean startsWith(String prefix) {
//
//		}
//	}

	/**
	 * Your Trie object will be instantiated and called as such: Trie obj = new
	 * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
	 * = obj.startsWith(prefix);
	 */

	// 一个模板
//	public class Trie {
//	    private boolean is_string=false;
//	    private Trie next[]=new Trie[26];
//
//	    public Trie(){}
//
//	    public void insert(String word){//插入单词
//	        Trie root=this;
//	        char w[]=word.toCharArray();
//	        for(int i=0;i<w.length;++i){
//	            if(root.next[w[i]-'a']==null)root.next[w[i]-'a']=new Trie();
//	            root=root.next[w[i]-'a'];
//	        }
//	        root.is_string=true;
//	    }
//
//	    public boolean search(String word){//查找单词
//	        Trie root=this;
//	        char w[]=word.toCharArray();
//	        for(int i=0;i<w.length;++i){
//	            if(root.next[w[i]-'a']==null)return false;
//	            root=root.next[w[i]-'a'];
//	        }
//	        return root.is_string;
//	    }
//	    
//	    public boolean startsWith(String prefix){//查找前缀
//	        Trie root=this;
//	        char p[]=prefix.toCharArray();
//	        for(int i=0;i<p.length;++i){
//	            if(root.next[p[i]-'a']==null)return false;
//	            root=root.next[p[i]-'a'];
//	        }
//	        return true;
//	    }
//	}
}
