package com.casic.cloud.qcy.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化与反序列化工具类
 * 
 * @author 王坤
 * 
 */
public class SerializableUtil {
	/**
	 * 序列化
	 * 
	 * @param 传入对象
	 */
	public static byte[] serialize(Object obj) {
		ObjectOutputStream objout = null;
		ByteArrayOutputStream basout = null;
		try {
			basout = new ByteArrayOutputStream();
			objout = new ObjectOutputStream(basout);
			objout.writeObject(obj);
			byte[] bt = basout.toByteArray();
			return bt;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	/**
	 * 反序列化
	 * @param byte数组
	 */
	public static Object unSerialize(byte[] bt) {
		ObjectInputStream objinput = null;
		ByteArrayInputStream basinput = null;
		try {
			basinput = new ByteArrayInputStream(bt);
			objinput = new ObjectInputStream(basinput);
			return objinput.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
