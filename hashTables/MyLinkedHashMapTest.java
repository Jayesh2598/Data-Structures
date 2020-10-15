package ds.hashTables;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenSentenceWhenWordsAreAddedShouldImplementHashCodeAndReturnWordFrequency() {

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";
		String[] words = sentence.toLowerCase().split(" ");
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		for (String word : words) {
			Integer value = myLinkedHashMap.getValueForKey(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.getValueForKey("paranoid");
		assertTrue(frequency == 3);
	}

	@Test
	public void givenSentenceTheWordEnteredShouldBeRemovedFromSentence() {

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";
		String[] words = sentence.toLowerCase().split(" ");
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		for (String word : words) {
			Integer value = myLinkedHashMap.getValueForKey(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			System.out.println(word + " - " + value);
			myLinkedHashMap.add(word, value);
		}
		System.out.println();
		for (String word : words) {
			System.out.println(word + "-" + myLinkedHashMap.getValueForKey(word));
		}
		MyMapNode<String, Integer> deleted = myLinkedHashMap.remove("avoidable");
		assertEquals("avoidable", deleted.getKey());
	}
}
