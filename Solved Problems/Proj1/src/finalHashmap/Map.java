package finalHashmap;
import java.util.ArrayList;
public class Map <K, V> {
	
	ArrayList<MapNode<K, V>> buckets;
	int count; // by default zero
	int numBuckets; // by default zero
	
	public Map() { // this is constructor of Map
		buckets = new ArrayList<>(); // bucket initialize in ArrayList
		numBuckets = 5; //Bucket size initialize 5 bucket;
		for(int i = 0; i<numBuckets; i++) {
			buckets.add(null); // this time every bucket have null elements
		}
		
	}
	
	// get bucket index by hashcode and compression
	private int getBucketIndex(K key) {
		int hc = key.hashCode();  //get integer value from hashcode. (hc means = hashcode)
		int index = hc%numBuckets; // get index value from compression function.
		
		return index;
	}
	
	public int size() {
		return count;
	}
	
	// Remove key
	
		public V removeKey(K key) {
			int bucketIndex = getBucketIndex(key);
			MapNode<K,V> head = buckets.get(bucketIndex);
			MapNode<K, V> prev = null;
			
			while(head!= null) {
				if(head.key.equals(key)) {
					if(prev!= null) {
						prev.next = head.next;
					}else {
						buckets.set(bucketIndex, head.next);
					}
					count--;
					return head.value;
				}
				prev = head;
				head = head.next;
			}
			return null; // when key is not present in BucketArray
		}
	
	
	// Get Value
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		while(head!= null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null; // when key is not present in BucketArray
	}
	
	
	// Rehashing
	
		private void reHash() {
			ArrayList<MapNode<K, V>> temp = buckets; // this is old BucketArray
			buckets = new ArrayList<>(); // create new bucket for rehashing
			for(int i = 0; i<2*numBuckets; i++) { // this bucketArray is Double as compare to old BucketArray
			buckets.add(null); //this time every bucket have null element because of this is new Bucket and there have not stored any elements
			
		}
		count= 0; 
		numBuckets = numBuckets*2;
		for(int i = 0; i<temp.size(); i++) { // this is store element from old Bucket to new Bucket
			MapNode<K, V>head = temp.get(i);
			while(head!= null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
			
		}
		}
		
		// Create LoadFactor Function
		
		public double loadFactor() {
			return(1.0*count)/numBuckets;
		}
		
		
	// Insert Key and Value or Insert Pair
	
	public void insert (K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex); // front node initialize as a head in LinkedList of Array bucket
		
		// element is already there? just update its value
		
		while(head!= null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next; // this is store as a head when (head.key.!equals(key))
		}
		
		// element is not there, insert at 0th position of linkedlist
		
		head = buckets.get(bucketIndex); // head is store in front at 0th position in linkedlist
		MapNode<K, V> newNode = new MapNode<>(key, value); // create a new node at front as a head
		newNode.next = head; // new node initialize as a head;
		buckets.set(bucketIndex, newNode); // this is set new node in bucketIndex
		count++; // element counting increase 1 by 1;
		double loadFactor =  (1.0*count)/numBuckets;
		if(loadFactor>0.7) {
			reHash();
		}
	}
	
	

}
