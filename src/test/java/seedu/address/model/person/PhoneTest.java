package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.*;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Phone(null));
    }

    @Test
    public void constructor_invalidPhone_throwsIllegalArgumentException() {
        String invalidPhone = "";
        assertThrows(IllegalArgumentException.class, () -> new Phone(invalidPhone));
    }

    @Test
    public void isValidPhone() {
        // null phone number
        assertThrows(NullPointerException.class, () -> Phone.isValidPhone(null));

        // invalid phone numbers
        assertFalse(Phone.isValidPhone("")); // empty string
        assertFalse(Phone.isValidPhone(" ")); // spaces only
        assertFalse(Phone.isValidPhone("91")); // less than 3 numbers
        assertFalse(Phone.isValidPhone("phone")); // non-numeric
        assertFalse(Phone.isValidPhone("9011p041")); // alphabets within digits
        assertFalse(Phone.isValidPhone("9312 1534")); // spaces within digits
        assertFalse(Phone.isValidPhone("911")); // short phone numbers
        assertFalse(Phone.isValidPhone("124293842033123")); // long phone numbers

        // valid phone numbers
        assertTrue(Phone.isValidPhone("93121534")); // exactly 8 numbers

    }

    @Test
    public void equals() {
        Phone phone = new Phone("12345678");

        // same values -> returns true
        assertEquals(phone, new Phone("12345678"));

        // same object -> returns true
        assertEquals(phone, phone);

        // null -> returns false
        assertNotEquals(null, phone);

        // different types -> returns false
        assertNotEquals(5.0f, phone);

        // different values -> returns false
        assertNotEquals(phone, new Phone("87654321"));
    }
}
