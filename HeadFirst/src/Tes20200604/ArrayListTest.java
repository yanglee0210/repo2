package Tes20200604;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 创建Egg 类型的list
		ArrayList<Egg> myList = new ArrayList<Egg>();
		// 放Egg对象s
		Egg s = new Egg();
		myList.add(s);
		// 放Egg对象b
		Egg b = new Egg();
		myList.add(b);
		// 返回元素数
		int theSize = myList.size();
		// ArrayList 是否带有s所引用的Egg对象
		boolean isIn = myList.contains(s);
		// 引用对象在ArrayList中的索引
		int idx = myList.indexOf(b);
		// 判断是否为空
		boolean empty = myList.isEmpty();
		//删除元素s
		myList.remove(s);

	}

}
