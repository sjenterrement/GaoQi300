package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ģ���������
 * 
 * @author SJ
 *
 */
public class CRace2 implements Callable<Integer> {
	private String winner;// ʤ����

	@Override
	public Integer call() throws Exception {
		for (int steps = 1; steps <= 100; steps++) {
			if (Thread.currentThread().getName().equals("rabbit") && steps % 10 == 0)
				Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + "-->" + steps);
			// �����Ƿ����
			boolean flag = gameOver(steps);
			if (flag)
				return steps;
		}
		return null;
	}

	private boolean gameOver(int steps) {
		if (winner != null)
			return true;
		else {
			if (steps == 100) {
				winner = Thread.currentThread().getName();
				System.out.println("winner-->" + winner);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CRace2 race = new CRace2();
		//����ִ�з���
		ExecutorService ser=Executors.newFixedThreadPool(2);
		//�ύִ��
		Future<Integer> result1=ser.submit(race);
		Future<Integer> result2=ser.submit(race);
		//�رշ���
		Integer r1=result1.get();
		Integer r2=result2.get();
		System.out.println(r1+"-->"+r2);
		//�رշ���
		ser.shutdownNow();
	}
}
