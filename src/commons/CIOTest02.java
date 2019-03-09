package commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class CIOTest02 {
	public static void main(String[] args) {
		Collection<File> files=FileUtils.listFiles(new File("C:\\Users\\ASUS\\eclipse-workspace\\Leetcode"), 
				EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("-----------------------");
		files=FileUtils.listFiles(new File("C:\\Users\\ASUS\\eclipse-workspace\\Leetcode"), 
				EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("-----------------------");
		files=FileUtils.listFiles(new File("C:\\Users\\ASUS\\eclipse-workspace\\Leetcode"), 
				new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("-----------------------");
		files=FileUtils.listFiles(new File("C:\\Users\\ASUS\\eclipse-workspace\\Leetcode"), 
				FileFilterUtils.or(new SuffixFileFilter("java"),
						new SuffixFileFilter("class"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("-----------------------");
		files=FileUtils.listFiles(new File("C:\\Users\\ASUS\\eclipse-workspace\\Leetcode"), 
				FileFilterUtils.and(new SuffixFileFilter("java"),
						EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
