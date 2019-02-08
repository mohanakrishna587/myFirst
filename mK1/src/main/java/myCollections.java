import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myCollections {
	
	public WebDriver driver;
	@BeforeTest
	public void initDriver(){
		driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	@Test
	public void rotateList(){
	ArrayDeque<String> DQ = new ArrayDeque<String>();
	
	DQ.add("Mohan");
	DQ.add("Arush");
	DQ.add("Arun");
	DQ.add("12ABC");
	DQ.add("Arun");
	
//	DQ.removeIf(n -> (n.charAt(1)=='r'));
	System.out.println(DQ.pop());
//	System.out.println(DQ);
		
	/*List<String> myList = new ArrayList<String>();
	
	myList.add("1");
	myList.add("2");
	myList.add("3");
	myList.add("4");
	Collections.rotate(myList, 3);
	System.out.println(myList);
	
	int arr[] = {1,3,7,2};
	Collections.rotate(Arrays.asList(arr), 2);
	System.out.println(Arrays.toString(arr));
	
	Arrays.parallelSort(arr);
	System.out.println(Arrays.toString(arr));*/
		
	}

}
