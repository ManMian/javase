
import java.util.*;
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
public class ArrayErr
{
	public static void main(String[] args)
	{
		// ����һ��Integer����
		Integer[] ia = new Integer[5];
		// ���԰�һ��Integer[]���鸳��Number[]����
		Number[] na = ia;
		// ����������������������ʱ������ArrayStoreException�쳣
		// ��Ϊ0.5������Integer
		na[0] = 0.5;   // ��


		List<Integer> iList = new ArrayList<>();
		// ������뵼�±������
//		List<Number> nList = iList;
	}
}