package week5Day2;

import org.testng.annotations.Test;

public class DailyQuestion {
	@Test
	public void a() {
		System.out.println("a");
	}
	@Test(dependsOnMethods="c")
	public void b() {
		System.out.println("b");
	}
	@Test
	public void e() {
		System.out.println("e");
	}
	@Test/*(dependsOnMethods="a")*/
	public void c() {
		System.out.println("c");
	}
	@Test
	public void d() {
		System.out.println("d");
	}
	@Test
	public void f() {
		System.out.println("f");
	}
}
