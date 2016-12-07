package com.wukong.weixin.tools;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UUIDGenerator {
	private static Logger logger = LoggerFactory.getLogger(UUIDGenerator.class);
	private static char[] chars1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4' };
	private static char[] chars2 = new char[] { 'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z', '5', '6', '7', '8', '9' };
	private static char[] chars3 = new char[] { '!', '$', '(', ')', '{', '}',
			'[', ']', '<', '>', '-', '_', ';', ':', '~', '^' };
	
	public static void main(String[] args) {
		logger.info(getUUID32());
		logger.info(getUUID32());
		logger.info(getUUID32());
		logger.info(getUUID32());
	}
	
	/**
	 * 获得一个32位的UUID
	 * 
	 * @return String UUID
	 */
	public static String getUUID32() {
		StringBuffer uuid32 = new StringBuffer(UUID.randomUUID().toString());
		// 去掉“-”符号
		uuid32.deleteCharAt(8).deleteCharAt(12).deleteCharAt(16).deleteCharAt(
				20);
		return uuid32.toString();
	}

	/**
	 * 获得一个16位的UUID
	 * 
	 * @return String UUID
	 */
	public static String getUUID16() {
		StringBuffer uuid32 = new StringBuffer(getUUID32());
		char[] tmp = new char[2];
		StringBuffer uuid16 = new StringBuffer("");
		int index = 0;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 32; i += 2) {
			uuid32.getChars(i, i + 2, tmp, 0);
			num1 = Integer.parseInt(String.valueOf(tmp[0]), 16);
			num2 = Integer.parseInt(String.valueOf(tmp[1]), 16);
			index = num1 + num2;
			if (num1 > num2) {
				uuid16.append(chars1[index]);
			} else if (num1 < num2) {
				uuid16.append(chars2[index]);
			} else if (num1 == num2) {
				uuid16.append(chars3[num1]);
			}
		}
		return uuid16.toString();
	}
}
