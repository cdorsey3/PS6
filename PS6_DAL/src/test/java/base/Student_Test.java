package base;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void createTest(){
		PersonDomainModel per = new PersonDomainModel();
		per.setFirstName("Christian");
		per.setLastName("Dorsey");
		per.setPostalCode(19977);
		per.setStreet("Main Street");
		per.setCity("Newark");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate date = LocalDate.parse("1997-aug-14", formatter);
		per.setBirthday(date);
		PersonDAL.addPerson(per);
		
	}
	@Test
	public void updateTest(){
		PersonDomainModel per = new PersonDomainModel();
		per.setFirstName("Christian");
		per.setLastName("Dorsey");
		per.setPostalCode(19977);
		per.setStreet("Main Street");
		per.setCity("Newark");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate date = LocalDate.parse("1997-aug-14", formatter);
		per.setBirthday(date);
		PersonDAL.addPerson(per);
		per.setPostalCode(199938);
		PersonDAL.updatePerson(per);
	}
	@Test
	public void deleteTest(){
		PersonDomainModel per = new PersonDomainModel();
		per.setFirstName("Christian");
		per.setLastName("Dorsey");
		per.setPostalCode(19977);
		per.setStreet("Main Street");
		per.setCity("Newark");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate date = LocalDate.parse("1997-aug-14", formatter);
		per.setBirthday(date);
		PersonDAL.addPerson(per);
		//PersonDAL.deletePerson(per);
		String id = per.toString();
		PersonDAL.deletePerson(null);
	}

}
