

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class GcTest
{
	public static void main(String[] args)
	{
		for (var i = 0; i < 4; i++)
		{
			new GcTest();
			// �������д����������ȫ��ͬ��ǿ��ϵͳ������������
			// System.gc();
			Runtime.getRuntime().gc();
		}
	}
	public void finalize()
	{
		System.out.println("ϵͳ��������GcTest�������Դ...");
	}
}