package ds.hashTables;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {
	
	@Test
	public void givenSentenceWhenWordsAreAddedShouldImplementHashCodeAndReturnWordFrequency() {

		String sentence = "Paranoids are not paranoid because they are paranoid "
							+"but because they keep putting themselves deliberately into "
							+"paranoid avoidable situations.";
		String[] words = sentence.toLowerCase().split(" ");
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		for (String word: words) {
			Integer value = myLinkedHashMap.get(word);
			if(value == null)
				value=1;
			else
				value+=1;
			myLinkedHashMap.add(word,value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		assertTrue(frequency==3);
	}
}
