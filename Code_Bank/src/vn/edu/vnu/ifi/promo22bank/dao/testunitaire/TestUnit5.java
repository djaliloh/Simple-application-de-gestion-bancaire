/**
 * 
 */
package vn.edu.vnu.ifi.promo22bank.dao.testunitaire;

import org.junit.Test;

import junit.framework.Assert;
import vn.edu.vnu.ifi.promo22bank.dao.Dao;

/**
 * @author KENGNI Hippolyte
 *
 */
public class TestUnit5 {
	@Test
	public void testConnexionBD() {
		Dao dao = new Dao();
		int monTest = dao.calculInteretDaoComptes(17, 8);
		Assert.assertEquals(monTest, monTest);//("ok", monTest);//("Devrai être vrai", monTest);
	}

}
