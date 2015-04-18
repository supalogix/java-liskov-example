
import java.util.Set;
import org.junit.Test;
import junit.framework.TestCase;

abstract public class SetContractTest extends TestCase {

	/** Get Instance of Subclass 
	  *
	  * Each subclass must return an instance of type Set. The tests within this
	  * class will use this method to verify the runtime behavior of the
	  * subclass.
	  */
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
		assertEquals(set.size(), 0);
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
	  * When we insert an element into a set, we expect a cardinality of one
	  */
	public void test_set_has_size_one_when_inserting_an_item() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		/// I hard code an Integer into our set since it doesn't specifically
		/// matter what I put in the set
		///
		set.add( new Integer(1) );

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertEquals( set.size(), 1 );
	}

	/** Set Contains Item After Inserting It
	  *
	  * When we insert an item into a set, we expect that we can also retrieve it
	  * later.
	  */
	public void test_set_contain_an_element_after_inserting_an_item() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		///
		Integer number = new Integer(1);
		set.add( number );
		Boolean flag = set.contains( number );

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertTrue( flag );
	}

	/** Enforce Double Insertion Property
	  *
	  * When we insert the same item twice, we expect that the size of the set
	  * only increments by one. 
	  */
	public void test_set_has_size_one_when_inserting_two_similar_items() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		///
		Integer number1 =  new Integer(1);
		Integer number2 =  new Integer(1);
		set.add( number1 );
		set.add( number2 );

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertEquals( set.size(), 1 );
	}

	/** Enforce Dissimmilar Insertion Property
	  *
	  */
	public void test_set_has_size_two_when_inserting_two_dissimmilar_items() {
	}

	/** Remove an Item and Check the Size
	  * 
	  * When the caller removes an item from the set, the size of the set should
	  * decriment by one.
	  */
	public void test_set_size_is_one_less_than_before_after_removing_element() {
		/// ======================================================================
		/// Arrange
		/// ======================================================================
		///
		Set set = this.getSetInstance();

		/// ======================================================================
		/// Act
		/// ======================================================================
		///
		Integer number1 =  new Integer(1);
		Integer number2 =  new Integer(2);
		set.add( number1 );
		set.add( number2 );
		set.remove( number1 );

		/// ======================================================================
		/// Assert
		/// ======================================================================
		///
		assertEquals( set.size(), 1 );
	}

	/** Enforce Removal Item Property
	  *
	  */
	public void test_set_does_not_contain_element_after_removing_element() {
	}
}
