package generics;

/**
 * 接口泛型中的字母只能使用在方法里，不能使用在全局常量中
 * @author savrina
 *
 */

public interface Comparator<T> {
	void compare(T t);
}
