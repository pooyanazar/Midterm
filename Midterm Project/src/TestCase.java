import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	

	@Test
	public void helloTest() {
			System.out.println("Hello World!Java OnlyItFor040420220005");
	}

        @Test
	public void testClear() {
		// Removes all of the mapping from this map
		populateMapWithPut(12);
		hashTable.clear();
		
	      // Validate with isEmpty
	      assertTrue(hashTable.isEmpty());
	}
		
		
