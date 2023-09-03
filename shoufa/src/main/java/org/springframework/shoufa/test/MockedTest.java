package org.springframework.shoufa.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.shoufa.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shoufa.config.ShoufaConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= ShoufaConfig.class)
@RunWith(MockitoJUnitRunner.class)
public class MockedTest {

//	@Autowired
//	private Service1 service1;

//	public Test1(Service1 service1) {
//		this.service1 = service1;
//	}

//	@Test
//	public void shouldNotBeNull() {
//		assertNotNull("错误", service1);
//	}

	@Mock
	private List<String> mockedList;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void mockshou() {// 使用 mock 静态方法创建 Mock 对象.
		Service1 service1 = mock(Service1.class);
//		mockedList.add("abc");
		when(mockedList.get(1)).thenReturn("abcd");
		when(mockedList.get(3)).thenReturn("abcd");

		//using mock object
//		for (String str : mockedList) {
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
		System.out.println(mockedList.get(2));
		System.out.println(mockedList.get(3));
		System.out.println(mockedList.get(4));
//		}
//		mockedList.add("one");
//		mockedList.clear();
		//verification
//		 verify(mockedList).add("one");
//		 verify(mockedList).clear();


//		Mockito.when(service1.)).thenReturn("hello").thenReturn("world");
		//预设当iterator调用next()时第一次返回hello，第n次都返回world
//		Mockito.when(iterator.next()).thenReturn("hello").thenReturn("world");
//		List<Integer> mockedList = Mockito.mock(List.class);
//		Assert.assertTrue(mockedList instanceof List);
//
		// mock 方法不仅可以 Mock 接口类, 还可以 Mock 具体的类型.
//		ArrayList<String> mockedArrayList = Mockito.mock(ArrayList.class);
//		Assert.assertTrue(mockedArrayList instanceof List);
//		Assert.assertTrue(mockedArrayList instanceof ArrayList);
//		System.out.println("shoufs");
	}
}
