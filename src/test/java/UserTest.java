import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    
    public UserTest() {
    }

    @Test
    public void testGetName() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        String expResult = "cano";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetForname() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        String expResult = "roman";
        String result = instance.getForname();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMail() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        String expResult = "roman.cano04@gmail.com";
        String result = instance.getMail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        instance.setName("jimenez");
        assertEquals("jimenez", instance.getName());
    }

    @Test
    public void testSetForname() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        instance.setForname("enzo");
        assertEquals("enzo", instance.getForname());
    }

    @Test
    public void testSetMail() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        instance.setMail("enzo.cano04@gmail.com");
        assertEquals("enzo.cano04@gmail.com", instance.getMail());
    }

    @Test
    public void testSetPassword() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        instance.setPassword("12546");
        assertEquals("12546", instance.getPassword());
    }

  

   @Test
    public void testVerifpassword() {
        User instance = new User("cano","roman","roman.cano04@gmail.com");
        String mdp = "abdsdF";
        boolean expResult = false;
        boolean result = instance.verifpassword(mdp);
        // Test with a valid password
      
    }
}
