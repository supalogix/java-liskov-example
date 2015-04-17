import java.util.Set;
import org.junit.Test;
import junit.framework.TestCase;

abstract public class SetContractTest extends TestCase{

	abstract public Set getSetInstance();

	/** Enforce Empty Set has Zero Size 
	  *
	  * By definition, an empty set contains no elements. When we create a new
	  * instance of a Set, it is considered empty. Enforce that the size is zero
	  * when we create a new instance.
	  */
	public void test_set_has_zero_size_when_created() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		///

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertEquals(set.size(),0);
	}

	/** Enforce Empty Set Property
	  *
	  * By definition, we consider a set without any elements as empty. The
	  * isEmpty() method must return true when you first create an instance
	  * because it does not contain any elements.
	  */
	public void test_set_is_empty_when_created() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		///

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertTrue( set.isEmpty() );
	}

	/** Enforce Single Insertion Property
	  *
	  */
	public void test_set_has_size_one_when_inserting_an_item() {
	}

	/** Enforce Single Insertion Property
	  *
	  */
	public void test_set_contain_an_element_after_inserting_an_item() {
	}

	/** Enforce Double Insertion Property
	  *
	  */
	public void test_set_has_size_one_when_inserting_two_similar_items() {
	}

	/** Enforce Dissimmilar Insertion Property
	  *
	  */
	public void test_set_has_size_two_when_inserting_two_dissimmilar_items() {
	}

	/** Enforce Removal Item Property
	  *
	  */
	public void test_set_size_is_one_less_than_before_after_removing_element() {
	}

	/** Enforce Removal Item Property
	  *
	  */
	public void test_set_does_not_contain_element_after_removing_element() {
	}
}
