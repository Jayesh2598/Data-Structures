package ds.hashTables;

import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

	@Test
	public void givenASentenceWhenWordsAreAddedShouldReturnAWordFrequency() {
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word: words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value=1;
			else
				value+=1;
			hashMap.add(word,value);
		}
		int frequency = hashMap.get("to");
		System.out.println(hashMap);
		assertTrue(frequency==2);
	}
}
