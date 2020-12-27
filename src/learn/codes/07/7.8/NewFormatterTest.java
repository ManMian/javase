
import java.time.*;
import java.time.format.*;
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
public class NewFormatterTest
{
	public static void main(String[] args)
	{
		var formatters = new DateTimeFormatter[] {
			// ֱ��ʹ�ó�������DateTimeFormatter��ʽ��
			DateTimeFormatter.ISO_LOCAL_DATE,
			DateTimeFormatter.ISO_LOCAL_TIME,
			DateTimeFormatter.ISO_LOCAL_DATE_TIME,
			// ʹ�ñ��ػ��Ĳ�ͬ���������DateTimeFormatter��ʽ��
			DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
			DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
			// ����ģʽ�ַ���������DateTimeFormatter��ʽ��
			DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		var date = LocalDateTime.now();
		// ����ʹ�ò�ͬ�ĸ�ʽ����LocalDateTime���и�ʽ��
		for (var i = 0; i < formatters.length; i++)
		{
			// �������д����������ͬ
			System.out.println(date.format(formatters[i]));
			System.out.println(formatters[i].format(date));
		}
	}
}