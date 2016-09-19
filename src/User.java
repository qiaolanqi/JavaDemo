import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class User implements Comparable<User> {
	private int age;
	private int userNo;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/** 根据年龄age排序 */
	public int compareTo(User user) {
		return age > user.age ? 1 : (age == user.age ? 0 : -1);
	}

	public static void main(String args[]) {
		User user1 = new User();
		user1.setAge(1);
		User user2 = new User();
		user2.setAge(2);
		System.out.println(user1.compareTo(user2)); // 单个对象的比较

		User[] users = new User[] { user1, user2 };
		Arrays.sort(users); // 数组的排序，对Collection的排序Collections.sort(..)
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].getAge());
		}
	}
}