package com.wukong.weixin.tools;

import java.security.MessageDigest;

/**
 * SHA1 算法工具类
 * 
 * 
 */
public class SHA1Tool {
	/**
	 * 转换字节数组为字符串
	 * 
	 * @param b
	 *            字节数组
	 * @return 字符串
	 */
	public static String toHexString(byte[] b) {
		StringBuffer hexString = new StringBuffer();
		String plainText;

		for (int i = 0; i < b.length; i++) {
			plainText = Integer.toHexString(0xFF & b[i]);
			if (plainText.length() < 2) {
				plainText = "0" + plainText;
			}
			hexString.append(plainText);
		}
		return hexString.toString();
	}

	/**
	 * 用SHA1加密密码
	 * 
	 * @param password
	 *            未加密密码
	 * @return 加密密码
	 * @throws Exception
	 *             异常
	 */
	public static String toSHA1Password(String password) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA1");
		if (password == null) {
			throw new Exception("The password is 'Null',check it please!");
		}
		md.update(password.getBytes());
		return toHexString(md.digest());
	}

	public static void main(String[] args) {
		try {
			// //System.out.println(SHA1Tool.toSHA1Password("111111"));
			// 3d4f2bf07dc1be38b20cd6e46949a1071f9d0e3d
			// ////System.out.println(MD5Tool.toMD5Password("test2"));
			// ////System.out.println(MD5Tool.toMD5Password("test3"));
			// ////System.out.println(MD5Tool.toMD5Password("test4"));
			// ////System.out.println(MD5Tool.toMD5Password("test5"));
			// ////System.out.println("111111 SHA1 :"
			// 82 + EncoderHandler.encode("SHA1", "111111"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
